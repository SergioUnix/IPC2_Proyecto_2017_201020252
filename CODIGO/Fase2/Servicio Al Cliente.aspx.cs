using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Servicio_Al_Cliente : System.Web.UI.Page
{
   
        Wserver.Ws_2017Client WS = new Wserver.Ws_2017Client();
    protected void Page_Load(object sender, EventArgs e)
    {
       


        Random rnd = new Random();
        int y = rnd.Next(1000, 10001);
        TextBox6.Text = y.ToString();

        DropDownList2.Items.Clear();

        DropDownList2.Items.Add("");

        String[] empresas =WS.empresa_cargar();

        for (int i = 0; i < empresas.Length; i++)
        {
            DropDownList2.Items.Add(empresas[i]);
        }
        
       



    }

    protected void Button1_Click(object sender, EventArgs e)
    {

        if (DropDownList1.SelectedIndex == 1)
        {
            Boolean afirmacion = WS.cliente_crear_individual(int.Parse(TextBox1.Text), TextBox2.Text, TextBox3.Text,
                                   int.Parse(TextBox4.Text), TextBox5.Text, int.Parse(TextBox6.Text),
                                   DropDownList1.SelectedIndex);
            if (afirmacion == false)
            { Labell.Text = "Error en datos"; }
            else
            { Labell.Text = "Ingreso Exitoso"; }
        }
        else if (DropDownList1.SelectedIndex == 2)
        {

      

        }

        }


    }
