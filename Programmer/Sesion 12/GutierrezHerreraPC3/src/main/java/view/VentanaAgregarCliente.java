package view;

import factory.DAOFactory;
import model.Cliente;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaAgregarCliente extends JFrame {

    private JTextField txtNombre, txtApellido, txtEmail, txtTelefono;

    public VentanaAgregarCliente(MenuPrincipal menuPrincipal) {
        setTitle("Agregar Cliente");
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 30, 80, 25);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(120, 30, 200, 25);
        add(txtNombre);

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(20, 70, 80, 25);
        add(lblApellido);

        txtApellido = new JTextField();
        txtApellido.setBounds(120, 70, 200, 25);
        add(txtApellido);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(20, 110, 80, 25);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(120, 110, 200, 25);
        add(txtEmail);

        JLabel lblTelefono = new JLabel("Teléfono:");
        lblTelefono.setBounds(20, 150, 80, 25);
        add(lblTelefono);

        txtTelefono = new JTextField();
        txtTelefono.setBounds(120, 150, 200, 25);
        add(txtTelefono);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(120, 200, 100, 30);
        add(btnGuardar);

        btnGuardar.addActionListener(e -> {
            Cliente c = new Cliente(
                    txtNombre.getText(),
                    txtApellido.getText(),
                    txtEmail.getText(),
                    txtTelefono.getText()
            );
            DAOFactory.getClienteDAO().insertar(c);
            JOptionPane.showMessageDialog(this, "Cliente agregado correctamente");
            dispose();
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                menuPrincipal.setVisible(true);
            }
        });
    }
}
