package view;

import factory.DAOFactory;
import model.Cliente;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

public class VentanaBuscarCliente extends JFrame {

    private JTextField txtBuscar;
    private JTable tabla;
    private DefaultTableModel modelo;

    public VentanaBuscarCliente(MenuPrincipal menuPrincipal) {
        setTitle("Buscar Clientes");
        setSize(700, 400);
        setLocationRelativeTo(null);
        setLayout(null);

        txtBuscar = new JTextField();
        txtBuscar.setBounds(20, 20, 200, 25);
        add(txtBuscar);

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(240, 20, 100, 25);
        add(btnBuscar);

        modelo = new DefaultTableModel(
                new String[]{"Código", "Nombre", "Apellido", "Email", "Teléfono"}, 0);
        tabla = new JTable(modelo);

        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(20, 70, 640, 260);
        add(scroll);

        btnBuscar.addActionListener(e -> cargarTabla());

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                menuPrincipal.setVisible(true);
            }
        });
    }

    private void cargarTabla() {
        modelo.setRowCount(0);
        List<Cliente> lista =
                DAOFactory.getClienteDAO().buscar(txtBuscar.getText());

        for (Cliente c : lista) {
            modelo.addRow(new Object[]{
                    c.getCodigo(),
                    c.getNombre(),
                    c.getApellido(),
                    c.getEmail(),
                    c.getTelefono()
            });
        }
    }

}
