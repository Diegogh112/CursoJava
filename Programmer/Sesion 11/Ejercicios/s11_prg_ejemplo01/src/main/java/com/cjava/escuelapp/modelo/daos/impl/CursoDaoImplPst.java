package com.cjava.escuelapp.modelo.daos.impl;

import com.cjava.escuelapp.modelo.daos.CursoDao;
import com.cjava.escuelapp.modelo.entidades.Curso;
import com.cjava.escuelapp.util.DbConn;
import com.cjava.escuelapp.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CursoDaoImplPst implements CursoDao {

    @Override
    public void create(Curso curso) {
        String sql = "INSERT INTO curso VALUES (?,?,?)";
        try (Connection cn = DbConn.getConnection();
             PreparedStatement pst = cn.prepareStatement(sql)) {
            pst.setString(1, curso.id());
            pst.setString(2, curso.nombre());
            pst.setInt(3, curso.creditos());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(Util.ERROR3+ex.getMessage());
        }
    }

    @Override
    public Curso find(String id) {
        String sql = "SELECT * FROM curso WHERE id=?";
        try (Connection cn = DbConn.getConnection();
             PreparedStatement pst = cn.prepareStatement(sql);){
          pst.setString(1, id);
          ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {
                return new Curso(rs.getString(1), rs.getString(2), rs.getInt(3));
            }
        } catch (SQLException ex) {
            System.out.println(Util.ERROR2);
            return null;
        }
        return null;
    }

    @Override
    public List<Curso> findAll() {
        String sql = "SELECT * FROM curso";
        List<Curso> lista = new ArrayList<>();
        try (Connection cn = DbConn.getConnection();
             PreparedStatement pst = cn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                lista.add(new Curso(rs.getString(1), rs.getString(2), rs.getInt(3)));
            }
        } catch (SQLException ex) {
            System.out.println(Util.ERROR2);
            return null;
        }
        return lista;
    }

    @Override
    public void update(Curso curso) {
        String sql = "UPDATE curso SET nombre=?, creditos=? WHERE id=?";
        try (Connection cn = DbConn.getConnection();
             PreparedStatement pst = cn.prepareStatement(sql)) {
            pst.setString(1, curso.nombre());
            pst.setInt(2, curso.creditos());
            pst.setString(3, curso.id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(Util.ERROR2);
        }
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM curso WHERE id=?";
        try (Connection cn = DbConn.getConnection();
             PreparedStatement pst = cn.prepareStatement(sql)) {
            pst.setString(1, id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(Util.ERROR2);
        }
    }
}