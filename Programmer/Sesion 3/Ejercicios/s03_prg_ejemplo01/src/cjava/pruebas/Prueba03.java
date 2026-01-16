/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.pruebas;

import cjava.beans.Alumno;
import cjava.daos.AlumnoDao;
import cjava.daos.impl.DaoFactory;
import cjava.util.Util;
import static cjava.util.Util.opc;

/**
 *
 * @author emaravi
 */
public class Prueba03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Crear 4 alumnos y mostrar lo siguiente:
        //1. Lista ordeanada en forma alfabetia
        //2. Lista ordenada por promedios
        //3. Nombre y nota de alumnos aprobados.
        DaoFactory fabrica = DaoFactory.getInstance();
        AlumnoDao dao = fabrica.getAlumnoDao(opc);
        Alumno alumno1 = new Alumno(15, "juan",true);
        Alumno alumno2 = new Alumno(10, "maria",false);
        Alumno alumno3 = new Alumno(16, "carlos",true);
        
        dao.create(alumno1);
        dao.create(alumno2);
        dao.create(alumno3);
        dao.create(new Alumno(5,"jose",true));
        for(Alumno a: dao.findAllOrderByNombre()){
            System.out.println(a);
        }
        System.out.println("------------------------");
        for(Alumno a: dao.findAllOrderByPromedio()){
            System.out.println(a);
        }
        System.out.println("------------------------");
        for(Alumno a: dao.findAlumnosPorEstado(Util.APROBADO)){
            System.out.println(a);
        }
    }
    
}
