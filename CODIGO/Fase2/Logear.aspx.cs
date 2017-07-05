using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Collections;

public partial class _Default : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {

        Wserver.Ws_2017Client Wserver = new Wserver.Ws_2017Client();
        String usuario = TextBox1.Text;
        int contraseña = int.Parse(TextBox2.Text);
         String a = DropDownList1.Text;
        int tipo = DropDownList1.SelectedIndex;
        Boolean res = false;
        String direccion = "";

       


      
        
        switch (a)
        {
            case "Administrador": 
              direccion = "MasterPage2.aspx";
                res = Wserver.login_operario(usuario, contraseña, tipo);
                break;
            case "Gerente Banco":
                direccion = "Gerente Banco.aspx";
                res = Wserver.login_operario(usuario, contraseña, tipo);
                break;
            case "Gerente Empresa":
                direccion = "Gerente Empresa.aspx";
                res = Wserver.login_operario(usuario, contraseña, tipo);
                break;
            case "Caja":
                direccion = "Caja.aspx";
                res = Wserver.login_operario(usuario, contraseña, tipo);
                break;
            case "Servicio Al Cliente":
                direccion = "Servicio Al Cliente.aspx";
                res = Wserver.login_operario(usuario, contraseña, tipo);
                break;
            case "Individual":
                direccion = "Individual.aspx";
                res = Wserver.login_cliente(usuario, contraseña, 1);
                break;
            case "Empresarial":
                direccion = "Empresarial.aspx";
                res = Wserver.login_cliente(usuario, contraseña, 2);
                break;

            default:
                break;
                    }

       

        if (res == false)
        {
            Response.Redirect("Logear.aspx");
        }
        else
        {
           Session.Add(usuario, a);
            Response.Redirect(direccion);
        }







    }
    
}