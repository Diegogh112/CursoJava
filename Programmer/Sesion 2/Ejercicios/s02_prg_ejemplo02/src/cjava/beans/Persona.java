package cjava.beans;

import cjava.util.Util;

/**
 *
 * @author emaravi
 */
public class Persona {
    private int id;
    private String nombre;
    private boolean genero;

    public Persona(){
        this.id =  Util.generarId();
   }

    public Persona(String nombre, boolean genero) {
        this.id =  Util.generarId();
        this.nombre = nombre;
        this.genero = genero;
    }
    
    //int i =1;
    public int getId() {
        //id=i;
        //i++;
        //Util util = new Util();
        
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }
    
    
}
