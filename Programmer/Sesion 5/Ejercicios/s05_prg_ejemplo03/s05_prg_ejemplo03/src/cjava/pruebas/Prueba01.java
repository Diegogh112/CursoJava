package cjava.pruebas;

import cjava.modelo.entidades.Curso;
import cjava.servicios.CursoService;
import cjava.servicios.CursoServiceImpl;

public class Prueba01 {

    public static void main (String ... args){
        Curso curso1 = new Curso(100,"programmer 11",5);
        Curso curso2 = new Curso(200,"developer",5);
        Curso curso3 = new Curso(300,"expert",5);

        CursoService servicio = new CursoServiceImpl();
        servicio.grabar(curso1);
        servicio.grabar(curso2);
        servicio.grabar(curso3);

        for(Curso curso: servicio.listar()){
            System.out.println(curso);
        }
    }
}
