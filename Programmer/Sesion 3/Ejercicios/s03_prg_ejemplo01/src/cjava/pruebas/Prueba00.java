package cjava.pruebas;

import cjava.beans.Profesor;

public class Prueba00 {
  
    public static void main(String[] args) {
       Profesor p = new Profesor();
       p.setNombre("juan");
       p.setCategoria("A");
       p.setGenero(true);
       System.out.println(p);
       
       Profesor q = new Profesor();
       q.setNombre("juan");
       q.setCategoria("A");
       q.setGenero(true);
       System.out.println(q);
       
       boolean b = p.equals(q);
        System.out.println(b);
       
    }
    
}
