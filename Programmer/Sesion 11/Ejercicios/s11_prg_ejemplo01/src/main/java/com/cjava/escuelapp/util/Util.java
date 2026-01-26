package com.cjava.escuelapp.util;

import java.util.ResourceBundle;

public class Util {
    public static final String RUTA= "c:/cjava/Datos.ini";

    public static  int opc;
    public static Tipo opc2;
    public static final String ERROR1;
    public static final String ERROR2;
    public static final String ERROR3;
    static{
        ResourceBundle properties = ResourceBundle.getBundle("mensajes");
        ERROR1 = properties.getString("error1");
        ERROR2 = properties.getString("error2");
        ERROR3 = properties.getString("error3");
        opc = Integer.parseInt(properties.getString("opc"));
        opc2 = Tipo.valueOf(properties.getString("opc2"));
    }

}
