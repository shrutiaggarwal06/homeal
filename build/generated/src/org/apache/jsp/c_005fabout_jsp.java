package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class c_005fabout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          \n");
      out.write("          <style>\n");
      out.write("          .frosted{\n");
      out.write("border-radius:1em;\n");
      out.write("width:600px;\n");
      out.write("height:530px;\n");
      out.write("background:inherit;\n");
      out.write("position:relative;\n");
      out.write("z-index:0;\n");
      out.write("overflow:hidden;\n");
      out.write("margin:0 auto;\n");
      out.write("padding:2rem;\n");
      out.write("box-sizing:border-box;\n");
      out.write("box-shadow:0 0.5em 1em rgba(0,0,0,0.8);\n");
      out.write("}\n");
      out.write(".frosted::before\n");
      out.write("{\n");
      out.write("content:\"\";\n");
      out.write("position:absolute;\n");
      out.write("z-index:-1;\n");
      out.write("top:0; right:0; bottom:0; left:0;\n");
      out.write("background:inherit;\n");
      out.write("box-shadow:inset 0 0 3000px rgba(255,255,255,0.8);\n");
      out.write("filter:blur(10px);\n");
      out.write("margin:-20px;\n");
      out.write("}\n");
      out.write("          </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
String cid="";
                    String fn="";                 
                    String g="";
                    String ph="";
                    String bh=""; 
                    String e="";
                    cid=(String)session.getAttribute("cid");
                     try
                    {
                         Class.forName("org.apache.derby.jdbc.ClientDriver");
                         Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                    PreparedStatement ps= cn.prepareStatement("select * from customer where CUSTID=?");
                    ps.setString(1, cid); 
                      ResultSet rs=ps.executeQuery();
                      if(rs.next())
                      {
                       g= rs.getString("GENDER");
                       fn=rs.getString("NAME");
                       ph= rs.getString("MOB");                      
                       bh=rs.getString("DOB");
                       e=rs.getString("EMAILID");                       
                    }                    
                      cn.close();
                    }                          
                    catch(Exception ex)
                            {
                                out.print(ex);
                            }
                    
                   
      out.write("\n");
      out.write("                   <div class=\"frosted\">\n");
      out.write("                        <h1 style=\"font-size:25px;font-family:Cursive,Brush Script MT;\">Personal Information</h1>\n");
      out.write("                   <hr style=\"border-color:white ; width:400px\" >\n");
      out.write("                <h1 style=\"font-size:25px;font-family:Cursive,Brush Script MT;-webkit-text-stroke: 2px black;\">&nbsp First Name : ");
      out.print(fn);
      out.write("</h1>               \n");
      out.write("                <h1 style=\"font-size:25px;font-family:Cursive,Brush Script MT;-webkit-text-stroke: 2px black;\">&nbsp Email id : ");
      out.print(e);
      out.write("</h1>               \n");
      out.write("                 <h1 style=\"font-size:25px;font-family:Cursive,Brush Script MT;-webkit-text-stroke: 2px black;\">&nbsp Birth-Date : ");
      out.print(bh);
      out.write("</h1>\n");
      out.write("                <h1 style=\"font-size:25px;font-family:Cursive,Brush Script MT;-webkit-text-stroke: 2px black;\">&nbsp Gender : ");
      out.print(g);
      out.write("</h1>              \n");
      out.write("                \n");
      out.write("                  <h1 style=\"font-size:25px;font-family:Cursive,Brush Script MT;-webkit-text-stroke: 2px black;\">&nbsp Phone Number : ");
      out.print(ph);
      out.write("</h1>\n");
      out.write("                  <br>\n");
      out.write("                   </div>\n");
      out.write("    </body>\n");
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
