/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.service;

import cjava.beans.Alumno;
import java.util.List;

/**
 *
 * @author emaravi
 */
public interface AlumnoService {
    public void grabar(Alumno alumno);
    
    public Alumno buscar(Object id);
    public List<Alumno> listar();
    
    public void actualizar(Alumno alumno);
    public void borrar(Object id);
    
    public List<Alumno> filtrarPoEstado(String estado);
    public List<Alumno> ordenarPorPromedio();
    public List<Alumno> ordenarPorNombre();
}
