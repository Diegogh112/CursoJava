package cjava.modelo.daos;

import cjava.modelo.daos.CursoDao;
import cjava.modelo.daos.impl.CursoDaoImplDb;
import cjava.modelo.daos.impl.CursoDaoImplFile;
import cjava.modelo.daos.impl.CursoDaoImplMemory;

import static cjava.util.Util.MEMORY;
import static cjava.util.Util.FILE;
import static cjava.util.Util.DB;

public class DaoFactory {

    public static CursoDao getCursoDao(int tipo){
        switch (tipo){
            case MEMORY:return new CursoDaoImplMemory();
            case FILE:return new CursoDaoImplFile();
            case DB:return new CursoDaoImplDb();
            default: return null;
        }
    }


}
