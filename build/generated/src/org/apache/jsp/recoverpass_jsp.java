package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class recoverpass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css\">\n");
      out.write("        <style>\n");
      out.write("        .select{\n");
      out.write("border: 2px solid;\n");
      out.write("  border-color: grey;\n");
      out.write("  width:395px;\n");
      out.write("}\n");
      out.write("            .inputWithIcon.inputIconBg i {\n");
      out.write("  background-color: #aaa;\n");
      out.write("  color: #fff;\n");
      out.write("  padding: 9px 4px;\n");
      out.write("  border-radius: 4px 0 0 4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".inputWithIcon.inputIconBg input[type=\"text\"]:focus + i {\n");
      out.write("  color: #fff;\n");
      out.write("  background-color: dodgerBlue;\n");
      out.write("}\n");
      out.write("input[type=\"text\"] {\n");
      out.write("  width: 100%;\n");
      out.write("  border: 2px solid #aaa;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  outline: none;\n");
      out.write("  padding: 8px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  transition: 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"text\"]:focus {\n");
      out.write("  border-color: dodgerBlue;\n");
      out.write("  box-shadow: 0 0 8px 0 dodgerBlue;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".inputWithIcon input[type=\"text\"] {\n");
      out.write("  padding-left: 40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".inputWithIcon {\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".inputWithIcon i {\n");
      out.write("  position: absolute;\n");
      out.write("  left: 0;\n");
      out.write("  top: 8px;\n");
      out.write("  padding: 9px 8px;\n");
      out.write("  color: #aaa;\n");
      out.write("  transition: 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".inputWithIcon input[type=\"text\"]:focus + i {\n");
      out.write("  color: dodgerBlue;\n");
      out.write("}\n");
      out.write(" .inputWithIcon.inputIconBg i {\n");
      out.write("  background-color: #aaa;\n");
      out.write("  color: #fff;\n");
      out.write("  padding: 9px 4px;\n");
      out.write("  border-radius: 4px 0 0 4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".inputWithIcon.inputIconBg input[type=\"password\"]:focus + i {\n");
      out.write("  color: #fff;\n");
      out.write("  background-color: dodgerBlue;\n");
      out.write("}\n");
      out.write("input[type=\"password\"] {\n");
      out.write("  width: 100%;\n");
      out.write("  border: 2px solid #aaa;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  outline: none;\n");
      out.write("  padding: 8px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  transition: 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"password\"]:focus {\n");
      out.write("  border-color: dodgerBlue;\n");
      out.write("  box-shadow: 0 0 8px 0 dodgerBlue;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".inputWithIcon input[type=\"password\"] {\n");
      out.write("  padding-left: 40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".inputWithIcon {\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".inputWithIcon i {\n");
      out.write("  position: absolute;\n");
      out.write("  left: 0;\n");
      out.write("  top: 8px;\n");
      out.write("  padding: 9px 8px;\n");
      out.write("  color: #aaa;\n");
      out.write("  transition: 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".inputWithIcon input[type=\"password\"]:focus + i {\n");
      out.write("  color: dodgerBlue;\n");
      out.write("}\n");
      out.write(".container{\n");
      out.write("  text-align: center;\n");
      out.write("  \n");
      out.write("}\n");
      out.write(".btn{\n");
      out.write("  border: 1px solid #3498db;\n");
      out.write("  background: #3498db;\n");
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
      out.write("  color: #3498db;\n");
      out.write("}\n");
      out.write(".frosted{\n");
      out.write("width:400px;\n");
      out.write("height:100%;\n");
      out.write("float:left;\n");
      out.write("margin-left:650px;}\n");
      out.write(".container{\n");
      out.write(" position: relative;\n");
      out.write("  text-align: center;\n");
      out.write("  color: white;}\n");
      out.write(".text{\n");
      out.write(" position: absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  left: 50%;\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    <script>\n");
      out.write("        function fn1(){\n");
      out.write("    \n");
      out.write("                var p = document.f1.npass.value;\n");
      out.write("        var pa = /^((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,100})+$/;\n");
      out.write("                   if(p==\"\")\n");
      out.write("               {\n");
      out.write("                   document.getElementById(\"ps\").innerHTML=\"Field cannot be empty\";\n");
      out.write("                   return false;\n");
      out.write("               }\n");
      out.write("                 else if((!pa.test(p)))\n");
      out.write("                 {\n");
      out.write("                     document.getElementById(\"ps\").innerHTML=\"*Invalid Password Format<br><br> Password must contain atleast <br>one uppercase letter<br>one lower case letter <br> one numeric digits <br>min limit is :4\" ;\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                     document.getElementById(\"ps\").innerHTML=\" \" ;        \n");
      out.write("                     return true;\n");
      out.write("                }    \n");
      out.write("            }\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
String e=(String)session.getAttribute("email");
        session.setAttribute("email", e);
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"container\"><img src=\"travelimages\\reset.jpg\" style=\"width:100%\" height=\"200\" >\n");
      out.write("            <div class=\"text\"><font style=\"font-size:50px\">RESET YOUR PASSWORD</font></div>    \n");
      out.write("        </div>\n");
      out.write("        <div class=\"frosted\">\n");
      out.write("        <form action=\"updatepass.jsp\" method=\"POST\" onsubmit=\"return fn1()\"><BR><BR>\n");
      out.write("            <font style=\"font-size:25px\">Phone Number</font>\n");
      out.write("            <div class=\"inputWithIcon inputIconBg\">\n");
      out.write("       <i class=\"fa fa-phone\" aria-hidden=\"true\"></i><input type=\"text\" placeholder=\"PHONE NUMBER\" name=\"phno\">\n");
      out.write("            </div>\n");
      out.write("                <font style=\"font-size:25px\">Security Question</font><br>\n");
      out.write("                <div class=\"select\" style=\"width:395px;\">\n");
      out.write("                <select  name=\"secq\" style=\"padding: 10px 20px;font-size: 17px;font-family: montserrat;\">\n");
      out.write("                     <option>SELECT</option>\n");
      out.write("                            <option value=\"q1\">what is your father's middle name?</option>\n");
      out.write("                            <option value=\"q2\">what was your first pets name?</option>\n");
      out.write("                            <option value=\"q3\">Where is your hometown?</option>\n");
      out.write("                            <option value=\"q4\">What is your common password?</option>\n");
      out.write("                </select></div><br>\n");
      out.write("            <font style=\"font-size:25px\">Security Answer</font>\n");
      out.write("        <div class=\"inputWithIcon inputIconBg\">\n");
      out.write("        <i class=\"fa fa-unlock-alt\" aria-hidden=\"true\"></i><input type=\"text\" name=\"seca\" placeholder=\"SECURITY ANSWER\">\n");
      out.write("        </div>\n");
      out.write("        <font style=\"font-size:25px\">New Password</font> \n");
      out.write("        <div class=\"inputWithIcon inputIconBg\">\n");
      out.write("       <i class=\"fa fa-key\" aria-hidden=\"true\"></i><input type=\"password\" name=\"npass\" placeholder=\"PASSWORD\" >\n");
      out.write("        </div>\n");
      out.write("<div class=\"container\"><input type=\"submit\" class =\"btn\" value=\"RESET PASSWORD\"></div>   \n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        </body>\n");
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
