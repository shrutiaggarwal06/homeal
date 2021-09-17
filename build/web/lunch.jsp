<%-- 
    Document   : meals
    Created on : 23 Feb, 2021, 1:43:43 PM
    Author     : HP
--%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Breakfast</title>
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:400" rel="stylesheet" />    
	<link href="css1/templatemo-style.css" rel="stylesheet" />
      
         <%@page import="java.sql.*"%>
         <style>
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
font-family: 'Allura', cursive;
}
#menu ul li a
{
text-decoration : none ;
color : white ;
display : block ;
line-height:100px;
font-family: 'Allura', cursive;
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
.im1{
    height:100px;
width:200px;
float:right;
}
.gfg{
    
    position:relative;
}
.first {
    position:absolute;
    bottom:20px;
    left:10px;
    font-size:20px;
    font-family:'Cursive';
    text-transform:uppercase;
}
</style>
</head>
<!--

Simple House

https://templatemo.com/tm-539-simple-house

-->
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
%>                   
 
<div class="container">
	<!-- Top box -->
		
	<!-- Top box -->
		<!-- Logo & Site Name -->
		<div class="placeholder">
			<div class="parallax-window" data-parallax="scroll" data-image-src="img/simple-house-01.jpg">
		<!-- Logo & Site Name -->
                <div class="container">
		<div class="placeholder">
			<div class="parallax-window" data-parallax="scroll" data-image-src="images/simple-house-01.jpg">
                            
				<div class="tm-header">
					<div class="row tm-header-inner">
						<div class="col-md-6 col-12">
							<img src="images/simple-house-logo.png" alt="Logo" class="tm-site-logo" /> 
							<div class="tm-site-text-box">
								<h1 class="tm-site-title">Homeal</h1>
								<h6 class="tm-site-description">From Our Home To Yours</h6>	
							</div>
						</div>
						<nav class="col-md-6 col-12 tm-nav">
							<ul class="tm-nav-ul">
								<li class="tm-nav-li"><a href="index.jsp" class="tm-nav-link ">Home</a></li>
								<li class="tm-nav-li"><a href="About.jsp" class="tm-nav-link">About</a></li>
								<li class="tm-nav-li"><a href="contactus.jsp" class="tm-nav-link">Contact</a></li>
                                                                <li class="tm-nav-li"><a href="breakfast.jsp" class="tm-nav-link active">Meals</a></li>
							             <li class="tm-nav-li"class="tm-nav-li"><a href = "<%=a%>"class="tm-nav-link"><%=b%></a></li>
                                                              <li class="tm-nav-li"><a href="feedback.jsp" class="tm-nav-link">Feedback</a></li>
                                                        </ul>
						</nav>	
					</div>
				</div>
			</div>
		</div>

                           
                         
   

		<main>
			<header class="row tm-welcome-section">
				<h2 class="col-12 text-center tm-section-title">Welcome To Our Food Menu</h2>
				<p class="col-12 text-center"> You Will Find Different Food Prepared With Love By Our Lovely Home Chef's.</p>
			</header>
			<% int c=0;%>
			<div class="tm-paging-links">
				<nav>
					<ul>
						<li class="tm-paging-item"><a href="breakfast.jsp" class="tm-paging-link ">Breakfast</a></li>
						<li class="tm-paging-item"><a href="lunch.jsp" class="tm-paging-link active">Lunch</a></li>
						<li class="tm-paging-item"><a href="dinner.jsp" class="tm-paging-link">Dinner</a></li>
					</ul>
				</nav>
			</div>

			<!-- Gallery -->
                        
                        <div class="row tm-gallery">
<%                                    
    String chef="",meal_type="lunch", id="",price="",det="";
                try
                {            
                 Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin"); 
                 PreparedStatement ps= cn.prepareStatement("select * from tiffin_provider where status=?");
                ps.setString(1,"accept");
                 ResultSet rs=ps.executeQuery();
                  while(rs.next())
                  {
                      chef=rs.getString("kitchen_name");
                      id=rs.getString("tf_id");  
                     //out.print(id);
                     Connection cn1= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin"); 
                       PreparedStatement ps1= cn1.prepareStatement("select * from meals where tf_id=? and meal_typ=?");
                       ps1.setString(1,id);
                        ps1.setString(2,meal_type);
                       ResultSet rs1 = ps1.executeQuery();
                       if(rs1.next())
                       {
                      price=rs1.getString("m_price");
                      det=rs1.getString("M_DET");
                    //  out.print(price);
                     
                               %>  
                              
				<div id="tm-gallery-page-pizza" class="tm-gallery-page">
					<article class="col-lg-3 col-md-4 col-sm-6 col-12 tm-gallery-item">
						<figure>
                                                    <div class="gfg">
							<img src="images/breakfast.jpg" alt="Image" height="150" width="250"/>
                                                        <h3 class="first"><%=chef%></h3>
                                                    </div>
							<figcaption>
                                                               
                                                                <p style="font-family: 'Allura', cursive;font-size:30;text-transform:uppercase"><%=meal_type%></p>
                                                                <p style="text-shadow: 2px 2px 5px #FAFAD2;font-family: 'Allura', cursive;font-size:30;font-weight:800;text-transform:uppercase;color:#2F956D"><%=det%> </p>
								<p style="font-family: 'Allura', cursive;font-size:30;text-transform:uppercase">RS <%=price%> </p>
                                                                <button class="tm-paging-link" type='button' onclick="window.location.href='menu.jsp?tid=<%=id%>'">view</button>
                                                                <br>
                                                        
                                                        </figcaption>
						</figure>
					</article>																														
					
				</div> <!-- gallery page 1 -->
				<%
                      
                       }
                  cn1.close();}
                                          cn.close();    }
                                catch(Exception ex)
                                        {}%>         
                                        <!-- gallery page 2 -->       <br>
                        </div> <br>                                        
			<div class="tm-section tm-container-inner">
				<div class="row">
					<div class="col-md-6">
						<figure class="tm-description-figure">
							<img src="images/menu-image1.jpg" alt="Image" class="img-fluid" />
						</figure>
                                            <br>
                                        
                                        </div>
                                    <br><br>
					<div class="col-md-6">
						<div class="tm-description-box"> 
                                                    <br>
							<h4 class="tm-gallery-title">Homeal</h4>
							<p class="tm-mb-45">Here we will provide you with exciting food , mouth-watering dishes.that you will love to eat and enjoy.
                                                            for any <a href="contactus.jsp">queries</a> or <a href="feedback.jsp">feedback</a> you can contact us.
                                                            we will try to solve your every queries.Hope you like it.We will try our best to provide you with best quality and safe food.<span>HAPPY CUSTOMER HAPPY WE.</span></p>
							<a href="About.jsp" class="tm-btn tm-btn-default tm-right">Read More</a>
						</div>
					</div>
				</div>
                        </div>
                        </div>
		</main>

		<footer class="tm-footer text-center">
                    <p>Copyright &copy; 2021 Homeal</p> 
            
            
		</footer>
	</div>
	<script src="js/jquery.min.js"></script>
	<script src="js/parallax.min.js"></script>
	<script>
		$(document).ready(function(){
			// Handle click on paging links
			$('.tm-paging-link').click(function(e){
				e.preventDefault();
				
				var page = $(this).text().toLowerCase();
				$('.tm-gallery-page').addClass('hidden');
				$('#tm-gallery-page-' + page).removeClass('hidden');
				$('.tm-paging-link').removeClass('active');
				$(this).addClass("active");
			});
		});
	</script>
</body>
</html>