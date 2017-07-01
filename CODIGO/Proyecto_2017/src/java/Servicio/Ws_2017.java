/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Operaciones.login_cliente;
import Operaciones.login_operario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Ariel
 */
@WebService(serviceName = "Ws_2017")
public class Ws_2017 {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public List<String> hello(@WebParam(name = "name") String txt) {
        List C=new ArrayList();
        
        
        List<String> A= new ArrayList();
        
        A.add("hello");
        
        return A;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login_cliente")
    public boolean login_cliente(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrase\u00f1a") int contraseña, @WebParam(name = "cod_tipo_cliente") int cod_tipo_cliente) {
          login_cliente opera=new login_cliente();
      
          ArrayList b;
          b=null;
          boolean res=false;
        try {
            b = opera.login(usuario, contraseña, cod_tipo_cliente);
        } catch (SQLException ex) {
            Logger.getLogger(Ws_2017.class.getName()).log(Level.SEVERE, null, ex);
        }     
        
       
         if(b!=null)
             res=true;
       
        
       return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login_operario")
    public boolean login_operario(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrase\u00f1a") int contraseña, @WebParam(name = "cod_rol") int cod_rol) {
    
        login_operario oper=new login_operario();
      ArrayList a;
          a=null;
          boolean res=false;
          
        
        try {
           a= oper.login(usuario,contraseña, cod_rol);
        } catch (SQLException ex) {
            Logger.getLogger(Ws_2017.class.getName()).log(Level.SEVERE, null, ex);
        }
         if(a!=null)
             res=true;
       
        return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Hello_prueba")
    public ArrayList Hello_prueba(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrase\u00f1a") int contraseña, @WebParam(name = "cod_rol") int cod_rol) {
    
          login_operario oper=new login_operario();
      ArrayList a;
          a=null;
       
          
        
        try {
           a= oper.login(usuario,contraseña, cod_rol);
        } catch (SQLException ex) {
            Logger.getLogger(Ws_2017.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return a;
    }
}
