/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio_al_cliente;

import Operaciones.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ariel
 */
public class cliente_renovar_contraseña {
    
    
    
    
    public cliente_renovar_contraseña(){
    }
    
    public boolean crear(int contraseña,int cui) throws SQLException{
        
        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;

        
   String insertTableSQL = "Update cliente set contraseña =? where cui=?";
   
     

        try {
            dbConnection = new conexion().getDBConnection();
            preparedStatement = dbConnection.prepareStatement(insertTableSQL);
          
            
           
            preparedStatement.setInt(1, contraseña);
            preparedStatement.setInt(2, cui);
            preparedStatement.executeUpdate();
            dbConnection.close();

            return true;

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            return false;

        } finally {

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (dbConnection != null) {
                dbConnection.close();
            }

        }
}
    
    
    
    
    
}
