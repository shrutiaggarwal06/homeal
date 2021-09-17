<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>Homeal</title>
<!-- 
Avalon Template 
https://templatemo.com/tm-513-avalon
-->
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="apple-touch-icon.png">

        <link rel="stylesheet" href="aboutcss/css/bootstrap.min.css">
        <link rel="stylesheet" href="aboutcss/css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="aboutcss/css/fontAwesome.css">
        <link rel="stylesheet" href="aboutcss/css/hero-slider.css">
        <link rel="stylesheet" href="aboutcss/css/owl-carousel.css">
        <link rel="stylesheet" href="aboutcss/css/datepicker.css">
        <link rel="stylesheet" href="aboutcss/css/templatemo-style.css">

        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800" rel="stylesheet">

        <script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
    </head>

<body>

    <section class="banner" id="top">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-8">
                    <div class="left-banner-content">
                        <div class="text-content">
                            <h6>GHAR KA KHANA</h6>
                            <div class="line-dec"></div>
                            <h1>From Our Home <br>To Yours.</h1>
                            <div class="white-border-button">
                                <a href="breakfast.jsp" class="scroll-link" data-id="best-offer-section">Discover More</a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="right-banner-content">
                        <div class="logo"><a href="index.html"><img src="images/logo.png" alt=""></a></div>
                        <h2>Homeal</h2>
                        <span>Kuch <em>Ghar</em> Sa.</span>
                        <div class="line-dec"></div>
                        
                        <ul class="social-icons">
                            <li><a href="http://www.facebook.com"><i class="fa fa-facebook"></i></a></li>
                            <li><a href="http://www.twitter.com"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="http://www.linkedin.in"><i class="fa fa-linkedin"></i></a></li>
                            <li><a href="https://instagram.com/food_factory_06?igshid=1flt2ssi1j2ft"><i class="fa fa-instagram"></i></a></li>
                            <li><a href="index.jsp"><i class="fa fa-home"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </section>


    <section class="best-offer" id=best-offer-section>
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-4">
                    <div class="best-offer-left-content">
                        <div class="icon"><img src="aboutcss/img/best-offer-icon.png" alt=""></div>
                        <h4>Best Offer For You</h4>
                    </div>
                </div>
                <div class="col-md-8">
                    <div class="best-offer-right-content">
                        <div class="row">
                            <div class="col-md-6 col-sm-12">
                                <h2>KNOW US<br><em>BETTER</em></h2>
                                It is a user-friendly system. It is a platform where people who can cook and design their meals and connect to those who like to eat homemade food. Here the administrator can handle all the activities online and securely. The system also covers features like login , registration , meal description, meal booking, payment and etc.
              The project provides a source of business for the Tiffin providers as they can create meals and connect to customers and earn and spread happiness .
            
                                
                                
                                <ul>
                                    <li>WHY US?.</li>
                                    <li>GOOD QUALITY HOME MADE FOOD</li>
                                    <li>HEALTH & FULL OF NUTRITION</li>
                                    <li>PROPER CARE OF HYGIENE</li>
                                </ul>
                                <div class="pink-button">
                                    <a href="contactus.jsp">Contactus</a>
                                </div>
                            </div>
                            <div class="col-md-6 col-sm-12">
                                <img src="aboutcss/img/best-offer-image.png" alt="">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
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
    <section class="events" id="events-section">
        <div class="content-wrapper">
            <div class="inner-container container-fluid">
                <div class="row">
                    <div class="col-md-12 col-sm-12">
                        <div class="section-heading">
                            <div class="filter-categories">
                                <ul class="project-filter">
                                    <li class="filter" data-filter="all"><a href="index.jsp"><span>HOME</span></a></li>
                                    <li class="filter" data-filter="design"><a href="breakfast.jsp"><span>MEALS</span></a></li>
                                    <li class="filter" data-filter="start"><a href="<%=a%>" > <%=b%><span></span></a></li>
                                    <li class="filter" data-filter="web"><a href="contactus.jsp"><span>CONTACTUS</span></a></li>
                                     <li class="filter" data-filter="web"><a href="feedback.jsp"><span>FEEDBACK</span></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                   
    </section>


    <section class="testimonial" id="testimonial-section">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-4">
                    <div class="testimonial-image"></div>
                </div>
                <div class="col-md-8">
                    <div id="owl-testimonial" class="owl-carousel owl-theme">
                        <div class="item col-md-12">
                            <img src="aboutcss/img/s1.jpg" alt="Shruti">
                            <span>Full Stack Developer</span>
                            <h4>Shruti Aggarwal</h4>
                            <br>
                            <p><em>"</em>My name is Shruti Aggarwal. I'm working as a Full Stack Developer I describe myself as a passionate developer who loves coding, open source, and the web platform .

As a Lead Front End Engineer, one of my main tasks was to mentor coworkers of my team, contributing to their personal and professional growth. I worked very close to stakeholders to define, organise and breakdown new projects.

Aside from my job, I like to create and contribute to open source projects. That helps me to learn a ton of new stuff, grow as a developer and support other open source projects. Also I enjoy writing recipes at my blog. <em>"</em></p>
                        </div>
                        <div class="item col-md-12">
                            <img src="aboutcss/img/g1.jpg" alt="Geetanjali">
                            <span>Web Developer</span>
                            <h4>Geetanjali Sao</h4>
                            <br>
                            <p><em>"</em>My name is Geetanjali Sao. I'm working as a Full Stack Developer I describe myself as a passionate developer who loves coding, open source, and the web platform .

As a Lead Front End Engineer, one of my main tasks was to mentor coworkers of my team, contributing to their personal and professional growth. I worked very close to stakeholders to define, organise and breakdown new projects.

Aside from my job, I like to create and contribute to open source projects. That helps me to learn a ton of new stuff, grow as a developer and support other open source projects. Also I enjoy Dancing too.<em>"</em></p>
                        </div>
                        <div class="item col-md-12">
                            <img src="aboutcss/img/h1.jpg" alt="William Smoker">
                            <span>Full Stack Developer</span>
                            <h4>Himanshu Sharma</h4>
                            
                            <p><em>"</em>My name is Himanshu Sharma. I'm a 20 year Full Stack Developer I describe myself as a passionate developer who loves coding, open source, and the web platform .

As a Front-End Developer I created a lot of different websites for our clients using Wordpress as a CMS and HTML, CSS and Java to built the sites. I helped to improve the developer experience of the company by implementing tools to improve our software development process.

Aside from my job, I like to create and contribute to open source projects. That helps me to learn a ton of new stuff, grow as a developer and support other open source projects. Also I enjoy writing poetries  at my blog.<em>"</em></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>      
    
    <section class="services" id="services-section">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-3">
                    <div class="flip-container" ontouchstart="this.classList.toggle('hover');">
                        <div class="flipper first-service">
                            <div class="front">
                                <div class="icon">
                                    <img src="aboutcss/img/heart-icon.png" alt="">
                                </div>
                                <h4>LOVE FOOD AND US TOO</h4>
                            </div>
                            <div class="back">
                                <p>YOU HAPPINESS IS OUR MOTTO</p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="flip-container" ontouchstart="this.classList.toggle('hover');">
                        <div class="flipper second-service">
                            <div class="front">
                                <div class="icon">
                                    <img src="aboutcss/img/home-icon.png" alt="">
                                </div>
                                <h4>KUCH GHAR SA</h4>
                            </div>
                            <div class="back">
                                <p>HOPES OUR FOOD MAKE YOU FEEL LIKE HOME.</p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="flip-container" ontouchstart="this.classList.toggle('hover');">
                        <div class="flipper third-service">
                            <div class="front">
                                <div class="icon">
                                    <img src="aboutcss/img/revision-icon.png" alt="">
                                </div>
                                <h4>CONTACT US</h4>
                            </div>
                            <div class="back">
                                <p>ALWAYS THERE TO SOLVE YOUR QUERIES.</p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="flip-container" ontouchstart="this.classList.toggle('hover');">
                        <div class="flipper fourth-service">
                            <div class="front">
                                <div class="icon">
                                    <img src="aboutcss/img/chat-icon.png" alt="">
                                </div>
                                <h4>GIVE US YOUR FEEDBACK</h4>
                            </div>
                            <div class="back">
                                <p>WE WILL LOVE TO HEAR YOUR FEEDBACK.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section class="contact-us" id="contact-section"> 
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-8">
                
                <!-- Please visit https://templatemo.com/contact page if you do not know how to setup the contact form -->
                
                    <form id="contact" action="" method="post">
                        <div class="row">
                            <div class="col-md-4">
                              <fieldset>
                                <input name="name" type="text" class="form-control" id="name" placeholder="Your name..." required="">
                              </fieldset>
                            </div>
                            <div class="col-md-4">
                              <fieldset>
                                <input name="email" type="email" class="form-control" id="email" placeholder="Your email..." required="">
                              </fieldset>
                            </div>
                             <div class="col-md-4">
                              <fieldset>
                                <input name="subject" type="text" class="form-control" id="subject" placeholder="Subject..." required="">
                              </fieldset>
                            </div>
                            <div class="col-md-12">
                              <fieldset>
                                <textarea name="message" rows="6" class="form-control" id="message" placeholder="Your message..." required=""></textarea>
                              </fieldset>
                            </div>
                            <div class="col-md-6">
                              <fieldset>
                                <button type="submit" id="form-submit" class="btn">Send it now</button>
                              </fieldset>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-md-4">
                    <div class="contact-right-content">
                        <div class="icon"><img src="img/map-marker-icon.png" alt=""></div>
                        <h4>You can find us on maps</h4>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <footer>
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12">
                    <p>Copyright &copy; 2021 HOMEAL 
                    
                    - <a rel="nofollow" href="https://templatemo.com/tm-513-avalon" target="_parent">HOMEAL</a> 
                     <a rel="nofollow" href="https://www.html5max.com" target="_parent"></a></p>
                </div>
            </div>
        </div>
    </footer>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.2.min.js"><\/script>')</script>

    <script src="aboutcss/js/vendor/bootstrap.min.js"></script>
    
    <script src="aboutcss/js/datepicker.js"></script>
    <script src="aboutcss/js/plugins.js"></script>
    <script src="aboutcss/js/main.js"></script>

    <script type="text/javascript">
    $(document).ready(function() 
	{
        // navigation click actions 
        $('.scroll-link').on('click', function(event){
            event.preventDefault();
            var sectionID = $(this).attr("data-id");
            scrollToID('#' + sectionID, 750);
        });
        // scroll to top action
        $('.scroll-top').on('click', function(event) {
            event.preventDefault();
            $('html, body').animate({scrollTop:0}, 'slow');         
        });
        // mobile nav toggle
        $('#nav-toggle').on('click', function (event) {
            event.preventDefault();
            $('#main-nav').toggleClass("open");
        });
    });
    // scroll function
    function scrollToID(id, speed){
        var offSet = 0;
        var targetOffset = $(id).offset().top - offSet;
        var mainNav = $('#main-nav');
        $('html,body').animate({scrollTop:targetOffset}, speed);
        if (mainNav.hasClass("open")) {
            mainNav.css("height", "1px").removeClass("in").addClass("collapse");
            mainNav.removeClass("open");
        }
    }
    if (typeof console === "undefined") {
        console = {
            log: function() { }
        };
    }
    </script>
</body>
</html>