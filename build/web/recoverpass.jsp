<%-- 
    Document   : recoverpass
    Created on : 19 Feb, 2021, 2:21:29 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <%@page import="java.sql.*"%>
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
        <style>
        .select{
border: 2px solid;
  border-color: grey;
  width:395px;
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
 .inputWithIcon.inputIconBg i {
  background-color: #aaa;
  color: #fff;
  padding: 9px 4px;
  border-radius: 4px 0 0 4px;
}

.inputWithIcon.inputIconBg input[type="password"]:focus + i {
  color: #fff;
  background-color: dodgerBlue;
}
input[type="password"] {
  width: 100%;
  border: 2px solid #aaa;
  border-radius: 4px;
  margin: 8px 0;
  outline: none;
  padding: 8px;
  box-sizing: border-box;
  transition: 0.3s;
}

input[type="password"]:focus {
  border-color: dodgerBlue;
  box-shadow: 0 0 8px 0 dodgerBlue;
}

.inputWithIcon input[type="password"] {
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

.inputWithIcon input[type="password"]:focus + i {
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
.frosted{
width:400px;
height:100%;
float:left;
margin-left:650px;}
.container{
 position: relative;
  text-align: center;
  color: white;}
.text{
 position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}
    </style>
    <script>
        function fn1(){
    
                var p = document.f1.npass.value;
        var pa = /^((?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{4,100})+$/;
                   if(p=="")
               {
                   document.getElementById("ps").innerHTML="Field cannot be empty";
                   return false;
               }
                 else if((!pa.test(p)))
                 {
                     document.getElementById("ps").innerHTML="*Invalid Password Format<br><br> Password must contain atleast <br>one uppercase letter<br>one lower case letter <br> one numeric digits <br>min limit is :4" ;
                    return false;
                }
                else
                {
                     document.getElementById("ps").innerHTML=" " ;        
                     return true;
                }    
            }
    </script>
    </head>
    <body>
        <%String e=(String)request.getParameter("em");
            session.setAttribute("email",e);
         try
            {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
             Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
            PreparedStatement ps= cn.prepareStatement("select * from CUSTOMER where EMAILID=? ");
                  ps.setString(1 ,e);                                
                 ResultSet rs=ps.executeQuery();
                 if(rs.next())
                 {                        
                 }   
                 else
                 {
                       response.sendRedirect("http://localhost:8080/tiffin/forgetpass.jsp?p=error");
                 }
            }
         catch(Exception ex)
         {
             out.print(ex);
         }
          String pr = "";
                       if(request.getParameter("p")!=null)
            {
                     if(request.getParameter("p").equals("error"))
                    {
                          pr="Some details are wrong. check and Try again";
                    }                    
            }
                     %>
        <p id ="mes"><font style="font-size:18px"><%=pr%></font></p>
        <div class="container"><img src="images\reset.jpg" style="width:100%" height="200" >
            <div class="text"><font style="font-size:50px">RESET YOUR PASSWORD</font></div>    
        </div>
        <div class="frosted">
        <form action="recoverpassfinal.jsp" method="POST" onsubmit="return fn1()"><BR><BR>
            <font style="font-size:25px">Phone Number</font>
            <div class="inputWithIcon inputIconBg">
       <i class="fa fa-phone" aria-hidden="true"></i><input type="text" placeholder="PHONE NUMBER" name="phno">
            </div>
                <font style="font-size:25px">Security Question</font><br>
                <div class="select" style="width:395px;">
                <select  name="secq" style="padding: 10px 20px;font-size: 17px;font-family: montserrat;">
                     <option>SELECT</option>
                            <option value="q1">what is your father's middle name?</option>
                            <option value="q2">what was your first pets name?</option>
                            <option value="q3">Where is your hometown?</option>
                            <option value="q4">What is your common password?</option>
                </select></div><br>
            <font style="font-size:25px">Security Answer</font>
        <div class="inputWithIcon inputIconBg">
        <i class="fa fa-unlock-alt" aria-hidden="true"></i><input type="text" name="seca" placeholder="SECURITY ANSWER">
        </div>
        <font style="font-size:25px">New Password</font> 
        <div class="inputWithIcon inputIconBg">
       <i class="fa fa-key" aria-hidden="true"></i><input type="password" name="npass" placeholder="PASSWORD" >
        </div>
<div class="container"><input type="submit" class ="btn" value="RESET PASSWORD"></div>   
        </form>
        </div>
        </body>
</html>
