/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio_al_cliente;

import Operaciones.conexion;
import Operaciones.login_operario;
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
public class empresas_cargar {

    conexion conexion;
 String nombre;
         int cod_empresa;
    
    public empresas_cargar(){
    }
     public empresas_cargar(int cod,String nombre){
       
     this.nombre=nombre;
this.cod_empresa=cod;
              
    }
    
    
    public List<String> cargar() throws SQLException{
    List user=null;    
    Connection dbConnection = null;
    PreparedStatement preparedStatement = null;
    ArrayList a[] = new ArrayList[2];
    ///La clave es Un String clave
    String selectSQL = "SELECT * FROM empresa";
                    
        try {
            dbConnection = new conexion().getDBConnection();

            preparedStatement = dbConnection.prepareStatement(selectSQL);
         
           //preparedStatement.setString(1, cod_empresa);
          // preparedStatement.setInt(2, nombre); 
         
            ResultSet rs;
            rs = preparedStatement.executeQuery();
            if(rs.next()){
            user=new ArrayList();            
            //user.add(String.valueOf(rs.getInt(1)));
            user.add(rs.getString(2));
            new empresas_cargar(rs.getInt(1),rs.getString(2));
            return user;
             }
      
            rs.close();   
            
        
            
            
            
            
            
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
        return user;
} 

    
    
}
