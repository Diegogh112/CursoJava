package cjava.pruebas;

import cjava.beans.ContainsAnalyzer;
import cjava.beans.EndWithAnalyzer;

/**
 *
 * @author emaravi
 */
public class Prueba01 {

    public static void main(String[] args) {
        
        String[] cadenas = {"cjava",
                            "xxx",
                            "Phyton viene con fuerza",
                            "cjava siempre para apoyarte",
                            "java 11 es la VOZ",
                            "lambdas en Java8"
        };
        
        ContainsAnalyzer c = new ContainsAnalyzer();
        EndWithAnalyzer e = new EndWithAnalyzer();
        for(String s : cadenas){
            if(e.analize(s,"java"))
                System.out.println(s);
        }
    }
    
}
