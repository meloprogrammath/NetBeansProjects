<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Cookie[] cookies = request.getCookies();

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trabalhando com Cookies</title>
    </head>
    <body>
        <h1>Trabalhando com Cookies - Cookies Gerados</h1>
        <hr>

        <br>

        <%            
            if (cookies.length > 1) {
                for (int i = 0; i < cookies.length; i++) {

                    if (cookies[i].getName().equals("usuario")) {
                        out.print("<b>Usuário: </b>" + cookies[i].getValue());
                    }
                    out.print("<br>");
                    if (cookies[i].getName().equals("email")) {
                        out.print("<b>E-mail: </b>" + cookies[i].getValue());
                    }
                    out.print("<br>");
                    if (cookies[i].getName().equals("anoNascimento")) {
                        out.print("<b>Ano de nascimento: </b>" + cookies[i].getValue());
                    }
                    out.print("<br>");
                    if (cookies[i].getName().equals("idade")) {
                        int idade = Integer.parseInt(cookies[i].getValue());
                        if (idade >= 18) {
                            out.print("Pode acessar essa aplicação!");
                        } else {
                            out.print("Melhor acessar o site da Disney!");
                        }
                    }

                }
            }
        %>
    </body>
</html>