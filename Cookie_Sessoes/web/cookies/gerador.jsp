<%@page import="java.time.Year"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
   String usuario = request.getParameter("usuario");
    String email = request.getParameter("email");
    int anoNascimento = Integer.parseInt(request.getParameter("anoNasc"));
    int idade = Year.now().getValue() - anoNascimento;
    
    //criação dos objetos "cokies" com chave <> valor
    Cookie cookieUsuario = new Cookie("usuario", usuario);
    Cookie cookieMail = new Cookie("email", email);
    Cookie cookieAno = new Cookie("anoNascimento", String.valueOf(anoNascimento));
    Cookie cookieIdade = new Cookie("idade", String.valueOf(idade));
    
    //altera o tempo de vida dos cookies
    cookieUsuario.setMaxAge(120);
    cookieMail.setMaxAge(120);
    cookieAno.setMaxAge(120);
    cookieIdade.setMaxAge(120);
    
    //envia os cookies para o usuário
    response.addCookie(cookieUsuario);
    response.addCookie(cookieMail);
    response.addCookie(cookieAno);
    response.addCookie(cookieIdade);

    //envia o usuário para a raiz do projeto 
    response.sendRedirect("./?gerouCookie");
%>