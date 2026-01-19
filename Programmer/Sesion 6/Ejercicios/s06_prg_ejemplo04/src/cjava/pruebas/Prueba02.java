/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.pruebas;

import cjava.beans.Alumno;
import cjava.service.AlumnoService;
import cjava.service.impl.AlumnoServiceImpl;

/**
 *
 * @author emaravi
 */
public class Prueba02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoService servicio = new AlumnoServiceImpl();
        servicio.grabar(new Alumno(310,14,"pablo2",true));
        servicio.grabar(new Alumno(320,11,"marcos2",true));
        servicio.grabar(new Alumno(330,5,"judas2",true));
        
        System.out.println("Lista de alumnos");
        servicio.listar().stream().forEach((alumno) -> {
            System.out.println(alumno);
        });
    }
    
}
