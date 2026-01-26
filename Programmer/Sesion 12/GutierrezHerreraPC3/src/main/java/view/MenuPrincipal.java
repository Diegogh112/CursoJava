package view;

import dao.ClienteDAO;
import factory.DAOFactory;
import model.Cliente;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class MenuPrincipal extends JFrame {

    private JTable tablaClientes;
    private DefaultTableModel modelo;
    private ClienteDAO clienteDAO;

    public MenuPrincipal() {

        clienteDAO = DAOFactory.getClienteDAO();

        setTitle("Sistema de Ventas - Gestión de Clientes");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inicializarComponentes();
        cargarClientes();
    }

    private void inicializarComponentes() {


        modelo = new DefaultTableModel(
                new String[]{"Código", "Nombre", "Apellido", "Email", "Teléfono", "Fecha Registro"},
                0
        );

        tablaClientes = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tablaClientes);

        // ===== Barra de menú =====
        JMenuBar menuBar = new JMenuBar();
        JMenu menuCliente = new JMenu("Cliente");

        JMenuItem itemAgregar = new JMenuItem("Agregar Cliente");
        JMenuItem itemActualizarEliminar = new JMenuItem("Actualizar / Eliminar Cliente");
        JMenuItem itemBuscar = new JMenuItem("Buscar Cliente");

        itemAgregar.addActionListener(e -> {
            this.setVisible(false);
            new VentanaAgregarCliente(this).setVisible(true);

        });

        itemActualizarEliminar.addActionListener(e -> {
            this.setVisible(false);
            new VentanaActualizarEliminar(this).setVisible(true);
        });

        itemBuscar.addActionListener(e -> {
            this.setVisible(false);
            new VentanaBuscarCliente(this).setVisible(true);
        });

        menuCliente.add(itemAgregar);
        menuCliente.add(itemActualizarEliminar);
        menuCliente.add(itemBuscar);

        menuBar.add(menuCliente);
        setJMenuBar(menuBar);

        // ===== Layout =====
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
    }

    public void cargarClientes() {

        modelo.setRowCount(0); // limpiar tabla

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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MenuPrincipal().setVisible(true);
        });
    }
}
