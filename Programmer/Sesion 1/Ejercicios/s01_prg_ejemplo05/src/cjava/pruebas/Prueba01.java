/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.pruebas;

import cjava.beans.Persona;

/**
 *
 * @author emaravi
 */
public class Prueba01 {

    /**     
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.setId(100);
        persona.setNombre("juan");
        persona.setGenero(true);
        
        System.out.println("nombre:"+persona.getNombre());
        System.out.println("genero:"+(persona.isGenero()?"masc":"fem"));
    }
    
}
