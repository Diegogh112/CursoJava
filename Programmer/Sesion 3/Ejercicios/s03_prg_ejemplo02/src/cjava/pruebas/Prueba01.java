
package cjava.pruebas;

import cjava.beans.Auto;
import cjava.beans.Motor;
import cjava.beans.Neumatico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emaravi
 */
public class Prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor mimotor = new Motor();
        mimotor.setSerie(25487);
        mimotor.setFabricante("ford");
        
        Auto auto = new Auto();
        auto.setPlaca("a1125");
        auto.setModelo("abc");
        auto.setMotor(mimotor);
        
        Neumatico r1 = new Neumatico();
        r1.setAro(13);
        Neumatico r2 = new Neumatico();
        r2.setAro(13);
        Neumatico r3 = new Neumatico();
        r3.setAro(13);
        Neumatico r4 = new Neumatico();
        r4.setAro(13);
        
        List<Neumatico> lista = new ArrayList<>();
        lista.add(r1);
        lista.add(r2);
        lista.add(r3);
        lista.add(r4);
        
        auto.setRuedas(lista);
        System.out.println("serie:" +auto.getMotor().getSerie());
        for(Neumatico n:auto.getRuedas()){
            System.out.println("aro: "+n.getAro());
        }
    }
    
}
