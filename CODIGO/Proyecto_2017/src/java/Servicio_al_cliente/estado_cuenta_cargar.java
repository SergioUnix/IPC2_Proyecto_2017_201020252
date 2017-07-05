/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio_al_cliente;

import Operaciones.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ariel
 */
public class estado_cuenta_cargar {
        conexion conexion;
 String nombre;
         int cod_empresa;
    
    public estado_cuenta_cargar(){
    }
     public estado_cuenta_cargar(int cod,String nombre){
       
     this.nombre=nombre;
this.cod_empresa=cod;
              
    }
    
    
    public List<String> cargar() throws SQLException{
        List<String> Master=null;
      List objeto_ini=null;
      
      
    Connection dbConnection = null;
        PreparedStatement preparedStatement = null;
        
    String selectSQL = "SELECT * FROM estado_cuenta";
                    
        try {
                    
            dbConnection = new conexion().getDBConnection();
            preparedStatement = dbConnection.prepareStatement(selectSQL);
         
           //preparedStatement.setString(1, cod_empresa);
          // preparedStatement.setInt(2, nombre); 
         
            ResultSet rs;
            rs = preparedStatement.executeQuery();
               Master=new ArrayList();
               
            while (rs.next()) {
                 
                
               //Master.add(String.valueOf(rs.getInt(1)));
                Master.add(rs.getString(2));
               
               //Master.add(objeto_ini);
                
            }
            rs.close();
           
            
            
            
            return Master;
            
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    dbConnection.close();
                }
            } catch (SQLException se) {
            }// do nothing
            try {
                if (dbConnection != null) {
                    dbConnection.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        return null;
} 

    
    
    
}
