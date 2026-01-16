package cjava.pruebas;

import cjava.beans.Persona;

/**
 *
 * @author emaravi
 */
public class Prueba05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona x = new Persona("juan", true);
        Persona y = new Persona("juan", true);
        
        if(x.equals(y)){
            System.out.println("son iguales");
        }else{
            System.out.println("no son iguales");
        }
        
        System.out.println("hash x: "+x.hashCode());
        System.out.println("hash y: "+y.hashCode());
    }
    
}
