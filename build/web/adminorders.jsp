<%-- 
    Document   : allorders
    Created on : 19 Feb, 2021, 11:18:32 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <%@page import="java.sql.*"%>
          <style>
              table , th, td{
                  border:1px solid black;
                  margin-right:500px;
                  
              }
          </style>
    </head>
    
    <body>       
     <%      
                String meid="";        
         try
            {                
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                PreparedStatement ps= cn.prepareStatement("select * from orders");               
                ResultSet rs=ps.executeQuery();             
                    %>
                     <table>
                    <tr>
                        <th>ORDER ID </th>   
                        <th>CUSTOMER ID</th>
                         <th>EMAIL ID</th>
                        <th>ORDER DATE </th>
                        <th>PRICE</th>
                        <th>KITCHEN NAME</th>
                        <th>CHEF ID</th>
                        
                        <th>MEAL PLAN</th>
                        <th>DELIVERY ADDRESS </th>
                        <th> MOBILE NUMBER</th>
                        <th>MODE OF PAYMENT</th>
                        <th>STATUS</th>                        
                    </tr>  <%                         
                while(rs.next()) 
                {                    
                    meid=rs.getString("mealid");               
                    Connection cn1= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                  PreparedStatement  ps1= cn1.prepareStatement("select * from meals where mealid=?");  
                ps1.setString(1, meid);
                ResultSet rs1=ps1.executeQuery();   
                if(rs1.next())
                {                  
               %> <tr>                            
                         <td> <%=rs.getString("ORDERID")%> </td> 
                         <td> <%=rs.getString("CUSTID")%> </td>  
                         <td> <%=rs.getString("EMAIL")%> </td>
                         <td> <%=rs.getString("DATE")%> </td>
                         <td><%=rs1.getString("m_price")%> </td>
                         
                        <td><%=rs1.getString("t_pro")%> </td>
                        <td><%=rs1.getString("tf_id")%> </td>               
                         <td><%=rs1.getString("meal_typ")%></td>     
                         <td> <%=rs.getString("addr")%> </td>      
                         <td> <%=rs.getString("mob")%></td>
                         <td> <%=rs.getString("mode")%></td>
                         <td><%= rs.getString("status")%></td>                                             
                    </tr><%                
                cn1.close();
                }                                   
                 }                
               cn.close();
            }                    
                catch(Exception ex)
                {
                    out.print(ex);
                }
                    %>                                   
            </table>
    </body>
</html>

