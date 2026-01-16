package cjava.beans;

/**
 *
 * @author emaravi
 */
public class Profesor extends Persona{
    private String categoria;
    private double sueldo;


    public Profesor(String categoria, String nombre, boolean genero) {
        super(nombre, genero);
        this.categoria = categoria.toUpperCase();
    }

    public Profesor() {
        super();
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Profesor{"+super.toString() + "categoria=" + categoria + ", sueldo=" + getSueldo() + '}';
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria.toUpperCase();
    }
    //categoria = A   sueldo = 2000
    //categoria = B   sueldo = 1500
    //categoria = C   sueldo = 1000
    public double getSueldo() {
        //formula  para calcular sueldo
        switch(categoria){
            case "A": sueldo=2000;break;
            case "B": sueldo=1500;break;
            case "C": sueldo=1000;break;
            default:sueldo=0;
        }
        return sueldo;
    }
    
}
