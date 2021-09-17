<%-- 
    Document   : menu
    Created on : 7 Mar, 2021, 8:54:28 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
<%@page import="java.sql.*"%>
    <title>Menu</title>
<!-- 

Timeless Template 

http://www.templatemo.com/tm-517-timeless

-->
    <!-- load CSS -->
    <!-- load CSS -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400">
    <!-- Google web font "Open Sans" -->
    <link rel="stylesheet" href="menucss/css/bootstrap.min.css">
    <!-- https://getbootstrap.com/ -->
    <link rel="stylesheet" href="menucss/css/templatemo-style.css">
    <!-- Templatemo style -->
    <!-- Templatemo style -->
    <style>
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
<%String id=(String)request.getParameter("tid"),chef="",name="",email="",mob="",add="";
session.setAttribute("chef_id" , id);
String type="";
String price[]=new String[4];
String det[]=new String[4];
String mealid[]=new String[4];
int i=0;
det[0]="chef is not providing the particular meal type";
det[1]="chef is not providing the particular meal type";
det[2]="chef is not providing the particular meal type";
                try
                {                         
                 Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin"); 
                 PreparedStatement ps= cn.prepareStatement("select * from tiffin_provider where tf_id=?");
                ps.setString(1,id);
                 ResultSet rs=ps.executeQuery();
                   while(rs.next())
                  {
                      chef=rs.getString("kitchen_name");
                      name=rs.getString("name");
                      session.setAttribute("chef" ,chef);
                      email=rs.getString("emailid");
                      mob=rs.getString("mob");
                      add=rs.getString("address");                                                      
                       PreparedStatement ps1= cn.prepareStatement("select * from meals where tf_id=?");
                       ps1.setString(1,id);
                       ResultSet rs1 = ps1.executeQuery();
                       while(rs1.next())
                       {                                                    
                           type=rs1.getString("meal_typ");
                           if(type.equals("breakfast"))
                           {
                           det[0]=rs1.getString("m_det");
                      price[0]=rs1.getString("m_price");
                      mealid[0]=rs1.getString("mealid");
                           }
                           else if(type.equals("lunch"))
                           {
                           det[1]=rs1.getString("m_det");
                      price[1]=rs1.getString("m_price");
                       mealid[1]=rs1.getString("mealid");
                           }
                             else  if(type.equals("dinner"))
                           {
                           det[2]=rs1.getString("m_det");
                      price[2]=rs1.getString("m_price");
                       mealid[2]=rs1.getString("mealid");
                           }
                       }             
                  }
                                          cn.close();    
                }
                                catch(Exception ex)
                                        {}
%>   

<%
                                String a="";
                                String b="";
                                String c="";
                                String d="";
                                if(session.getAttribute("cid")!=null)
                                {
                                        a="customerprofile.jsp";
                                        b="PROFILE";
                                        c="booking.jsp";
                                  
                                 }
                                  else
                                 {
                                   a="login.jsp";
                                   b="Login";
                                   c="login.jsp";
                                   d="YOURE NOT LOGGED IN , YOU NEED TO LOGIN TO BOOK ANY MEAL";
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
          
    
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <header class="text-center tm-site-header">
                    <div class="tm-site-logo"></div>
                    <h1 class="pl-4 tm-site-title">HOMEAL</h1>
                </header>
            </div>
        </div>
         <div class="row">
            <div class="col-lg-12">
                <div class="tm-video-container">
                    <video id="tm-welcome-video" class="tm-welcome-video" autoplay="" loop="" muted="">
                        <source src="menucss/videos/menu.mp4" type="video/mp4"> Your browser does not support the video tag.
                        </video>
                        <div id="tm-video-loader"></div>
                        <div id="tm-video-text-overlay" class="tm-video-text-overlay d-none">
                            <h1>
                                <div id="rotate" class="tm-video-text">
                                    <div>This is delicious</div>
                                    <div>We are foodiee</div>
                                    <div>Quite unbeatable</div>
                                    <div>and indestructible</div>
                                </div>
                            </h1>
                        </div>

                    </div>
                </div>
            </div>
        </div>
        <div class="container tm-container-2">
            <div class="row">
                <div class="col-lg-12">
                    <h2 class="tm-welcome-text">WELCOME TO <%=chef%></h2>
                </div>
            </div>
            <div class="row tm-section-mb">
             
                <div class="col-lg-12">
                    <h3 class="tm-text-green tm-font-400"> <%=d%> </h3>
                    <br>
                    <% if(price[0]!=null)
                    {%>
                    <div class=" tm-timeline-item">
                        <div class="tm-timeline-item-inner">
                            <img src="images/breakfast1.jpg" alt="Image" class="rounded-circle tm-img-timeline">
                            <div class="tm-timeline-connector">
                                <p class="mb-0">&nbsp;</p>
                            </div>
                            <div class="tm-timeline-description-wrap">
                                <div class="tm-bg-dark tm-timeline-description">
                                    <h3 class="tm-text-green tm-font-400">BREAKFAST MENU</h3>
                                    <p style="font-family: 'Allura', cursive;font-size:40;text-transform:capitalize">Breakfast is only worth having when somebody else made it for you. ...</p>
						
                                    <p style="color:#ecf5f5;font-size: 20px;font-family: 'Allura',cursive">Meal Available From 7am.</p>
                                    <p style="color:#ecf5f5;font-size: 20px;font-family: 'Allura',cursive">Meal Consists Of:<%=det[0]%></p>
                                    <p style="color:#ecf5f5;font-size: 20px;font-family: 'Allura',cursive">Price:<%=price[0]%></p>
                                      <button type='button' onclick="window.location.href='<%=c%>?meal=b&det=<%=det[0]%>&mealid=<%=mealid[0]%>'">book</button>
                                    <p class="tm-text-green float-right mb-0"><%=chef%></p>
                                </div>
                            </div>
                        </div>

                        <div class="tm-timeline-connector-vertical"></div>
                    </div>
<%}
                     if(price[1]!=null)
                    {%>
                    <div class="tm-timeline-item">
                        <div class="tm-timeline-item-inner">
                            <img src="images/lunch.jfif" alt="Image" class="rounded-circle tm-img-timeline">
                            <div class="tm-timeline-connector">
                                <p class="mb-0">&nbsp;</p>
                            </div>
                            <div class="tm-timeline-description-wrap">
                                <div class="tm-bg-dark-light tm-timeline-description">
                                    <h3 class="tm-text-cyan tm-font-400">LUNCH MENU</h3>
<p style="font-family: 'Allura', cursive;font-size:40;text-transform:capitalize"> Lunch is the most precious meal of the day.So It need to be special and Tasty..</p>

                                    <p style="color:#ecf5f5;font-size: 20px;font-weight: 900;font-family: 'Allura',cursive">Available from 2pm</p>
                                     <p style="color:#ecf5f5;font-size: 20px;font-weight: 900;font-family: 'Allura',cursive">meal consists of:<%=det[1]%></p>
                                    <p style="color:#ecf5f5;font-size: 20px;font-weight: 900;font-family: 'Allura',cursive">price:<%=price[1]%></p>
                                     <button type='button' onclick="window.location.href='<%=c%>?meal=l&det=<%=det[1]%>&mealid=<%=mealid[1]%>'">book</button>
                                    <p class="tm-text-cyan float-right mb-0"><%=chef%></p>
                                </div>
                            </div>
                        </div>
                        <div class="tm-timeline-connector-vertical"></div>
                    </div>
<%}
                      if(price[2]!=null)
                    {%>
                    <div class="tm-timeline-item">
                        <div class="tm-timeline-item-inner">
                            <img src="images/dinner.png" alt="Image" class="rounded-circle tm-img-timeline">
                            <div class="tm-timeline-connector">
                                <p class="mb-0">&nbsp;</p>
                            </div>
                            <div class="tm-timeline-description-wrap">
                                <div class="tm-bg-dark tm-timeline-description">
                                    
                                    <h3 class="tm-text-yellow tm-font-400">DINNER MENU</h3>
<p style="font-family: 'Allura', cursive;font-size:40;text-transform:capitalize">A great dinner must include not only yummy food, but good conversation.</p>
                                   
                                   
                                    <p style="color:#ecf5f5;font-size: 20px;font-weight: 900;font-family: 'Allura',cursive">Available from 7pm</p>
                                     <p style="color:#ecf5f5;font-size: 20px;font-weight: 900;font-family: 'Allura',cursive">Meal consists of:<%=det[2]%></p>
                                    <p style="color:#ecf5f5;font-size: 20px;font-weight: 900;font-family: 'Allura',cursive">Price:<%=price[2]%></p>
                                      <button type='button' onclick="window.location.href='<%=c%>?meal=d&det=<%=det[2]%>&mealid=<%=mealid[2]%>'">book</button>
                                    <p class="tm-text-yellow float-right mb-0"><%=chef%></p>
                                </div>
                            </div>
                        </div>
                      
<%}%>
                   

                </div>
            </div>
            <!--  row -->
            <hr>
            <div class="row tm-section-mb tm-section-mt">
                <div class="col-lg-4 col-md-4 col-sm-12 pr-lg-5 mb-md-0 mb-4">
                    <h3 class="mt-2 mb-3 tm-text-gray">CONTACT THROUGH MAIL</h3>
                    <p>If you have any queries regarding  <br> anything
                        you can email us on the<br>email id given below,we will be <br> happy to help you.<br><u style="color:#ecf5f5;font-size: 20px;font-weight: 900;font-family: 'Allura',cursive"><%=email%></u></p>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-12 pr-lg-5 mb-md-0 mb-4">
                    <h3 class="mt-2 mb-3 tm-text-gray"><b><u>CONTACT THROUGH PHONE</u></b></h3>
                    <p>For any feedback or any other specific change you can<br>call us and tell us about it.<br>we will pay attention to it<br><u style="color:#ecf5f5;font-size: 20px;font-weight: 900;font-family: 'Allura',cursive"><%=mob%></u></p>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-12">
                    <h3 class="mt-2 mb-3 tm-text-gray">CHEF'S LOCATION</h3>
                    <p>If you want to visit us<br>and see how we work and for any <br> other thing you are free to come and meet us<br><u style="color:#ecf5f5;font-size: 20px;text-transform:capitalize;font-weight: 900;font-family: 'Allura',cursive"><%=add%></u></p>
                </div>
            </div>
            <hr>
            <div class="row tm-section-mt">
                <div class="col-lg-6">
                    <h3 class="mb-4 tm-text-gray">Our Location</h3>
                    <!-- GOOGLE MAP -->
                    <div id="google-map" class="text-center mb-5">
                    <!-- How to change your own map point
                           1. Go to Google Maps
                           2. Click on your location point
                           3. Click "Share" and choose "Embed map" tab
                           4. Copy only URL and paste it within the src="" field below
                       -->
                       <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3647.3030413476204!2d100.5641230193719!3d13.757206847615207!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xf51ce6427b7918fc!2sG+Tower!5e0!3m2!1sen!2sth!4v1510722015945"
                       class="google-map-iframe" width="500" height="300" frameborder="0" style="border:0" allowfullscreen></iframe>
                   </div>
               </div>
               <div class="col-lg-6 mb-5">
                <h3 class="mb-4 tm-text-gray">FEEDBACK FOR THE CHEF</h3>
                <form method="post" action="cheffeedback.jsp?tid=<%=id%>">
                    <div class="row">
                        <div class="form-group col-xl-6">
                            <input type="text" name="name" class="form-control" placeholder="Name..." required/>
                        </div>
                        <div class="form-group col-xl-6">
                            <input type="text" name="email" class="form-control" placeholder="Email..." required/>
                        </div>
                    </div>
                    <div class="form-group">
                        <textarea name="msg" class="form-control" rows="6" placeholder="Your Feedback..." required></textarea>
                    </div>
                    <input type="submit" class="btn  tm-btn-send" value="POST">
                </form>
            </div>
        </div>
        <hr>
        <!-- Footer -->
        <footer class="row mt-5 mb-5">
            <div class="col-lg-12">
                <p class="text-center tm-text-gray tm-copyright-text mb-0">Copyright &copy;
                    <span class="tm-current-year">2021</span>HOMEAL
                    
                    | Design: <a href="http://templatemo.com/tm-517-timeless" class="tm-text-white">HOMEAL</a>
                </p>
            </div>
        </footer>
    </div>
    <!-- .container -->

    <script src="menucss/js/jquery.min.js"></script>
    <!-- <script src="js/jquery-3.2.1.slim.min.js"></script> -->
    <script src="menucss/js/templatemo-script.js"></script>

</body>
</html>
