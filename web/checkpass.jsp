<%-- 
    Document   : checkpass
    Created on : 11 Feb, 2021, 8:52:39 PM
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
                   String e=(String)session.getAttribute("cid");
                   session.setAttribute("cid", e);
                   String op=request.getParameter("opass");
                   String np=request.getParameter("npass");        
         try
                {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                    PreparedStatement ps= cn.prepareStatement("select * from customer where CUSTID=? and password=?");                
                    ps.setString(1, e);
                    ps.setString(2, op);
                    ResultSet rs=ps.executeQuery();
                    if(rs.next())
                    {
                       PreparedStatement ps1= cn.prepareStatement("update customer set password=? where CUSTID=?");                
                        ps1.setString(1,np);
                        ps1.setString(2, e);                        
                        ps1.executeUpdate();                        
                        cn.close();   
                         response.sendRedirect("http://localhost:8080/tiffin/customerprofile.jsp?p=yes");
                     }
                     else
                     {
                             response.sendRedirect("http://localhost:8080/tiffin/customerprofile.jsp?p=no");
                     }
                     cn.close();
                }
         catch(Exception ex)
                 {
                     out.print(ex);
                 }
        %>
</body>
</html>