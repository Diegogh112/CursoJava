package cjava.entidades;

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
        if(promedio>=13) estado = "aprobado";
        else estado = "desaprobado";
        return estado;
    }

    @Override
    public String toString() {
        return "Alumno{"+ super.toString()+ "  promedio=" + promedio + ", estado=" + getEstado() + '}';
    }

    

}
