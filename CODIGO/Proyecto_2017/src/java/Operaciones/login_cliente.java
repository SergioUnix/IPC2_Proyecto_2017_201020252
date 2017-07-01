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
public class login_cliente {
    
    
       
    conexion conexion;
    String usuario,nombres,apellidos;
    int cod_tipo_cliente,salario,cod_empresa,contraseña,cui;
    
    
    public login_cliente(){     
    }
    
     public login_cliente(int cu, String no,String ap,int sa,String us,int con,int co,int cd){
       cui=cu;
       nombres=no;
       apellidos=ap;
       salario=sa;
       usuario=us;
       contraseña=co;
       cod_empresa=co;
       cod_tipo_cliente=cd;
              
    }
    
    
    public ArrayList login(String usuario,int contraseña, int cod_tipo_cliente) throws SQLException{
    ArrayList user=null;    
    Connection dbConnection = null;
    PreparedStatement preparedStatement = null;
    ArrayList a[] = new ArrayList[2];
    ///La clave es Un String clave
    String selectSQL = "SELECT * FROM cliente where usuario=? and contraseña=? and cod_tipo_cliente=?";
                    
        try {
            dbConnection = new conexion().getDBConnection();

            preparedStatement = dbConnection.prepareStatement(selectSQL);
         
            preparedStatement.setString(1, usuario);
            preparedStatement.setInt(2, contraseña); 
            preparedStatement.setInt(3, cod_tipo_cliente);
         
            ResultSet rs;
            rs = preparedStatement.executeQuery();
            if(rs.next()){
            user=new ArrayList();            
            user.add(rs.getInt(1));
            user.add(rs.getString(2));
            user.add(rs.getString(3));
            user.add(rs.getInt(4));
            user.add(rs.getString(5));
            user.add(rs.getInt(6));
            user.add(rs.getInt(7));
            user.add(rs.getInt(8));
           new login_cliente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getInt(6),rs.getInt(7),rs.getInt(8));
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
