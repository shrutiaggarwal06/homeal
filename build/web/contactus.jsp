<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Homeal Contact Info.</title>
<!-- 
Cafe House Template
http://www.templatemo.com/tm-466-cafe-house
-->
  <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,600,700' rel='stylesheet' type='text/css'>
  <link href='http://fonts.googleapis.com/css?family=Damion' rel='stylesheet' type='text/css'>
  <link href="indexcss/css/bootstrap.min.css" rel="stylesheet">
  <link href="indexcss/css/font-awesome.min.css" rel="stylesheet">
  <link href="indexcss/css/templatemo-style.css" rel="stylesheet">
  <link rel="shortcut icon" href="indexcss/img/favicon.ico" type="image/x-icon" />

  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

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
              <img src="indexcss/img/logo.png" alt="Logo" class="tm-site-logo">
              <h1 class="tm-site-name tm-handwriting-font">Homeal</h1>
            </div>
            <div class="mobile-menu-icon">
              <i class="fa fa-bars"></i>
            </div>
            <nav class="tm-nav">
              <ul>
                <li><a href="index.jsp" class="active">Home</a></li>
                <li><a href="<%=a%>"><%=b%></a></li>
                <li><a href="breakfast.jsp">Menu</a></li>
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
           <%
            String cu="";
            if(request.getParameter("c")!=null)
            {                                   
               if(request.getParameter("c").equals("yes"))
                {
                    cu="QUERY SUCCESSFULLY RECIEVED<BR>WE WILL REVERT BACK SOON!";
                }
            }
        %>
        <div class="row tm-welcome-content">
          <h2 class="white-text tm-handwriting-font tm-welcome-header"><img src="indexcss/img/header-line.png" alt="Line" class="tm-header-line">&nbsp;Contact Us&nbsp;&nbsp;<img src="indexcss/img/header-line.png" alt="Line" class="tm-header-line"></h2>
          <h2 class="gold-text tm-welcome-header-2">Homeal</h2>
         <p ><font style="color:sandybrown"><b><%=cu%></b></font></p>
           <div class="col-lg-6 col-md-6">
                <div id="google-map">
                    <img src="images/logo.png" alt="Table Set" class="mg-circle img-thumbnail">
                    
                    
                </div>
            </div>   
          <form action="updatequery.jsp" method="POST" >  
             <div class="col-lg-6 col-md-6">
              <div class="form-group">
                <input type="text" name="name" class="form-control" placeholder="NAME" />
              </div>
              <div class="form-group">
                <input type="email" name="email" class="form-control" placeholder="EMAIL" />
              </div>
              <div class="form-group">
                <input type="text" name="phone" class="form-control" placeholder="PHONENO" />
              </div>
              <div class="form-group">
                <textarea name="msg" class="form-control" rows="6" placeholder="MESSAGE"></textarea>
                 <input type="hidden" name="type" value="contact">
                <button class="btn">Send</button>
              </div>     
                   
         </div></form> 
            
          
        </div>
            
        <img src="indexcss/img/table-set.png" alt="Table Set" class="tm-table-set img-responsive">            
      </div>      
    </section>   
      
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
           <p class="col-lg-12 small copyright-text text-center">Copyright &copy; 2021 Homeal</p>
         </div>  
       </div>
     </div>
   </footer> <!-- Footer content-->  
   <!-- JS --> <!-- Footer content-->  
   <!-- JS -->
   <script type="text/javascript" src="indexcss/js/jquery-1.11.2.min.js"></script>      <!-- jQuery -->
   <script type="text/javascript" src="indexcss/js/templatemo-script.js"></script>      <!-- Templatemo Script -->
   
    </body>
    </html>