package cjava.pruebas;

import cjava.beans.Persona;

public class Prueba00 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setGenero(true);

        System.out.println(persona);
    }

}
