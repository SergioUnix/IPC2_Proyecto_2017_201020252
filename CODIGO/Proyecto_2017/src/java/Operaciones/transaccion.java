/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ariel
 */
public class transaccion {
     public transaccion(){
    }
    
     public boolean agregar(String lugar_transaccion,int recargo,String persona_emitio,String fecha,int monto,int cuenta_destino,
             int cod_cuenta,int cod_tipo_transaccion,int cod_operario) throws SQLException{
        
        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;

        
   String insertTableSQL = "Insert into transaccion(lugar_transaccion,recargo,persona_emitio,fecha,monto,cuenta_destino,cod_cuenta,cod_tipo_transaccion,cod_operario)VALUES"+ "(?,?,?,?,?,?,?,?,?)";
   
    

        try {
            dbConnection = new conexion().getDBConnection();
            preparedStatement = dbConnection.prepareStatement(insertTableSQL);
          
            
            preparedStatement.setString(1, lugar_transaccion);
            preparedStatement.setInt(2, recargo);
            preparedStatement.setString(3, persona_emitio);
            preparedStatement.setString(4, fecha);
            preparedStatement.setInt(5,monto); 
            preparedStatement.setInt(6, cuenta_destino); 
            preparedStatement.setInt(7, cod_cuenta); 
            preparedStatement.setInt(8, cod_tipo_transaccion); 
            preparedStatement.setInt(9, cod_operario); 
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
