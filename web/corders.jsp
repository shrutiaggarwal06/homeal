<%-- 
    Document   : corders
    Created on : 12 Feb, 2021, 8:42:14 PM
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
             
              .styled-table {
    border-collapse: collapse;
    margin: 25px 0;
    font-size: 0.9em;
    font-family: sans-serif;
    min-width: 400px;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
}
.styled-table thead tr {
    background-color: #009879;
    color: #ffffff;
    text-align: left;
}
.styled-table th,
.styled-table td {
    padding: 12px 15px;
}
.styled-table tbody tr {
    border-bottom: 1px solid #dddddd;
}

.styled-table tbody tr:nth-of-type(even) {
    background-color: #f3f3f3;
}

.styled-table tbody tr:last-of-type {
    border-bottom: 2px solid #009879;
}
.styled-table tbody tr.active-row {
    font-weight: bold;
    color: #009879;
    
}

.btn{
  border: 1px solid black;
  background:#f54d70;
  padding: 10px 20px;
  font-size: 15px;
  font-family: "montserrat";
  margin: 10px;
  transition: 0.8s;
  position: relative;
  overflow: hidden;
  color: #fff;
}
.btn:hover{
     background:#fff; 
  color: #f54d70;
}
          </style>
    </head>
    
    <body>       
     <% 
         String cid=(String)session.getAttribute("cid");
                String meid="";   
                String oid="";
         try
            {                
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                PreparedStatement ps= cn.prepareStatement("select * from orders where custid=?");  
                ps.setString(1, cid);
                ResultSet rs=ps.executeQuery();
               if(rs.next())
                {
                    %>
                     <table class="styled-table">
                    <tr>
                        <th>Order_id</th>                        
                         <th>Email_id</th>
                        <th>Order date </th>
                        <th>Days</th>
                        <th>Price</th>
                        <th>Tiffin name</th>
                        <th>Meal type</th>
                        <th>Meal plan</th>
                        <th>Delivery Address </th>
                        <th> Mobile Number</th>
                        <th>Mode of Payment</th>
                        <th>Status</th> 
                        <th>Cancel Meal</th>
                    </tr>  <%      
                     rs=ps.executeQuery();
                while(rs.next()) 
                {                    
                    meid=rs.getString("mealid");               
                    Connection cn1= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                  PreparedStatement  ps1= cn1.prepareStatement("select * from meals where mealid=?");  
                ps1.setString(1, meid);
                ResultSet rs1=ps1.executeQuery();   
                if(rs1.next())
                {                  
               %> <tr class="active-row">
                         <td> <%=rs.getString("ORDERID")%> </td>    
                         <% oid =rs.getString("ORDERID");%>
                         <td> <%=rs.getString("EMAIL")%> </td>
                         <td> <%=rs.getString("DATE")%> </td>
                          <td> <%=rs.getString("days")%> </td>
                         <td><%=rs.getString("amount")%> </td>
                         <td><%=rs1.getString("t_pro")%> </td>
                         <td><%=rs1.getString("meal_typ")%></td>  
                          <td><%=rs1.getString("m_det")%></td>  
                         <td> <%=rs.getString("addr")%> </td>      
                         <td> <%=rs.getString("mob")%></td>
                         <td> <%=rs.getString("mode")%></td>   
                         <td><%=rs.getString("status")%></td>                        
                         <td> <%if((rs.getString("status")).equals("waiting"))
                         {%><button type='button' onclick="window.location.href='cancel.jsp?status=cancelled&oid=<%=oid%>'">Cancel</button></td>
                    <%}%>
               </tr><%                
                cn1.close();
                }
                else
                {
                    out.print("no meals");
                }
                }    
                 }
                else
                   {
                             out.print("no orders");
                        }
               cn.close();
            }                    
                catch(Exception ex)
                {
                    out.print(ex);
                }
                    %>                                   
            </table>
            
            <br><br>
    <center> <button class="btn" type='button' onclick="window.location.href='customerprofile.jsp'">GO BACK TO PROFILE</button>
    </center>
    
    </body>
</html>
