<%-- 
    Document   : chefabout
    Created on : 17 Mar, 2021, 9:34:28 AM
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
              body{
background:url(images/loginbg.jpg);
background-attachment:fixed;
background-size:cover;
background-repeat:no-repeat;
overflow-x: hidden;
overflow-y: hidden;
}
              #menu{
float:right;
margin-right:30px;
}
#menu ul
{
list-style : none ;
margin: 0;
}
#menu ul li
{
font-size : 20px ;
width : 150px ;
height : 60px ;
text-align : center ;
line-height : 60px ;
float : left ;
position : relative ;
}
#menu ul li a
{
text-decoration : none ;
color : white ;
display : block ;
line-height:100px;
}
#menu ul ul li a{
    width:100%;
    height:100%;
    background-color:rgba(0,0,0,0.3);
    line-height: 60px;
}
#menu ul ul
{
    margin-top:1px;
position : relative ;
display : none ;
}
#menu ul li:hover > ul
{
display : block ;
background-color:red;
}
.d4{
height:100px;
border:1px solid black;
box-shadow:12px;
border-radius:4px;
margin:3px auto;
background-color:rgba(0,0,0,0.3);
background-attachment:fixed;
}

          .frosted{
border-radius:1em;
width:600px;
height:600px;
background:inherit;
position:relative;
z-index:0;
overflow:hidden;
margin:0 auto;
padding:2rem;
box-sizing:border-box;
box-shadow:0 0.5em 1em rgba(0,0,0,0.3);
text-transform:capitalize;
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
text-transform:capitalize;
}
  
.im1{
    height:100px;
width:200px;
float:right;
}
h1{
  text-transform:capitalize;  
}
          </style>
    </head>
    <body>
        <%String tid="";
                    String fn="";                 
                    String g="";
                    String ph="";
                    String bh=""; 
                    String e="";
                    String kn="";
                    tid=(String)session.getAttribute("tid");
                     try
                    {
                         Class.forName("org.apache.derby.jdbc.ClientDriver");
                         Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                    PreparedStatement ps= cn.prepareStatement("select * from tiffin_provider where tf_id=?");
                    ps.setString(1, tid); 
                      ResultSet rs=ps.executeQuery();
                      if(rs.next())
                      {
                       g= rs.getString("GENDER");
                       fn=rs.getString("NAME");
                       ph= rs.getString("MOB");                      
                       bh=rs.getString("DOB");
                       e=rs.getString("EMAILID");   
                       kn=rs.getString("kitchen_name");
                    }                    
                      cn.close();
                    }                          
                    catch(Exception ex)
                            {
                                out.print(ex);
                            }
                    
                   %>
                   <div>
        <div class="d4">
   <div id = "menu">
<ul>
    <li> <a href="index.jsp"><img class = "im1" src="images/logo.png" style="line-height:0px;margin-right:100px"></a></li>
<li><a href = "cheforders.jsp">NEWORDERS</a></li>
<li><a href = "feedbackchef.jsp">FEEDBACK</a></li>
<li><a href="chefmenu.jsp?tid=<%=tid%>">YOUR MENU</a></li>
<li><a href="chefallorders.jsp">ALL ORDERS</a></li>
<li><a href="logout.jsp">LOGOUT</a></li>
</ul>
   </div></div> 
    <br><br>                                                                              
<div class="frosted" >
<h1 style="font-size:25px;font-family:Cursive,Brush Script MT;color:whitesmoke;">Personal Information</h1>
                   <hr style="border-color:white ; width:400px" >
                   <h1 style="font-size:22px;font-family:Cursive,Brush Script MT;color:greenyellow;text-transform:capitalize;">&nbsp Name : <%=fn%></h1>  <br>             
                   <h1 style="font-size:20px;font-family:Cursive,Brush Script MT;text-transform:capitalize;color:whitesmoke">&nbsp Email id : &nbsp <%=e%></h1>    <br>           
                       <h1 style="font-size:22px;font-family:Cursive,Brush Script MT;text-transform:capitalize;color:yellowgreen">&nbsp Birth-Date : <%=bh%></h1> <br>
                       <h1 style="font-size:22px;font-family:Cursive,Brush Script MT;color:whitesmoke">&nbsp Gender : <%=g%></h1>  <br>                            
                       <h1 style="font-size:22px;font-family:Cursive,Brush Script MT;color:greenyellow">&nbsp Phone Number : <%=ph%></h1><br>
         <h1 style="font-size:22px;font-family:Cursive,Brush Script MT;text-transform:capitalize;color:whitesmoke">&nbsp Kitchen Name : <%=kn%></h1>  <br> 
                  <br>
                
                   </div>                                                     
    </body>
</html>

