package cjava.beans;

/**
 *
 * @author Profesor
 */
public class Profesor {
    private String categoria;
    private double sueldo;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getSueldo() {
        sueldo=(categoria.equals("A"))?2000:1000;
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Profesor{" + "categoria=" + categoria + ", sueldo=" + sueldo + '}';
    }
    
    
}
