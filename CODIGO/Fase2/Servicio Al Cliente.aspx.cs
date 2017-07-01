using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Servicio_Al_Cliente : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

        ListBox1.Items.Add("hello");
        DropDownList1.Items.Add("si se puede");
        
        Wservicio.Ws_2017Client WS = new Wservicio.Ws_2017Client();
       
        String[] helo = null;
        helo= WS.hello("no importa");

        DropDownList1.Items.Add(helo[0]);






        









    }
}