<%-- 
    Document   : changepass
    Created on : 11 Feb, 2021, 8:50:06 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>   
        <style>
             .frosted{
border-radius:1em;
width:400px;
height:500px;
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
.btn-bot {
  position: center;
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
        
            
        <div class="frosted">
        <form action="checkpass.jsp" method="POST" onsubmit="return pass()"><BR><BR>
            <%
                String e=(String)session.getAttribute("cid");
               session.setAttribute("cid", e);
             String pr="";
          if(request.getParameter("p")!=null)
            {
                if(request.getParameter("p").equals("no"))
                {
                    pr="Entered wrong password<BR>Try Another";
                }                     
               else if(request.getParameter("p").equals("yes"))
                {
                    pr="PASSWORD SUCCESFULLY CHANGED";
                }
            }
                %>
                <div class="text"><center><font style="font-size:27px;font-family:Cursive,Brush Script MT;color:greenyellow;"><u>CHANGE PASSWORD</u></center></font></div>   
                <p id ="mes"><font style="font-size:18px"><%=pr%>  </p> </font>
                
            <span id="Message"></span> <BR><font style="font-size:25px;font-family:Cursive,Brush Script MT;color:whitesmoke;">Old Password</font> 
        <div class="inputWithIcon inputIconBg">
       <i class="fa fa-key" aria-hidden="true"></i><input type="password" name="opass" placeholder="OLD PASSWORD" required>
       
        </div> 
            <br>
        <font style="font-size:25px;font-family:Cursive,Brush Script MT;color:greenyellow;">New Password</font> 
        <div class="inputWithIcon inputIconBg">
       <i class="fa fa-key" aria-hidden="true"></i><input type="password" name="npass" placeholder="NEW PASSWORD" required>
        </div>
        <br><br>
        <div class="container"><center><input type="submit" class="btn-bot" value="CHANGE PASSWORD"/></center></div>   
        </form>            
        </div>
    </body>
</html>
