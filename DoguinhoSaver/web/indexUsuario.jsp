<%-- 
    Document   : indexUsuario
    Created on : Nov 16, 2023, 10:41:08 AM
    Author     : ALUNO
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <jsp:directive.include file="menuUsuario.jsp"/>
        
        <h1>Bem Vindo ${sessionScope.usuarioLogado.login}</h1>
    </body>
</html>
