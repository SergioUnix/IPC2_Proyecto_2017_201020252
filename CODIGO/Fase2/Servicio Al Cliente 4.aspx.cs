using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Servicio_Al_Cliente_4 : System.Web.UI.Page
{
    Wserver.Ws_2017Client WS = new Wserver.Ws_2017Client();
    protected void Page_Load(object sender, EventArgs e)
    {
      
      

       


    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        Boolean afirmacion =
                  WS.cuenta_gestion_estado(DropDownList1.SelectedIndex,int.Parse(TextBox1.Text),int.Parse(TextBox2.Text));
        if (afirmacion == false)
        {
            Label4.Text = "Error en datos";

        }
        else
        {
            Label4.Text = "Cambio Correcto";
        }

    }
}