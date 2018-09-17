<%-- 
    Document   : alterar
    Created on : 16/09/2018, 19:06:04
    Author     : carol
--%>

<%@page import="br.com.crudcidade.bo.BOCidade"%>
<%@page import="br.com.crudcidade.to.TOCidade"%>
<%@page import="br.com.crudcidade.bo.BOEstado"%>
<%@page import="br.com.crudcidade.to.TOEstado"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

    String id = request.getParameter("id");

    TOCidade cidade = new TOCidade();
    cidade.setId(Integer.parseInt(id));

    cidade = BOCidade.obter(cidade);

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h1>Alterar Cidade</h1>

        <form action="salvaralterar.jsp" method="POST">
            
            <input name="id" type="hidden" value="<%=cidade.getId()%>"> 

            Cidade <input name="cidade" type="text" value="<%=cidade.getCidade()%>"/><br/><br/>

            Estado <select name="estado">

                <option value="">Selecione o estado</option>

                <%
                    List<TOEstado> l = BOEstado.lista();

                    for (TOEstado t : l) {

                        if (cidade.getUf().equals(t.getUf())) {
                %>
                <option value="<%=t.getUf()%>" selected><%=t.getUf()%></option>
                <%} else {%>
                <option value="<%=t.getUf()%>"><%=t.getUf()%></option>
                <%}%>

                <%}%>

            </select>

            <br/><br/>

            <input name="btnsalvar" value="Salvar" type="submit"/>

        </form>
    </body>
</html>
