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
public class Prueba04 {

     public static void main(String[] args) {
         String[] cadenas = {"cjava",
                            "xxx",
                            "Phyton viene con fuerza",
                            "cjava siempre para apoyarte",
                            "java 8 es la VOZ",
                            "lambdas en Java8"
        };
        //ContainsAnalyzer c = new ContainsAnalyzer(); 
        Util.searchArray(cadenas,"java", (x, y)->x.endsWith(y));
    }
}
