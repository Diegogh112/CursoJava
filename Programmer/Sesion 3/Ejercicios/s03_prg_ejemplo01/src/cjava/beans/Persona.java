package cjava.beans;

import cjava.util.Util;
import java.util.Objects;

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
        if(nombre!=null)
            this.nombre = nombre;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", genero=" + genero + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.id;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + (this.genero ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.genero != other.genero) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    



    
}
