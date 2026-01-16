/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.pruebas;

/**
 *
 * @author emaravi
 */
public class Prueba02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var a = 2;
        var b = a++;
        System.out.println(b);
        var c = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    
}
