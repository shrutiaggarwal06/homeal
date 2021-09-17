<%-- 
    Document   : updatechefstatus
    Created on : 17 Mar, 2021, 2:29:57 PM
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
           String tid=request.getParameter("tid");
           String status=request.getParameter("status");           
                try
            {
             Class.forName("org.apache.derby.jdbc.ClientDriver");
             Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");       
                PreparedStatement ps= cn.prepareStatement("update tiffin_provider set status=? where tf_id=?");
                       ps.setString(1, status);
                       ps.setString(2,tid);
                       ps.executeUpdate();
                   response.sendRedirect("adminchangechef.jsp");
               cn.close();
            }
                catch(Exception ex)
                {
                    out.print(ex);
                }
                
            %>
    </body>
</html>