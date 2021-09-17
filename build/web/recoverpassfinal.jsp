<%-- 
    Document   : recoverpassfinal
    Created on : 19 Feb, 2021, 2:24:25 PM
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
            String ph,sq,sa,ps1,e;
            e=(String)session.getAttribute("email");
            ph=request.getParameter("phno");
            sq=request.getParameter("secq");
            sa=request.getParameter("seca");
            ps1=request.getParameter("npass");
            try
            {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
             Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
            PreparedStatement ps= cn.prepareStatement("select * from customer where  mob=? and QUES=? and ANS=? and EMAILID=? ");
                  ps.setString(1 ,ph);
                  ps.setString(2 ,sq);
                  ps.setString(3 ,sa);     
                  ps.setString(4 ,e);                  
                 ResultSet rs=ps.executeQuery();
                 if(rs.next())
                 {                    
                     PreparedStatement psn= cn.prepareStatement("update CUSTOMER set PASSWORD=? where EMAILID=?");                
                        psn.setString(1, ps1);
                        psn.setString(2, e);
                        psn.executeUpdate();                    
                        response.sendRedirect("successfulpass.jsp");
                 }
                 else
                 {
                      response.sendRedirect("http://localhost:8080/tiffin/recoverpass.jsp?p=error");
                 }
            }
            catch(Exception ex)
            {
                out.print(ex);
            }
        %>
    </body>
</html>

