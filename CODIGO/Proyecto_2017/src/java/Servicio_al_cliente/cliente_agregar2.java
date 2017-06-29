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
public class cliente_agregar2 {
    public cliente_agregar2(){
    }
    
    public boolean agregar(int cui,String nombres,String apellidos ,int salario,String usuario,String contraseña,int cod_empresa,int cod_tipo_cliente) throws SQLException{
        
        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;

        
   String insertTableSQL = "Insert into cliente (cui,nombres,apellidos,salario,usuario,contraseña,cod_empresa,cod_tipo_cliente)VALUES"+ "(?,?,?,?,?,?,?,?)";
   
     

        try {
            dbConnection = new conexion().getDBConnection();
            preparedStatement = dbConnection.prepareStatement(insertTableSQL);
          
            
            preparedStatement.setInt(1, cui);
            preparedStatement.setString(2, nombres);
            preparedStatement.setString(3, apellidos);
            preparedStatement.setInt(4, salario);
            preparedStatement.setString(5, usuario);
            preparedStatement.setString(6, contraseña);            
            preparedStatement.setInt(7, cod_empresa);
            preparedStatement.setInt(8, cod_tipo_cliente);
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
