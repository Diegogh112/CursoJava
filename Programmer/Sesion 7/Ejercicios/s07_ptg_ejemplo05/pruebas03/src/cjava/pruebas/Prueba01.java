package cjava.pruebas;

import cjava.beans.Alumno;
import cjava.dao.AlumnoDao;
import cjava.dao.impl.DaoFactory;
import cjava.util.Util;

public class Prueba01 {

    public static void main(String[] args) {
        AlumnoDao dao;
        DaoFactory fabrica = DaoFactory.getInstance();
        dao = fabrica.getAlumnoDao(Util.opc);
        dao.create(new Alumno(100,14,"juan",true));
        dao.create(new Alumno(200,10,"jose",true));
        dao.create(new Alumno(300,17,"carlos",true));
        
        System.out.println("Lista de alumnos");
        dao.orderByNombre().stream().forEach((a) -> {
            System.out.println(a);
        });
        
        System.out.println("Lista de alumnos aprobados");
        dao.filterByEstado(Util.mensajeAprobado).stream().forEach((a) -> {
            System.out.println(a);
        });
    }
    
}
