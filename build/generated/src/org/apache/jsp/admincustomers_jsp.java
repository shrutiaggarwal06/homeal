package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class admincustomers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("          \n");
      out.write("          <style>\n");
      out.write("              table , th, td{\n");
      out.write("                  border:2px solid black;\n");
      out.write("              }\n");
      out.write("          </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>       \n");
      out.write("     ");
                           
         try
            {                
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                PreparedStatement ps= cn.prepareStatement("select * from customer where usr_typ=?");
                ps.setString(1,"CUST");
                ResultSet rs=ps.executeQuery();             
                    
      out.write("\n");
      out.write("                     <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>NAME</th>   \n");
      out.write("                        <th>CUSTOMER ID</th>\n");
      out.write("                         <th>EMAIL ID</th>\n");
      out.write("                        <th>GENDER</th>\n");
      out.write("                        <th>DATE OF BIRTH</th>\n");
      out.write("                        <th>MOBILE</th>                                      \n");
      out.write("                    </tr>  ");
                         
                while(rs.next()) 
                {                    
                        
               
      out.write(" <tr>                            \n");
      out.write("                         <td> ");
      out.print(rs.getString("NAME"));
      out.write(" </td> \n");
      out.write("                         <td> ");
      out.print(rs.getString("CUSTID"));
      out.write(" </td>  \n");
      out.write("                         <td> ");
      out.print(rs.getString("EMAILID"));
      out.write(" </td>\n");
      out.write("                         <td> ");
      out.print(rs.getString("GENDER"));
      out.write(" </td>\n");
      out.write("                         <td>");
      out.print(rs.getString("DOB"));
      out.write(" </td>\n");
      out.write("                         <td>");
      out.print(rs.getString("MOB"));
      out.write(" </td>                                                                  \n");
      out.write("                    </tr>");
                
                }         
               cn.close();
            }                    
                catch(Exception ex)
                {
                    out.print(ex);
                }
                    
      out.write("                                   \n");
      out.write("            </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
