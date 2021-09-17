<%-- 
    Document   : adminchangecgef
    Created on : 17 Mar, 2021, 1:13:06 PM
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
    .btnn{
  border: 1px solid black;
  background:yellowgreen;
  padding: 10px 20px;
  font-size: 15px;
  font-family: "montserrat";
  margin: 10px;
  transition: 0.8s;
  position: relative;
  overflow: hidden;
  color: #fff;
}
.btnn:hover{
     background:#fff; 
  color: greenyellow;
}
    

          </style>
    </head>
    
    <body>       
     <%                        
         String meid="" , tid="";
         try
            {                
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                PreparedStatement ps= cn.prepareStatement("select * from TIFFIN_PROVIDER where status=?");          
                ps.setString(1,"waiting");
                ResultSet rs=ps.executeQuery();             
                    if(rs.next())
                    {%>
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
                          <th>MENU</th>
                          <th>CHANGE STATUS</th>
                    </tr>  <% } rs=ps.executeQuery();                       
                while(rs.next()) 
                {       tid=rs.getString("tf_id");                                   
               %> <tr class="active-row">                            
                         <td> <%=rs.getString("TF_ID")%> </td> 
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
                
                <td>  <button class="btn1" onclick="window.location.href='chefmenu.jsp?tid=<%=tid%>'">view</button></td>
                <td> <button class="btnn" onclick="window.location.href='updatechefstatus.jsp?status=accept&tid=<%=tid%>'">accept</button>
                             <button class="btnn" onclick="window.location.href='updatechefstatus.jsp?status=reject&tid=<%=tid%>'">reject</button>
                
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
            <button class="btnn" onclick="window.location.href='adminchefs.jsp'">GO BACK</button>
                          
    </body>
</html>