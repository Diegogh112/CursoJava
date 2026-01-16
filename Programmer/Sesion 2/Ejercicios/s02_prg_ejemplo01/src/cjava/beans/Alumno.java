package cjava.beans;

import java.util.Objects;

/**
 *
 * @author emaravi
 */
public class Alumno extends Persona{
    private double promedio;
    private String estado;

    public Alumno() {
        super();
        //this.promedio=0;
        //this.estado=null;
    }

    public Alumno(double promedio, String nombre,
            boolean genero) {
        super(nombre, genero);
        this.promedio = promedio;
        this.estado = getEstado();
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getEstado() {
        //if(this.promedio>=13) this.estado = "aprobado";
        //else this.estado = "desaprobado";
        //return this.estado;
        this.estado = (getPromedio()>=13)?"aprobado":"desaprobado";
        return this.estado;
    }

    //@Override
    //public void m1(){
    ///    System.out.println("m1 de Alumno");
    //}

    @Override
    public String toString() {

        return "Alumno{" +
                super.toString()+
                "promedio=" + promedio +
                ", estado='" + getEstado() + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno)) return false;
        if (!super.equals(o)) return false;
        Alumno alumno = (Alumno) o;
        return Double.compare(alumno.getPromedio(), getPromedio()) == 0 &&
                Objects.equals(getEstado(), alumno.getEstado());
    }



    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPromedio(), getEstado());
    }



}
