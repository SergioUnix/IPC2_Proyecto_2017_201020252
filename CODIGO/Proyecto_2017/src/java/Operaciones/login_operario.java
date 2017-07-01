/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ariel
 */
public class login_operario {
    
       
    conexion conexion;
    String usuario,nombre,apellidos,empresa_pertenece;
    int cod_rol,cod_operario,contraseña;
    
    
    public login_operario(){     
    }
    
     public login_operario(int cod,String usu,int con,String nom,String ape,String emp,int cod_rol){
         ArrayList envio=null;
       cod_operario=cod;
       usuario=usu;
       contraseña=con;
       nombre=nom;
       apellidos = ape;
       empresa_pertenece=emp;
       this.cod_rol=cod_rol;
       
              
    }
    
    
    public ArrayList login(String usuario,int contraseña, int cod_rol) throws SQLException{
    ArrayList user=null;    
    Connection dbConnection = null;
    PreparedStatement preparedStatement = null;
    ArrayList a[] = new ArrayList[2];
    ///La clave es Un String clave
    String selectSQL = "SELECT * FROM operario where usuario=? and contraseña=? and cod_rol=?";
                    
        try {
            dbConnection = new conexion().getDBConnection();

            preparedStatement = dbConnection.prepareStatement(selectSQL);
         
            preparedStatement.setString(1, usuario);
            preparedStatement.setInt(2, contraseña); 
            preparedStatement.setInt(3, cod_rol);
         
            ResultSet rs;
            rs = preparedStatement.executeQuery();
            if(rs.next()){
            user=new ArrayList();            
            user.add(rs.getInt(1));
            user.add(rs.getString(2));
            user.add(rs.getInt(3));
            user.add(rs.getString(4));
            user.add(rs.getString(5));
            user.add(rs.getString(6));
            user.add(rs.getInt(7));
           new login_operario(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));
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
