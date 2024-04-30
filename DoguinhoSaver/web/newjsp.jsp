<%-- 
    Document   : newjsp
    Created on : Oct 26, 2023, 9:03:07 AM
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
        <h1>Hello World!</h1>
        <%!
            int b = 0;
            
        %>
        <%
            int a = 0;
            out.println("<h1>Este é um h1 dentro de um scriptlet</h1>");
            

            int[] colecao = new int[]{1,2,3,4,5,2,1,2,3,3,4,2,4};
            
            request.setAttribute("colecao", colecao);
            
            int k = 1;
        
            request.setAttribute("k", k);
            
            String p = "<i>2727166263</i>"; 
request.setAttribute("p", p);
        %>
        <h2><%= a+1%></h2>
        a+1
        <%-- este é um comentario jsp--%>
        <!-- este é um comentario html-->
        
        <c:if test="${2 ne 2}">
            <h1>Entrou no if</h1>
        </c:if>
            
            
            
            <c:forEach begin="1" end="10" step="1" varStatus="i">
                <h3>${i.index}</h3>
            </c:forEach>
                
                <c:forEach items="${colecao}" var="item" varStatus="i">
                    <h5>valor de item ${item} na posicao ${i.index}</h5>
                </c:forEach>
                    
                    <c:choose>
                        <c:when test="${k eq 1}">
                            <h1>Entrou no when</h1>
                        </c:when>
                        <c:when test="${k eq 5}">
                            <h1>Entrou no 5</h1>
                        </c:when>
                        <c:otherwise>
                            <h1>entrou no otherwise</h1>
                        </c:otherwise>
                    </c:choose>
                            
                    <c:out value="${p}" escapeXml="true"/>
                    
                    <c:remove var="p" scope="request"/>
                          <c:out value="${p}" escapeXml="true"/>  
                          
                         <c:
    </body>
</html>
