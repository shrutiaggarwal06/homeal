package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class meals_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\n");
      out.write("    <title>Simple House Template</title>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400\" rel=\"stylesheet\" />    \n");
      out.write("\t<link href=\"css1/templatemo-style.css\" rel=\"stylesheet\" />\n");
      out.write("</head>\n");
      out.write("<!--\n");
      out.write("\n");
      out.write("Simple House\n");
      out.write("\n");
      out.write("https://templatemo.com/tm-539-simple-house\n");
      out.write("\n");
      out.write("-->\n");
      out.write("<body> \n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t<!-- Top box -->\n");
      out.write("\t\t<!-- Logo & Site Name -->\n");
      out.write("\t\t<div class=\"placeholder\">\n");
      out.write("\t\t\t<div class=\"parallax-window\" data-parallax=\"scroll\" data-image-src=\"img/simple-house-01.jpg\">\n");
      out.write("\t\t\t\t<div class=\"tm-header\">\n");
      out.write("\t\t\t\t\t<div class=\"row tm-header-inner\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6 col-12\">\n");
      out.write("\t\t\t\t\t\t<!--\t<img src=\"img/simple-house-logo.png\" alt=\"Logo\" class=\"tm-site-logo\" />--> \n");
      out.write("\t\t\t\t\t\t\t<div class=\"tm-site-text-box\">\n");
      out.write("\t\t\t\t\t\t\t\t<h1 class=\"tm-site-title\">HOMEAL</h1>\n");
      out.write("\t\t\t\t\t\t\t\t<h6 class=\"tm-site-description\">food from home to home</h6>\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<nav class=\"col-md-6 col-12 tm-nav\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"tm-nav-ul\">\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"tm-nav-li\"><a href=\"index.html\" class=\"tm-nav-link active\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"tm-nav-li\"><a href=\"about.html\" class=\"tm-nav-link\">About</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"tm-nav-li\"><a href=\"contact.html\" class=\"tm-nav-link\">Contact</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</nav>\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<main>\n");
      out.write("\t\t\t<header class=\"row tm-welcome-section\">\n");
      out.write("\t\t\t\t<h2 class=\"col-12 text-center tm-section-title\">Welcome to our food menu</h2>\n");
      out.write("\t\t\t\t<p class=\"col-12 text-center\">here u will find different food prepared with love by our lovely home chefs</p>\n");
      out.write("\t\t\t</header>\n");
      out.write("\t\t\t");
 int c=0;
      out.write("\n");
      out.write("\t\t\t<div class=\"tm-paging-links\">\n");
      out.write("\t\t\t\t<nav>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li class=\"tm-paging-item\"><a href=\"#b\" class=\"tm-paging-link active\">Pizza</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"tm-paging-item\"><a href=\"breakfast.jsp\" class=\"tm-paging-link\">Salad</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"tm-paging-item\"><a href=\"#dinner\" class=\"tm-paging-link\">Noodle</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Gallery -->\n");
      out.write("                        \n");
      out.write("                        <div class=\"row tm-gallery\">\n");
      out.write("                                    ");

                                  for(int i=0;i<=4;i++)
                                    {
      out.write("             \n");
      out.write("                                    \n");
      out.write("\t\t\t\t<div id=\"tm-gallery-page-pizza\" class=\"tm-gallery-page\">\n");
      out.write("\t\t\t\t\t<article class=\"col-lg-3 col-md-4 col-sm-6 col-12 tm-gallery-item\">\n");
      out.write("\t\t\t\t\t\t<figure>\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/LOGIN.jpg\" alt=\"Image\" class=\"img-fluid tm-gallery-img\" />\n");
      out.write("\t\t\t\t\t\t\t<figcaption>\n");
      out.write("\t\t\t\t\t\t\t\t<h4 class=\"tm-gallery-title\">Fusce dictum finibus</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"tm-gallery-description\">Ut sit akhjhfjfyjfyfuyfuyfyfyfyfyfyfyfmet tellus accumsan</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"tm-gallery-price\">$45 / $55</p>\n");
      out.write("\t\t\t\t\t\t\t</figcaption>\n");
      out.write("\t\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t\t</article>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div> <!-- gallery page 1 -->\n");
      out.write("\t\t\t\t");
}
      out.write("                                                                                                                                                                                                        \t\t\t<!-- gallery page 2 -->                               \t\t\t\n");
      out.write("\t\t\t<div class=\"tm-section tm-container-inner\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t<figure class=\"tm-description-figure\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/img-01.jpg\" alt=\"Image\" class=\"img-fluid\" />\n");
      out.write("\t\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"tm-description-box\"> \n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"tm-gallery-title\">Maecenas nulla neque</h4>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"tm-mb-45\">Redistributing this template as a downloadable ZIP file on any template collection site is strictly prohibited. You will need to <a rel=\"nofollow\" href=\"https://templatemo.com/contact\">talk to us</a> for additional permissions about our templates. Thank you.</p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"about.html\" class=\"tm-btn tm-btn-default tm-right\">Read More</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("\t\t</main>\n");
      out.write("\n");
      out.write("\t\t<footer class=\"tm-footer text-center\">\n");
      out.write("\t\t\t<p>Copyright &copy; 2020 Simple House \n");
      out.write("            \n");
      out.write("            | Design: <a rel=\"nofollow\" href=\"https://templatemo.com\">TemplateMo</a></p>\n");
      out.write("\t\t</footer>\n");
      out.write("\t</div>\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"js/parallax.min.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t\t\t// Handle click on paging links\n");
      out.write("\t\t\t$('.tm-paging-link').click(function(e){\n");
      out.write("\t\t\t\te.preventDefault();\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tvar page = $(this).text().toLowerCase();\n");
      out.write("\t\t\t\t$('.tm-gallery-page').addClass('hidden');\n");
      out.write("\t\t\t\t$('#tm-gallery-page-' + page).removeClass('hidden');\n");
      out.write("\t\t\t\t$('.tm-paging-link').removeClass('active');\n");
      out.write("\t\t\t\t$(this).addClass(\"active\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
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
