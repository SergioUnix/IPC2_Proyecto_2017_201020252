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
public class prestamo_agregar {
    
     public prestamo_agregar(){
    }
    
    public boolean agregar(String modo_pago,int monto_solicitado,int abono_cancelado,int cui,int cod_estado_prestamo) throws SQLException{
        
        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;

        
   String insertTableSQL = "Insert into prestamo(modo_pago,monto_solicitado,abono_cancelado,cui,cod_estado_prestamo)VALUES"+ "(?,?,?,?,?)";
   
     

        try {
            dbConnection = new conexion().getDBConnection();
            preparedStatement = dbConnection.prepareStatement(insertTableSQL);
          
            
            preparedStatement.setString(1, modo_pago);
            preparedStatement.setInt(2, monto_solicitado);
            preparedStatement.setInt(3, abono_cancelado);
            preparedStatement.setInt(4, cui);
            preparedStatement.setInt(5, cod_estado_prestamo);
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
