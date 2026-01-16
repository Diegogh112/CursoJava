/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.pruebas;

import cjava.beans.Alumno;
import cjava.beans.Persona;

/**
 *
 * @author emaravi
 */
public class Prueba02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String... args) {
        Alumno alumno1 = new Alumno(15,"juan",true);
        Alumno alumno2 = new Alumno(15,"juan",true);
        System.out.println(alumno1);
        System.out.println(alumno2);

        if(alumno1.equals(alumno2))
        //if(alumno1==alumno2)
            System.out.println("son iguales");
        else
            System.out.println("NO son iguales");


    }


}
