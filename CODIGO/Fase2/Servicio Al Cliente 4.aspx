<%@ Page Title="" Language="C#" MasterPageFile="~/Servicio Al Cliente.master" AutoEventWireup="true" CodeFile="Servicio Al Cliente 4.aspx.cs" Inherits="Servicio_Al_Cliente_4" %>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">

     
    <form id="form1" runat="server" style="height: 274px; width: 616px">
     <table style="width: 100%;">
                <tr>
            <td><asp:Label ID="Label1" runat="server" Text="Ingresar Cui"></asp:Label></td>
            <td><asp:TextBox ID="TextBox1" runat="server"></asp:TextBox></td>
         </tr>
                <tr>
            <td><asp:Label ID="Label2" runat="server" Text="Ingresar No. Cuenta"></asp:Label></td>
            <td><asp:TextBox ID="TextBox2" runat="server"></asp:TextBox></td>
         </tr>
                <tr>
            <td><asp:Label ID="Label3" runat="server" Text="Estado de Cuenta"></asp:Label></td>
            <td>  <asp:DropDownList ID="DropDownList1" runat="server" Height="19px" Width="102px">

                  <asp:ListItem Selected="True" Value=""></asp:ListItem>
                  <asp:ListItem Value="Activor">Activo</asp:ListItem>
                  <asp:ListItem Value="Bloqueado">Bloqueado</asp:ListItem>
                  <asp:ListItem Value="Suspendido">Suspendido</asp:ListItem>
                  </asp:dropdownlist>    </td>
         </tr>
          <tr>
            <td>
                <asp:Button ID="Button1" runat="server" Text="Suspender o Activar Cuenta" OnClick="Button1_Click" /></td>
            <td>
                <asp:Label ID="Label4" runat="server" Text=""></asp:Label></td>
         </tr>
    </table>
      
        </form>




</asp:Content>

