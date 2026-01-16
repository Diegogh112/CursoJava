
package cjava.pruebas;


import cjava.beans.Animal;
import cjava.beans.AnimalFactory;
import cjava.beans.AnimalFactory2;
import cjava.beans.Tipo;
import cjava.util.Util;

/**
 *
 * @author emaravi
 */
public class Prueba02 {
    public static void main(String[] args) {

       // Animal animal = AnimalFactory.getAnimal(Util.opc);
        //System.out.println(animal.pedirAyuda());

        //Animal animal = AnimalFactory.getAnimalote(Tipo.EPATO);
        //System.out.println(animal.pedirAyuda());

        Animal animal = AnimalFactory2.getInstance().getAnimal(Util.opc);
        System.out.println(animal.pedirAyuda());

        Animal animal2 = AnimalFactory2.getInstance().getAnimal(1);
        System.out.println(animal2.pedirAyuda());

    }

}










