<%-- 
    Document   : c_about
    Created on : 11 Feb, 2021, 8:14:48 PM
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
          .frosted{
border-radius:1em;
width:auto;
height:auto;
background:inherit;
position:relative;
z-index:0;
overflow:hidden;
margin:0 auto;
padding:2rem;
box-sizing:border-box;
box-shadow:0 0.5em 1em rgba(0,0,0,0.3);
}
.frosted::before
{
content:"";
position:absolute;
z-index:-1;
top:0; right:0; bottom:0; left:0;
background:inherit;
box-shadow:inset 0 0 3000px rgba(255,255,255,0.5);
filter:blur(10px);
margin:-20px;
}
          </style>
    </head>
    <body>
        <%String cid="";
                    String fn="";                 
                    String g="";
                    String ph="";
                    String bh=""; 
                    String e="";
                    cid=(String)session.getAttribute("cid");
                     try
                    {
                         Class.forName("org.apache.derby.jdbc.ClientDriver");
                         Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                    PreparedStatement ps= cn.prepareStatement("select * from customer where CUSTID=?");
                    ps.setString(1, cid); 
                      ResultSet rs=ps.executeQuery();
                      if(rs.next())
                      {
                       g= rs.getString("GENDER");
                       fn=rs.getString("NAME");
                       ph= rs.getString("MOB");                      
                       bh=rs.getString("DOB");
                       e=rs.getString("EMAILID");                       
                    }                    
                      cn.close();
                    }                          
                    catch(Exception ex)
                            {
                                out.print(ex);
                            }
                    
                   %>
                   <div class="frosted"> 
                        <h1 style="font-size:25px;font-family:Cursive,Brush Script MT;">Personal Information</h1>
                   <hr style="border-color:white ; width:400px" >
                   <h1 style="font-size:22px;font-family:Cursive,Brush Script MT;text-transform:capitalize;color:greenyellow">&nbsp First Name : <%=fn%></h1>  <br>             
                   <h1 style="font-size:20px;font-family:Cursive,Brush Script MT;text-transform:capitalize;">&nbsp Email id : &nbsp <%=e%></h1>    <br>           
                       <h1 style="font-size:22px;font-family:Cursive,Brush Script MT;text-transform:capitalize;color:yellowgreen">&nbsp Birth-Date : <%=bh%></h1> <br>
                       <h1 style="font-size:22px;font-family:Cursive,Brush Script MT;text-transform:capitalize;color:whitesmoke">&nbsp Gender : <%=g%></h1>  <br>            
                
                  <h1 style="font-size:22px;font-family:Cursive,Brush Script MT;color:greenyellow">&nbsp Phone Number : <%=ph%></h1>
                  <br>
                   </div>
    </body>
</html>
