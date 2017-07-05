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
public class empresa_buscar_id {
    

    conexion conexion;
 String nombre;
         int cod_empresa;
    
    public empresa_buscar_id(){
    }
     public empresa_buscar_id(int cod,String nombre){
       
     this.nombre=nombre;
this.cod_empresa=cod;
              
    }
    
    
    public int cargar(String nombre) throws SQLException{
       
    int Master=0;
      
      
    Connection dbConnection = null;
        PreparedStatement preparedStatement = null;
        
    String selectSQL = "SELECT * FROM empresa where nombre=?";
                    
        try {
                    
            dbConnection = new conexion().getDBConnection();
            preparedStatement = dbConnection.prepareStatement(selectSQL);
         
           preparedStatement.setString(1, nombre); 
         
            ResultSet rs;
            rs = preparedStatement.executeQuery();
               
              
            while (rs.next()) {
                 
                
               Master=rs.getInt(1);
               /// Master.add(rs.getString(2));
               
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
        return Master;
} 

    
    
    
}
