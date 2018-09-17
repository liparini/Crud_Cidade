<%-- 
    Document   : inserir
    Created on : 16/09/2018, 19:03:44
    Author     : carol
--%>

<%@page import="br.com.crudcidade.bo.BOEstado"%>
<%@page import="br.com.crudcidade.to.TOEstado"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h1>Insira uma Nova Cidade</h1>

        <form action="inserircidade.jsp" method="POST">

            Cidade <input name="cidade" type="text"/><br/><br/>                      
               
                Estado <select name="estado">

                <option value="">Selecione o estado</option>

                <%

                    List<TOEstado> l = BOEstado.lista();

                    for (TOEstado t : l) {

                %>

                <option value="<%=t.getUf()%>"><%=t.getUf()%></option>

                <%}%>
                
            </select>
                <br/>
                <br/>
                <input value="Inserir" type="submit"/>

        </form>
    </body>
</html>
