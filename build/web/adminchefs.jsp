<%-- 
    Document   : allchefs
    Created on : 19 Feb, 2021, 11:23:31 AM
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
                String meid="",tid="";        
         try
            {                
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                PreparedStatement ps= cn.prepareStatement("select * from TIFFIN_PROVIDER");               
                ResultSet rs=ps.executeQuery();             
                    %>
                     <table class="styled-table">
                    <tr>
                        <th>CHEF ID </th>   
                        <th>NAME</th>
                         <th>EMAIL ID</th>
                        <th>GENDER</th>                       
                        <th>TIFFIN NAME</th>                      
                        <th>KITCHEN ADDRESS </th>
                        <th> MOBILE NUMBER</th>
                        <th>AADHAR</th>
                        <th>DATE OF BIRTH</th>  
                          <th>MEALS OFFERING</th>
                          <th>STATUS</th>
                          <th>MENU</th>
                    </tr>  <%                         
                while(rs.next()) 
                { tid=rs.getString("TF_ID");                                         
               %> <tr class="active-row">                            
                         <td> <%=tid%> </td> 
                         <td> <%=rs.getString("NAME")%> </td>  
                         <td> <%=rs.getString("EMAILID")%> </td>
                         <td> <%=rs.getString("GENDER")%> </td>
                         <td><%=rs.getString("KITCHEN_NAME")%> </td>                        
                         <td><%=rs.getString("ADDRESS")%></td>     
                         <td> <%=rs.getString("MOB")%> </td>      
                         <td> <%=rs.getString("AADHAR")%></td>
                         <td> <%=rs.getString("DOB")%></td>  
                       <%   meid=rs.getString("tf_id");                            
                    Connection cn1= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                PreparedStatement  ps1= cn1.prepareStatement("select * from meals where tf_id=?");  
                ps1.setString(1, meid);
                ResultSet rs1=ps1.executeQuery();  
                int i=0;
                String meal[]= new String[3];
                meal[0]=" ";
                meal[1]="";
                meal[2]="";
                while(rs1.next())
                {                                
                        meal[i]=rs1.getString("meal_typ");                         
                        i++;
                }                              
                %><td><%=meal[0]%> <%=meal[1]%> <%=meal[2]%></td>
                <td><%=rs.getString("status")%></td>
                <td> <button class="btn1" onclick="window.location.href='chefmenu.jsp?tid=<%=tid%>'">view</button></td>
                 </tr>                              
               <%
                cn1.close();
                }
               cn.close();
            }                    
                catch(Exception ex)
                {
                    out.print(ex);
                }
                    %>                                   
            </table>
            <button class="btn" type='button' onclick="window.location.href='adminchangechef.jsp'">Check New Registration For Chef</button>
            <button class="btn" type='button' onclick="window.location.href='admin1.jsp'">GO BACK</button>
    </center>
    
    </body>
</html>