package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class paymentd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("      \n");
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
      out.write("             justify-content: center; align-items: center; }\n");
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
      out.write(".credit-card .card-details{ \tpadding: 25px 25px 15px; } \n");
      out.write(".inner-addon { position: relative; } \n");
      out.write(".inner-addon .fas, .inner-addon .far { position: absolute; padding: 10px; pointer-events: none; \n");
      out.write("      color: #bcbdbd !important; }\n");
      out.write(".right-addon .fas, .right-addon .far { right: 0px; top: 40px;} \n");
      out.write(".right-addon input { padding-right: 30px; } \n");
      out.write(".credit-card .card-details label{ \tfont-family: 'Abhaya Libre', serif; \n");
      out.write("                     font-size: 20px; \tfont-weight: 400; \t\n");
      out.write("                     margin-bottom: 15px; \tcolor: black; \t\n");
      out.write("                     text-transform: uppercase; }\n");
      out.write(".credit-card .card-details input[type=\"text\"] { \tfont-family: \"Poppins\", sans-serif; \n");
      out.write("                                                 font-size: 16px; \tfont-weight: 500; \n");
      out.write("                                                 padding: 10px 10px 10px 5px; \t-webkit-appearance: none; \n");
      out.write("                                                 display: block; \tbackground: #fafafa; \tcolor: #636363;\n");
      out.write("                                                 border: none; \tborder-radius: 0; \t\n");
      out.write("                                                 border: 1px solid #757575;\t } \n");
      out.write(".credit-card .card-details input[type=\"text\"]:focus { outline: none; } \n");
      out.write(".credit-card .card-details button{ \tmargin-top: 0.6em; \tpadding:12px 0; \n");
      out.write("                      font-weight: 600; }\n");
      out.write(".credit-card .date-separator{ \tmargin-left: 10px; margin-right: 10px; margin-top: 5px; }\n");
      out.write("@media (max-width: 768px) { \t.credit-card{ \t height: 250vh; \t width: 100%; \t} \t\n");
      out.write("                             .credit-card .title { \t\tfont-size: 1.2em; \t} \t\n");
      out.write("                             .credit-card .row .col-lg-6 { \t\tmargin-bottom: 40px; \t} \t\n");
      out.write("                             .credit-card .card-details { \tpadding: 40px 40px 30px; } \t\n");
      out.write("                             .credit-card .card-details button { \tmargin-top: 2em; } }\n");
      out.write(".container1{\n");
      out.write("  text-align: center;  \n");
      out.write("}\n");
      out.write(".btn{\n");
      out.write("  border: 1px solid #f54d70;\n");
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
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\t\t\n");
      out.write("      \n");
      out.write("<section class=\"credit-card\"> \t\t \n");
      out.write("<div class=\"container\"> \t\t \t\t\t\n");
      out.write("<div class=\"card-holder\"> \t\t\t\n");
      out.write("<div class=\"card-box bg-news\"> \t\t\n");
      out.write("<div class=\"row\"> \t\t\t\t\n");
      out.write("<div class=\"col-lg-6\"> \t\t\t\t                        \t\t\t\t                         \t\t\t\t                       \t\t\n");
      out.write("</div> \t\t\t\t\n");
      out.write("<div class=\"col-lg-6\"> \t\t\t\t \t\t\t\t\n");
      out.write("<form action=\"\" method=\"POST\">                            \n");
      out.write("<div class=\"card-details\"> \t\t\t\t\t\n");
      out.write("<h1 class=\"title\">PAYMENT MODE</h1> \t\t                                \n");
      out.write("<div class=\"row\"> \t\t\t\t\t\n");
      out.write("<div class=\"form-group col-sm-7\"> \t\t\t\t\t \n");
      out.write("<div class=\"inner-addon right-addon\"> \n");
      out.write("   <label for=\"card-number\">SAVED CARDS</label> <i class=\"far fa-credit-card\"></i> \n");
      out.write("    ");

                      
                    String cno="";
                    String cid=(String)session.getAttribute("cid");
                    String pr="";
                    try
                    {
                         Class.forName("org.apache.derby.jdbc.ClientDriver");
                         Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                    PreparedStatement ps= cn.prepareStatement("select * from card where CUSTID=?");
                    ps.setString(1, cid); 
                      ResultSet rs=ps.executeQuery();
                      if(rs.next())
                      {
                           rs=ps.executeQuery();                     
                      while(rs.next())
                      {                       
                       cno=rs.getString("cardno");                      
                   
      out.write(" \n");
      out.write("                   <br><br>  <input type=\"radio\" id=\"roundtrip\" name=\"card\" value=\"");
      out.print(cno);
      out.write('"');
      out.write('>');
      out.print(cno);
      out.write('\n');

     }  
                      
      out.write("   <input type=\"submit\" class =\"btn\" value=\"Pay\" formaction=\"cardpayment.jsp?crdno=");
      out.print(cno);
      out.write("\"></div>");

                      }               
                      else
                      {
                          out.print("no saved cards");
                      }
                    cn.close();
                    }                          
                    catch(Exception ex)
                            {
                                out.print(ex);
                            }
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"total\">                    \n");
      out.write("                    <input type=\"submit\" class=\"btn btn-danger\" value=\"New Card\" formaction=\"cardpayment.jsp\">             \n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div></div></div> \t\t\t\t\n");
      out.write("</form>\n");
      out.write("</div> </div> </div> </div>\n");
      out.write("</div>\t\t\t\t\n");
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
