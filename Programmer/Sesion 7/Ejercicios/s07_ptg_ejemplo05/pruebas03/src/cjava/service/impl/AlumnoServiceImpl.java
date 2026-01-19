/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.service.impl;

import cjava.beans.Alumno;
import cjava.dao.AlumnoDao;
import cjava.dao.impl.DaoFactory;
import cjava.service.AlumnoService;
import static cjava.util.Util.opc;
import java.util.List;

/**
 *
 * @author emaravi
 */
public class AlumnoServiceImpl implements AlumnoService{
    private AlumnoDao dao;

    public AlumnoServiceImpl() {
        DaoFactory fabrica = DaoFactory.getInstance();
        dao = fabrica.getAlumnoDao(opc);
    }
    
    @Override
    public void grabar(Alumno alumno) {
        dao.create(alumno);
    }

    @Override
    public Alumno buscar(Object id) {
        return dao.find(id);
    }

    @Override
    public List<Alumno> listar() {
        return dao.findAll();
    }

    @Override
    public void actualizar(Alumno alumno) {
        dao.update(alumno);
    }

    @Override
    public void borrar(Object id) {
        dao.delete(id);
    }

    @Override
    public List<Alumno> filtrarPoEstado(String estado) {
        return dao.filterByEstado(estado);
    }

    @Override
    public List<Alumno> ordenarPorPromedio() {
        return dao.orderByPromedio();
    }

    @Override
    public List<Alumno> ordenarPorNombre() {
        return dao.orderByNombre();
    }
    
}
