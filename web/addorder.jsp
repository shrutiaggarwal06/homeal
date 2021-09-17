<%-- 
    Document   : addorder
    Created on : 10 Mar, 2021, 9:41:43 PM
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
           String mealtype=(String)session.getAttribute("mealtype");
           String chefname=(String)session.getAttribute("chefname");
           String custname=(String)session.getAttribute("custname");
           String mealdet=(String)session.getAttribute("mealdet");
           String email=(String)session.getAttribute("email");
           String phone=(String)session.getAttribute("phone");
           String days=(String)session.getAttribute("days");
           String startdate=(String)session.getAttribute("startdate");
           double price1=(Double)session.getAttribute("price");
           String chefid=(String)session.getAttribute("chef_id");
           String custid=(String)session.getAttribute("cid");
           String mealid=(String)session.getAttribute("mealid");
           String addr=(String)session.getAttribute("addr");
           String pincode=(String)session.getAttribute("pincode");
           String address=addr+pincode;    
           String price=String.valueOf(price1);
           
                try
            {
             Class.forName("org.apache.derby.jdbc.ClientDriver");
             Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");       
              PreparedStatement ps= cn.prepareStatement("select max(ORDERID) from orders");
                 ResultSet rs=ps.executeQuery();
                 int oid=1001;                
                if(rs.next())
                {
                        if(rs.getInt(1)!=0)
                    {
                        oid=rs.getInt(1)+1;
                        session.setAttribute("oid",oid);
                    }
                }
            ps= cn.prepareStatement("insert into orders values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
                       ps.setString(1, custid);
                       ps.setInt(2,oid);
                       ps.setString(3, startdate); 
                       ps.setString(4, phone);                     
                       ps.setString(5,address );
                       ps.setString(6, email);
                       ps.setString(7,"card");
                       ps.setString(8, mealid);                     
                       ps.setString(9,"waiting");
                       ps.setString(10,price);
                       ps.setString(11,custname);
                       ps.setString(12,days);
                       ps.setString(13,chefid);
                       ps.executeUpdate();
                       response.sendRedirect("custneworder.jsp");
               cn.close();
            }
                catch(Exception ex)
                {
                    out.print(ex);
                }
                
            %>
    </body>
</html>
