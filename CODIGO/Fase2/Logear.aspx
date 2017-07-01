<%@ Page Title="" Language="C#" MasterPageFile="~/Login.master" AutoEventWireup="true" CodeFile="Logear.aspx.cs" Inherits="_Default" %>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
    <table style="width:100%;">
                  <tr>
                      <td style="height: 20px">Usuario</td>
                      <td style="height: 20px">
                          <asp:TextBox ID="TextBox1" runat="server" Width="213px"></asp:TextBox>
                      </td>
                     
                  </tr>
                  <tr>
                      <td>Contraseña</td>
                      <td>
                          <asp:TextBox ID="TextBox2" runat="server" Width="214px"></asp:TextBox>
                      </td>
                      
                  </tr>
                  <tr>
                      <td>Tipo</td>
                      <td>
                          <asp:DropDownList ID="DropDownList1" runat="server">
                                <asp:ListItem Selected="True" Value=""></asp:ListItem>
                               <asp:ListItem Value="Administrador">Administrador</asp:ListItem>
                  <asp:ListItem Value="Gerente Empresa">Gerente Empresa</asp:ListItem>
                  <asp:ListItem Value="Gerente Banco">Gerente Banco</asp:ListItem>
                  <asp:ListItem Value="Servicio Al Cliente">Servicio Al Cliente</asp:ListItem>
                  <asp:ListItem Value="Caja">Caja</asp:ListItem>                              
                  <asp:ListItem Value="Individual">Individual</asp:ListItem>                              
                  <asp:ListItem Value="Empresarial">Empresarial</asp:ListItem>
                              
                          </asp:DropDownList>
                      </td>
                      
                  </tr>
                  <tr>
                      <td>
                          <asp:Button ID="Button1" runat="server" Text="Ingresar" OnClick="Button1_Click" />
                      </td>
                      <td>&nbsp;</td>
                      
                  </tr>
              </table>

</asp:Content>

