<%-- 
    Document   : index.jsp
    Created on : 4 de mai. de 2023, 20:39:49
    Author     : mateu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
        <title>Trabalhando com Cookies</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Trabalhando com Cookies</h1>
        <%
            if(request.getParameter("gerouCookie") !=null){
            out.print("<b>Cookie gerado com sucesso!");
            }
        %>
        
        <hr>
        
        <br>
        
        <ul>
            <li><a href="formulario.html">Formulário de cadastro</a></li>
            <li><a href="verCookies.jsp">Visualizar Cookies</a></li>
        </ul>
    </body>
</html>