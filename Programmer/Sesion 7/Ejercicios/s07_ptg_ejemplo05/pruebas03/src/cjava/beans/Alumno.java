package cjava.beans;

import cjava.util.Util;
import java.io.Serializable;

/**
 *
 * @author emaravi
 */
public class Alumno extends Persona implements Serializable{
    private transient double promedio;
    private String estado;

    public Alumno() {
    }

    public Alumno(int id,double promedio, String nombre, 
            boolean genero) {
        super(id,nombre, genero);
        this.promedio = promedio;
    }
    
    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getEstado() {
        if(promedio>=Util.MAX) estado = Util.mensajeAprobado;
        else estado = Util.mensajeADesaprobado;
        return estado;
    }

    @Override
    public String toString() {
        return "Alumno{"+ super.toString()+ "  promedio=" + promedio + ", estado=" + getEstado() + '}';
    }

    

}
