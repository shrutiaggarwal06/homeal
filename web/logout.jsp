<%-- 
    Document   : logout
    Created on : 12 Feb, 2021, 9:50:39 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <%@page import="java.sql.*" %>
    </head>
    <body>
        <%
            try{
                session.invalidate();
            
            response.sendRedirect("http://localhost:8080/tiffin/index.jsp");
            }
            catch(Exception ex)
            {
                out.print(ex);
            }
            %>
            
    </body>
</html>
