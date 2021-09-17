package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class booking_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("\n");
      out.write("\t<title>HOMEAL</title>\n");
      out.write("\n");
      out.write("\t<!-- Google font -->\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=PT+Sans:400\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t<!-- Bootstrap -->\n");
      out.write("\t<link type=\"text/css\" rel=\"stylesheet\" href=\"bookingcss/bootstrap.min.css\" />\n");
      out.write("\n");
      out.write("\t<!-- Custom stlylesheet -->\n");
      out.write("\t<link type=\"text/css\" rel=\"stylesheet\" href=\"bookingcss/style.css\" />\n");
      out.write("\n");
      out.write("\t<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("\t<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("\t\t  <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("\t\t  <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div id=\"booking\" class=\"section\">\n");
      out.write("<div class=\"section-center\">\n");
      out.write("<div class=\"container\">\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"booking-form\">\n");
      out.write("<form>\n");
      out.write("<div class=\"form-group\">\n");
      out.write("<div class=\"form-checkbox\">\n");
      out.write("<label for=\"roundtrip\">\n");
      out.write("<input type=\"radio\" id=\"roundtrip\" name=\"flight-type\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span></span>BREAKFAST\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"one-way\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" id=\"one-way\" name=\"flight-type\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span></span>LUNCH\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"multi-city\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" id=\"multi-city\" name=\"flight-type\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span></span>DINNER\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"form-label\">HOMECHEF</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" placeholder=\"City or airport\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"form-label\">EMAIL ADDRESS</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" placeholder=\"City or airport\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"form-label\">PHONE NUMBER</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" placeholder=\"phone number\" required>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"form-label\">FROM</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"date\" required>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"form-label\">HOW MANY DAYS</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option>1</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option>2</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option>3</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"select-arrow\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"form-label\">Pincode</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" required>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"select-arrow\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"form-label\">ADDRESS</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" placeholder=\"City or airport\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"select-arrow\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-btn\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"submit-btn\">BOOK MEAL</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body><!-- This templates was made by Colorlib (https://colorlib.com) -->\n");
      out.write("\n");
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
