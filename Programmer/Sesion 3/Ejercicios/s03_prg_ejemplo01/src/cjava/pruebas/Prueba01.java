/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.pruebas;

import cjava.beans.Alumno;
import cjava.daos.AlumnoDao;
import cjava.daos.impl.AlumnoDaoImplMemory;
import cjava.util.Util;

/**
 *
 * @author emaravi
 */
public class Prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoDao dao = new AlumnoDaoImplMemory();
        Alumno alumno1 = new Alumno(15, "juan",true);
        Alumno alumno2 = new Alumno(12, "maria",false);
        Alumno alumno3 = new Alumno(16, "carlos",true);
        
        dao.create(alumno1);
        dao.create(alumno2);
        dao.create(alumno3);
        dao.create(new Alumno(12,"jose",true));
        
        for(Alumno a: dao.findAlumnosPorEstado(Util.APROBADO)){
            System.out.println(a);
        }
        
    }
    
}
