<%-- 
    Document   : inserircidade
    Created on : 16/09/2018, 20:11:44
    Author     : carol
--%>

<%@page import="br.com.crudcidade.bo.BOCidade"%>
<%@page import="br.com.crudcidade.to.TOCidade"%>
<%
    
    String cidade = request.getParameter("cidade");
    String uf = request.getParameter("estado)");

    TOCidade t = new TOCidade();
    t.setCidade(cidade);
    t.setUf(uf);

    BOCidade.inserir(t);

    response.sendRedirect("index.jsp");
    
%>