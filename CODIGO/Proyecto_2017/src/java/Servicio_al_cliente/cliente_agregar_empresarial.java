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
public class cliente_agregar_empresarial {
    
    public cliente_agregar_empresarial(){
    }
    
    public boolean agregar(int cui,String nombres,String apellidos ,int salario,String usuario,int contraseña,int cod_empresa,int cod_tipo_cliente,String encargado1,String encargado2,String encargado3) throws SQLException{
        
        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;

        
   String insertTableSQL = "Insert into cliente (cui,nombres,apellidos,salario,usuario,contraseña,cod_empresa,cod_tipo_cliente,encargado1,encargado2,encargado3)VALUES"+ "(?,?,?,?,?,?,?,?,?,?,?)";
   
     

        try {
            dbConnection = new conexion().getDBConnection();
            preparedStatement = dbConnection.prepareStatement(insertTableSQL);
          
            
            preparedStatement.setInt(1, cui);
            preparedStatement.setString(2, nombres);
            preparedStatement.setString(3, apellidos);
            preparedStatement.setInt(4, salario);
            preparedStatement.setString(5, usuario);
            preparedStatement.setInt(6, contraseña);            
            preparedStatement.setInt(7, cod_empresa);
            preparedStatement.setInt(8, cod_tipo_cliente);
            preparedStatement.setString(9, encargado1);    
            preparedStatement.setString(10, encargado2);    
            preparedStatement.setString(11, encargado3);    
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
