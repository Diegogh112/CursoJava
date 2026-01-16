package cjava.beans;

/**
 *
 * @author emaravi
 */
public class Persona {
    private int id;
    private String nombre;
    private boolean genero;

    public Persona(){
        this.id=0;
        
        this.nombre= null;
        this.genero= false;
    }

    public Persona(int id, String nombre, boolean genero) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    
}
