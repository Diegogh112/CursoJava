package cjava.pruebas;

import cjava.beans.Persona;

public class Prueba03 {

    public static void main(String[] args) {
        Persona x = new Persona();
        x.setNombre("juan");
        Persona y = x;
        x.setNombre("jose");
        System.out.println(":::"+y.getNombre());
    }
    
}
