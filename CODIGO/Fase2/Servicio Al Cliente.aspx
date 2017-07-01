<%@ Page Title="" Language="C#" MasterPageFile="~/Servicio Al Cliente.master" AutoEventWireup="true" CodeFile="Servicio Al Cliente.aspx.cs" Inherits="Servicio_Al_Cliente" %>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    
    <form id="form1" runat="server">
    
    <table style="width: 100%;">
        <tr>
            <td>Cui</td>
            <td>
                <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>Nombres</td>
            <td>
                <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td style="height: 20px">Apellidos</td>
            <td style="height: 20px">
                <asp:TextBox ID="TextBox3" runat="server"></asp:TextBox>
            </td>
            <td style="height: 20px"></td>
        </tr>
        <tr>
            <td>Salario</td>
            <td>
                <asp:TextBox ID="TextBox4" runat="server"></asp:TextBox>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>Usuario</td>
            <td>
                <asp:TextBox ID="TextBox5" runat="server"></asp:TextBox>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>Contraseña</td>
            <td>
                <asp:TextBox ID="TextBox6" runat="server"></asp:TextBox>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>Empresa</td>
            <td>
                <asp:TextBox ID="TextBox7" runat="server"></asp:TextBox>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>Tipo Cliente</td>
            <td>
                  <asp:DropDownList ID="DropDownList1" runat="server">
                                <asp:ListItem Selected="True" Value=""></asp:ListItem>
                               <asp:ListItem Value="Individual">Individual</asp:ListItem>
                  <asp:ListItem Value="Empresarial">Empresarial</asp:ListItem>
                 
                              
                          </asp:DropDownList>

            </td>
            <td>&nbsp;</td>
        </tr>
          <tr>
            <td style="height: 24px"></td>
            <td style="height: 24px">
                <asp:Button ID="Button1" runat="server" Text="Agregar Usuario" />

            </td>
            <td style="height: 24px"></td>
        </tr>

    </table>

      <asp:ListBox ID="ListBox1" runat="server"></asp:ListBox>
    
  
    </form>
      
    
  
</asp:Content>

