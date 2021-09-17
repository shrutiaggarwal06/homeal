<%-- 
    Document   : registration
    Created on : 4 Feb, 2021, 10:19:44 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
<style>
body{
background:url(aboutcss/img/banner-bg.png);
background-attachment:fixed;
background-size:cover;
background-repeat:no-repeat;
}
.frosted{
border-radius:1em;
width:600px;
height:100%;
background-color:rgba(211,211,211,0.3);
position:relative;
overflow:hidden;
margin:0 auto;
padding-left:4rem;
padding-bottom:2rem;
color: white;
}
#Message,#ps,#g,#dts,#dr,#qw,#fu,#Mess,#mes{   
        color:black; 
        font-family:Cursive,Brush Script MT;
       font-weight: bold ; 
       font-size:20px ; 
}
#submit{
    font-size:20px;
    font-family:'Times New Roman';
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
background-color:rgba(0,0,0,0.5);
background-attachment:fixed;
}

</style>
    <script>
                function fn()
             {
                        var e=document.f1.em.value;
                        var filter=/^([A-Za-z])+([0-9.$%&#A-Za-z0-9])+\@(([a-zA-Z])+\.)+([a-zA-Z]{2,3})+$/ ;
               if(e=="")
               {
                   document.getElementById("Message").innerHTML="Field cannot be empty" ;
               }
                  else if((!filter.test(e)))
                {
                     document.getElementById("Message").innerHTML="Invalid Email Format <br>(Vaild Format:example@exam.em)" ;
                    return false;                
                }
                else
                {
                   document.getElementById("Message").innerHTML=" "
                   return 1;
                }
            }
             function fn1(){
    
                var p = document.f1.pass.value;
        var pa = /^((?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{4,100})+$/;
                   if(p=="")
               {
                   document.getElementById("ps").innerHTML="Field cannot be empty";
               }
                 else if((!pa.test(p)))
                 {
                     document.getElementById("ps").innerHTML="*Invalid Password Format<br><br> Password must contain atleast <br>one uppercase letter<br>one lower case letter <br> one numeric digits <br>min limit is :4" ;
                    return false;
                }
                else
                {
                     document.getElementById("ps").innerHTML=" " ;        
                     return 1;
                }    
            }
            function fn2()
            {
                var ph = document.f1.pi.value;
                 if(ph=="")
               {
                   document.getElementById("Mess").innerHTML="Field cannot be empty" ;
                   
        }
               else if(isNaN(ph))
                {
                        document.getElementById("Mess").innerHTML="Invalid Phone Number Format<br> Phone Number must contain only" ;
                        return false;
                }
                else
                {
                     if((ph.length<10)||(ph.length>10))
                     {
                        document.getElementById("Mess").innerHTML=" Invalid Phone Number Format<br> Phone Number must contain exact : 10 digts" ;
                        return false;
                    }
                   else
                   {    
                        document.getElementById("Mess").innerHTML=" " ;        
                        return 1;
                   }
                 }                
               }
            
                 function fn4()
                 {
                 if(f1.sec_ques.selectedIndex==0)
                 {
                     document.getElementById("dr").innerHTML="Select Atleast one " ;
                    return false;
                 }
                
                else{
                    document.getElementById("dr").innerHTML=" " ;
                    return 1;
                }
                
            }  
            function fn6()
            {
                var c = document.f1.fname.value ;
                if( c=="")            
                {
                     document.getElementById("fu").innerHTML="Field cannot be empty" ;
                     
                    return false;
                }
                else
                {
                        document.getElementById("fu").innerHTML=" " ;
                        return 1;
                }
            }    
             function fn7()
            {
                var sc = document.f1.seca.value ;
                if( sc=="")            
                {
                     document.getElementById("qw").innerHTML="Field cannot be empty" ; 
                    return false;
                }
                else
                {
                        document.getElementById("qw").innerHTML=" " ;
                        return 1;
                }
            }    
            function check()
            {
                var choice1=document.getElementById("t1");
                var choice2=document.getElementById("t2");
                var b=document.getElementById("dateid").value;
                var form;
                var form1;
                if((choice1.checked)||(choice2.checked))
                {
                    form="true";
                }
                else
                {
                    form="false";
                }
                 if(b=="")
                 {
                     form1="false1";
                 }
                 else
                 {
                     form1="true1";
                 }
                 
                if((form1=="true1")&&(form=="true")&&(fn()==1)&&(fn1()==1)&&(fn2()==1)&&(fn4()==1)&&(fn7()==1)&&(fn6()==1))
                    {  
                        return true;
                    }
                    else
                    {  
                            if(form=="false")
                            {
                               document.getElementById("g").innerHTML="Select Atleast one";
                            }
                            if(form1=="false1")
                             {
                                document.getElementById("dts").innerHTML="Select Atleast one";
                             }
                             alert("something is wrong");
                            return false;
                    }
            }
        
    </script>
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
    <li> <a href="index.html"><img class = "im1" src="images/logo.png" style="line-height:0px;"></a></li>
<li><a href = "index.jsp"> Home&nbsp </a></li>
   
<li><a href = "breakfast.jsp"> Meals</a></li>
<li><a href = "<%=a%>"><%=b%></a></li>
<li><a href = "About.jsp">About &nbsp &nbsp</a></li>
<li><a href = "feedback.jsp">Feedback</a></li>
<li><a href = "contactus.jsp">Contact</a></li>
</ul>
   </div></div> 
        <br><br><br>    
<div class="frosted"> 
        <form style="line-height:5px" name = "f1" action="newregister.jsp" method="POST" onsubmit="return check()"  >
             <%
                    String ph= "";
                    String fn = "";                    
                    String sa = "";
                    String dt = "";
                    String pr = "";
                    String em1="";
                    String pr1="";
                    
                if(request.getParameter("e")!=null)
            {
                if(request.getParameter("e").equals("exists"))
                {
                    pr="Email Id Exist<br> Try Another";                      
                    ph=(String)session.getAttribute("ph1");                        
                    fn=(String)session.getAttribute("fn1");                                                                   
                    sa=(String)session.getAttribute("sa1");                        
                    dt=(String)session.getAttribute("dt1");
                }
            }
                if(request.getParameter("p")!=null)
            {
                if(request.getParameter("p").equals("1exists"))
                {
                    pr1="phone number exist<br> Try Another";                      
                    em1=(String)session.getAttribute("em1");                        
                    fn=(String)session.getAttribute("fn1");                                                                 
                    sa=(String)session.getAttribute("sa1");                        
                    dt=(String)session.getAttribute("dt1");
                }
            }
 %> 
            <table style="line-height:20px">
                <tr>
                    <td colspan="2">
                        <font style="font-size:30px;color:black">REGISTRATION</font> <br><br>  </td>
                </tr>
                <tr>
                    <td style="font-size:20px;color:black"><label for="usertype">USER TYPE</label><BR>
                    <select name="ut" REQUIRED>
                    <option value="" disabled selected hidden >SELECT</option>
                    <option value="CUST">CUSTOMER</option>
                    <option value="TF">TIFFIN PROVIDER</option>
                    </select></td>
                </tr>
                <tr>
                    <td> <font style="font-size:18px ; color:white">EMAIL ID:      </td><br>
                </tr>
                <tr>
                    <td> <input type="text" name="em" placeholder="Email Id" size="40" value= "<%=em1%>" onfocusout="fn()">&nbsp &nbsp &nbsp</font> <br><span id="Message"></span></td>
                    <td><td> <p id ="mes"><font style="font-size:18px"><%=pr%>   </p>   </td></td>
                </tr>  
                
                <tr>
                    <td><br> <font style="font-size:18px; color:black"> PASSWORD : </td><br>
                </tr>
                <tr>
                    <td><input type="password" name="pass" placeholder="Password" size="40"  onfocusout="fn1()" >&nbsp &nbsp &nbsp</font><br><span id="ps"></span></td>
                </tr>
                 <tr>
                     <td><br> <font style="font-size:18px;color:white"> PHONE NO  </td><br>
                </tr>
                <tr>
                    <td><input type="text" name="pi" placeholder="Phone Number" size="40" value = "<%=ph%>"onfocusout="fn2()" />&nbsp &nbsp &nbsp<br><span id="Mess"></span></font></td>
                    <td><td> <p id ="mes"><font style="font-size:18px"><%=pr1%>   </p>   </td></td>
                </tr>
                 <tr>
                     <td><br> <font style="font-size:18px;color:black"> SECURITY QUESTION : </td><br>
                </tr>
                <tr>
                    <td> <select  name="sec_ques" onclick="fn4()">
                            <option>Select</option>
                            <option value="q1">what is your father's middle name?</option>
                            <option value="q2">what was your first pets name?</option>
                            <option value="q3">Where is your hometown?</option>
                            <option value="q4">What is your common password?</option>
                         </select>&nbsp &nbsp &nbsp<span id="dr"></span></td>
                </tr>
                <tr>
                    <td><br> <font style="font-size:18px;color:whitesmoke"> SECURITY ANSWER: : </td><br>
                </tr>
                <tr>
                    <td><input type="text" name="seca" placeholder="Security Answer" size="40" value="<%=sa%>" onfocusout="fn7()"/><br><span id="qw"></span></font></td>
                </tr>
                <tr>
                    <td><br> <font style="font-size:18px;color:black"  > DATE OF BIRTH : </td><br>
                </tr>
                <tr>
                    <td><input type="date" name="date" id="dateid" min="1990-12-31" max="2000-12-31" value="<%=dt%>">&nbsp &nbsp &nbsp<br> <span id="dts"></span></font></td>
                </tr>
                <tr>
                    <td><br> <font style="font-size:18px;color:whitesmoke"> FIRST NAME : </td><br>
                </tr>
                <tr>
                    <td><input type="text" name="fname" placeholder="First Name" size="40" value="<%=fn%>"onfocusout="fn6()" /><br><span id="fu" ></span></font></td>
                </tr>     
                 <tr>
                     <td> <br><font style="font-size:18px;color:black"> GENDER: </td><br>
                </tr>
                <tr>
                    <td style="font-size:18px;color:orange"><input type="radio"  name="gender" value="Male" id="t1">Male</td></tr>
                <tr>    <td style="font-size:18px;color:black"><input type="radio"  name="gender" value="Female" id ="t2">Female &nbsp &nbsp &nbsp<span id="g"></span></td><tr>
                <tr>  <td style="font-size:18px;color:orange"><input type="radio"  name="gender" value="rather not say" id ="t3">Rather not say &nbsp &nbsp &nbsp<span id="g"></span></td>
                </tr> 
              <!-- <tr><td><INPUT NAME="file" TYPE="file" required>  </td></tr>-->
            </table>
                <center>    <br><br><br><input type="submit" id="submit" value="REGISTER"  /></center> 
        </form>
                <br><font style="font-size:20px;color:white">ALREADY A MEMBER?&nbsp <a style="font-size:20px;color:black"href="login.jsp">LOGIN</a> </font> 
                <br><br><font style="font-size:20px;color:white">CHANGED YOUR MIND?&nbsp &nbsp<a style="font-size:20px;color:black" href="index.html">HOME</a> </font>    
</div>
 <br>
</body></html>