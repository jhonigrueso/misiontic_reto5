/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5.util;
import java.io.File;//Para verificación de longitud de base de datos

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Windows 10
 */
public class JDBCUtilities {
       // Atributos de clase para gestión de conexión con la base de datos
    
 private static final String UBICACION_BD = "D:\\Windows 10\\Documents\\NetBeansProjects\\misiontic\\ProyectosConstruccion.db";
    public static Connection getConnection() throws SQLException {
    String url = "jdbc:sqlite:" + UBICACION_BD;
    return DriverManager.getConnection(url);
    }
    
    public static boolean isDatabaseEmpty() {
        File file = new File(UBICACION_BD);
        return file.length() == 0;
    }
}
