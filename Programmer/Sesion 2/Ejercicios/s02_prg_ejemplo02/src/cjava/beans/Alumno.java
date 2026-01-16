package cjava.beans;

import cjava.util.Util;

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
//        if(promedio>=13) estado = "aprobado";
//        else estado = "desaprobado";
//        return estado;
          this.estado = (promedio>=Util.PROMEDIO)?Util.mensaje01:Util.mensaje02;
          return estado;
    }


}
