package view;

import dao.ClienteDAO;
import factory.DAOFactory;
import model.Cliente;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class VentanaListarCliente extends JFrame {

    private JTable tabla;
    private DefaultTableModel modelo;
    private ClienteDAO clienteDAO;

    public VentanaListarCliente() {

        clienteDAO = DAOFactory.getClienteDAO();

        setTitle("Listado de Clientes");
        setSize(700, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        inicializarTabla();
        cargarClientes();
    }

    private void inicializarTabla() {

        modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Email");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Fecha Registro");

        tabla = new JTable(modelo);
        add(new JScrollPane(tabla));
    }

    public void cargarClientes() {

        modelo.setRowCount(0); // limpia tabla

        List<Cliente> lista = clienteDAO.listar();

        for (Cliente c : lista) {
            modelo.addRow(new Object[]{
                    c.getCodigo(),
                    c.getNombre(),
                    c.getApellido(),
                    c.getEmail(),
                    c.getTelefono(),
                    c.getFechaRegistro()
            });
        }
    }
}
