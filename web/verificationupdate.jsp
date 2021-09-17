<%-- 
    Document   : verificationupdate
    Created on : 4 Feb, 2021, 10:25:56 PM
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
            String tf, mealb="",meall="",meald="",mealdb="",mealdl="",mealdd="",ka,ac,mealpb,mealpl,mealpd;
            ac=request.getParameter("ac");
            tf=request.getParameter("tf");
            mealb=request.getParameter("mealb");
            meall=request.getParameter("meall");
            meald=request.getParameter("meald");
            mealdb=request.getParameter("mealdb");
            mealdl=request.getParameter("mealdl");
            mealdd=request.getParameter("mealdd");
            ka=request.getParameter("ka");
            mealpb=request.getParameter("mealpb");
            mealpl=request.getParameter("mealpl");
            mealpd=request.getParameter("mealpd");
            String ph =(String)session.getAttribute("ph");
            String em1=(String)session.getAttribute("em1");                        
            String fn=(String)session.getAttribute("fn1");                                                                 
            String sa=(String)session.getAttribute("sa1");                        
            String dt=(String)session.getAttribute("dt1");
            String pass=(String)session.getAttribute("pas");
            String sq=(String)session.getAttribute("sq1");
            String g=(String)session.getAttribute("g1");
            int uid=(Integer)session.getAttribute("uid");
            int meid=0;                       
           try
            {                
             Class.forName("org.apache.derby.jdbc.ClientDriver");
             Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
              PreparedStatement ps= cn.prepareStatement("select max(MEALID) from meals");
                 ResultSet rs=ps.executeQuery();               
                if(rs.next())
                {
                        if(rs.getInt(1)!=0)
                    {
                         meid=rs.getInt(1)+1;
                    }
                }
              ps= cn.prepareStatement("insert into TIFFIN_PROVIDER values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
                       ps.setString(1, fn);
                       ps.setInt(2,uid);
                       ps.setString(3, em1); 
                       ps.setString(4, pass);
                       ps.setString(5,ph);
                       ps.setString(6, sq);
                       ps.setString(7, g);
                       ps.setString(8, dt);
                       ps.setString(9, ka);
                       ps.setString(10, ac);
                       ps.setString(11, tf);
                       ps.setString(12, sa);
                       ps.setString(13, "waiting");
                       ps.executeUpdate();
                      out.print("registered");
             if(mealb!=null)
             {
                 ps= cn.prepareStatement("insert into MEALS values(?,?,?,?,?,?)");               
                ps.setString(1, mealb);
                ps.setString(2, mealpb);
                ps.setString(3, mealdb);
                ps.setString(4, tf);
                ps.setInt(5, uid);
                ps.setInt(6,meid);                
                ps.executeUpdate();
             }
            if(meall!=null)
             {
               meid=meid+1;
                 ps= cn.prepareStatement("insert into MEALS values(?,?,?,?,?,?)");               
                ps.setString(1, meall);
                ps.setString(2, mealpl);
                ps.setString(3, mealdl);
                ps.setString(4, tf);
                ps.setInt(5, uid);
                ps.setInt(6,meid); 
                ps.executeUpdate();
                out.print(meall);
             }
             if(meald!=null)
             {
                meid=meid+1;
                 ps= cn.prepareStatement("insert into meals values(?,?,?,?,?,?)");               
                ps.setString(1, meald);
                ps.setString(2, mealpd);
                ps.setString(3, mealdd);
                ps.setString(4, tf);
                ps.setInt(5, uid);
                ps.setInt(6,meid); 
                ps.executeUpdate(); 
             }                       
             response.sendRedirect("http://localhost:8080/tiffin/confirmed.jsp?user=tf");
            }
            catch(Exception ex)
            {
              out.print(ex);
            }
        %>
    </body>
</html>

