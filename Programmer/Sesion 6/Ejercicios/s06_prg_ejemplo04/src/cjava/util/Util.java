/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.util;

import java.util.ResourceBundle;

/**
 *
 * @author emaravi
 */
public class Util {
   public static final int MEMORY=0;
   public static final int FILE=1;
   public static final int DB=2;
   public static String mensajeAprobado ;
   public static String mensajeADesaprobado;

   public static  int MAX;
   
   public static int opc;
   
   static {
    ResourceBundle properties = ResourceBundle.getBundle("cjava.util.config");
    opc = Integer.parseInt(properties.getString("opc"));
    MAX = Integer.parseInt(properties.getString("maxprom"));
    mensajeAprobado = properties.getString("maprobado");
    mensajeADesaprobado = properties.getString("mdesaprobado");
    
    }

}
