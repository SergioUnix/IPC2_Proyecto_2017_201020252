/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones.Administrador;

import Operaciones.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ariel
 */
public class operario_agregar {
    
      public operario_agregar(){
    }
    
    public boolean agregar(String usuario,int contraseña,String nombre,String apellidos ,String empresa_pertenece,int cod_rol) throws SQLException{
        
        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;

        
   String insertTableSQL = "Insert into operario (usuario,contraseña,nombre,apellidos,empresa_pertenece,cod_rol)VALUES"+ "(?,?,?,?,?,?)";
   
    

        try {
            dbConnection = new conexion().getDBConnection();
            preparedStatement = dbConnection.prepareStatement(insertTableSQL);
          
            
            preparedStatement.setString(1, usuario);
            preparedStatement.setInt(2, contraseña);
            preparedStatement.setString(3, nombre);
            preparedStatement.setString(4, apellidos);
            preparedStatement.setString(5, empresa_pertenece);
            preparedStatement.setInt(6, cod_rol); 
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
