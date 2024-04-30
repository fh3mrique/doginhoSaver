<%-- 
    Document   : loginUsuario
    Created on : Nov 16, 2023, 10:01:34 AM
    Author     : ALUNO
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <body>

        <c:if test="${usuarioLogado ne null}">
            <script>location.href = 'indexUsuario.jsp'</script>
        </c:if>
        
        <div class="p-1 mb-4 bg-light rounded-3">
            <div class="container-fluid py-5">
                <h1 class="display-5 fw-bold">Doguinho Saver</h1>
                <p class="col-md-8 fs-4">oueis seivin doguis laifes</p>
            </div>
        </div>
        
        <h4><i>${sessionScope.msg}</i></h4>
        
        <c:remove var="msg" scope="session"/>

        <div class="card" style="width: 18rem; left:35%; position: absolute">
            <div class="card-body">
                <h5 class="card-title">Login de Usuario</h5>
                <h6 class="card-subtitle mb-2 text-muted">Faça Login</h6>
                <div class="card-text">
                    <form method="post" action="loginUsuario">
                        <table class="table">
                            <tr>
                                <th>login:</th>
                                <td><input type="text" name="login" class="form-control"/></td>
                            <tr>

                            </tr>
                            <th>senha:</th>
                            <td><input type="password" name="senha" class="form-control"/></td>

                            </tr>
                        </table>
                        <button type="submit" class="btn btn-primary">logar</button>

                    </form>
                </div>
                <small style="color: red ">não é cadastrado?</small><a href="#" class="btn btn-link" data-bs-toggle="modal" data-bs-target="#modalRegistrese">registre-se</a>

            </div>
        </div>

        <div id="modalRegistrese" class="modal" tabindex="-1">
            <div class="modal-dialog">
                <div class="modal-content">
                    
                    <div class="modal-body">
                        <%-- <%@include  file="CadastroUsuario.jsp" %> --%>
                        <c:import url="CadastroUsuario.html"/>
                    </div>
                    
                </div>
            </div>
        </div>

    </body>
</html>
