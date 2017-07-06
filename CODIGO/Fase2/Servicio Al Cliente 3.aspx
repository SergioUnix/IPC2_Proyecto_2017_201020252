<%@ Page Title="" Language="C#" MasterPageFile="~/Servicio Al Cliente.master" AutoEventWireup="true" CodeFile="Servicio Al Cliente 3.aspx.cs" Inherits="Servicio_Al_Cliente_3" %>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    
    <form id="form1" runat="server" style="height: 274px; width: 616px">
     <table style="width: 100%;">
                <tr>
            <td><asp:Label ID="Label1" runat="server" Text="Ingresar Cui de Usuario"></asp:Label></td>
            <td><asp:TextBox ID="TextBox1" runat="server"></asp:TextBox></td>
         </tr>
          <tr>
            <td>
                <asp:Button ID="Button1" runat="server" Text="Obtener estados de cuenta" OnClick="Button1_Click" /></td>
            <td>
                <asp:Label ID="Label2" runat="server" Text=""></asp:Label></td>
         </tr>
    </table>
        <asp:ListBox ID="ListBox1" runat="server" Height="212px" Width="437px"></asp:ListBox>
        </form>

   
</asp:Content>

