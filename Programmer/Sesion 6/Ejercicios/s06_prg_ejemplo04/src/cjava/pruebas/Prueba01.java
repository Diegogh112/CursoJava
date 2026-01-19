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
        dao.create(new Alumno(550,12,"aeropajita",true));
        dao.create(new Alumno(650,14,"floricienta",true));
        dao.create(new Alumno(750,12,"quirozcienta",true));
        
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
