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
public class cuenta_crear {
    
    public cuenta_crear(){
    }
    
    public boolean crear(int monto_disponible,String tipo ,int cod_estado_cuenta,int cui) throws SQLException{
        
        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;

        
   String insertTableSQL = "Insert into cuenta (monto_disponible,tipo,cod_estado_cuenta,cui)VALUES"+ "(?,?,?,?)";
   
     

        try {
            dbConnection = new conexion().getDBConnection();
            preparedStatement = dbConnection.prepareStatement(insertTableSQL);
          
            
           
            preparedStatement.setInt(1, monto_disponible);
            preparedStatement.setString(2, tipo);
            preparedStatement.setInt(3, cod_estado_cuenta);
            preparedStatement.setInt(4, cui);
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
