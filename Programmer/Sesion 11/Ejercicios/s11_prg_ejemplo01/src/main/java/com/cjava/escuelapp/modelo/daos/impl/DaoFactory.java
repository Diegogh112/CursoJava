package com.cjava.escuelapp.modelo.daos.impl;


import com.cjava.escuelapp.modelo.daos.CursoDao;
import com.cjava.escuelapp.util.Tipo;

public class DaoFactory {
    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        return DaoFactoryHolder.INSTANCE;
    }

    private static class DaoFactoryHolder {
    private static final DaoFactory INSTANCE = new DaoFactory();
    }

    public CursoDao getCursoDao(Tipo tipo) {
        CursoDao dao = null;
        switch (tipo) {
            case STMT:
                dao = new CursoDaoImplStm();
                break;
            case PSTMT:
                dao = new CursoDaoImplPst();
                break;
            case CSTMT:
                dao = new CursoDaoImplCst();
                break;
        }
        return dao;
    }



}
