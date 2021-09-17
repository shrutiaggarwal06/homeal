<%-- 
    Document   : allcustomers
    Created on : 19 Feb, 2021, 2:16:22 PM
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
    margin-right: 25px 0;
    font-size: 20px;
    font-family: sans-serif;
    min-width: 300px;
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
          </style>
    </head>
    
    <body>       
     <%                           
         try
            {                
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                PreparedStatement ps= cn.prepareStatement("select * from customer where usr_typ=?");
                ps.setString(1,"CUST");
                ResultSet rs=ps.executeQuery();             
                    %>
                     <table class="styled-table">
                    <tr>                      
                        <th>CUSTOMER ID</th>
                          <th>NAME</th>   
                         <th>EMAIL ID</th>
                        <th>GENDER</th>
                        <th>DATE OF BIRTH</th>
                        <th>MOBILE</th>                                      
                    </tr>  <%                         
                while(rs.next()) 
                {                    
                        
                    %> <tr class="active-row">                                                    
                         <td> <%=rs.getString("CUSTID")%> </td> 
                          <td> <%=rs.getString("NAME")%> </td> 
                         <td> <%=rs.getString("EMAILID")%> </td>
                         <td> <%=rs.getString("GENDER")%> </td>
                         <td><%=rs.getString("DOB")%> </td>
                         <td><%=rs.getString("MOB")%> </td>                                                                  
                    </tr><%                
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

