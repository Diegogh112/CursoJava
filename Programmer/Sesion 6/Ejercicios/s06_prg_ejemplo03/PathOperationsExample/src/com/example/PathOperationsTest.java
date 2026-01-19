package com.example;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathOperationsTest {

    public static void main(String[] args) {
        // Normalize
        System.out.println ("Normalize");
        Path p1 = Paths.get("c:/emaravi01/cjava/./developer/prueba");
        Path pN1 = p1.normalize();
        Path p2 = Paths.get("c:/emaravi01/cjava/developer/../programmer/prueba");
        Path pN2 = p2.normalize();
        System.out.format("Normalized paths: %s%n%s%n", pN1, pN2);
        // Subpath
        System.out.println ("Subpath");
        Path p3 = Paths.get("c:\\emaravi\\cjava\\expert");
        Path p4 = p3.subpath(0, 2);
        System.out.println("Count: " + p3.getNameCount());
        System.out.println(p3.getName(0));
        System.out.println(p4);
        // Resolve
        System.out.println ("Resolve");
        Path p5 = Paths.get("c:/emaravi01/cjava/developer");
        Path p6 = p5.resolve("prueba");
        System.out.println(p6);
        Path p7 = Paths.get("c:/emaravi01/cjava").resolve("developer");
        System.out.println(p7);
        // Relativize
        System.out.println ("Relativize");
        Path p8 = Paths.get("c:/emaravi01/cjava/developer");
        Path p9 = Paths.get("c:/emaravi01/cjava/expert");
        Path p8Top9 = p8.relativize(p9);
        Path p9Top8 = p9.relativize(p8);
        System.out.println(p8Top9);
        System.out.println(p9Top8);
    }
}