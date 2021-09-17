<%-- 
    Document   : feedbackchef
    Created on : 17 Mar, 2021, 8:33:21 PM
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
         String tid=(String)session.getAttribute("tid");
         try
            {                
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                PreparedStatement ps= cn.prepareStatement("select * from feedback where tf_id=?");
                ps.setString(1,tid);
                ResultSet rs=ps.executeQuery();             
                    %>
                    <table class="styled-table">
                    <tr>                                              
                          <th>NAME</th>   
                         <th>EMAIL ID</th>                      
                        <th>MESSAGE</th>                                      
                    </tr>  <%                         
                while(rs.next()) 
                {                    
                        
                    %> <tr class="active-row">                                                    
                         <td> <%=rs.getString("name")%> </td> 
                          <td> <%=rs.getString("emailid")%> </td>                          
                         <td> <%=rs.getString("feedback")%> </td>                                                                                       
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
            <button class="btn" type='button' onclick="window.location.href='chefabout.jsp'">GO BACK TO YOUR PROFILE</button>
    
   
    </body>
</html>
