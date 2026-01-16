package cjava.pruebas;

import cjava.beans.Curso;

public class Prueba04 {
    public static void main(String[] args) {
        Curso curso = Curso.PROGRAMMER;
        switch (curso){
            case PROGRAMMER:
                System.out.println("Java 14");
                break;
            case DEVELOPER:
                System.out.println("Spring Boot + Angular");
                break;
            case EXPERT:
                System.out.println("Microservicios y Cloud");
                break;
            case ARCHITECT:
                System.out.println("La META");
                break;
            default:
                System.out.println("no salio nada");
        }
        /*
        switch (curso) {
            case PROGRAMMER -> System.out.println("Java 14");
            case DEVELOPER -> System.out.println("Spring Boot + Angular");
            case EXPERT -> System.out.println("Microservicios y Cloud");
            case ARCHITECT -> System.out.println("La META");
            default -> System.out.println("no salio nada");
        }
        */
    }


}
