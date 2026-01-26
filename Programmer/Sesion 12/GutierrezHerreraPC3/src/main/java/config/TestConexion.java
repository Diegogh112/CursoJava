package config;

public class TestConexion {
    public static void main(String[] args) {
        if (Conexion.getConexion() != null) {
            System.out.println("Conexión exitosa a la BD");
        } else {
            System.out.println("Error en la conexión");
        }
    }
}
