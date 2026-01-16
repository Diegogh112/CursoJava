/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.pruebas;

import cjava.beans.Alumno;
import cjava.daos.AlumnoDao;
import cjava.daos.impl.DaoFactory;
import static cjava.util.Util.opc;
//import static java.lang.Math.random;

/**
 *
 * @author emaravi
 */
public class Prueba02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DaoFactory fabrica = DaoFactory.getInstance();
        AlumnoDao dao = fabrica.getAlumnoDao(opc);
        Alumno alumno1 = new Alumno(15, "juan",true);
        Alumno alumno2 = new Alumno(10, "maria",false);
        Alumno alumno3 = new Alumno(16, "carlos",true);
        
        dao.create(alumno1);
        dao.create(alumno2);
        dao.create(alumno3);
        dao.create(new Alumno(5,"jose",true));
       // double r =random();
        for(Alumno a: dao.findAllOrderByNombre()){
            System.out.println(a);
        }
    }
    
}
