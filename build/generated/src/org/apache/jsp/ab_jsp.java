package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ab_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Customer Profile</title>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Source+Sans+Pro:wght@300;400&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"profile/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"profile/css/slick.css\" type=\"text/css\" /> \n");
      out.write("    <link rel=\"stylesheet\" href=\"profile/css/templatemo-style.css\">\n");
      out.write("<!--\n");
      out.write("    \n");
      out.write("TemplateMo 560 Astro Motion\n");
      out.write("\n");
      out.write("https://templatemo.com/tm-560-astro-motion\n");
      out.write("\n");
      out.write("-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <video autoplay muted loop id=\"bg-video\">\n");
      out.write("        <source src=\"profile/video/gfp-astro-timelapse.mp4\" type=\"video/mp4\">\n");
      out.write("    </video>\n");
      out.write("    <div class=\"page-container\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-xs-12\">\n");
      out.write("            <div class=\"cd-slider-nav\">\n");
      out.write("              <nav class=\"navbar navbar-expand-lg\" id=\"tm-nav\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">HOMEAL</a>\n");
      out.write("                  <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbar-supported-content\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                  </button>\n");
      out.write("                  <div class=\"collapse navbar-collapse\" id=\"navbar-supported-content\">\n");
      out.write("                    <ul class=\"navbar-nav mb-2 mb-lg-0\">\n");
      out.write("                      <li class=\"nav-item selected\">\n");
      out.write("                        <a class=\"nav-link\" aria-current=\"page\" href=\"#0\" data-no=\"1\">About</a>\n");
      out.write("                        <div class=\"circle\"></div>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"corders.jsp\">Orders</a>\n");
      out.write("                        <div class=\"circle\"></div>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#0\" data-no=\"3\">Cards</a>\n");
      out.write("                        <div class=\"circle\"></div>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#0\" data-no=\"4\">Password</a>\n");
      out.write("                        <div class=\"circle\"></div>\n");
      out.write("                      </li>\n");
      out.write("                      <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"logout.jsp\">logout</a>\n");
      out.write("                        <div class=\"circle\"></div>\n");
      out.write("                      </li>\n");
      out.write("                    </ul>\n");
      out.write("                  </div>\n");
      out.write("              </nav>\n");
      out.write("            </div>\n");
      out.write("          </div>          \n");
      out.write("        </div>        \n");
      out.write("      </div>      \n");
      out.write("      <div class=\"container-fluid tm-content-container\">\n");
      out.write("        <ul class=\"cd-hero-slider mb-0 py-5\">\n");
      out.write("          <li class=\"px-3\" data-page-no=\"1\">\n");
      out.write("            <li data-page-no=\"1\" class=\"px-3\">\n");
      out.write("            <div class=\"position-relative page-width-1 page-right tm-border-top tm-border-bottom\">\n");
      out.write("              <div class=\"circle intro-circle-1\"></div>\n");
      out.write("              <div class=\"circle intro-circle-2\"></div>\n");
      out.write("              <div class=\"circle intro-circle-3\"></div>\n");
      out.write("              <div class=\"circle intro-circle-4\"></div>\n");
      out.write("              <div class=\"tm-bg-dark content-pad\">\n");
      out.write("                \n");
      out.write("                <p>\n");
      out.write("                 ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adminprofile.jsp", out, false);
      out.write("\n");
      out.write("                </p>\n");
      out.write("              </div>              \n");
      out.write("            </div>\n");
      out.write("          </li>           \n");
      out.write("          </li>\n");
      out.write("          <li data-page-no=\"2\">\n");
      out.write("            <!-- Image Carousel -->\n");
      out.write("            <div class=\"mx-auto position-relative gallery-container\">\n");
      out.write("              <div class=\"circle intro-circle-1\"></div>\n");
      out.write("              <div class=\"circle intro-circle-2\"></div>\n");
      out.write("              <div class=\"mx-auto tm-border-top gallery-slider\">\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </li>\n");
      out.write("          <li data-page-no=\"3\" class=\"px-3\">\n");
      out.write("            <div class=\"position-relative page-width-1 page-right tm-border-top tm-border-bottom\">\n");
      out.write("              <div class=\"circle intro-circle-1\"></div>\n");
      out.write("              <div class=\"circle intro-circle-2\"></div>\n");
      out.write("              <div class=\"circle intro-circle-3\"></div>\n");
      out.write("              <div class=\"circle intro-circle-4\"></div>\n");
      out.write("              <div class=\"tm-bg-dark content-pad\">\n");
      out.write("                \n");
      out.write("                <p>\n");
      out.write("                 ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adminorders.jsp", out, false);
      out.write("\n");
      out.write("                </p>\n");
      out.write("              </div>              \n");
      out.write("            </div>\n");
      out.write("          </li>\n");
      out.write("          <li data-page-no=\"4\">\n");
      out.write("            <div class=\"mx-auto page-width-2\">\n");
      out.write("             \n");
      out.write("              <div class=\"row\">\n");
      out.write("                   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "admincustomer.jsp", out, false);
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("            </div>            \n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <footer class=\"row mx-auto tm-footer\">\n");
      out.write("        <div class=\"col-md-6 px-0\">\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("      </footer>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!-- Preloader, https://ihatetomatoes.net/create-custom-preloading-screen/ -->\n");
      out.write("  <div id=\"loader-wrapper\">            \n");
      out.write("    <div id=\"loader\"></div>\n");
      out.write("    <div class=\"loader-section section-left\"></div>\n");
      out.write("    <div class=\"loader-section section-right\"></div>\n");
      out.write("  </div>  \n");
      out.write("  <script src=\"profile/js/jquery-3.5.1.min.js\"></script>\n");
      out.write("  <script src=\"profile/js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"profile/js/slick.js\"></script>\n");
      out.write("  <script src=\"profile/js/templatemo-script.js\"></script>\n");
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
