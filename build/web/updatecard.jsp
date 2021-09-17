<%-- 
    Document   : updatecard
    Created on : 12 Feb, 2021, 7:48:24 PM
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
           String cno=request.getParameter("cno");
           String cid=(String)session.getAttribute("cid");
           try
           {
           Class.forName("org.apache.derby.jdbc.ClientDriver");
                         Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                    PreparedStatement ps= cn.prepareStatement("delete from card where CUSTID=? and CARDNO=?");
                    ps.setString(1, cid); 
                    ps.setString(2,cno);
                    ps.executeUpdate();
                    response.sendRedirect("http://localhost:8080/tiffin/customerprofile.jsp?c=yes");                      
           }
            catch(Exception ex)
                 {
                     out.print(ex);
                 }           
                      %>
    </body>
</html>
