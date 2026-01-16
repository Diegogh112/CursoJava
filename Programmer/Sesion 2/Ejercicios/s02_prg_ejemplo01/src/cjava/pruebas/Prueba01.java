package cjava.pruebas;

import cjava.beans.Alumno;

public class Prueba01 {
 
    public static void main(String[] args) {
      Alumno alumno1 = new Alumno(15,"juan",true);
      System.out.println("id: " +alumno1.getId());
      System.out.println("nombre: "+alumno1.getNombre());
      System.out.println("estado: "+ alumno1.getEstado());
      
      Alumno alumno2 = new Alumno(11,"jose",true);
      System.out.println("id: " +alumno2.getId());
      System.out.println("nombre: "+alumno2.getNombre());
      System.out.println("estado: "+ alumno2.getEstado());
        
    }

   
    }
    
