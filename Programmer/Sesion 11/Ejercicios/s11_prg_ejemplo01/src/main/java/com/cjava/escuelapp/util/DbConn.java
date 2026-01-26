package com.cjava.escuelapp.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.PropertyResourceBundle;

public class DbConn {

    private static String driver= null;
    private static String usuario = null;
    private static String password = null;
    private static String url = null;

    static PropertyResourceBundle properties;

    static{
        try{
            properties = new PropertyResourceBundle(new FileInputStream(Util.RUTA));
            url= properties.getString("URL");
            driver= properties.getString("DRIVER");
            usuario= properties.getString("USER");
            password= properties.getString("PASSWORD");

            Class.forName(driver);

        }
        catch(IOException e){
            System.out.println(Util.ERROR2);
        }catch (ClassNotFoundException e) {
            System.out.println(Util.ERROR1);
        }
    }

    public static Connection getConnection(){
        Connection cn= null;
        try{
            cn= DriverManager.getConnection(url,usuario,password);
        }
        catch(SQLException e){
            //Error en base de datos no se puede lograr la conexion
            System.out.println(Util.ERROR3);
        }
        return cn;
    }
}
