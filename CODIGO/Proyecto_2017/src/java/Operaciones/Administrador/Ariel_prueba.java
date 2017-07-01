/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones.Administrador;

import Operaciones.login_cliente;
import Operaciones.login_operario;
import Operaciones.transaccion;
import Servicio_al_cliente.cliente_agregar;
import Servicio_al_cliente.cliente_agregar2;
import Servicio_al_cliente.cuenta_crear;
import Servicio_al_cliente.empresas_cargar;
import Servicio_al_cliente.prestamo_agregar;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ariel
 */
public class Ariel_prueba {
     public static void main(String[] args) throws SQLException {
         //Prueba empresas_cargar
         
        empresas_cargar lis=new empresas_cargar();
        List<String> des= lis.cargar();
        
        for(int i =0;i<des.size();i++){
        System.out.println("resultado  ="+des.get(i));
         
        }
         
         
       //Probar ArrayList login_cliente
        //  login_cliente opera=new login_cliente();
         
        // ArrayList b= opera.login("Ser", 123, 1);
         
        // if(b!=null){
        // for(int i=0; i< b.size();i++){
          //   System.out.println(b.get(i));
        // }}else{
          //   System.out.println("Error usuario o contraseña estan mal");
         
        // }
         



//Probar ArrayList login_operario
         //login_operario oper=new login_operario();
         
       //  ArrayList a= oper.login("SergioUnix", 1990, 1);
         
        // if(a!=null){
        // for(int i=0; i< a.size();i++){
          //   System.out.println(a.get(i));
        // }}else{
          //   System.out.println("Error usuario o contraseña estan mal");
         
        // }
         

         



//Realizar Transaccion
       //  transaccion b=new transaccion();
        // b.agregar("Banco", 0, "Enrique", "29/06/2017", 4500, 1, 4, 1, 2);
         
         //Agregar tipo Transaccion
      //  tipo_transaccion_agregar tipo=new tipo_transaccion_agregar();
        // tipo.agregar("Retipo Cuenta Ahorro");
        // tipo.agregar("Retiro Cuenta Monetaria");
        // tipo.agregar("Cambio Cheque");
         //tipo.agregar("Deposito Cuenta Monetaria");
        // tipo.agregar("Deposito Efectivo");
        // tipo.agregar("Deposito Con Cheque");
         
         
         //Agregar Operador
       // operario_agregar op=new operario_agregar();
        //op.agregar("SergioUnix", 1990, "Sergio Ariel", "Ramírez Castro", "Movistar", 1);
          // op.agregar("CajaUnix", 1990, "Arturo", "García", null, 6);
         
         
         //Crear Rol
        // rol_agregar rol=new rol_agregar();
        // rol.agregar("Administrador");
        // rol.agregar("Gerente Empresa");
        // rol.agregar("Gerente Banco");
        // rol.agregar("Servicio Al Cliente");
        // rol.agregar("Caja");
         
         
         
         //Crear Cuenta
     //   cuenta_crear cuen=new cuenta_crear();
       // cuen.crear(12500, "Monetaria", 1, 203040);
       //cuen.crear(5000, "Ahorro", 1, 406070);
      // cuen.crear(12500, "Ahorro a Plazo Fijo", 1, 306070);
      // cuen.crear(12500, "Ahorro a Plazo Fijo", 1, 106070);
         
         
//Estados de Cuenta
      //   estado_cuenta_agregar esta=new estado_cuenta_agregar();
       //  esta.agregar("Activo");
       //  esta.agregar("Bloqueado");
        // esta.agregar("Suspendido");
         
         
         
 //Agregar Prestamo
     //    prestamo_agregar ar=new prestamo_agregar();
       //  ar.agregar("Quincenal", 11000, 0,102030,1);
       //  ar.agregar("Mensual", 12000, 0,201020,1);
        // ar.agregar("Trimestral", 6000, 0,203040,1);
          
 
 //Agregar estados de prestamos
   //      estado_prestamo_agregar es=new estado_prestamo_agregar();
     //    es.agregar("Pendiente");
      //   es.agregar("Aceptado");
       //  es.agregar("Rechazado");
 
 
 //Usuario Individual codigo individual es 1
  //cliente_agregar a=new cliente_agregar();
// a.agregar(201020, "Sergio", "Ramirez", 8000, "Ser", "123", 1);
  //a.agregar(102030, "Roberto", "Gym", 3000, "Rob", "1234", 1);
 // a.agregar(203040, "Vero", "Garcia", 2000,"Ver", "12345", 1);
  
//Usuario Empresarial codigo empresarial es 2
  // cliente_agregar2 b= new cliente_agregar2();
  // b.agregar(406070, "Steve", "Darius", 2000,"Ste", "12",3, 2);
  // b.agregar(106070, "Carol", "Morales", 5000,"Caro", "2030",4, 2);
  // b.agregar(306070, "Nicky", "Lopez", 2000,"Nic", "9090",2, 2);
   
 
//  tipo_cliente_agregar cli=new tipo_cliente_agregar();
   //cli.agregar("Individual");
   //cli.agregar("Empresarial");


//   empresa_agregar arte = new empresa_agregar();
    // arte.agregar("Movistar", 200);
    // arte.agregar("Campero", 300);
  //  arte.agregar("Pepsi", 400);
     
 
    }    

    
}
