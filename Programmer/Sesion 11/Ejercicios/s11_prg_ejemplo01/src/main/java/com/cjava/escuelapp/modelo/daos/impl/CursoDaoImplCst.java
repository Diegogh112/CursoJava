package com.cjava.escuelapp.modelo.daos.impl;



import com.cjava.escuelapp.modelo.daos.CursoDao;
import com.cjava.escuelapp.modelo.entidades.Curso;
import com.cjava.escuelapp.util.DbConn;
import com.cjava.escuelapp.util.Util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CursoDaoImplCst implements CursoDao {
    @Override
    public void create(Curso curso) {
        String sql = "{CALL ins_curso(?,?,?)}";
        try (Connection cn = DbConn.getConnection();
             CallableStatement cst = cn.prepareCall(sql)){
            cst.setString(1,curso.id());
            cst.setString(2,curso.nombre());
            cst.setInt(3,curso.creditos());
            cst.executeUpdate();
        } catch (SQLException e){
            System.out.println(Util.ERROR3 + " - " + e.getMessage());
        }
    }

    @Override
    public Curso find(String id) {
        String sql = "{CALL find_curso(?)}";
        try (Connection cn = DbConn.getConnection();
             CallableStatement cst = cn.prepareCall(sql)){
            cst.setString(1,id);
            ResultSet rs = cst.executeQuery();
            if(rs.next()){
                return new Curso(rs.getString(1),
                        rs.getString(2),rs.getInt(3));
            }
        } catch (SQLException e){
            System.out.println(Util.ERROR3);
            return null;
        }
        return null;
    }

    @Override
    public List<Curso> findAll() {
        String sql = "{CALL findAll_cursos}";
        List<Curso> lista = new ArrayList<>();
        try (Connection cn = DbConn.getConnection();
             CallableStatement cst = cn.prepareCall(sql);
             ResultSet rs = cst.executeQuery()){
            while (rs.next()){
                lista.add(new Curso(rs.getString(1),
                        rs.getString(2),rs.getInt(3)));
            }
        } catch (SQLException e){
            System.out.println(Util.ERROR3);
            return lista;
        }
        return lista;
    }

    @Override
    public void update(Curso curso) {
        String sql = "{CALL upd_curso(?,?,?)}";
        try (Connection cn = DbConn.getConnection();
             CallableStatement cst = cn.prepareCall(sql)){
            cst.setString(1,curso.id());
            cst.setString(2,curso.nombre());
            cst.setInt(3,curso.creditos());

            cst.executeUpdate();
        } catch (SQLException e){
            System.out.println(Util.ERROR3);
        }
    }

    @Override
    public void delete(String id) {
        String sql = "{CALL del_curso(?)}";
        try (Connection cn = DbConn.getConnection();
             CallableStatement cst = cn.prepareCall(sql)){
            cst.setString(1,id);
            cst.executeUpdate();
        } catch (SQLException e){
            System.out.println(Util.ERROR3);
        }

    }
}
