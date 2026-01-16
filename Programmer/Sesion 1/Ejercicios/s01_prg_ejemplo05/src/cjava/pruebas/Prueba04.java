package cjava.pruebas;

import cjava.beans.Persona;

public class Prueba04 {

    public static void main(String[] args) {
        Persona x = new Persona();
        x.setNombre("juan");
        foo(x);
        System.out.println("nombre: "+x.getNombre());
    }
    
    static void foo( Persona persona){
        persona = new Persona();
        persona.setNombre("julio");
    }
    
}
