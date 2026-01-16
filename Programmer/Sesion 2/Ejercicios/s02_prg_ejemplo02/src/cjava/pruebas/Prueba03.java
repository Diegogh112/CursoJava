package cjava.pruebas;

import cjava.beans.Alumno;
import cjava.beans.Persona;

/**
 *
 * @author emaravi
 */
public class Prueba03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Alumno y = new Alumno();

        Persona x = new Alumno();
        x.setNombre("juan");

       // System.out.println(x.getId());

        Alumno y = (Alumno) x;
       // System.out.println(y.getId());
        //System.out.println("nombre de y:"+y.getNombre());
        y.setPromedio(15);

        Alumno z = (Alumno)x;
        //Alumno z  = new Alumno();
        //System.out.println(z.getId());
        System.out.println("estado de z:"+z.getEstado());
        //a. null
        //b. aprobado
        //c. desaprobado
        //d. no compila
        //e. n.a.
    }
    
}
