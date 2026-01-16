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
        this.nombre= null;
        this.genero= false;
        this.id = Util.generarId();
    }

    public Persona(String nombre, boolean genero) {
        this.id = Util.generarId();
        this.nombre = nombre;
        this.genero = genero;
    }
    
    public int getId() {
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

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return  genero == persona.genero && Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, genero);
    }

    public final void m1(){
        System.out.println("no hace nada");
    }
}
