package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private static final String URL =
            "jdbc:mysql://localhost:3306/ventas?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "1234"; // tu contraseña

    public static Connection getConexion() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            System.out.println("Error de conexión");
            e.printStackTrace();
            return null;
        }
    }
}
