package cjava.daos.impl;

import java.util.ArrayList;
import java.util.List;
import cjava.beans.Alumno;
import cjava.dao.AbstractEntity;

/**
 *
 * @author Profesor
 */
public class AlumnoDaoMemory extends AbstractEntity<Alumno>{

    List<Alumno> lAlumno;
    
    public AlumnoDaoMemory(){
        lAlumno = new ArrayList<>();
    }
    
    @Override
    public void create(Alumno t) {
        if(find(t.getId())==null)
            lAlumno.add(t);
    }

    @Override
    public void update(Alumno t) {
        for(int i=0; i<lAlumno.size(); i++){
            if(lAlumno.get(i).getId()==t.getId()){
                lAlumno.set(i,t);
                break;
            }
        }
        
    }

    @Override
    public void delete(int id) {
        for(int i=0; i<lAlumno.size(); i++){
            if(lAlumno.get(i).getId()==id){
                lAlumno.remove(i);
                break;
            }
        }
    }

    @Override
    public Alumno find(int id) {
        for(Alumno alumno:lAlumno){
            if(alumno.getId()==id)
                return alumno;
        }
        return null;
    }

    @Override
    public List<Alumno> findAll() {
        return lAlumno;
    }
    
}
