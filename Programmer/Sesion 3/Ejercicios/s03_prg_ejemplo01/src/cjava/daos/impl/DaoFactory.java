package cjava.daos.impl;

import cjava.daos.AlumnoDao;
import cjava.daos.ProfesorDao;
import static cjava.util.Util.MEMORY;
import static cjava.util.Util.FILE;
import static cjava.util.Util.DB;

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
    
    public AlumnoDao getAlumnoDao(int tipo){
        AlumnoDao dao ;
        switch(tipo){
            case MEMORY: dao = new AlumnoDaoImplMemory(); break;
            case FILE: dao = new AlumnoDaoImplFile(); break;
            case DB: dao = new AlumnoDaoImplDataBase(); break;
            default : dao=null;
        }
        return dao;
    }
    
    public AlumnoDao getProfesorDao(int tipo){
        ProfesorDao dao ;
        
        return null;
    }
}
