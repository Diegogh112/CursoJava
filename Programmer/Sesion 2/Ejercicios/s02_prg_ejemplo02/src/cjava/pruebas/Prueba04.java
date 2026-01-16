/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.pruebas;

import cjava.beans.Profesor;

/**
 *
 * @author emaravi
 */
public class Prueba04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor p1 = new Profesor("B","juan",true);
        System.out.println(p1.getNombre()+":"+p1.getSueldo());
        
        
        
    }
    
}
