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
        DropDownList1.Items.Clear();
        DropDownList2.Items.Clear();

        Random rnd = new Random();
        int y = rnd.Next(1000, 10001);
        TextBox6.Text = y.ToString();




        String[] empresas =WS.empresa_cargar();

        for (int i = 0; i < empresas.Length; i++)
        {
            DropDownList2.Items.Add(empresas[i]);
        }
        
        String[]  tipo_cliente= WS.tipo_cliente_cargar();

        for (int i = 0; i < tipo_cliente.Length; i++)
        {
            DropDownList1.Items.Add(tipo_cliente[i]);
        }



    }

    protected void Button1_Click(object sender, EventArgs e)
    {

        if (DropDownList2.SelectedIndex==0 & DropDownList1.Text.Equals("Individual"))
        {
            Boolean afirmacion =
                    WS.cliente_crear_individual(int.Parse(TextBox1.Text), TextBox2.Text, TextBox3.Text,
                        int.Parse(TextBox4.Text), TextBox5.Text, int.Parse(TextBox6.Text),
                        WS.tipo_cliente_id(DropDownList1.Text));
            if (afirmacion == false)
            {
                Labell.Text = "Error en datos";

            }
            else
            {
                Labell.Text = "Ingreso Exitoso";
            }

        }
        else
        {
            Boolean afirmacion =
            WS.cliente_crear(int.Parse(TextBox1.Text), TextBox2.Text, TextBox3.Text,
                int.Parse(TextBox4.Text), TextBox5.Text, int.Parse(TextBox6.Text),
                WS.empresa_buscar_id(DropDownList2.Text), WS.tipo_cliente_id(DropDownList1.Text));
            if (afirmacion == false)
            {
                Labell.Text = "Error en datos";

            }
            else
            {
                Labell.Text = "Ingreso Exitoso";
            }
        }


    }
}