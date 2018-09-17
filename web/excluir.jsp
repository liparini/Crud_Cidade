<%-- 
    Document   : excluir
    Created on : 16/09/2018, 19:16:45
    Author     : carol
--%>

<%@page import="br.com.crudcidade.bo.BOCidade"%>
<%@page import="br.com.crudcidade.to.TOCidade"%>
<%

    String id = request.getParameter("id");

    TOCidade t = new TOCidade();
    t.setId(Integer.parseInt(id));

    BOCidade.excluir(t);

    response.sendRedirect("index.jsp");

%>