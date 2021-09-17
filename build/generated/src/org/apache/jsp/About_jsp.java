package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class About_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <title>Homeal</title>\n");
      out.write("<!-- \n");
      out.write("Avalon Template \n");
      out.write("https://templatemo.com/tm-513-avalon\n");
      out.write("-->\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"aboutcss/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"aboutcss/css/bootstrap-theme.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"aboutcss/css/fontAwesome.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"aboutcss/css/hero-slider.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"aboutcss/css/owl-carousel.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"aboutcss/css/datepicker.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"aboutcss/css/templatemo-style.css\">\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <script src=\"js/vendor/modernizr-2.8.3-respond-1.4.2.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <section class=\"banner\" id=\"top\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"left-banner-content\">\n");
      out.write("                        <div class=\"text-content\">\n");
      out.write("                            <h6>GHAR KA KHANA</h6>\n");
      out.write("                            <div class=\"line-dec\"></div>\n");
      out.write("                            <h1>From Our Home <br>To Yours.</h1>\n");
      out.write("                            <div class=\"white-border-button\">\n");
      out.write("                                <a href=\"breakfast.jsp\" class=\"scroll-link\" data-id=\"best-offer-section\">Discover More</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"right-banner-content\">\n");
      out.write("                        <div class=\"logo\"><a href=\"index.html\"><img src=\"images/logo.png\" alt=\"\"></a></div>\n");
      out.write("                        <h2>Homeal</h2>\n");
      out.write("                        <span>Kuch <em>Ghar</em> Sa.</span>\n");
      out.write("                        <div class=\"line-dec\"></div>\n");
      out.write("                        \n");
      out.write("                        <ul class=\"social-icons\">\n");
      out.write("                            <li><a href=\"http://www.facebook.com\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                            <li><a href=\"http://www.twitter.com\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                            <li><a href=\"http://www.linkedin.in\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                            <li><a href=\"https://instagram.com/food_factory_06?igshid=1flt2ssi1j2ft\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("                            <li><a href=\"index.jsp\"><i class=\"fa fa-home\"></i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <section class=\"best-offer\" id=best-offer-section>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"best-offer-left-content\">\n");
      out.write("                        <div class=\"icon\"><img src=\"aboutcss/img/best-offer-icon.png\" alt=\"\"></div>\n");
      out.write("                        <h4>Best Offer For You</h4>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"best-offer-right-content\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6 col-sm-12\">\n");
      out.write("                                <h2>KNOW US<br><em>BETTER</em></h2>\n");
      out.write("                                It is a user-friendly system. It is a platform where people who can cook and design their meals and connect to those who like to eat homemade food. Here the administrator can handle all the activities online and securely. The system also covers features like login , registration , meal description, meal booking, payment and etc.\n");
      out.write("              The project provides a source of business for the Tiffin providers as they can create meals and connect to customers and earn and spread happiness .\n");
      out.write("            \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                <ul>\n");
      out.write("                                    <li>WHY US?.</li>\n");
      out.write("                                    <li>GOOD QUALITY HOME MADE FOOD</li>\n");
      out.write("                                    <li>HEALTH & FULL OF NUTRITION</li>\n");
      out.write("                                    <li>PROPER CARE OF HYGIENE</li>\n");
      out.write("                                </ul>\n");
      out.write("                                <div class=\"pink-button\">\n");
      out.write("                                    <a href=\"contactus.jsp\">Contactus</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 col-sm-12\">\n");
      out.write("                                <img src=\"aboutcss/img/best-offer-image.png\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");

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

      out.write("          \n");
      out.write("    <section class=\"events\" id=\"events-section\">\n");
      out.write("        <div class=\"content-wrapper\">\n");
      out.write("            <div class=\"inner-container container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12 col-sm-12\">\n");
      out.write("                        <div class=\"section-heading\">\n");
      out.write("                            <div class=\"filter-categories\">\n");
      out.write("                                <ul class=\"project-filter\">\n");
      out.write("                                    <li class=\"filter\" data-filter=\"all\"><a href=\"index.jsp\"><span>HOME</span></a></li>\n");
      out.write("                                    <li class=\"filter\" data-filter=\"design\"><a href=\"breakfast.jsp\"><span>MEALS</span></a></li>\n");
      out.write("                                    <li class=\"filter\" data-filter=\"start\"><a href=\"");
      out.print(a);
      out.write("\" > ");
      out.print(b);
      out.write("<span></span></a></li>\n");
      out.write("                                    <li class=\"filter\" data-filter=\"web\"><a href=\"contactus.jsp\"><span>CONTACTUS</span></a></li>\n");
      out.write("                                     <li class=\"filter\" data-filter=\"web\"><a href=\"feedback.jsp\"><span>FEEDBACK</span></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <section class=\"testimonial\" id=\"testimonial-section\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"testimonial-image\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div id=\"owl-testimonial\" class=\"owl-carousel owl-theme\">\n");
      out.write("                        <div class=\"item col-md-12\">\n");
      out.write("                            <img src=\"aboutcss/img/s1.jpg\" alt=\"Shruti\">\n");
      out.write("                            <span>Full Stack Developer</span>\n");
      out.write("                            <h4>Shruti Aggarwal</h4>\n");
      out.write("                            <br>\n");
      out.write("                            <p><em>\"</em>My name is Shruti Aggarwal. I'm working as a Full Stack Developer I describe myself as a passionate developer who loves coding, open source, and the web platform .\n");
      out.write("\n");
      out.write("As a Lead Front End Engineer, one of my main tasks was to mentor coworkers of my team, contributing to their personal and professional growth. I worked very close to stakeholders to define, organise and breakdown new projects.\n");
      out.write("\n");
      out.write("Aside from my job, I like to create and contribute to open source projects. That helps me to learn a ton of new stuff, grow as a developer and support other open source projects. Also I enjoy writing recipes at my blog. <em>\"</em></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"item col-md-12\">\n");
      out.write("                            <img src=\"aboutcss/img/g1.jpg\" alt=\"Geetanjali\">\n");
      out.write("                            <span>Web Developer</span>\n");
      out.write("                            <h4>Geetanjali Sao</h4>\n");
      out.write("                            <br>\n");
      out.write("                            <p><em>\"</em>My name is Geetanjali Sao. I'm working as a Full Stack Developer I describe myself as a passionate developer who loves coding, open source, and the web platform .\n");
      out.write("\n");
      out.write("As a Lead Front End Engineer, one of my main tasks was to mentor coworkers of my team, contributing to their personal and professional growth. I worked very close to stakeholders to define, organise and breakdown new projects.\n");
      out.write("\n");
      out.write("Aside from my job, I like to create and contribute to open source projects. That helps me to learn a ton of new stuff, grow as a developer and support other open source projects. Also I enjoy Dancing too.<em>\"</em></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"item col-md-12\">\n");
      out.write("                            <img src=\"aboutcss/img/h1.jpg\" alt=\"William Smoker\">\n");
      out.write("                            <span>Full Stack Developer</span>\n");
      out.write("                            <h4>Himanshu Sharma</h4>\n");
      out.write("                            \n");
      out.write("                            <p><em>\"</em>My name is Himanshu Sharma. I'm a 20 year Full Stack Developer I describe myself as a passionate developer who loves coding, open source, and the web platform .\n");
      out.write("\n");
      out.write("As a Front-End Developer I created a lot of different websites for our clients using Wordpress as a CMS and HTML, CSS and Java to built the sites. I helped to improve the developer experience of the company by implementing tools to improve our software development process.\n");
      out.write("\n");
      out.write("Aside from my job, I like to create and contribute to open source projects. That helps me to learn a ton of new stuff, grow as a developer and support other open source projects. Also I enjoy writing poetries  at my blog.<em>\"</em></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>      \n");
      out.write("    \n");
      out.write("    <section class=\"services\" id=\"services-section\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"flip-container\" ontouchstart=\"this.classList.toggle('hover');\">\n");
      out.write("                        <div class=\"flipper first-service\">\n");
      out.write("                            <div class=\"front\">\n");
      out.write("                                <div class=\"icon\">\n");
      out.write("                                    <img src=\"aboutcss/img/heart-icon.png\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <h4>LOVE FOOD AND US TOO</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"back\">\n");
      out.write("                                <p>YOU HAPPINESS IS OUR MOTTO</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"flip-container\" ontouchstart=\"this.classList.toggle('hover');\">\n");
      out.write("                        <div class=\"flipper second-service\">\n");
      out.write("                            <div class=\"front\">\n");
      out.write("                                <div class=\"icon\">\n");
      out.write("                                    <img src=\"aboutcss/img/home-icon.png\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <h4>KUCH GHAR SA</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"back\">\n");
      out.write("                                <p>HOPES OUR FOOD MAKE YOU FEEL LIKE HOME.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"flip-container\" ontouchstart=\"this.classList.toggle('hover');\">\n");
      out.write("                        <div class=\"flipper third-service\">\n");
      out.write("                            <div class=\"front\">\n");
      out.write("                                <div class=\"icon\">\n");
      out.write("                                    <img src=\"aboutcss/img/revision-icon.png\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <h4>CONTACT US</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"back\">\n");
      out.write("                                <p>ALWAYS THERE TO SOLVE YOUR QUERIES.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"flip-container\" ontouchstart=\"this.classList.toggle('hover');\">\n");
      out.write("                        <div class=\"flipper fourth-service\">\n");
      out.write("                            <div class=\"front\">\n");
      out.write("                                <div class=\"icon\">\n");
      out.write("                                    <img src=\"aboutcss/img/chat-icon.png\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <h4>GIVE US YOUR FEEDBACK</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"back\">\n");
      out.write("                                <p>WE WILL LOVE TO HEAR YOUR FEEDBACK.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <section class=\"contact-us\" id=\"contact-section\"> \n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                \n");
      out.write("                <!-- Please visit https://templatemo.com/contact page if you do not know how to setup the contact form -->\n");
      out.write("                \n");
      out.write("                    <form id=\"contact\" action=\"\" method=\"post\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-4\">\n");
      out.write("                              <fieldset>\n");
      out.write("                                <input name=\"name\" type=\"text\" class=\"form-control\" id=\"name\" placeholder=\"Your name...\" required=\"\">\n");
      out.write("                              </fieldset>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-4\">\n");
      out.write("                              <fieldset>\n");
      out.write("                                <input name=\"email\" type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Your email...\" required=\"\">\n");
      out.write("                              </fieldset>\n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"col-md-4\">\n");
      out.write("                              <fieldset>\n");
      out.write("                                <input name=\"subject\" type=\"text\" class=\"form-control\" id=\"subject\" placeholder=\"Subject...\" required=\"\">\n");
      out.write("                              </fieldset>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                              <fieldset>\n");
      out.write("                                <textarea name=\"message\" rows=\"6\" class=\"form-control\" id=\"message\" placeholder=\"Your message...\" required=\"\"></textarea>\n");
      out.write("                              </fieldset>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                              <fieldset>\n");
      out.write("                                <button type=\"submit\" id=\"form-submit\" class=\"btn\">Send it now</button>\n");
      out.write("                              </fieldset>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"contact-right-content\">\n");
      out.write("                        <div class=\"icon\"><img src=\"img/map-marker-icon.png\" alt=\"\"></div>\n");
      out.write("                        <h4>You can find us on maps</h4>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <p>Copyright &copy; 2021 HOMEAL \n");
      out.write("                    \n");
      out.write("                    - <a rel=\"nofollow\" href=\"https://templatemo.com/tm-513-avalon\" target=\"_parent\">HOMEAL</a> \n");
      out.write("                     <a rel=\"nofollow\" href=\"https://www.html5max.com\" target=\"_parent\"></a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"js/vendor/jquery-1.11.2.min.js\"><\\/script>')</script>\n");
      out.write("\n");
      out.write("    <script src=\"aboutcss/js/vendor/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <script src=\"aboutcss/js/datepicker.js\"></script>\n");
      out.write("    <script src=\"aboutcss/js/plugins.js\"></script>\n");
      out.write("    <script src=\"aboutcss/js/main.js\"></script>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function() \n");
      out.write("\t{\n");
      out.write("        // navigation click actions \n");
      out.write("        $('.scroll-link').on('click', function(event){\n");
      out.write("            event.preventDefault();\n");
      out.write("            var sectionID = $(this).attr(\"data-id\");\n");
      out.write("            scrollToID('#' + sectionID, 750);\n");
      out.write("        });\n");
      out.write("        // scroll to top action\n");
      out.write("        $('.scroll-top').on('click', function(event) {\n");
      out.write("            event.preventDefault();\n");
      out.write("            $('html, body').animate({scrollTop:0}, 'slow');         \n");
      out.write("        });\n");
      out.write("        // mobile nav toggle\n");
      out.write("        $('#nav-toggle').on('click', function (event) {\n");
      out.write("            event.preventDefault();\n");
      out.write("            $('#main-nav').toggleClass(\"open\");\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("    // scroll function\n");
      out.write("    function scrollToID(id, speed){\n");
      out.write("        var offSet = 0;\n");
      out.write("        var targetOffset = $(id).offset().top - offSet;\n");
      out.write("        var mainNav = $('#main-nav');\n");
      out.write("        $('html,body').animate({scrollTop:targetOffset}, speed);\n");
      out.write("        if (mainNav.hasClass(\"open\")) {\n");
      out.write("            mainNav.css(\"height\", \"1px\").removeClass(\"in\").addClass(\"collapse\");\n");
      out.write("            mainNav.removeClass(\"open\");\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    if (typeof console === \"undefined\") {\n");
      out.write("        console = {\n");
      out.write("            log: function() { }\n");
      out.write("        };\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}