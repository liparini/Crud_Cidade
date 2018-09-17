<%-- 
    Document   : index
    Created on : 16/09/2018, 19:35:57
    Author     : carol
--%>

<%@page import="br.com.crudcidade.bo.BOCidade"%>
<%@page import="java.util.List"%>
<%@page import="br.com.crudcidade.to.TOCidade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <a href="inserir.jsp">Nova Cidade</a>

        <br/><br/>

        <table border="1">
            <tr>
                <td>Uf</td>
                <td>Cidade</td>
            </tr>

            <%

                List<TOCidade> lista = BOCidade.lista();

                for (TOCidade cidade : lista) {%>

            <tr>
                <td><%=cidade.getUf()%></td>
                <td><%=cidade.getCidade()%></td>
                <td>
                    <a href="alterar.jsp?id=<%=cidade.getId()%>">Alterar</a>
                    <a href="excluir.jsp?id=<%=cidade.getId()%>">Excluir</a>
                </td>
            </tr>

                       
                        
            <%}

            %>

        </table>
    </body>
</html>
