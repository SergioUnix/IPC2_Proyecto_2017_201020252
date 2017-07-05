using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Servicio_Al_Cliente_1 : System.Web.UI.Page
{
    
    Wserver.Ws_2017Client WS = new Wserver.Ws_2017Client();
    protected void Page_Load(object sender, EventArgs e)
    {

        DropDownList1.Items.Clear();
        DropDownList2.Items.Clear();


        DropDownList1.Items.Add("Ahorro a Plazo Fijo");
        DropDownList1.Items.Add("Ahorro");
        DropDownList1.Items.Add("Monetaria");

          String [] cadena = WS.estado_cuenta_cargar();
        for (int i = 0; i < cadena.Length; i++)
        {
            DropDownList2.Items.Add(cadena[i]);
        }

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        Boolean afirmacion =
                 WS.cuenta_crear(int.Parse(TextBox1.Text), DropDownList1.Text, WS.estado_cuenta_buscar_id(DropDownList2.Text), int.Parse(TextBox4.Text));
        if (afirmacion == false)
        {
            Estado.Text = "Error en datos";

        }
        else
        {
            Estado.Text = "Cuenta Creada Exitosamente";
        }
       



 
    }
}