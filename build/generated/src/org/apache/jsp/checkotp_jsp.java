package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkotp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("<style>\n");
      out.write("\n");
      out.write("body{margin-top:20px;} \n");
      out.write(".container{\n");
      out.write("    width:50%;\n");
      out.write("    height:100%;\n");
      out.write("    margin-top:80px;\n");
      out.write("}\n");
      out.write(".credit-card{ background-color: #f4f4f4;\n");
      out.write("             height: 100%; width: 100%;\n");
      out.write("             display: flex; flex-direction: column;\n");
      out.write("             justify-content: center; align-items: center;\n");
      out.write("}\n");
      out.write(".card-holder { margin: 2em 0; }\n");
      out.write(".img-box { padding-top: 20px; display: flex; justify-content: center; } \n");
      out.write(".card-box { font-weight: 800; padding: 1em 1em; border-radius: 0.25em; box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2); } \n");
      out.write(".bg-news { background: -webkit-linear-gradient(70deg, #f54d70 40%, #ffffff 40%);\n");
      out.write("          background: -o-linear-gradient(70deg, #f54d70 40%, #ffffff 40%);\n");
      out.write("          background: -moz-linear-gradient(70deg, #f54d70 40%, #ffffff 40%); \n");
      out.write("          background: linear-gradient(70deg, #f54d70 40%, #ffffff 40%); } \n");
      out.write(".btn-primary{ background-image: -webkit-linear-gradient(315deg, #f54d70 0%, #fd8965 100%);\n");
      out.write("             background-image: -moz- oldlinear-gradient(315deg, #f54d70 0%, #fd8965 100%);\n");
      out.write("             background-image: -o-linear-gradient(315deg, #f54d70 0%, #fd8965 100%); \n");
      out.write("             background-image: linear-gradient(135deg, #f54d70 0%, #fd8965 100%); \n");
      out.write("             -webkit-filter: hue-rotate(0deg); filter: hue-rotate(0deg); \n");
      out.write("             border: none !important; } \n");
      out.write(".credit-card form{ \tbackground-color: #ffffff; \t\n");
      out.write("                   padding: 0; \tmax-width: 600px; \t\n");
      out.write("                   margin: auto; } \n");
      out.write(".credit-card .title{ \tfont-family: 'Abhaya Libre', serif; \n");
      out.write("        font-size: 30px; \tcolor: #2C3E50; \t\n");
      out.write("        border-bottom: 1px solid rgba(0,0,0,0.1); \n");
      out.write("        margin-bottom: 0.8em; \tfont-weight: 600; \n");
      out.write("        padding-bottom: 8px; }\n");
      out.write(".credit-card .card-details{ \tpadding: 25px 25px 15px;             border:2px solid black;\n");
      out.write(" } \n");
      out.write(".inner-addon { position: relative; } \n");
      out.write(".inner-addon .fas, .inner-addon .far { position: absolute; padding: 10px; pointer-events: none; \n");
      out.write("      color: #bcbdbd !important; }\n");
      out.write(".right-addon .fas, .right-addon .far { right: 0px; top: 40px;} \n");
      out.write(".right-addon input { padding-right: 30px; } \n");
      out.write(".credit-card .card-details label{ \tfont-family: 'Abhaya Libre', serif; \n");
      out.write("                     font-size: 20px; \tfont-weight: 400; \t\n");
      out.write("                     margin-bottom: 15px; \tcolor: black; \t\n");
      out.write("                     text-transform: uppercase; }\n");
      out.write(".credit-card .card-details input[type=\"text\"] { font-family: \"Poppins\", sans-serif; \n");
      out.write("                                                 font-size: 16px; \tfont-weight: 500; \n");
      out.write("                                                 padding: 10px 10px 10px 5px; \t-webkit-appearance: none; \n");
      out.write("                                                 display: block; \tbackground: #fafafa; \tcolor: #636363;\n");
      out.write("                                                 border: none; \tborder-radius: 0; \t\n");
      out.write("                                                 border: 1px solid #757575;\t } \n");
      out.write(".credit-card .card-details input[type=\"text\"]:focus { outline: none; } \n");
      out.write(".credit-card .card-details input[type=\"password\"] { \tfont-family: \"Poppins\", sans-serif; \n");
      out.write("                                                 font-size: 16px; \tfont-weight: 500; \n");
      out.write("                                                 padding: 10px 10px 10px 5px; \t-webkit-appearance: none; \n");
      out.write("                                                 display: block; \tbackground: #fafafa; \tcolor: #636363;\n");
      out.write("                                                 border: none; \tborder-radius: 0; \t\n");
      out.write("                                                 border: 1px solid #757575;\t } \n");
      out.write(".credit-card .card-details input[type=\"password\"]:focus { outline: none; } \n");
      out.write(".credit-card .card-details button{ \tmargin-top: 0.6em; \tpadding:12px 0; \n");
      out.write("                      font-weight: 600; }\n");
      out.write(".credit-card .date-separator{ \tmargin-left: 10px; margin-right: 10px; margin-top: 5px; }\n");
      out.write("@media (max-width: 768px) { \t.credit-card{ \t height: 250vh; \t width: 100%; \t} \t\n");
      out.write("                             .credit-card .title { \t\tfont-size: 1.2em; \t} \t\n");
      out.write("                             .credit-card .row .col-lg-6 { \t\tmargin-bottom: 40px; \t} \t\n");
      out.write("                             .credit-card .card-details { \tpadding: 40px 40px 30px; } \t\n");
      out.write("                             .credit-card .card-details button { \tmargin-top: 2em; } }\n");
      out.write(".container1{\n");
      out.write("  text-align: center;\n");
      out.write("  \n");
      out.write("}\n");
      out.write(".btn{\n");
      out.write("  border: 1px solid black;\n");
      out.write("  background:#f54d70;\n");
      out.write("  padding: 10px 20px;\n");
      out.write("  font-size: 15px;\n");
      out.write("  font-family: \"montserrat\";\n");
      out.write("  margin: 10px;\n");
      out.write("  transition: 0.8s;\n");
      out.write("  position: relative;\n");
      out.write("  overflow: hidden;\n");
      out.write("  color: #fff;\n");
      out.write("}\n");
      out.write(".btn:hover{\n");
      out.write("     background:#fff; \n");
      out.write("  color: #f54d70;\n");
      out.write("}\n");
      out.write("#Message{color:red ; \n");
      out.write("       font-size:15px ; }\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("    function check()\n");
      out.write("    {                                \n");
      out.write("               var x=document.f.otp1.value;\n");
      out.write("               var x1=document.f.otp.value;\n");
      out.write("                if(x==\"\")\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"Message\").innerHTML=\"Field cannot be empty\" ;\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(x1!=x)\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"Message\").innerHTML=\"OTP DONOT MATCH TRY AGAIN\" ;\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {                  \n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("               \n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\t\t \t\t\n");
      out.write("<section class=\"credit-card\"> \t\t \n");
      out.write("<div class=\"container\"> \t\t \t\t\t\t\t\t\t\n");
      out.write("<div class=\"col-lg-6\"> \t\t\t\t \t\t\t\t\n");
      out.write("<form action=\"addorder.jsp\" name=\"f\" method=\"POST\" onsubmit=\"return check()\" >\n");
      out.write("    ");

        int p=(Integer)session.getAttribute("otp");                     
    
      out.write("\n");
      out.write("    \n");
      out.write("   <input type=\"hidden\" name=\"otp\" value=\"");
      out.print(p);
      out.write("\">\n");
      out.write("<div class=\"card-details\"> \t\n");
      out.write("<h1 class=\"title\">OTP Verificaton</h1> \t\t\t\t\t\n");
      out.write("<div class=\"row\"> \t\t\t\t\t\n");
      out.write("<div class=\"form-group col-sm-7\"> \t\t\t\t\t \n");
      out.write("<div class=\"inner-addon right-addon\"> \t\t\t\t\t\t\n");
      out.write("    <label for=\"card-holder\">Enter OTP</label>\n");
      out.write("<br><input type=\"password\" name=\"otp1\" class=\"form-control\" placeholder=\"Enter the 4-Digit Code\" aria-label=\"Card Holder\" aria-describedby=\"basic-addon1\"> \t\t\t\t\t\t                                           \t\t\t\t\t \n");
      out.write("<span id=\"Message\"></span>\n");
      out.write("</div>\t \t\t\t\t\t\n");
      out.write("</div> \t\t\t\t                                    \n");
      out.write("</div> \t  \t\t\t\t\t \n");
      out.write("<div class=\"form-group col-sm-12\"> <br>\t\t\t\t\t\t\n");
      out.write("<div class=\"container1\"><input type=\"submit\" class =\"btn\" value=\"SUBMIT\"/></div>\n");
      out.write("</form>\t</div> \t\t\t\t\t\n");
      out.write("</div> \t\t\t\t\n");
      out.write(" </div>\n");
      out.write("</div> \t\t\t            \t\t \t\t\t\t \t\t\t\t\t\t\t\t\n");
      out.write("</section>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
