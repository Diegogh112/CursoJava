package cjava.beans;

/**
 *
 * @author Profesor
 */
public class Alumno extends Persona{
    private double promedio;
    private String estado;

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getEstado() {
        estado=(promedio>=13)?"aprobado":"desaprobado";
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "promedio=" + promedio + ", estado=" + estado + '}';
    }
    
    
    
}
