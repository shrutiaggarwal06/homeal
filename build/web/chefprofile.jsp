<%-- 
    Document   : chefprofile
    Created on : 11 Mar, 2021, 1:36:09 PM
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
  background:#009879;
  padding: 10px 20px;
  font-size: 15px;
  font-family: "montserrat";
  margin: 10px;
  transition: 0.8s;
  position: relative;
  overflow: hidden;
  color: #fff;
}
.btn1{
  border: 1px solid black;
  background:#ff0000;
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
.btn1:hover{
     background:#fff; 
  color: #f54d70;
}

          </style>
    </head>
    
    <body>       
     <%      
                String tid=(String)session.getAttribute("tid");        
         try
            {                
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                PreparedStatement ps= cn.prepareStatement("select * from orders where tf_id=? and status=?");      
                ps.setString(1, tid);
                ps.setString(2,"waiting");
                ResultSet rs=ps.executeQuery();             
                   if(rs.next()){ %>
                    <table class="styled-table">
                    <tr>
                        <th>Order id </th>         
                        <th>Meal type</th>
                        <th>Meal plan</th>
                        <th>Order date </th>
                        <th>No of days</th>
                        <th>Price</th>   
                        <th>Name</th>
                        <th>Email id</th>                        
                        <th>Delivery address </th>
                        <th> Mobile number</th>
                        <th>Payment mode</th>
                        <th>Status</th>
                    </tr>  <% rs=ps.executeQuery();                        
                while(rs.next()) 
                {                  
                       String meid=rs.getString("mealid");            
                    Connection cn1= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                  PreparedStatement  ps1= cn1.prepareStatement("select * from meals where mealid=?");  
                ps1.setString(1, meid);
                ResultSet rs1=ps1.executeQuery();   
                out.print(meid);
                if(rs1.next())
                { 
                    String oid=rs.getString("ORDERID");
               %> <tr>                            
                         <td> <%=rs.getString("ORDERID")%> </td> 
                         <td> <%=rs1.getString("meal_typ")%> </td>  
                         <td> <%=rs1.getString("m_det")%> </td>
                         <td> <%=rs.getString("DATE")%> </td>
                         <td><%=rs.getString("days")%> </td>
                         <td><%=rs.getString("amount")%> </td>
                         <td><%=rs.getString("name")%></td>     
                         <td> <%=rs.getString("email")%> </td>      
                         <td> <%=rs.getString("addr")%></td>
                         <td> <%=rs.getString("mob")%></td>
                         <td> <%=rs.getString("mode")%></td>  
                         <td> <%=rs.getString("status")%></td>
                         <td> <button class="btn" onclick="window.location.href='orderstatusupdate.jsp?status=accept&oid=<%=oid%>'">accept</button>
                             <button class="btn1" onclick="window.location.href='orderstatusupdate.jsp?status=reject&oid=<%=oid%>'">reject</button>
                    </tr><%                
                cn1.close();
                }                                   
                 }                
               cn.close();
            }  
                    else
         {
                 out.print("no orders");
          }
            }
        
                catch(Exception ex)
                {
                    out.print(ex);
                }
                    %>                                   
            </table>
    </body>
</html>

