package cjava.daos.impl;

import cjava.beans.Alumno;
import cjava.daos.AlumnoDao;
import cjava.util.AlumnoOrdenPorNombre;
import cjava.util.AlumnoOrdenPorPromedio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author emaravi
 */
public class AlumnoDaoImplMemory implements AlumnoDao{
    
    private List<Alumno> lista;

    public AlumnoDaoImplMemory() {
        lista = new ArrayList<>();
    }
    
    @Override
    public void create(Alumno t) {
        if(find(t.getId())==null)
            lista.add(t);
    }

    @Override
    public Alumno find(Integer v) {
        for(Alumno a:lista) if(a.getId()==v) return a;
        return null;
    }

    @Override
    public List<Alumno> findAll() {
        return lista;
    }

    @Override
    public void update(Alumno t) {
        for(int ind=0; ind<lista.size(); ind++){
            if(lista.get(ind).getId()==t.getId()){
                lista.set(ind,t);
                break;
            }
        }
    }

    @Override
    public void delete(Integer id) {
        lista.remove(find(id));
    }
    
        @Override
    public List<Alumno> findAlumnosPorEstado(String estado) {
         List<Alumno> subList=new ArrayList<>();
        for(Alumno a:lista){
            if(a.getEstado().equals(estado))
                subList.add(a);
        }
        return subList;
    }

    @Override
    public List<Alumno> findAllOrderByNombre() {
        Comparator<Alumno> sortName = new AlumnoOrdenPorNombre();
         Collections.sort(lista, sortName);  
        return lista;
    }

    @Override
    public List<Alumno> findAllOrderByPromedio() {
        Comparator<Alumno> sortName = new AlumnoOrdenPorPromedio();
         Collections.sort(lista, sortName);  
        return lista;
    }
    
    @Override
    public float getPromedioAlumnos() {
        return 0;
    }

    @Override
    public List<Alumno> findAllByPromedio(double min, double max) {
        return null;
    }

}
