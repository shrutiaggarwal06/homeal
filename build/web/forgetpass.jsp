<%-- 
    Document   : forgetpass
    Created on : 19 Feb, 2021, 2:18:40 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title></title>
       <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
       <style>
body
{
background:#3498db;
background-attachment:fixed;
background-size:cover;
background-repeat:no-repeat;
padding-top:4rem;
}
.frosted{
width:400px;
height:100%;
background-color:white;
z-index:0;
float:left;
margin-left:650px;
overflow:hidden;
padding:2rem;
box-sizing:border-box;
box-shadow:0 0.5em 1em rgba(0,0,0,0.3);
}

.inputWithIcon.inputIconBg i {
  background-color: #aaa;
  color: #fff;
  padding: 9px 4px;
  border-radius: 4px 0 0 4px;
}

.inputWithIcon.inputIconBg input[type="text"]:focus + i {
  color: #fff;
  background-color: dodgerBlue;
}
input[type="text"] {
  width: 100%;
  border: 2px solid #aaa;
  border-radius: 4px;
  margin: 8px 0;
  outline: none;
  padding: 8px;
  box-sizing: border-box;
  transition: 0.3s;
}

input[type="text"]:focus {
  border-color: dodgerBlue;
  box-shadow: 0 0 8px 0 dodgerBlue;
}

.inputWithIcon input[type="text"] {
  padding-left: 40px;
}

.inputWithIcon {
  position: relative;
}

.inputWithIcon i {
  position: absolute;
  left: 0;
  top: 8px;
  padding: 9px 8px;
  color: #aaa;
  transition: 0.3s;
}

.inputWithIcon input[type="text"]:focus + i {
  color: dodgerBlue;
}
.container{
  text-align: center;
  
}
.btn{
  border: 1px solid #3498db;
  background: #3498db;
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
  color: #3498db;
}
#mes{color:red ; 
       font-weight: bold ; 
       font-size:20px ; 
}
       </style>
    </head>
    <body>
        <div class="frosted">
            <center> <img src="images\lock.jpeg" height="200" width="200"></center>
            <center><font style ="font-size:40px">Forgot Password?</font><br><br>
             <font style ="font-size:15px">You can reset your password here</font></center>
            <form action="recoverpass.jsp" method="POST">
                <%
                    String pr = "";
                       if(request.getParameter("p")!=null)
            {
                     if(request.getParameter("p").equals("error"))
                    {
                          pr="Email Id doesnot Exist<br> Try again";
                    }                    
            }
                %>
                <br><br>
                
                <div class="inputWithIcon inputIconBg">
                   
  <i class="fa fa-envelope fa-lg fa-fw" aria-hidden="true"></i><input type="text" placeholder="Email" name="em">
  <p id ="mes"><font style="font-size:18px"><%=pr%></font></p>
 </div>
                <div class="container"><input type="submit" class ="btn" value="SEND"></div>
            </form>
       </div>
    </body>
</html>
