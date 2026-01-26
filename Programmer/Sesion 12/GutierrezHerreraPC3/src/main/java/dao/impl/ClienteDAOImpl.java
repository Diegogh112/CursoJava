package dao.impl;

import config.Conexion;
import dao.ClienteDAO;
import model.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {

    // INSERTAR (Stored Procedure)
    @Override
    public void insertar(Cliente cliente) {
        try (Connection cn = Conexion.getConexion();
             CallableStatement cs = cn.prepareCall("{call sp_insertar_cliente(?,?,?,?)}")) {

            cs.setString(1, cliente.getNombre());
            cs.setString(2, cliente.getApellido());
            cs.setString(3, cliente.getEmail());
            cs.setString(4, cliente.getTelefono());
            cs.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ACTUALIZAR (Stored Procedure)
    @Override
    public void actualizar(Cliente cliente) {
        try (Connection cn = Conexion.getConexion();
             CallableStatement cs = cn.prepareCall("{call sp_actualizar_cliente(?,?,?,?,?)}")) {

            cs.setInt(1, cliente.getCodigo());
            cs.setString(2, cliente.getNombre());
            cs.setString(3, cliente.getApellido());
            cs.setString(4, cliente.getEmail());
            cs.setString(5, cliente.getTelefono());
            cs.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ELIMINAR (Stored Procedure)
    @Override
    public void eliminar(int codigo) {
        try (Connection cn = Conexion.getConexion();
             CallableStatement cs = cn.prepareCall("{call sp_eliminar_cliente(?)}")) {

            cs.setInt(1, codigo);
            cs.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // BUSCAR POR CÓDIGO (PreparedStatement)
    @Override
    public Cliente buscarPorCodigo(int codigo) {
        Cliente cliente = null;

        try (Connection cn = Conexion.getConexion();
             PreparedStatement ps =
                     cn.prepareStatement("SELECT * FROM clientes WHERE codigo = ?")) {

            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cliente = new Cliente(
                        rs.getInt("codigo"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("email"),
                        rs.getString("telefono"),
                        rs.getTimestamp("fechaRegistro")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return cliente;
    }

    // BUSCAR POR CÓDIGO, NOMBRE O APELLIDO
    @Override
    public List<Cliente> buscar(String criterio) {
        List<Cliente> lista = new ArrayList<>();

        String sql = "SELECT * FROM clientes " +
                "WHERE codigo = ? OR nombre LIKE ? OR apellido LIKE ?";

        try (Connection cn = Conexion.getConexion();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            // Intentar convertir a número
            int codigo = -1;
            try {
                codigo = Integer.parseInt(criterio);
            } catch (NumberFormatException e) {
                // no es número, se ignora
            }

            ps.setInt(1, codigo);
            ps.setString(2, "%" + criterio + "%");
            ps.setString(3, "%" + criterio + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente(
                        rs.getInt("codigo"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("email"),
                        rs.getString("telefono"),
                        rs.getTimestamp("fechaRegistro")
                );
                lista.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    // LISTAR TODOS
    @Override
    public List<Cliente> listar() {
        List<Cliente> lista = new ArrayList<>();

        try (Connection cn = Conexion.getConexion();
             PreparedStatement ps =
                     cn.prepareStatement("SELECT * FROM clientes");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Cliente c = new Cliente(
                        rs.getInt("codigo"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("email"),
                        rs.getString("telefono"),
                        rs.getTimestamp("fechaRegistro")
                );
                lista.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}
