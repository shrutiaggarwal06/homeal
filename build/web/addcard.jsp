<%-- 
    Document   : addcard
    Created on : 7 Apr, 2021, 12:33:15 AM
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
             
            String email =(String)session.getAttribute("email");
                String save=request.getParameter("save");
                String card=request.getParameter("cardno"); 
                String cid=(String)session.getAttribute("cid");           
                session.setAttribute("cardno", card);
                if(save!=null)
                {       
                    String cname= request.getParameter("cardname");
                String bname=request.getParameter("bankname");
                String yy=request.getParameter("yy");
                String mm=request.getParameter("mm");
           try
            {
             Class.forName("org.apache.derby.jdbc.ClientDriver");
             Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
            PreparedStatement ps= cn.prepareStatement("insert into card values(?,?,?,?,?,?)");                
                   ps.setString(1,cname);
                   ps.setString(2,cid);
                   ps.setString(3, card);
                   ps.setString(4, bname);
                    ps.setString(5, mm);
                     ps.setString(6, yy);
                   ps.executeUpdate();   
                                    response.sendRedirect("otpmail.jsp");
            }           
            catch(Exception ex)
            {
                out.print(ex);
            }
                }
                else{
                     response.sendRedirect("otpmail.jsp");
                }
        %>
                  
    </body>
</html>
