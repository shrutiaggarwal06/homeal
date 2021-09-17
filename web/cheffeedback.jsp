<%-- 
    Document   : cheffeedback
    Created on : 17 Mar, 2021, 7:56:41 PM
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
            String name,email,msg,tid;
            name=request.getParameter("name");           
            email=request.getParameter("email");            
            msg=request.getParameter("msg");     
            tid=request.getParameter("tid");
           try
            {
             Class.forName("org.apache.derby.jdbc.ClientDriver");
             Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
            PreparedStatement ps= cn.prepareStatement("insert into feedback values(?,?,?,?)");                
                   ps.setString(1,name);
                   ps.setString(2,tid);
                   ps.setString(3, email);
                   ps.setString(4, msg);                     
                   ps.executeUpdate();                               
                  response.sendRedirect("http://localhost:8080/tiffin/menu.jsp?tid="+tid);                                      
            }           
            catch(Exception ex)
            {
                out.print(ex);
            }
        %>
    </body>
</html>


