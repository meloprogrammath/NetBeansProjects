<%@page import="br.uninove.auth.Login"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String usuario, senha;
    Login login = new Login();
    
    usuario = request.getParameter("user");
    senha = request.getParameter("password");
    
    login.setUsuario(usuario);
    login.setSenha(senha);
    
    if (login.autentica()) {
        //usuário digitou corretamente a senha:
        session.setAttribute("user", usuario);
        session.setAttribute("auth", true);
    } else {
        session.setAttribute("auth", false);
    }
    
    response.sendRedirect("protegida.jsp");
%>