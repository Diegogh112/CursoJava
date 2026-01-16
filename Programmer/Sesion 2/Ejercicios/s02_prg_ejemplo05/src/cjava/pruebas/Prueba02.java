package cjava.pruebas;

import cjava.beans.ContainsAnalyzer;
import cjava.beans.EndWithAnalyzer;
import cjava.util.Util;

/**
 *
 * @author emaravi
 */
public class Prueba02 {

    public static void main(String[] args) {
         String[] cadenas = {"cjava",
                            "xxx",
                            "Phyton viene con fuerza",
                            "cjava siempre para apoyarte",
                            "java 8 es la VOZ",
                            "lambdas en Java8"
        };
        ContainsAnalyzer c = new ContainsAnalyzer();
        EndWithAnalyzer e = new EndWithAnalyzer();
        Util.searchArray(cadenas,"java", e);
    }
    
}
