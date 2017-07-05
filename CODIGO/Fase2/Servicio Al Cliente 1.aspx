<%@ Page Title="" Language="C#" MasterPageFile="~/Servicio Al Cliente.master" AutoEventWireup="true" CodeFile="Servicio Al Cliente 1.aspx.cs" Inherits="Servicio_Al_Cliente_1" %>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">
     <form id="form1" runat="server">
    
    <table style="width: 100%;">
        <tr>
            <td>Monto inicial Disponible</td>
            <td>
                <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>Tipo Cuenta</td>
            <td>
                <asp:DropDownList ID="DropDownList1" runat="server" Height="19px" Width="102px">

                                <asp:ListItem Selected="True" Value=""></asp:ListItem>
                </asp:DropDownList>
                 

            </td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td style="height: 20px">Estado de Cuenta</td>
            <td style="height: 20px">
                <asp:DropDownList ID="DropDownList2" runat="server" Height="22px" Width="101px">
                    
                                <asp:ListItem Selected="True" Value=""></asp:ListItem>
                </asp:DropDownList>
                             
            </td>
            <td style="height: 20px"></td>
        </tr>
        <tr>
            <td>Cui</td>
            <td>
                <asp:TextBox ID="TextBox4" runat="server"></asp:TextBox>
            </td>
            <td>&nbsp;</td>
        </tr>
       
          <tr>
            <td style="height: 24px"></td>
            <td style="height: 24px">
                <asp:Button ID="Button1" runat="server" Text="Crear Cuenta" OnClick="Button1_Click" />


            </td>
            <td style="height: 24px"></td>
        </tr>

    </table>

        <asp:label runat="server" text="" id="Estado"></asp:label>
  
    </form>
      
    

</asp:Content>

