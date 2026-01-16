package lib;

public class Conversion {

    public  static String aCadena(int i){
        return String.valueOf(i);
    }
    public static String aCadena(double d){
        return String.valueOf(d);
    }
    public static double aReal(String s){
        return Double.parseDouble(s);
    }
    public  int aEntero(String s){
        return Integer.parseInt(s);
    }
}
