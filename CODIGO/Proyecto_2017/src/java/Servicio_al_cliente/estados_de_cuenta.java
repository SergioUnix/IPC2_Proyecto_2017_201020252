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
public class estados_de_cuenta {
    
    

    conexion conexion;
 String nombre;
         int cod_empresa;
    
    public estados_de_cuenta(){
    }
     public estados_de_cuenta(int cod,String nombre){
       
     this.nombre=nombre;
this.cod_empresa=cod;
              
    }
    
    
    public List<String> cargar(int cui) throws SQLException{
        List<String> Master=null;
     // List objeto_ini=null;
      
      
    Connection dbConnection = null;
        PreparedStatement preparedStatement = null;
        
    String selectSQL = "select cliente.nombres , cuenta.cod_cuenta,cuenta.monto_disponible, cuenta.tipo,estado_cuenta.descripcion from cuenta inner join\n" +
"cliente on cuenta.cui = cliente.cui inner join estado_cuenta on estado_cuenta.cod_estado_cuenta= cuenta.cod_estado_cuenta where cuenta.cui=?";
                    
        try {
                    
            dbConnection = new conexion().getDBConnection();
            preparedStatement = dbConnection.prepareStatement(selectSQL);
         
           preparedStatement.setInt(1, cui);
          // preparedStatement.setInt(2, nombre); 
         
            ResultSet rs;
            rs = preparedStatement.executeQuery();
               Master=new ArrayList();
               
            while (rs.next()) {
                Master.add("Nombres :");
                Master.add(rs.getString(1));
                Master.add("Código de Cuenta :");
                Master.add(String.valueOf(rs.getInt(2)));
                Master.add("Monto Disponible :");
                Master.add(String.valueOf(rs.getInt(3)));
                Master.add("Tipo de Cuenta :");
                Master.add(rs.getString(4));
                Master.add("Estado de cuenta :");
                Master.add(rs.getString(5));
                Master.add(" ");
                Master.add(" ");
                
              // Master.add(objeto_ini);
                
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
