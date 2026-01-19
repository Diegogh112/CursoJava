package Entidades;

public class Expositor {
    private int codigo;

    private String nombre;

    private String apellidos;

    private double sueldo;

    private String correo;

    public Expositor() {
    }

    public Expositor(int codigo, String nombre, String apellidos, double sueldo, String correo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldo = sueldo;
        this.correo = correo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}

/*Los expositores tienen código, nombre, apellidos, sueldo y correo, los asistentes al evento tienen código, nombre, apellidos, correo, teléfono y dirección.
Observación:
Para este caso se debe tener en cuenta que un evento solo debe tener un expositor y muchos asistentes. Un asistente solo puede ingresar a un evento.
Cree una aplicación Java con su apellido paterno y nombre.*/
