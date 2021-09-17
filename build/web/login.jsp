<%-- 
    Document   : userlogin
    Created on : 2 Jul, 2019, 12:05:06 AM
    Author     : HP
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
<style>
    #mes{
    color:red ; 
       font-weight: bold ; 
       font-size:15px ; 
}
body{
background:url(images/loginbg.jpg);
background-attachment:fixed;
background-size:cover;
background-repeat:no-repeat;
overflow-x: hidden;
overflow-y: hidden;
}
.frosted{
border-radius:1em;
width:400px;
height:635px;
background:inherit;
z-index:0;
border-right:2px solid black;
border-top:2px solid black;
border-bottom:2px solid black;
float:right;
margin-right:350px;
overflow:hidden;
padding:2rem;
box-sizing:border-box;
box-shadow:0 0.5em 1em rgba(0,0,0,0.9);
}
.frosted::before
{
content:"";
position:absolute;
z-index:-1;
top:0; right:0; bottom:0; left:0;
background:inherit ;
box-shadow:inset 0 0 3000px rgba(255,255,255,0.9);

margin:-20px;
}
.im1{
    height:100px;
width:200px;
float:right;
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

</style>
</head>
<body>
    <%
                                String a="";
                                String b="";
                                if(session.getAttribute("cid")!=null)
                                {
                                        a="customerprofile.jsp";
                                        b="PROFILE";
                                        
                                  
                                 }
                                  else
                                 {
                                   a="login.jsp";
                                   b="Login";
                                 }    
%>     
    <div>
        <div class="d4">
   <div id = "menu">
<ul>
    <li> <a href="index.jsp"><img class = "im1" src="images/logo.png" style="line-height:0px;"></a></li>
<li><a href = "index.jsp"> Home&nbsp </a></li>
   
<li><a href = "breakfast.jsp"> Meals</a></li>
<li><a href = "<%=a%>"><%=b%></a></li>
<li><a href = "About.jsp">About &nbsp &nbsp</a></li>
<li><a href = "feedback.jsp">Feedback</a></li>
<li><a href = "contactus.jsp">Contact</a></li>
</ul>
   </div></div> 
    <br><br>
    <img src="images\logimage.jpg" height="635" width="400" style="margin-left:325px; border-radius:1em;">
 <div class="frosted">
    
 <h1><font style="font-size:33px;color:white">USER LOGIN</font></h1> 
        <form action="checklogin.jsp" method="POST">
             <%
                String e=(String)session.getAttribute("email");
        session.setAttribute("email", e);
        String pr="";
          if(request.getParameter("p")!=null)
            {
                if(request.getParameter("p").equals("no"))
                {
                    pr="Entered wrong password<BR>Try again";
                }
            }
                %>
                
            <table>
               
                <tr>
                    <td><label for="usertype"><font style="font-size:18px;color:white;">USER TYPE</label><BR>
                        <select name="ut" REQUIRED>
  <option value="" disabled selected hidden >SELECT</option>
  <option value="ADMIN">ADMIN</option>
  <option value="CUST">CUSTOMER</option>
  <option value="TF">TIFFIN PROVIDER</option>
                        </select></td>
                </tr>
                <tr>
                <td> <font style="font-size:20px;color:white;"><br>EMAIL ID:      </td><br>
                </tr>
                <tr>
                    <td> <input type="text" name="em" placeholder="email" size="40" REQUIRED/><br><br></font></td>
                </tr>  
                <tr>
                    <td> <font style="font-size:18px;color:white;"> PASSWORD : </td><br>
                </tr>
                <tr>
                    <td><input type="password" name="pass" placeholder="password" size="40" REQUIRED/><br></font></td>
                </tr>
                
            </table>
            <center>    <br><input type="submit" value="Log In"/></center>
            <p id ="mes"><font style="color:sandybrown"><%=pr%></p></font>
        </form>
 <br> <a href="forgotpass1.jsp">FORGOT PASSWORD?</a><br><br>
 <font style="font-size:18px;color:white">NOT A MEMBER?<a href="registration.jsp">JOIN US</a></font>
 <br><br><BR><BR><BR>
</div>
            <BR><BR><br><br><br>
</body></html>

