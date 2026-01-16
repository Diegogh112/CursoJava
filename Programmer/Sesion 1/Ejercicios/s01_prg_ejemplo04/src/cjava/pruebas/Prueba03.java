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
public class Prueba03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //dada las siguientes asignaciones
        byte a = 0B0000_010;
        int b = 0b0000_0000_0000_0011;
        double c = 3;
        short x=128; //  0000 0001 0000 0000 
                     //  comp a 1  1111 1111
        String d = "2";
        a = (byte)x;
        System.out.println("a truncado:"+a);
        
        String e = (a>b)?"0":"1";
        //que es lo que se muestra en consola
        System.out.println(d + (a++ + b--)+(c-- -a + e));
        //251
        //250
        //250.0
        
    }
    /**
     * @since 2020
     * @param s1
     * @param d
     * @return 
     */
    public int m1(String s1, int d){
        
        
        return 0 ;
    }
    
    
}
