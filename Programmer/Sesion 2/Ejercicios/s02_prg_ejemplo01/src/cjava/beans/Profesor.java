package cjava.beans;

/**
 *
 * @author emaravi
 */
public class Profesor extends Persona{
    private String categoria;
    private double sueldo;
    

    public Profesor(String categoria, String nombre, boolean genero) {
        super(nombre, genero);
        this.categoria = categoria;
    }

    public double getSueldo2(){
        switch (categoria) {
        case "A" : sueldo = 3000;break; 
        case "B" : sueldo = 2500;break;
        case "C" : sueldo = 3000;break;
        }
        return sueldo;
    }

    public String getCategoria() {
        return categoria;
    }

}
   

