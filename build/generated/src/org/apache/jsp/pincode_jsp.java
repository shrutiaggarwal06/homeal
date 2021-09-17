package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pincode_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    <title></title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <textarea id=\"txtAddress\" rows=\"3\" cols=\"25\"></textarea>\n");
      out.write("    <br />\n");
      out.write("    <input type=\"button\" onclick=\"GetLocation()\" value=\"Get Location\" />\n");
      out.write("    <script type=\"text/javascript\" src=\"http://maps.googleapis.com/maps/api/js?sensor=false\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    <!--\n");
      out.write("        function GetLocation() {\n");
      out.write("            var geocoder = new google.maps.Geocoder();\n");
      out.write("            var address = document.getElementById(\"txtAddress\").value;\n");
      out.write("            geocoder.geocode({ 'address': address }, function (results, status) {\n");
      out.write("                if (status == google.maps.GeocoderStatus.OK) {\n");
      out.write("                    var latitude = results[0].geometry.location.lat();\n");
      out.write("                    var longitude = results[0].geometry.location.lng();\n");
      out.write("                    alert(\"Latitude: \" + latitude + \"\\nLongitude: \" + longitude);\n");
      out.write("                } else {\n");
      out.write("                    alert(\"Request failed.\")\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        };\n");
      out.write("        //-->\n");
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
