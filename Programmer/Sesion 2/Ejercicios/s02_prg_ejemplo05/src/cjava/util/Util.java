package cjava.util;

import cjava.beans.StringAnalizer;

/**
 *
 * @author emaravi
 */
public class Util {
    public static void searchArray(String[] cadenas, String cadena, StringAnalizer analizador){
       for(String s : cadenas){
            if(analizador.analize(s,cadena))
                System.out.println(s);
        } 
    }
}
