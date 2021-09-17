<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Profile</title>
    <link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro:wght@300;400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="profile/css/bootstrap.min.css">
    <link rel="stylesheet" href="profile/css/slick.css" type="text/css" /> 
    <link rel="stylesheet" href="profile/css/templatemo-style.css">
<!--
    
TemplateMo 560 Astro Motion

https://templatemo.com/tm-560-astro-motion

-->
</head>
<body>
    <video autoplay muted loop id="bg-video">
        <source src="profile/video/gfp-astro-timelapse.mp4" type="video/mp4">
    </video>
    <div class="page-container">
      <div class="container-fluid">
        <div class="row">
          <div class="col-xs-12">
            <div class="cd-slider-nav">
              <nav class="navbar navbar-expand-lg" id="tm-nav">
                <a class="navbar-brand" href="index.jsp">HOMEAL</a>
                
                  
                  <div class="collapse navbar-collapse" id="navbar-supported-content">
                    <ul class="navbar-nav mb-2 mb-lg-0">
                      <li class="nav-item selected">
                        <a class="nav-link" aria-current="page" href="#0" data-no="1">About</a>
                        <div class="circle"></div>
                      </li>
                      <li class="nav-item">
                        <a class="nav-link" href="#0" data-no="2">AllOrders</a>
                        <div class="circle"></div>
                      </li>
                      <li class="nav-item">
                        <a class="nav-link" href="#0" data-no="3">AllCustomers</a>
                        <div class="circle"></div>
                      </li>
                      <li class="nav-item">
                        <a class="nav-link" href="#0" data-no="4">Queries</a>
                        <div class="circle"></div>
                      </li>
                      <li class="nav-item">
                        <a class="nav-link" href="adminchefs.jsp">AllChefs</a>
                        <div class="circle"></div>
                      </li>
                    </ul>
                  </div>
              </nav>
            </div>
          </div>          
        </div>        
      </div>
         
      <div class="container-fluid tm-content-container">
        <ul class="cd-hero-slider mb-0 py-5">
          <li class="px-3" data-page-no="1">
            <li data-page-no="1" class="px-3">
            <div class="position-relative page-width-1 page-right tm-border-top tm-border-bottom">
              <div class="circle intro-circle-1"></div>
              <div class="circle intro-circle-2"></div>
              <div class="circle intro-circle-3"></div>
              <div class="circle intro-circle-4"></div>
              <div class="tm-bg-dark content-pad">
                
                <p>
                 <jsp:include page="adminprofile.jsp"/>
                </p>
              </div>              
            </div>
          </li>           
          </li>
          <li data-page-no="2">
            <!-- Image Carousel -->
            <div class="mx-auto position-relative gallery-container">
              <div class="circle intro-circle-1"></div>
              <div class="circle intro-circle-2"></div>
              <div class="mx-auto tm-border-top gallery-slider">
                <p>
                 <jsp:include page="adminorders.jsp"/>
                </p>
              </div>
            </div>
          </li>
          <li data-page-no="3" class="px-3">
            <div class="position-relative page-width-1 page-right tm-border-top tm-border-bottom">
              <div class="circle intro-circle-1"></div>
              <div class="circle intro-circle-2"></div>
              <div class="circle intro-circle-3"></div>
              <div class="circle intro-circle-4"></div>
             
                <p>
                 <jsp:include page="admincustomers.jsp"/>
                </p>
                          
            </div>
          </li>
          <li data-page-no="4">
            <div class="mx-auto page-width-2">
             
              <div class="row">
                   <jsp:include page="adminfeedback.jsp"/>
                </div>
                
              </div>
            </div>            
          </li>
         
        </ul>
    </div>
                
    <div class="container-fluid">
      <footer class="row mx-auto tm-footer">
        <div class="col-md-6 px-0">
         
        </div>
       
      </footer>
    </div>
  </div>
  <!-- Preloader, https://ihatetomatoes.net/create-custom-preloading-screen/ -->
  <div id="loader-wrapper">            
    <div id="loader"></div>
    <div class="loader-section section-left"></div>
    <div class="loader-section section-right"></div>
  </div> 
  
  <script src="profile/js/jquery-3.5.1.min.js"></script>
  <script src="profile/js/bootstrap.min.js"></script>
  <script src="profile/js/slick.js"></script>
  <script src="profile/js/templatemo-script.js"></script>
</body>
</html>