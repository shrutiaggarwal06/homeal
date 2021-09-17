<%-- 
    Document   : orderstatusupdate
    Created on : 11 Mar, 2021, 2:33:36 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@page import="java.sql.*"%>
    </head>
    <body>
        <%
           String oid=request.getParameter("oid");
           String status=request.getParameter("status");           
                try
            {
             Class.forName("org.apache.derby.jdbc.ClientDriver");
             Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");       
                PreparedStatement ps= cn.prepareStatement("update orders set status=? where orderid=?");
                       ps.setString(1, status);
                       ps.setString(2,oid);
                       ps.executeUpdate();
                   response.sendRedirect("cheforders.jsp");
               cn.close();
            }
                catch(Exception ex)
                {
                    out.print(ex);
                }
                
            %>
    </body>
</html>