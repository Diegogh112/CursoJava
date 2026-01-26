package view;

import dao.ClienteDAO;
import factory.DAOFactory;
import model.Cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaActualizarEliminar extends JFrame {

    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtEmail;
    private JTextField txtTelefono;

    private JButton btnBuscar;
    private JButton btnActualizar;
    private JButton btnEliminar;

    private ClienteDAO clienteDAO;

    public VentanaActualizarEliminar(MenuPrincipal menuPrincipal) {

        clienteDAO = DAOFactory.getClienteDAO();

        setTitle("Actualizar / Eliminar Cliente");
        setSize(450, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        inicializarComponentes();
        agregarEventos();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                menuPrincipal.setVisible(true);
            }
        });
    }

    private void inicializarComponentes() {

        txtCodigo = new JTextField();
        txtNombre = new JTextField();
        txtApellido = new JTextField();
        txtEmail = new JTextField();
        txtTelefono = new JTextField();

        btnBuscar = new JButton("Buscar");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");

        setLayout(new GridLayout(7, 2, 8, 8));

        add(new JLabel("Código:"));
        add(txtCodigo);

        add(new JLabel(""));
        add(btnBuscar);

        add(new JLabel("Nombre:"));
        add(txtNombre);

        add(new JLabel("Apellido:"));
        add(txtApellido);

        add(new JLabel("Email:"));
        add(txtEmail);

        add(new JLabel("Teléfono:"));
        add(txtTelefono);

        add(btnActualizar);
        add(btnEliminar);
    }

    private void agregarEventos() {

        btnBuscar.addActionListener(e -> buscarCliente());

        btnActualizar.addActionListener(e -> actualizarCliente());

        btnEliminar.addActionListener(e -> eliminarCliente());
    }

    private void buscarCliente() {
        try {
            int codigo = Integer.parseInt(txtCodigo.getText());

            Cliente cliente = clienteDAO.buscarPorCodigo(codigo);

            if (cliente != null) {
                txtNombre.setText(cliente.getNombre());
                txtApellido.setText(cliente.getApellido());
                txtEmail.setText(cliente.getEmail());
                txtTelefono.setText(cliente.getTelefono());
            } else {
                JOptionPane.showMessageDialog(this, "Cliente no encontrado");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un código válido");
        }
    }

    private void actualizarCliente() {
        try {
            Cliente cliente = new Cliente();
            cliente.setCodigo(Integer.parseInt(txtCodigo.getText()));
            cliente.setNombre(txtNombre.getText());
            cliente.setApellido(txtApellido.getText());
            cliente.setEmail(txtEmail.getText());
            cliente.setTelefono(txtTelefono.getText());

            clienteDAO.actualizar(cliente);

            JOptionPane.showMessageDialog(this,
                    "Cliente actualizado correctamente");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "Error al actualizar cliente");
        }
    }

    private void eliminarCliente() {

        int opcion = JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro de eliminar el cliente?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION
        );

        if (opcion == JOptionPane.YES_OPTION) {
            try {
                int codigo = Integer.parseInt(txtCodigo.getText());
                clienteDAO.eliminar(codigo);

                JOptionPane.showMessageDialog(this,
                        "Cliente eliminado correctamente");

                limpiarCampos();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,
                        "Error al eliminar cliente");
            }
        }
    }


    private void limpiarCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
    }
}
