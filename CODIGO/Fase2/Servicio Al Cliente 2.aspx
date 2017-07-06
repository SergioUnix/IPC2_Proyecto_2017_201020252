<%@ Page Title="" Language="C#" MasterPageFile="~/Servicio Al Cliente.master" AutoEventWireup="true" CodeFile="Servicio Al Cliente 2.aspx.cs" Inherits="Servicio_Al_Cliente_2" %>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">


    <form id="form1" runat="server">
     <table style="width: 100%;">
        <tr>
            <td><asp:Label ID="Label1" runat="server" Text="Modo Pago"></asp:Label></td>
            <td> 
                 <asp:DropDownList ID="DropDownList1" runat="server" Height="16px" Width="104px">
                     <asp:ListItem Selected="True" Value=""></asp:ListItem>
                  <asp:ListItem Value="Quincenal">Quincenal</asp:ListItem>
                  <asp:ListItem  Value="Mensual">Mensual</asp:ListItem>
                  <asp:ListItem Value="Trimestral">Trimestral</asp:ListItem>
               </asp:DropDownList>

            </td>
           
        </tr>
        <tr>
            <td style="height: 20px"><asp:Label ID="Label2" runat="server" Text="Monto solicitado"></asp:Label></td>
            <td style="height: 20px"><asp:TextBox ID="TextBox2" runat="server"></asp:TextBox></td>
        
        </tr>
        <tr>
           <td><asp:Label ID="Label3" runat="server" Text="Abono Cancelado" Enabled="false"></asp:Label></td>
            <td><asp:TextBox ID="TextBox3" runat="server" value="0" Enabled="false"></asp:TextBox></td>
         </tr>
          <tr>
          <td><asp:Label ID="Label4" runat="server" Text="Ingresar Cui"></asp:Label></td>
            <td><asp:TextBox ID="TextBox4" runat="server"></asp:TextBox></td>
         </tr>
          <tr>
            <td><asp:Label ID="Label5" runat="server" Text="Estado"></asp:Label></td>
            <td><asp:TextBox ID="TextBox5" runat="server" value="Pendiente" Enabled="false"></asp:TextBox></td>
         </tr>
          <tr>
            <td>
                <asp:Button ID="Button1" runat="server" Text="Crear solicitud Prestamo" OnClick="Button1_Click" /></td>
            <td>
                <asp:Label ID="Label6" runat="server" Text=""></asp:Label></td>
         </tr>
    </table>

        </form>

   




</asp:Content>

