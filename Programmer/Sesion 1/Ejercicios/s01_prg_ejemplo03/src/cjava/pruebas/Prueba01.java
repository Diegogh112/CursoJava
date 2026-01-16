/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.pruebas;

import java.io.IOException;

/**
 *
 * @author emaravi
 */
public class Prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("notepad");
            Runtime.getRuntime().gc();

//runtime virtual machine 
        } catch (IOException ex) {
            System.out.println("Error en comando");
        }
    }
    
}
