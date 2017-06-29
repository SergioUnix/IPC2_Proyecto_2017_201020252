/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ariel
 */
public class conexion {
    
        
    //-- DRIVER -- (Definición del Driver de HeidySQL)
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";

    //-- DATOS DE STRING CONN --
    private static final String cHOST = "localhost";
    private static final String cPORT = "3306"; // PORT mariadB
    private static final String cDATABASE = "proyecto";

    // -- DATOS DE USUARIO DE BD -- //
    private static final String cUSER = "root";
    private static final String cPASSWORD = "1990";

    private static final String DB_CONNECTION = "jdbc:mysql://" + cHOST + ":" + cPORT + "/" + cDATABASE;
 

    /**
     * Metodo para conectar a la base de datos.
     * @return Conexion
     */
    public Connection getDBConnection() {
        Connection dbConnection = null;
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            dbConnection = DriverManager.getConnection(DB_CONNECTION, cUSER, cPASSWORD);
            return dbConnection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dbConnection;
}
    
}
