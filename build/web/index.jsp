<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>HOMEAL</title>
<!-- 
Cafe House Template
http://www.templatemo.com/tm-466-cafe-house
-->
  <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,600,700' rel='stylesheet' type='text/css'>
  <link href='http://fonts.googleapis.com/css?family=Damion' rel='stylesheet' type='text/css'>
  <link href="indexcss/css/bootstrap.min.css" rel="stylesheet">
  <link href="indexcss/css/font-awesome.min.css" rel="stylesheet">
  <link href="indexcss/css/templatemo-style.css" rel="stylesheet">
  <link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon" />

  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
        
        .im1{
    height:50px;
width:100px;
float:right;
margin-right:2%;
}
    </style>
  </head>
  <body>
    <!-- Preloader -->
    <div id="loader-wrapper">
      <div id="loader"></div>
      <div class="loader-section section-left"></div>
      <div class="loader-section section-right"></div>
    </div>
    <!-- End Preloader -->
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
    <div class="tm-top-header">
      <div class="container">
        <div class="row">
          <div class="tm-top-header-inner">
            <div class="tm-logo-container">
           
              <h1 class="tm-site-name tm-handwriting-font">Homeal</h1>
            </div>
            <div class="mobile-menu-icon">
              <i class="fa fa-bars"></i>
            </div>
            <nav class="tm-nav">
              <ul>
                <li><a href="index.jsp" class="active">Home</a></li>
                <li><a href="<%=a%>"><%=b%></a></li>
                <li><a href="breakfast.jsp">Meal</a></li>
                <li><a href="contactus.jsp">Contact</a></li>
                <li><a href="About.jsp">About us</a></li>
                <li><a href="feedback.jsp">Feedback</a></li>
              </ul>
            </nav>   
          </div>           
        </div>    
      </div>
    </div>
    <section class="tm-welcome-section">
      <div class="container tm-position-relative">
        <div class="tm-lights-container">
          <img src="indexcss/img/light.png" alt="Light" class="light light-1">
          <img src="indexcss/img/light.png" alt="Light" class="light light-2">
          <img src="indexcss/img/light.png" alt="Light" class="light light-3">  
        </div>        
        <div class="row tm-welcome-content">
          <h2 class="white-text tm-handwriting-font tm-welcome-header"><img src="indexcss/img/header-line.png" alt="Line" class="tm-header-line">&nbsp;Welcome To&nbsp;&nbsp;<img src="indexcss/img/header-line.png" alt="Line" class="tm-header-line"></h2>
          <h2 class="gold-text tm-welcome-header-2">Homeal</h2>
          <p class="gray-text tm-welcome-description">Eat breakfast like a <span class="gold-text"> KING,</span> lunch like a <span class="gold-text">PRINCE </span>and dinner like a <span class="gold-text">PAUPER</span>. So what are you waiting for</p>
          <a href="breakfast.jsp" class="tm-more-button tm-more-button-welcome">Order Now</a>      
        </div>
        <img src="indexcss/img/table-set.png" alt="Table Set" class="tm-table-set img-responsive">             
      </div>      
    </section>
    <div class="tm-main-section light-gray-bg">
      <div class="container" id="main">
        <section class="tm-section row">
          <div class="col-lg-9 col-md-9 col-sm-8">
            <h2 class="tm-section-header gold-text tm-handwriting-font">Homeal</h2>
            
            <p class="tm-welcome-description">Homeal Provide you with <span class="blue-text">Tiffin  Service </span>which give you vibes of <span class="green-text"> Ghar ka Khana </span>.Get your Fav food on your door step.Enjoy healthy and good quality food on your address.We provide you with different variety of dishes and mouth-watering food.</p>
            <a href="About.jsp" class="tm-more-button margin-top-30">Read More</a> 
          </div>
          <div class="col-lg-3 col-md-3 col-sm-4 tm-welcome-img-container">
            <div class="inline-block shadow-img">
              <img src="images/logo.png" alt="Image" class="img-circle img-thumbnail">  
            </div>              
          </div>            
        </section>          
        <section class="tm-section tm-section-margin-bottom-0 row">
          <div class="col-lg-12 tm-section-header-container">
            <h2 class="tm-section-header gold-text tm-handwriting-font"><img src="indexcss/img/logo.png" alt="Logo" class="tm-site-logo"> Popular Items</h2>
            <div class="tm-hr-container"><hr class="tm-hr"></div>
          </div>
          <div class="col-lg-12 tm-popular-items-container">
            <div class="tm-popular-item">
              <img src="indexcss/img/popular-1.jpg" alt="Popular" class="tm-popular-item-img">
              <div class="tm-popular-item-description">
                <h3 class="tm-handwriting-font tm-popular-item-title"><span class="tm-handwriting-font bigger-first-letter">B</span>reakfast</h3><hr class="tm-popular-item-hr">
                <p>Breakfast is only worth having when somebody else made it for you. ...</p>
                <div class="order-now-container">
                  <a href="breakfast.jsp" class="order-now-link tm-handwriting-font">Order Now</a>
                </div>
              </div>              
            </div>
            <div class="tm-popular-item">
              <img src="indexcss/img/popular-2.jpg" alt="Popular" class="tm-popular-item-img">
              <div class="tm-popular-item-description">
                <h3 class="tm-handwriting-font tm-popular-item-title"><span class="tm-handwriting-font bigger-first-letter">L</span>unch</h3><hr class="tm-popular-item-hr">
                <p>Lunch is the most precious meal of the day.So It need to be special and Tasty..</p>
                <div class="order-now-container">
                  <a href="lunch.jsp" class="order-now-link tm-handwriting-font">Order Now</a>
                </div>
              </div>              
            </div>
            <div class="tm-popular-item">
              <img src="indexcss/img/popular-3.jpg" alt="Popular" class="tm-popular-item-img">
              <div class="tm-popular-item-description">
                <h3 class="tm-handwriting-font tm-popular-item-title"><span class="tm-handwriting-font bigger-first-letter">D</span>inner</h3><hr class="tm-popular-item-hr">
                <p>A great dinner must include not only yummy food, but good conversation.</p>
                <div class="order-now-container">
                  <a href="dinner.jsp" class="order-now-link tm-handwriting-font">Order Now</a>
                </div>
              </div>              
            </div>
          </div>          
        </section>
        <section class="tm-section row">
          <div class="col-lg-12 tm-section-header-container">
            <h2 class="tm-section-header gold-text tm-handwriting-font"><img src="indexcss/img/logo.png" alt="Logo" class="tm-site-logo"> Today's Special</h2>
            <div class="tm-hr-container"><hr class="tm-hr"></div>
          </div>          
          <div class="col-lg-12 tm-special-container margin-top-60">
            <div class="tm-special-container-left"> <!-- left -->
              <div class="tm-special-item">
                <div class="tm-special-img-container">
                  <img src="images/logo.png" alt="Special" class="tm-special-img img-responsive">  
                  
                </div>
              </div>
            </div>
            <div class="tm-special-container-right"> <!-- right -->
              <div>
                <div class="tm-special-item">
                  <div class="tm-special-img-container">
                    <img src="indexcss/img/lunch.jpg" alt="Special" class="img-responsive">  
                   
                  </div>
                </div>  
              </div>
              <div class="tm-special-container-lower">
                <div class="tm-special-item">
                  <div class="tm-special-img-container">
                    <img src="indexcss/img/dinner.jpg" alt="Special" class="img-responsive">  
                    <a href="#">
                      
                    </a>
                  </div>
                </div>
                <div class="tm-special-item">
                  <div class="tm-special-img-container">
                    <img src="indexcss/img/breakfast1.jpg" alt="Special" class="img-responsive">  
                    
                  </div>
                </div>  
              </div>              
            </div>
          </div>
        </section>
        <section class="tm-section">
          <div class="row">
             
          </div>          
          <div class="row">
            <div class="tm-daily-menu-container margin-top-60">
              <div class="col-lg-4 col-md-4">
                    
              </div>            
              
            </div>
          </div>          
        </section>
      </div>
    </div> 
    <footer>
      <div class="tm-black-bg">
        <div class="container">
          <div class="row margin-bottom-60">
            <nav class="col-lg-3 col-md-3 tm-footer-nav tm-footer-div">
              <h3 class="tm-footer-div-title">Main Menu</h3>
              <ul>
                <li><a href="index.jsp">Home</a></li>
                <li><a href="about.jsp">About Us</a></li>
                <li><a href="login.jsp">Login</a></li>
                <li><a href="contactus.jsp">Contact</a></li>
                <li><a href="feedback.jsp">Feedback</a></li>
              </ul>
            </nav>
            <div class="col-lg-5 col-md-5 tm-footer-div">
            </div>
            <div class="col-lg-4 col-md-4 tm-footer-div">
              <h3 class="tm-footer-div-title">Get Social</h3>
              <div class="tm-social-icons-container">
                <a href="#" class="tm-social-icon"><i class="fa fa-facebook"></i></a>
                <a href="#" class="tm-social-icon"><i class="fa fa-twitter"></i></a>
                <a href="#" class="tm-social-icon"><i class="fa fa-linkedin"></i></a>
                <a href="#" class="tm-social-icon"><i class="fa fa-youtube"></i></a>
                <a href="#" class="tm-social-icon"><i class="fa fa-behance"></i></a>
              </div>
            </div>
          </div>          
        </div>  
      </div>      
      <div>
        <div class="container">
          <div class="row tm-copyright">
           <p class="col-lg-12 small copyright-text text-center">Copyright &copy; 2021  Homeal</p>
         </div>  
       </div>
     </div>
   </footer> <!-- Footer content-->  
   <!-- JS -->
   <script type="text/javascript" src="indexcss/js/jquery-1.11.2.min.js"></script>      <!-- jQuery -->
   <script type="text/javascript" src="indexcss/js/templatemo-script.js"></script>      <!-- Templatemo Script -->

 </body>
 </html>