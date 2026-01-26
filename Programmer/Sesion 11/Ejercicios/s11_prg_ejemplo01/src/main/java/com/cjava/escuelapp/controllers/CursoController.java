package com.cjava.escuelapp.controllers;

import com.cjava.escuelapp.modelo.entidades.Curso;
import com.cjava.escuelapp.servicio.CursoService;
import com.cjava.escuelapp.servicio.impl.CursoServiceImpl;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CursoController {
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtCreditos;
    @FXML
    private TextArea txtSalida;
    @FXML
    private Button btnGuardar;
    @FXML
    private Button btnListar;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnActualizar;
    private CursoService servicio;
    public CursoController() {
        servicio = new CursoServiceImpl();
    }
    @FXML
    public void btnGuardarClick() {
        Curso curso = new Curso(txtId.getText(), txtNombre.getText(), Integer.parseInt(txtCreditos.getText()));
        servicio.grabar(curso);
        txtSalida.setText("curso grabado");
    }
    @FXML
    public void btnEliminarClick() {
        servicio.eliminar(txtId.getText());
        txtSalida.setText("curso eliminado");
    }

    @FXML
    public void btnActualizarClick() {
        Curso curso = new Curso(txtId.getText(), txtNombre.getText(), Integer.parseInt(txtCreditos.getText()));
        servicio.actualizar(curso);
        txtSalida.setText("curso actualizado");
    }

    @FXML
    public void btnListarClick() {
        txtSalida.setText("");
        servicio.listar().forEach(c -> txtSalida.appendText(c + "\n"));
    }
}
