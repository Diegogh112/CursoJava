/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.pruebas;

import cjava.beans.StringAnalizer;
import cjava.util.Util;

/**
 *
 * @author emaravi
 */
public class Prueba05 {

    
     public static void main(String[] args) {
         String[] cadenas = {"cjava",
                            "xxx",
                            "Phyton viene con fuerza",
                            "cjava siempre para apoyarte",
                            "java 8 es la VOZ",
                            "lambdas en Java8"
        };
        
        StringAnalizer a1 = (a,b)->a.contains(b);
        StringAnalizer a2 = (o, d)->o.equalsIgnoreCase(d);
        StringAnalizer a3 = (o, d)->o.endsWith(d);
        StringAnalizer a4 = (o, d)->o.startsWith(d);
        StringAnalizer a5 = (o, d)->o.length() == d.length();
        StringAnalizer a6 = (o, d)->o.equals(d);
        StringAnalizer a7 = (o, d)->o.compareTo(d) == 0;
        StringAnalizer a8 = (o, d)->o.compareToIgnoreCase(d) == 0;
        StringAnalizer a9 = (o, d)->o.matches(d);
        StringAnalizer a10 = (o, d)->o.regionMatches(true, 0, d, 0, d.length());
         
        Util.searchArray(cadenas,"java",a3);
    }
    
}
