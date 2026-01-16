package cjava.pruebas;

import cjava.beans.Persona;

public class Prueba01 {
    public static void main(String[] args) {
        Persona persona = new Persona(100,"juan",true);

        System.out.println("nombre:"+persona.nombre());
        System.out.println("genero:"+(persona.genero()?"masc":"fem"));
    }
}
