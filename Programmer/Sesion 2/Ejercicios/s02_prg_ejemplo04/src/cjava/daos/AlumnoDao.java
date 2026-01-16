/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.daos;

import cjava.entidades.Alumno;

/**
 *
 * @author emaravi
 */
public interface AlumnoDao extends EntityDao<Alumno,Integer>{
   
    public double calcularPromedioFinal();
}
