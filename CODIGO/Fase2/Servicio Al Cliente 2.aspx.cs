using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Servicio_Al_Cliente_2 : System.Web.UI.Page
{
    Wserver.Ws_2017Client WS = new Wserver.Ws_2017Client();
    protected void Page_Load(object sender, EventArgs e)
    {

       


    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        Boolean afirmacion =
        WS.prestamo_agregar(DropDownList1.Text, int.Parse(TextBox2.Text), int.Parse(TextBox3.Text), int.Parse(TextBox4.Text), 1);
       
        if (afirmacion == false)
        {
            Label6.Text = "Error en datos";

        }
        else
        {
            Label6.Text = "Solicitud Creada";
        }

    }
}