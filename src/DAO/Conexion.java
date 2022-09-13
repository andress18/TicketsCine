package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private Connection connection;
    private  String usuario= "root";
    private String password = "Admin2022_";
    private String servidor = "localhost";
    private String puerto = "3306";
    private String nombreDB = "cine";
    
    private String url = "jdbc:mysql://"+servidor+":"+puerto+"/"+nombreDB+"?serverTimeZone=UTC";

    private String driver = "com.mysql.cj.jdbc.Driver";
    public Conexion() {
        
        try {
            
            Class.forName(driver);
            
            connection = DriverManager.getConnection(url, usuario, password);
            
            if (connection != null) {
                System.out.println("Conexion realizada correctamente!!!");
            }
            
        } catch (Exception e) {
            System.err.println("Ocurrio un error en la conexion");
            System.err.println("Mensaje del error: "+e.getMessage());
            System.err.println("Detalle del error: ");
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
