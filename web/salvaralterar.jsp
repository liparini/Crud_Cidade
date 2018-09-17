<%-- 
    Document   : salvaralterar
    Created on : 16/09/2018, 19:14:28
    Author     : carol
--%>

<%@page import="br.com.crudcidade.bo.BOCidade"%>
<%@page import="br.com.crudcidade.to.TOCidade"%>
<%
    String id = request.getParameter("id");
    String cidade = request.getParameter("cidade");
    String estado = request.getParameter("estado");

    TOCidade t = new TOCidade();
    t.setId(Integer.parseInt(id));
    t.setCidade(cidade);
    t.setUf(estado);

    BOCidade.alterar(t);

    response.sendRedirect("index.jsp");

%>