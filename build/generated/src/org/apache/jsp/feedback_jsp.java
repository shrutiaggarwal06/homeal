package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>Feedback</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"feedbackcss/style.css\">\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Quicksand&display=swap\" rel=\"stylesheet\">\n");
      out.write("\t\n");
      out.write("       <meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0\">\n");
      out.write("       <style>\n");
      out.write("          .im1{\n");
      out.write("    height:100px;\n");
      out.write("width:200px;\n");
      out.write("float:right;\n");
      out.write("margin-right:2%;\n");
      out.write("}\n");
      out.write(" \n");
      out.write("       #menu{\n");
      out.write("float:right;\n");
      out.write("margin-right:0px;\n");
      out.write("}\n");
      out.write("#menu ul\n");
      out.write("{\n");
      out.write("list-style : none ;\n");
      out.write("margin: 0;\n");
      out.write("}\n");
      out.write("#menu ul li\n");
      out.write("{\n");
      out.write("font-size : 20px ;\n");
      out.write("width : 150px ;\n");
      out.write("height : 60px ;\n");
      out.write("text-align : center ;\n");
      out.write("line-height : 60px ;\n");
      out.write("float : left ;\n");
      out.write("position : relative ;\n");
      out.write("}\n");
      out.write("#menu ul li a\n");
      out.write("{\n");
      out.write("text-decoration : none ;\n");
      out.write("color : white ;\n");
      out.write("display : block ;\n");
      out.write("line-height:100px;\n");
      out.write("}\n");
      out.write("#menu ul ul li a{\n");
      out.write("    width:100%;\n");
      out.write("    height:100%;\n");
      out.write("    background-color:rgba(0,0,0,0.3);\n");
      out.write("    line-height: 60px;\n");
      out.write("}\n");
      out.write("#menu ul ul\n");
      out.write("{\n");
      out.write("    margin-top:1px;\n");
      out.write("position : relative ;\n");
      out.write("display : none ;\n");
      out.write("}\n");
      out.write("#menu ul li:hover > ul\n");
      out.write("{\n");
      out.write("display : block ;\n");
      out.write("background-color:#27ae60;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".d4{\n");
      out.write("height:100px;\n");
      out.write("border:1px solid black;\n");
      out.write("box-shadow:12px;\n");
      out.write("border-radius:4px;\n");
      out.write("margin:0px auto;\n");
      out.write("background-color:#00999c;\n");
      out.write("background-attachment:fixed;\n");
      out.write("}\n");
      out.write(".btn{\n");
      out.write("\twidth: 100%;\n");
      out.write("\tpadding: 0.5rem 1rem;\n");
      out.write("\tbackground-color: #00999c;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-size: 1.1rem;\n");
      out.write("\tborder: none;\n");
      out.write("\toutline: none;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\ttransition: .3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn:hover{\n");
      out.write("    background-color: #00999c;\n");
      out.write("}\n");
      out.write("h2{\n");
      out.write("\tposition: relative;\n");
      out.write("\tpadding: 0 0 10px;\n");
      out.write("\tmargin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2:after{\n");
      out.write("\tcontent: '';\n");
      out.write("    position: absolute;\n");
      out.write("    left: 50%;\n");
      out.write("    bottom: 0;\n");
      out.write("    transform: translateX(-50%);\n");
      out.write("    height: 4px;\n");
      out.write("    width: 50px;\n");
      out.write("    border-radius: 2px;\n");
      out.write("    background-color: #00999c;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");

                                String a="";
                                String b="";
                                if(session.getAttribute("cid")!=null)
                                {
                                        a="customerprofile.jsp";
                                        b="Profile";
                                        
                                  
                                 }
                                  else
                                 {
                                   a="login.jsp";
                                   b="Login";
                                 }                                
            String cu="";
            if(request.getParameter("c")!=null)
            {                                   
               if(request.getParameter("c").equals("yes"))
                {
                    cu="THANK YOU FOR YOUR FEEDBACK ! YOUR FEEDBACK MATTERS US A LOT!";
                }
            }
              

      out.write("                   \n");
      out.write(" \n");
      out.write("    <div>\n");
      out.write("        <div class=\"d4\">\n");
      out.write("   <div id = \"menu\">\n");
      out.write("<ul>\n");
      out.write("    <li> <a href=\"index.html\"><img class = \"im1\" src=\"images/logo.png\" style=\"line-height:0px;\"></a></li>\n");
      out.write("<li><a href = \"index.jsp\"> Home&nbsp </a></li>\n");
      out.write("   \n");
      out.write("<li><a href = \"meals.jsp\"> Meals</a></li>\n");
      out.write("<li><a href = \"");
      out.print(a);
      out.write('"');
      out.write('>');
      out.print(b);
      out.write("</a></li>\n");
      out.write("<li><a href = \"About.jsp\">About &nbsp &nbsp</a></li>\n");
      out.write("<li><a href = \"feedback.jsp\">Feedback</a></li>\n");
      out.write("<li><a href = \"contactus.jsp\">Contact</a></li>\n");
      out.write("</ul>\n");
      out.write("   </div></div>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"Feedback\">\n");
      out.write("\t\t\t<div class=\"left\"></div>\n");
      out.write("\t\t\t<div class=\"right\">\n");
      out.write("                            <p class=\"text\"><font style=\"color:#00999c\"><b>");
      out.print(cu);
      out.write("</b></font></p>\n");
      out.write("\t\t\t\t<h2>Feedback</h2>\n");
      out.write("                                <form action=\"updatequery.jsp\" method=\"post\">\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"name\" class=\"field\" placeholder=\"Your Name\">\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"email\" class=\"field\" placeholder=\"Your Email\">\n");
      out.write("\t\t\t\t<input type=\"text\" name=\" phone\" class=\"field\" value=\"12345\" placeholder=\"Phone number\">\n");
      out.write("\t\t\t\t<textarea  name=\"msg\" placeholder=\"Message\" class=\"field\"></textarea>\n");
      out.write("                                <input type=\"hidden\" name=\"type\" value=\"feedback\">\n");
      out.write("\t\t\t\t<button class=\"btn\">Send</button>\n");
      out.write("                                </form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("        </div>\n");
      out.write("\t</div>\n");
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
