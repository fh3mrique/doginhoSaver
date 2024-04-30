<%-- 
    Document   : CadastroUsuario
    Created on : Oct 26, 2023, 9:38:08 AM
    Author     : ALUNO
--%>

<%@page import="br.edu.ifpe.recife.model.negocio.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>${(requestScope.usuario == null)?'Cadastro de novo':'Editar'} usuário</h1>

        <a href="index.html">home</a><br/>
        <form method="post" action="UsuariosServlet2">
            
            <input type="hidden" name="op" value="${(requestScope.usuario == null)?'cadastro':'editar'}"/>
            Codigo: ${(requestScope.usuario == null)?'':usuario.codigo} <input type="${(requestScope.usuario == null)?'text':'hidden'}" name="codigo" ${(requestScope.usuario == null)?'':' value="'+=usuario.codigo+='"'}  /><br/>
            Login: ${(requestScope.usuario == null)?'':usuario.login} <input type="${(requestScope.usuario == null)?'text':'hidden'}" name="login" ${(requestScope.usuario == null)?'':' value="'+=usuario.login+='"'}/><br/>
            ${(requestScope.usuario == null)?'Senha: <input type="password" name="senha"/><br/>':''}
            e-mail: <input type="text" name="email" ${(requestScope.usuario == null)?'':'value="'+=usuario.email+='"'}/><br/>
            Cidade: <input type="text" name="cidade" ${(requestScope.usuario == null)?'':'value="'+=usuario.cidade+='"'}/><br/>
            Bairro: <input type="text" name="bairro" ${(requestScope.usuario == null)?'':'value="'+=usuario.bairro+='"'}/><br/>
            Contato: <input type="text" name="contato" ${(requestScope.usuario == null)?'':'value="'+=usuario.contato+='"'}/><br/>
            <input type="submit" value="${(requestScope.usuario == null)?'Cadastrar':'Editar'}"/>
            
        </form>
    </body>
</html>
