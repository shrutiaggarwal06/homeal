<%-- 
    Document   : newregister
    Created on : 4 Feb, 2021, 10:23:28 AM
    Author     : HP
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
               <%@page import="java.sql.*"%>
               <%@ page import="java.io.*"%>
    </head>
    <body>
        <%         
            String fn,e,pas,g,sq,sa,dt,ut,ph;
            ut=request.getParameter("ut");
            fn=request.getParameter("fname");
            e=request.getParameter("em");
            e=e.toUpperCase();
            pas=request.getParameter("pass");
            g=request.getParameter("gender");
            sq=request.getParameter("sec_ques");
            sa=request.getParameter("seca");
            dt=request.getParameter("date");
            ph=request.getParameter("pi");          
           try
            {
             Class.forName("org.apache.derby.jdbc.ClientDriver");
             Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");                
              if(ut.equals("CUST"))
              {
                 PreparedStatement ps= cn.prepareStatement("select max(CUSTID) from CUSTOMER");
                 ResultSet rs=ps.executeQuery();
                 int uid=1001;
               out.print(fn+" ");
                if(rs.next())
                {
                        if(rs.getInt(1)!=0)
                    {
                        uid=rs.getInt(1)+1;
                    }
                }
                   ps= cn.prepareStatement("select * from CUSTOMER where  upper(EMAILID)=?");                
                   ps.setString(1, e);
                rs=ps.executeQuery();
               if(rs.next())
               {
                   session.setAttribute("ph1", ph);
                   session.setAttribute("fn1", fn);            
                   session.setAttribute("sq1", sq);
                   session.setAttribute("sa1", sa);
                   session.setAttribute("dt1", dt);
                   session.setAttribute("g1", g);
                   
                    response.sendRedirect("http://localhost:8080/tiffin/registration.jsp?e=exists");      
               }   
                ps= cn.prepareStatement("select * from CUSTOMER where  MOB=?");                
                   ps.setString(1, ph);
                rs=ps.executeQuery();
                if(rs.next())
               {
                   session.setAttribute("em1", e);
                   session.setAttribute("fn1", fn);            
                   session.setAttribute("sq1", sq);
                   session.setAttribute("sa1", sa);
                   session.setAttribute("dt1", dt);
                   session.setAttribute("g1", g);
                    response.sendRedirect("http://localhost:8080/tiffin/registration.jsp?p=1exists");      
               }
               
               else{
                       ps= cn.prepareStatement("insert into CUSTOMER values(?,?,?,?,?,?,?,?,?,?)");
                       ps.setString(1, fn);
                       ps.setInt(2,uid);
                       ps.setString(3, e); 
                       ps.setString(4, pas);
                       ps.setString(10,ph);
                       ps.setString(5, sq);
                       ps.setString(6, sa);
                       ps.setString(7, g);
                       ps.setString(8, dt);
                       ps.setString(9, ut);
                       ps.executeUpdate();
                       session.setAttribute("uid",uid);
                       response.sendRedirect("http://localhost:8080/tiffin/confirmed.jsp?user=cust");
                      cn.close();
               }
                    }
                    else
                   {                  
                       PreparedStatement ps= cn.prepareStatement("select max(TF_ID) from TIFFIN_PROVIDER");
                 ResultSet rs=ps.executeQuery();
                 int uid=1001;
                out.print(fn+" ");
                if(rs.next())
                {
                        if(rs.getInt(1)!=0)
                    {
                        uid=rs.getInt(1)+1;
                    }
                }
                   ps= cn.prepareStatement("select * from TIFFIN_PROVIDER where  upper(EMAILID)=?");                
                   ps.setString(1, e);
                rs=ps.executeQuery();
               if(rs.next())
               {
                   session.setAttribute("ph1", ph);
                   session.setAttribute("fn1", fn);            
                   session.setAttribute("sq1", sq);
                   session.setAttribute("sa1", sa);
                   session.setAttribute("dt1", dt);
                   session.setAttribute("g1", g);
                   
                    response.sendRedirect("http://localhost:8080/tiffin/registration.jsp?e=exists");      
               }   
                ps= cn.prepareStatement("select * from TIFFIN_PROVIDER where  MOB=?");                
                   ps.setString(1, ph);
                rs=ps.executeQuery();
               if(rs.next())
               {
                   session.setAttribute("em1", e);
                   session.setAttribute("fn1", fn);            
                   session.setAttribute("sq1", sq);
                   session.setAttribute("sa1", sa);
                   session.setAttribute("dt1", dt);
                   session.setAttribute("g1", g);
                    response.sendRedirect("http://localhost:8080/tiffin/registration.jsp?p=1exists");      
               }
                       session.setAttribute("em1", e);
                       session.setAttribute("pas", pas);
                       session.setAttribute("ph", ph);
                       session.setAttribute("fn1", fn);            
                       session.setAttribute("sq1", sq);
                       session.setAttribute("sa1", sa);
                       session.setAttribute("dt1", dt);
                       session.setAttribute("g1", g); 
                       session.setAttribute("uid",uid);                       
                       response.sendRedirect("verification.jsp");
                        cn.close();
                   }
               }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
           
        %>
        <a href="index.jsp">goback</a>
    </body>
</html>
