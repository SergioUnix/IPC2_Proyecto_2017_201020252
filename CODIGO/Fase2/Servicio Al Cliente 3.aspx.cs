using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Servicio_Al_Cliente_3 : System.Web.UI.Page
{
    Wserver.Ws_2017Client WS = new Wserver.Ws_2017Client();

    protected void Page_Load(object sender, EventArgs e)
    { 
       
    }





    protected void Button1_Click(object sender, EventArgs e)
    {
       String [] cadena = WS.estados_de_cuenta(int.Parse(TextBox1.Text));
        for (int i = 0; i < cadena.Length; i++)
        {
            ListBox1.Items.Add(cadena[i]);
        }


    }
}