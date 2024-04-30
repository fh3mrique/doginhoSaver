<%-- 
    Document   : usuarios
    Created on : Oct 26, 2023, 10:43:49 AM
    Author     : ALUNO
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <h1>Usuarios Cadastrados</h1>

        <a href="CadastroUsuario.jsp">Cadastrar</a>



        <h2>${sessionScope.msg}</h2>


        <c:remove  var="msg" scope="session"/>


        <table border="1">

            <tr><th>Login</th><th>e-mail</th><th>Contato</th><th>Ações</th></tr>


            <c:forEach items="${sessionScope.usus}" var="u" varStatus="i">   
                <tr>
                    <td>
                        ${u.login}
                    </td>
                    <td>
                        ${u.email}
                    </td>
                    <td>
                        ${u.contato}
                    </td>
                    <td>
                        <a href="detalharUsuario.jsp?i=${i.index}">detalhar </a>
                        <a href="UsuariosServlet2?c=${u.codigo}">alterar </a>
                        <a href="UsuariosServlet2?c=${u.codigo}&op=deletar">deletar</a>
                    </td>
                </tr>
            </c:forEach>   

        </table>

    </body>
</html>
