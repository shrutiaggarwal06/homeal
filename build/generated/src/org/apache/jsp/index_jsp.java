package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <title>HOMEAL</title>\n");
      out.write("<!-- \n");
      out.write("Cafe House Template\n");
      out.write("http://www.templatemo.com/tm-466-cafe-house\n");
      out.write("-->\n");
      out.write("  <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,600,700' rel='stylesheet' type='text/css'>\n");
      out.write("  <link href='http://fonts.googleapis.com/css?family=Damion' rel='stylesheet' type='text/css'>\n");
      out.write("  <link href=\"indexcss/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"indexcss/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"indexcss/css/templatemo-style.css\" rel=\"stylesheet\">\n");
      out.write("  <link rel=\"shortcut icon\" href=\"img/favicon.ico\" type=\"image/x-icon\" />\n");
      out.write("\n");
      out.write("  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("    <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("        .im1{\n");
      out.write("    height:50px;\n");
      out.write("width:100px;\n");
      out.write("float:right;\n");
      out.write("margin-right:2%;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <!-- Preloader -->\n");
      out.write("    <div id=\"loader-wrapper\">\n");
      out.write("      <div id=\"loader\"></div>\n");
      out.write("      <div class=\"loader-section section-left\"></div>\n");
      out.write("      <div class=\"loader-section section-right\"></div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Preloader -->\n");
      out.write("    ");

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

      out.write("     \n");
      out.write("    <div class=\"tm-top-header\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"tm-top-header-inner\">\n");
      out.write("            <div class=\"tm-logo-container\">\n");
      out.write("           \n");
      out.write("              <h1 class=\"tm-site-name tm-handwriting-font\">Homeal</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mobile-menu-icon\">\n");
      out.write("              <i class=\"fa fa-bars\"></i>\n");
      out.write("            </div>\n");
      out.write("            <nav class=\"tm-nav\">\n");
      out.write("              <ul>\n");
      out.write("                <li><a href=\"index.jsp\" class=\"active\">Home</a></li>\n");
      out.write("                <li><a href=\"");
      out.print(a);
      out.write('"');
      out.write('>');
      out.print(b);
      out.write("</a></li>\n");
      out.write("                <li><a href=\"breakfast.jsp\">Meal</a></li>\n");
      out.write("                <li><a href=\"contactus.jsp\">Contact</a></li>\n");
      out.write("                <li><a href=\"About.jsp\">About us</a></li>\n");
      out.write("                <li><a href=\"feedback.jsp\">Feedback</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </nav>   \n");
      out.write("          </div>           \n");
      out.write("        </div>    \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <section class=\"tm-welcome-section\">\n");
      out.write("      <div class=\"container tm-position-relative\">\n");
      out.write("        <div class=\"tm-lights-container\">\n");
      out.write("          <img src=\"indexcss/img/light.png\" alt=\"Light\" class=\"light light-1\">\n");
      out.write("          <img src=\"indexcss/img/light.png\" alt=\"Light\" class=\"light light-2\">\n");
      out.write("          <img src=\"indexcss/img/light.png\" alt=\"Light\" class=\"light light-3\">  \n");
      out.write("        </div>        \n");
      out.write("        <div class=\"row tm-welcome-content\">\n");
      out.write("          <h2 class=\"white-text tm-handwriting-font tm-welcome-header\"><img src=\"indexcss/img/header-line.png\" alt=\"Line\" class=\"tm-header-line\">&nbsp;Welcome To&nbsp;&nbsp;<img src=\"indexcss/img/header-line.png\" alt=\"Line\" class=\"tm-header-line\"></h2>\n");
      out.write("          <h2 class=\"gold-text tm-welcome-header-2\">Homeal</h2>\n");
      out.write("          <p class=\"gray-text tm-welcome-description\">Eat breakfast like a <span class=\"gold-text\"> KING,</span> lunch like a <span class=\"gold-text\">PRINCE </span>and dinner like a <span class=\"gold-text\">PAUPER</span>. So what are you waiting for</p>\n");
      out.write("          <a href=\"breakfast.jsp\" class=\"tm-more-button tm-more-button-welcome\">Order Now</a>      \n");
      out.write("        </div>\n");
      out.write("        <img src=\"indexcss/img/table-set.png\" alt=\"Table Set\" class=\"tm-table-set img-responsive\">             \n");
      out.write("      </div>      \n");
      out.write("    </section>\n");
      out.write("    <div class=\"tm-main-section light-gray-bg\">\n");
      out.write("      <div class=\"container\" id=\"main\">\n");
      out.write("        <section class=\"tm-section row\">\n");
      out.write("          <div class=\"col-lg-9 col-md-9 col-sm-8\">\n");
      out.write("            <h2 class=\"tm-section-header gold-text tm-handwriting-font\">Homeal</h2>\n");
      out.write("            \n");
      out.write("            <p class=\"tm-welcome-description\">Homeal Provide you with <span class=\"blue-text\">Tiffin  Service </span>which give you vibes of <span class=\"green-text\"> Ghar ka Khana </span>.Get your Fav food on your door step.Enjoy healthy and good quality food on your address.We provide you with different variety of dishes and mouth-watering food.</p>\n");
      out.write("            <a href=\"About.jsp\" class=\"tm-more-button margin-top-30\">Read More</a> \n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-3 col-md-3 col-sm-4 tm-welcome-img-container\">\n");
      out.write("            <div class=\"inline-block shadow-img\">\n");
      out.write("              <img src=\"images/logo.png\" alt=\"Image\" class=\"img-circle img-thumbnail\">  \n");
      out.write("            </div>              \n");
      out.write("          </div>            \n");
      out.write("        </section>          \n");
      out.write("        <section class=\"tm-section tm-section-margin-bottom-0 row\">\n");
      out.write("          <div class=\"col-lg-12 tm-section-header-container\">\n");
      out.write("            <h2 class=\"tm-section-header gold-text tm-handwriting-font\"><img src=\"indexcss/img/logo.png\" alt=\"Logo\" class=\"tm-site-logo\"> Popular Items</h2>\n");
      out.write("            <div class=\"tm-hr-container\"><hr class=\"tm-hr\"></div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-12 tm-popular-items-container\">\n");
      out.write("            <div class=\"tm-popular-item\">\n");
      out.write("              <img src=\"indexcss/img/popular-1.jpg\" alt=\"Popular\" class=\"tm-popular-item-img\">\n");
      out.write("              <div class=\"tm-popular-item-description\">\n");
      out.write("                <h3 class=\"tm-handwriting-font tm-popular-item-title\"><span class=\"tm-handwriting-font bigger-first-letter\">B</span>reakfast</h3><hr class=\"tm-popular-item-hr\">\n");
      out.write("                <p>Breakfast is only worth having when somebody else made it for you. ...</p>\n");
      out.write("                <div class=\"order-now-container\">\n");
      out.write("                  <a href=\"breakfast.jsp\" class=\"order-now-link tm-handwriting-font\">Order Now</a>\n");
      out.write("                </div>\n");
      out.write("              </div>              \n");
      out.write("            </div>\n");
      out.write("            <div class=\"tm-popular-item\">\n");
      out.write("              <img src=\"indexcss/img/popular-2.jpg\" alt=\"Popular\" class=\"tm-popular-item-img\">\n");
      out.write("              <div class=\"tm-popular-item-description\">\n");
      out.write("                <h3 class=\"tm-handwriting-font tm-popular-item-title\"><span class=\"tm-handwriting-font bigger-first-letter\">L</span>unch</h3><hr class=\"tm-popular-item-hr\">\n");
      out.write("                <p>Lunch is the most precious meal of the day.So It need to be special and Tasty..</p>\n");
      out.write("                <div class=\"order-now-container\">\n");
      out.write("                  <a href=\"lunch.jsp\" class=\"order-now-link tm-handwriting-font\">Order Now</a>\n");
      out.write("                </div>\n");
      out.write("              </div>              \n");
      out.write("            </div>\n");
      out.write("            <div class=\"tm-popular-item\">\n");
      out.write("              <img src=\"indexcss/img/popular-3.jpg\" alt=\"Popular\" class=\"tm-popular-item-img\">\n");
      out.write("              <div class=\"tm-popular-item-description\">\n");
      out.write("                <h3 class=\"tm-handwriting-font tm-popular-item-title\"><span class=\"tm-handwriting-font bigger-first-letter\">D</span>inner</h3><hr class=\"tm-popular-item-hr\">\n");
      out.write("                <p>A great dinner must include not only yummy food, but good conversation.</p>\n");
      out.write("                <div class=\"order-now-container\">\n");
      out.write("                  <a href=\"dinner.jsp\" class=\"order-now-link tm-handwriting-font\">Order Now</a>\n");
      out.write("                </div>\n");
      out.write("              </div>              \n");
      out.write("            </div>\n");
      out.write("          </div>          \n");
      out.write("        </section>\n");
      out.write("        <section class=\"tm-section row\">\n");
      out.write("          <div class=\"col-lg-12 tm-section-header-container\">\n");
      out.write("            <h2 class=\"tm-section-header gold-text tm-handwriting-font\"><img src=\"indexcss/img/logo.png\" alt=\"Logo\" class=\"tm-site-logo\"> Today's Special</h2>\n");
      out.write("            <div class=\"tm-hr-container\"><hr class=\"tm-hr\"></div>\n");
      out.write("          </div>          \n");
      out.write("          <div class=\"col-lg-12 tm-special-container margin-top-60\">\n");
      out.write("            <div class=\"tm-special-container-left\"> <!-- left -->\n");
      out.write("              <div class=\"tm-special-item\">\n");
      out.write("                <div class=\"tm-special-img-container\">\n");
      out.write("                  <img src=\"images/logo.png\" alt=\"Special\" class=\"tm-special-img img-responsive\">  \n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"tm-special-container-right\"> <!-- right -->\n");
      out.write("              <div>\n");
      out.write("                <div class=\"tm-special-item\">\n");
      out.write("                  <div class=\"tm-special-img-container\">\n");
      out.write("                    <img src=\"indexcss/img/lunch.jpg\" alt=\"Special\" class=\"img-responsive\">  \n");
      out.write("                   \n");
      out.write("                  </div>\n");
      out.write("                </div>  \n");
      out.write("              </div>\n");
      out.write("              <div class=\"tm-special-container-lower\">\n");
      out.write("                <div class=\"tm-special-item\">\n");
      out.write("                  <div class=\"tm-special-img-container\">\n");
      out.write("                    <img src=\"indexcss/img/dinner.jpg\" alt=\"Special\" class=\"img-responsive\">  \n");
      out.write("                    <a href=\"#\">\n");
      out.write("                      \n");
      out.write("                    </a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"tm-special-item\">\n");
      out.write("                  <div class=\"tm-special-img-container\">\n");
      out.write("                    <img src=\"indexcss/img/breakfast1.jpg\" alt=\"Special\" class=\"img-responsive\">  \n");
      out.write("                    \n");
      out.write("                  </div>\n");
      out.write("                </div>  \n");
      out.write("              </div>              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </section>\n");
      out.write("        <section class=\"tm-section\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("             \n");
      out.write("          </div>          \n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"tm-daily-menu-container margin-top-60\">\n");
      out.write("              <div class=\"col-lg-4 col-md-4\">\n");
      out.write("                    \n");
      out.write("              </div>            \n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("          </div>          \n");
      out.write("        </section>\n");
      out.write("      </div>\n");
      out.write("    </div> \n");
      out.write("    <footer>\n");
      out.write("      <div class=\"tm-black-bg\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row margin-bottom-60\">\n");
      out.write("            <nav class=\"col-lg-3 col-md-3 tm-footer-nav tm-footer-div\">\n");
      out.write("              <h3 class=\"tm-footer-div-title\">Main Menu</h3>\n");
      out.write("              <ul>\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"about.jsp\">About Us</a></li>\n");
      out.write("                <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                <li><a href=\"contactus.jsp\">Contact</a></li>\n");
      out.write("                <li><a href=\"feedback.jsp\">Feedback</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"col-lg-5 col-md-5 tm-footer-div\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-4 tm-footer-div\">\n");
      out.write("              <h3 class=\"tm-footer-div-title\">Get Social</h3>\n");
      out.write("              <div class=\"tm-social-icons-container\">\n");
      out.write("                <a href=\"#\" class=\"tm-social-icon\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                <a href=\"#\" class=\"tm-social-icon\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                <a href=\"#\" class=\"tm-social-icon\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("                <a href=\"#\" class=\"tm-social-icon\"><i class=\"fa fa-youtube\"></i></a>\n");
      out.write("                <a href=\"#\" class=\"tm-social-icon\"><i class=\"fa fa-behance\"></i></a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>          \n");
      out.write("        </div>  \n");
      out.write("      </div>      \n");
      out.write("      <div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row tm-copyright\">\n");
      out.write("           <p class=\"col-lg-12 small copyright-text text-center\">Copyright &copy; 2021  Homeal</p>\n");
      out.write("         </div>  \n");
      out.write("       </div>\n");
      out.write("     </div>\n");
      out.write("   </footer> <!-- Footer content-->  \n");
      out.write("   <!-- JS -->\n");
      out.write("   <script type=\"text/javascript\" src=\"indexcss/js/jquery-1.11.2.min.js\"></script>      <!-- jQuery -->\n");
      out.write("   <script type=\"text/javascript\" src=\"indexcss/js/templatemo-script.js\"></script>      <!-- Templatemo Script -->\n");
      out.write("\n");
      out.write(" </body>\n");
      out.write(" </html>");
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
