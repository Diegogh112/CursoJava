package com.cjava.escuelapp.modelo.daos.impl;

import com.cjava.escuelapp.modelo.daos.CursoDao;
import com.cjava.escuelapp.modelo.entidades.Curso;
import com.cjava.escuelapp.util.DbConn;
import com.cjava.escuelapp.util.Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CursoDaoImplStm implements CursoDao {
    @Override
    public void create(Curso curso) {
        String sql= "INSERT INTO curso VALUES ('"+curso.id()+"','"+curso.nombre()+"',"+curso.creditos()+")";
        try(Connection cn = DbConn.getConnection();
            Statement   stm = cn.createStatement()) {
            cn.setAutoCommit(false);
            stm.executeUpdate(sql);

            System.out.println("ya se hizo en insert pero en cache");
            if(curso.id().equals("C98")) {
                cn.rollback();
                System.out.println("rollback");
            }else
                cn.commit();
        } catch (SQLException ex) {
            System.out.println(Util.ERROR2);
        }
    }

    @Override
    public Curso find(String id) {
        String sql= "SELECT * FROM curso WHERE id='"+id+"'";
        try(Connection cn = DbConn.getConnection();
            Statement   stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql)) {
            if(rs.next()){
                return new Curso(rs.getString(1),rs.getString(2),rs.getInt(3));
            }
        } catch (SQLException ex) {
            System.out.println(Util.ERROR2);
            return null;
        }
    return null;
    }

    @Override
    public List<Curso> findAll() {
        String sql= "SELECT * FROM curso";
        List<Curso> lista=new ArrayList<>();
        try(Connection cn = DbConn.getConnection();
            Statement   stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql)) {
            while(rs.next()){
                lista.add(new Curso(rs.getString(1),rs.getString(2),rs.getInt(3)));
            }
        } catch (SQLException ex) {
            System.out.println(Util.ERROR2);
            return null;
        }
        return lista;
    }

    @Override
    public void update(Curso curso) {
        String sql= "UPDATE curso SET nombre='"+curso.nombre()+"', creditos="+curso.creditos()+" WHERE id='"+curso.id()+"'";
        try(Connection cn = DbConn.getConnection();
            Statement   stm = cn.createStatement()) {
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(Util.ERROR2);
        }
    }

    @Override
    public void delete(String id) {
        String sql= "DELETE FROM curso WHERE id='"+id+"'";
        try(Connection cn = DbConn.getConnection();
            Statement   stm = cn.createStatement()) {
            stm.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(Util.ERROR2);
        }
    }
}
