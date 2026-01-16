package cjava.beans;

import static cjava.util.Util.APROBADO;
import static cjava.util.Util.DESAPROBADO;
import static cjava.util.Util.MAXPROM;
/**
 *
 * @author emaravi
 */
public class Alumno extends Persona{
    private double promedio;
    private String estado;

    public Alumno() {
    }

    public Alumno(double promedio, String nombre, 
            boolean genero) {
        super(nombre, genero);
        this.promedio = promedio;
    }
    
    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getEstado() {
        if(promedio>=MAXPROM) estado = APROBADO;
        else estado =DESAPROBADO;
        return estado;
    }

    @Override
    public String toString() {
        return "Alumno{"+super.toString()+ "promedio=" + promedio + ", estado=" + getEstado() + '}';
    }

    
    

}
