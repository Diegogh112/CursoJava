package cjava.pruebas;

import cjava.util.Util;

public class Prueba06 {
    public static void main(String[] args) {
        String[] cadenas = {"cjava",
                            "xxx",
                            "Phyton viene con fuerza",
                            "cjava siempre para apoyarte",
                            "java 11 es la VOZ",
                            "lambdas en Java8"
        };

        //ContainsAnalyzer c = new ContainsAnalyzer();
        //Util.searchArray(cadenas, "java", c);
        Util.searchArray(cadenas, "java", (o, d)->o.contains(d));
    }
}
