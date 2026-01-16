package util;

import lib.Conversion;

public class Operacion  extends Conversion {
    public static String sumar(String s1,String s2){
        return aCadena(aReal(s1)+aReal(s2));
    }
}
