/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.dao;

import cjava.beans.Alumno;
import java.util.List;

/**
 *
 * @author emaravi
 */
public interface AlumnoDao extends EntidadDao<Alumno>{
    public List<Alumno> filterByEstado(String estado);
    public List<Alumno> orderByPromedio();
    public List<Alumno> orderByNombre();
}
