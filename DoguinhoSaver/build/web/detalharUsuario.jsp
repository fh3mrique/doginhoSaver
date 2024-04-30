<%-- 
    Document   : editarUsuario
    Created on : Nov 9, 2023, 12:19:46 PM
    Author     : ALUNO
--%>

<%@page import="br.edu.ifpe.recife.model.negocio.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int i = Integer.parseInt(request.getParameter("i"));
            
            List<Usuario> usuarios = (List)session.getAttribute("usus");
               
            Usuario u = usuarios.get(i);

        %>
        
        <h1>Dados do usuário <%= u.getLogin()%></h1>
        
        e-mail: <%= u.getEmail() %><br/>
        Contato: <%= u.getContato() %><br/>
        Cidade: <%= u.getCidade() %><br/>
        Bairro: <%= u.getBairro() %><br/>
        
        <a href="usuarios.jsp">voltar</a>
    </body>
</html>
