package com.familia.mx.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author luis_
 */
public class Conexion {
    
    private static Connection conn = null;
    private static String login = "FAMILIA";
    private static String clave = "FAMILIA";
    private static String url = "jdbc:oracle:thin:@localhost:1521:XE";
    
    public static Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, login, clave);
            conn.setAutoCommit(false);
            if(conn != null){
                System.out.println("Conexion Exitosa");
            }else{
                System.err.println("Conexion es erronea ");
            }
        } catch (ClassNotFoundException |SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion Erronea " + e.getMessage());
            System.out.println("Conexion Erronea " + e.getMessage());
        }
        return conn;
    }   
    
    public void desconexion(){
        try {
            conn.close();
        } catch (Exception e) {
            System.err.println("Error al desconectar "+ e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Conexion c = new Conexion();
        c.getConnection();
        
    }
}
