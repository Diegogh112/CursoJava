/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.daos;

import cjava.beans.Alumno;
import java.util.List;

/**
 *
 * @author emaravi
 */
public interface AlumnoDao extends EntidadDao<Alumno,Integer>{
     
    public List<Alumno> findAlumnosPorEstado(String estado);
    public List<Alumno> findAllOrderByNombre();
    public List<Alumno> findAllOrderByPromedio();
    public float getPromedioAlumnos();
    public List<Alumno> findAllByPromedio(double min, double max);
    
}
