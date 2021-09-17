<%-- 
    Document   : feedback
    Created on : 12 Mar, 2021, 8:27:36 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Feedback</title>
	<link rel="stylesheet" type="text/css" href="feedbackcss/style.css">
	<link href="https://fonts.googleapis.com/css?family=Quicksand&display=swap" rel="stylesheet">
	
       <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
       <style>
          .im1{
    height:100px;
width:200px;
float:right;
margin-right:2%;
}
 
       #menu{
float:right;
margin-right:0px;
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
background-color:#27ae60;
}

.d4{
height:100px;
border:1px solid black;
box-shadow:12px;
border-radius:4px;
margin:0px auto;
background-color:#00999c;
background-attachment:fixed;
}
.btn{
	width: 100%;
	padding: 0.5rem 1rem;
	background-color: #00999c;
	color: #fff;
	font-size: 1.1rem;
	border: none;
	outline: none;
	cursor: pointer;
	transition: .3s;
}

.btn:hover{
    background-color: #00999c;
}
h2{
	position: relative;
	padding: 0 0 10px;
	margin-bottom: 10px;
}

h2:after{
	content: '';
    position: absolute;
    left: 50%;
    bottom: 0;
    transform: translateX(-50%);
    height: 4px;
    width: 50px;
    border-radius: 2px;
    background-color: #00999c;
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
                                        b="Profile";
                                        
                                  
                                 }
                                  else
                                 {
                                   a="login.jsp";
                                   b="Login";
                                 }                                
            String cu="";
            if(request.getParameter("c")!=null)
            {                                   
               if(request.getParameter("c").equals("yes"))
                {
                    cu="THANK YOU FOR YOUR FEEDBACK ! YOUR FEEDBACK MATTERS US A LOT!";
                }
            }
              
%>                   
 
    <div>
        <div class="d4">
   <div id = "menu">
<ul>
    <li> <a href="index.html"><img class = "im1" src="images/logo.png" style="line-height:0px;"></a></li>
<li><a href = "index.jsp"> Home&nbsp </a></li>
   
<li><a href = "meals.jsp"> Meals</a></li>
<li><a href = "<%=a%>"><%=b%></a></li>
<li><a href = "About.jsp">About &nbsp &nbsp</a></li>
<li><a href = "feedback.jsp">Feedback</a></li>
<li><a href = "contactus.jsp">Contact</a></li>
</ul>
   </div></div>
	<div class="container">
		<div class="Feedback">
			<div class="left"></div>
			<div class="right">
                            <p class="text"><font style="color:#00999c"><b><%=cu%></b></font></p>
				<h2>Feedback</h2>
                                <form action="updatequery.jsp" method="post">
				<input type="text" name="name" class="field" placeholder="Your Name">
				<input type="text" name="email" class="field" placeholder="Your Email">
				<input type="text" name="phone" class="field" value="12345" placeholder="Phone number">
				<textarea  name="msg" placeholder="Message" class="field"></textarea>
                                <input type="hidden" name="type" value="feedback">
				<button class="btn">Send</button>
                                </form>
			</div>
		</div>
        </div>
	</div>
</body>
</html>