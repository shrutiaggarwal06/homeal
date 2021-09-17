<%-- 
    Document   : checklogin
    Created on : 31 Jan, 2021, 11:02:13 PM
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
            String e,p,u,cid;
            u=request.getParameter("ut");
            e=request.getParameter("em");
           
            p=request.getParameter("pass");
        try
            {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
               if(u.equals("CUST"))
               {
                PreparedStatement ps= cn.prepareStatement("select * from CUSTOMER where upper(EMAILID)=? and PASSWORD=? and usr_typ=?");                
                ps.setString(1, e);
                ps.setString(2, p);     
                ps.setString(3, "CUST");  
                ResultSet rs=ps.executeQuery(); 
                if(rs.next())
                {
                    cid=rs.getString("CUSTID");
                    session.setAttribute("cid", cid);                    
                    response.sendRedirect("http://localhost:8080/tiffin/customerprofile.jsp");
                }
                else
                {
                    response.sendRedirect("http://localhost:8080/tiffin/login.jsp?p=no");
                }
               }
               else if(u.equals("TF"))
               {
                   PreparedStatement ps= cn.prepareStatement("select * from  TIFFIN_PROVIDER where EMAILID=? and PASS=?");                
                ps.setString(1, e);
                ps.setString(2, p);                
                ResultSet rs=ps.executeQuery(); 
                if(rs.next())
                {
                    session.setAttribute("email", e);
                    String tid= rs.getString("tf_id");
                    session.setAttribute("tid",tid);
                    out.print("TIFFIN PROVIDER succesful");
                    response.sendRedirect("http://localhost:8080/tiffin/chefabout.jsp");
                }
                else
                {
                    response.sendRedirect("http://localhost:8080/tiffin/login.jsp?p=no");
                }
               }
               else if(u.equals("ADMIN"))
               {
                PreparedStatement ps= cn.prepareStatement("select * from CUSTOMER where EMAILID=? and PASSWORD=? and usr_typ=?");                
                ps.setString(1, e);
                ps.setString(2, p);    
                ps.setString(3, "ADMIN"); 
                ResultSet rs=ps.executeQuery(); 
                if(rs.next())
                {
                    String aid=rs.getString("CUSTID");
                    session.setAttribute("aid", aid);                    
                    response.sendRedirect("http://localhost:8080/tiffin/admin1.jsp");
                }
                else
                {
                    response.sendRedirect("http://localhost:8080/tiffin/login.jsp?p=no");
                }
               }
               else
               {
                   out.print("not available");
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

