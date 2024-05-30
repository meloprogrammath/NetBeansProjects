<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String usuario = "";
    boolean autenticado = false;
    if (session.getAttribute("auth") != null) {
        if ((boolean) session.getAttribute("auth") == true) {
            usuario = (String)session.getAttribute("user");
            autenticado = true;
        }
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Seja bem-vindo(a)!</h1>
        <hr>
 
        <br><br>
 
        Olá <%= usuario %>, tudo bem?
 
        <% if (!autenticado) { %>
        <h3 style="color: red">Você não poderia estár aqui!</h3>
        <% } %>
 
    </body>
</html>
