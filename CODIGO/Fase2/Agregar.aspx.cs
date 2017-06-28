using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Agregar : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Unnamed1_Click(object sender, EventArgs e)
    {
        WebServerjava.WebService_Practica1Client service = new WebServerjava.WebService_Practica1Client();
        service.agregar_autor(nombre.Text, int.Parse(cod_autor.Text));

    }
}