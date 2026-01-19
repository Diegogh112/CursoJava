package cjava.daos.impl;

import cjava.beans.Alumno;
import cjava.dao.AbstractEntity;
import static cjava.util.Util.FILE;
import static cjava.util.Util.MEMORY;
/**
 *
 * @author emaravi
 */
public class DaoFactory {
    
    private DaoFactory() {
    }
    
    public static DaoFactory getInstance() {
        return DaoFactoryHolder.INSTANCE;
    }
    
    private static class DaoFactoryHolder {

        private static final DaoFactory INSTANCE = new DaoFactory();
    }
    
    public AbstractEntity<Alumno> getAlumnoDao(int tipo){
        AbstractEntity<Alumno> servicio=null;
        switch(tipo){
            case MEMORY: servicio = new AlumnoDaoMemory();break;
            case FILE: servicio = new AlumnoDaoFile();break;
        }
        return servicio;
    }
    
}
