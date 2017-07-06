<%@ Page Title="" Language="C#" MasterPageFile="~/Servicio Al Cliente.master" AutoEventWireup="true" CodeFile="Servicio Al Cliente 5.aspx.cs" Inherits="Servicio_Al_Cliente_5" %>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">

       <form id="form1" runat="server" style="height: 274px; width: 616px">
     <table style="width: 100%;">
                <tr>
            <td><asp:Label ID="Label1" runat="server" Text="Ingresar Cui de Usuario"></asp:Label></td>
            <td><asp:TextBox ID="TextBox1" runat="server"></asp:TextBox></td>
         </tr>
           <tr>
            <td><asp:Label ID="Label2" runat="server" Text="Nueva Contraseña"></asp:Label></td>
            <td><asp:TextBox ID="TextBox2" runat="server"></asp:TextBox></td>
         </tr>
          <tr>
            <td>
                <asp:Button ID="Button1" runat="server" Text="Renovar Contraseña" OnClick="Button1_Click" /></td>
            <td>
                <asp:Label ID="Label3" runat="server" Text=""></asp:Label></td>
         </tr>
    </table>
       
        </form>

</asp:Content>

