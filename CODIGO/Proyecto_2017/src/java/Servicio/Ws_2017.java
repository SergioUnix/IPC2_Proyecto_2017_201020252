/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Operaciones.login_cliente;
import Operaciones.login_operario;
import Servicio_al_cliente.cliente_agregar;
import Servicio_al_cliente.cliente_crear;
import Servicio_al_cliente.cliente_renovar_contraseña;
import Servicio_al_cliente.cuenta_crear;
import Servicio_al_cliente.cuenta_gestion_estado;
import Servicio_al_cliente.empresa_buscar_id;
import Servicio_al_cliente.empresas_cargar;
import Servicio_al_cliente.estado_cuenta_buscar_id;
import Servicio_al_cliente.estado_cuenta_cargar;
import Servicio_al_cliente.estado_prestamo_buscar_id;
import Servicio_al_cliente.estado_prestamo_cargar;
import Servicio_al_cliente.estados_de_cuenta;
import Servicio_al_cliente.prestamo_agregar;
import Servicio_al_cliente.tipo_cliente_cargar;
import Servicio_al_cliente.tipo_cliente_id;
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

    /**
     * Web service operation
     */
    @WebMethod(operationName = "empresa_cargar")
    public List<String> empresa_cargar() {
     List<String> des=null;
     
               
 empresas_cargar lis=new empresas_cargar();
        try {
            des= lis.cargar();
        } catch (SQLException ex) {
            Logger.getLogger(Ws_2017.class.getName()).log(Level.SEVERE, null, ex);
        }
        
 
       
        return des;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "tipo_cliente_cargar")
    public List<String> tipo_cliente_cargar() {
        List<String> des=null;
     
               
tipo_cliente_cargar lis=new tipo_cliente_cargar();
        try {
            des= lis.cargar();
        } catch (SQLException ex) {
            Logger.getLogger(Ws_2017.class.getName()).log(Level.SEVERE, null, ex);
        }
        
 
        return des;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "tipo_cliente_id")
    public int tipo_cliente_id(@WebParam(name = "nombre") String nombre) {
     
         tipo_cliente_id bus=new tipo_cliente_id();
         int a=0;
         
         
        try {
            a = bus.cargar(nombre);
        } catch (SQLException ex) {
            Logger.getLogger(Ws_2017.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
        
        return a;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "empresa_buscar_id")
    public int empresa_buscar_id(@WebParam(name = "nombre") String nombre) {
       
        empresa_buscar_id bus=new empresa_buscar_id();
         int a=0;
         
         
        try {
            a = bus.cargar(nombre);
        } catch (SQLException ex) {
            Logger.getLogger(Ws_2017.class.getName()).log(Level.SEVERE, null, ex);
        }
         
             
        return a;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cliente_crear")
    public boolean cliente_crear(@WebParam(name = "cui") int cui, @WebParam(name = "nombres") String nombres, @WebParam(name = "apellidos") String apellidos, @WebParam(name = "salario") int salario, @WebParam(name = "usuario") String usuario, @WebParam(name = "contrase\u00f1a") int contraseña, @WebParam(name = "cod_empresa") int cod_empresa, @WebParam(name = "cod_tipo_cliente") int cod_tipo_cliente) {
     boolean res=false;
     
        cliente_crear crea=new cliente_crear();
        try {
            res = crea.crear(cui,nombres,apellidos,salario,usuario,contraseña,cod_empresa,cod_tipo_cliente);
        } catch (SQLException ex) {
            Logger.getLogger(Ws_2017.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return res;
    }
     @WebMethod(operationName = "cliente_crear_individual")
    public boolean cliente_crear_individual(@WebParam(name = "cui") int cui, @WebParam(name = "nombres") String nombres, @WebParam(name = "apellidos") String apellidos, @WebParam(name = "salario") int salario, @WebParam(name = "usuario") String usuario, @WebParam(name = "contrase\u00f1a") int contraseña, @WebParam(name = "cod_tipo_cliente") int cod_tipo_cliente) {
     boolean res=false;
     
        cliente_agregar crea=new cliente_agregar();
        try {
            res = crea.agregar(cui,nombres,apellidos,salario,usuario,contraseña,cod_tipo_cliente);
        } catch (SQLException ex) {
            Logger.getLogger(Ws_2017.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "estado_cuenta_cargar")
    public List<String> estado_cuenta_cargar() {
        estado_cuenta_cargar esta=new estado_cuenta_cargar();
        List<String> res= null;
                
        try {
            res = esta.cargar();
        } catch (SQLException ex) {
            Logger.getLogger(Ws_2017.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cuenta_crear")
    public boolean cuenta_crear(@WebParam(name = "monto_disponible") int monto_disponible, @WebParam(name = "tipo") String tipo, @WebParam(name = "cod_estado_cuenta") int cod_estado_cuenta, @WebParam(name = "cui") int cui) {
       cuenta_crear crear=new cuenta_crear();
       boolean res=false;
       
        try {
            res =crear.crear(monto_disponible, tipo, cod_estado_cuenta, cui);
        } catch (SQLException ex) {
            Logger.getLogger(Ws_2017.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "estado_cuenta_buscar_id")
    public int estado_cuenta_buscar_id(@WebParam(name = "cadena") String cadena) {

        estado_cuenta_buscar_id bus=new estado_cuenta_buscar_id();
         int a=0;
         
         
        try {
            a = bus.cargar(cadena);
        } catch (SQLException ex) {
            Logger.getLogger(Ws_2017.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        
        return a;
    }

    /**
     * Web service operation
     */
     @WebMethod(operationName = "estados_de_cuenta")
    public List<String> estados_de_cuenta(@WebParam(name = "cui") int cui) {
        estados_de_cuenta result=new estados_de_cuenta();
         List<String> a =new ArrayList();
        
          
        try {
            a= result.cargar(cui);
        } catch (SQLException ex) {
            Logger.getLogger(Ws_2017.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return a;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "estado_prestamo_buscar_id")
    public int estado_prestamo_buscar_id(@WebParam(name = "estado") String estado) {
       estado_prestamo_buscar_id bus = new estado_prestamo_buscar_id();
       int a=0;
       
        try {
            a=bus.cargar(estado);
        } catch (SQLException ex) {
            Logger.getLogger(Ws_2017.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        return a;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "estado_prestamo_cargar")
    public List<String> estado_prestamo_cargar() {
     estado_prestamo_cargar us=new estado_prestamo_cargar();
     List<String> a=new ArrayList();
     
        try {
            a=us.cargar();
        } catch (SQLException ex) {
            Logger.getLogger(Ws_2017.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        return a;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cuenta_gestion_estado")
    public boolean cuenta_gestion_estado(@WebParam(name = "cod_estado_cuenta") int cod_estado_cuenta, @WebParam(name = "cui") int cui, @WebParam(name = "cod_cuenta") int cod_cuenta) {
        
        cuenta_gestion_estado bus=new cuenta_gestion_estado();
        boolean z=false;
        
        try {
            z=bus.crear(cod_estado_cuenta, cui, cod_cuenta);
        } catch (SQLException ex) {
            Logger.getLogger(Ws_2017.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return z;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cliente_renovar_contrase\u00f1a")
    public boolean cliente_renovar_contraseña(@WebParam(name = "contrase\u00f1a") int contraseña, @WebParam(name = "cui") int cui) {
        cliente_renovar_contraseña bus= new cliente_renovar_contraseña();
        boolean z= false;
        
        try {
            z=bus.crear(contraseña, cui);
        } catch (SQLException ex) {
            Logger.getLogger(Ws_2017.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return z;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "prestamo_agregar")
    public boolean prestamo_agregar(@WebParam(name = "modo_pago") String modo_pago, @WebParam(name = "monto_solicitado") int monto_solicitado, @WebParam(name = "abono_cancelado") int abono_cancelado, @WebParam(name = "cui") int cui, @WebParam(name = "cod_estado_prestamo") int cod_estado_prestamo) {
       prestamo_agregar bus=new prestamo_agregar();
       boolean z=false;
       
        try {
            z= bus.agregar(modo_pago, monto_solicitado, abono_cancelado, cui, cod_estado_prestamo);
        } catch (SQLException ex) {
            Logger.getLogger(Ws_2017.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return z;
    }

   
}
