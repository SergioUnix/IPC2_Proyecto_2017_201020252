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
public class cuenta_gestion_estado {
    
    
    
    public cuenta_gestion_estado(){
    }
    
    public boolean crear(int cod_estado_cuenta,int cui,int cod_cuenta) throws SQLException{
        
        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;

        
   String insertTableSQL = "Update cuenta set cod_estado_cuenta =? where cui=? and cod_cuenta =?";
   
     

        try {
            dbConnection = new conexion().getDBConnection();
            preparedStatement = dbConnection.prepareStatement(insertTableSQL);
          
            
           
            preparedStatement.setInt(1, cod_estado_cuenta);
            preparedStatement.setInt(2, cui);
            preparedStatement.setInt(3, cod_cuenta);
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
