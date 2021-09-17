<%-- 
    Document   : updatecontact
    Created on : 18 Feb, 2021, 6:55:51 PM
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
            String name,email,msg,phno,type;
            name=request.getParameter("name");           
            email=request.getParameter("email");
            phno=request.getParameter("phone");
            msg=request.getParameter("msg");     
            type=request.getParameter("type");
           try
            {
             Class.forName("org.apache.derby.jdbc.ClientDriver");
             Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
            PreparedStatement ps= cn.prepareStatement("insert into query values(?,?,?,?,?)");                
                   ps.setString(1,name);
                   ps.setString(2,email);
                   ps.setString(3, phno);
                   ps.setString(4, msg);   
                   ps.setString(5, type);   
                   ps.executeUpdate();             
                   if(type.equals("contact"))
                   {
                   response.sendRedirect("http://localhost:8080/tiffin/contactus.jsp?c=yes");
                   }
                   else if(type.equals("feedback"))
                   {
                      response.sendRedirect("http://localhost:8080/tiffin/feedback.jsp?c=yes"); 
                   }
                   }           
            catch(Exception ex)
            {
                out.print(ex);
            }
        %>
    </body>
</html>


