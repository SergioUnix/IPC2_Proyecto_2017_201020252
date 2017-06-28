<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage2.master" AutoEventWireup="true" CodeFile="Agregar.aspx.cs" Inherits="Agregar" %>

<asp:Content ID="Content1" ContentPlaceHolderID="ContentPlaceHolder1" Runat="Server">

    <div class="field">
            <label>Nombre:</label>
            <asp:textbox runat="server" id="nombre">

              </asp:textbox>
          </div>
          <div class="field">

             


            <label>Codigo autor:</label>
              <asp:textbox runat="server" id="cod_autor">

              </asp:textbox>
          </div>
      <div class="field">
         <asp:button runat="server" text="Button" OnClick="Unnamed1_Click" />
          </div>
</asp:Content>

