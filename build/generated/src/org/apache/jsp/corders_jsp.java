package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class corders_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table class=\"table\" style=\"height:260px;border:2px; border-collapse:collapse\">\n");
      out.write("                    <tr class=\"filters\">\n");
      out.write("                        <th>ORDER ID </th>                        \n");
      out.write("                         <th>EMAIL ID</th>\n");
      out.write("                        <th>ORDER DATE </th>\n");
      out.write("                        <th>PRICE</th>\n");
      out.write("                        <th>TIFFIN NAME</th>\n");
      out.write("                        <th>MEAL PLAN</th>\n");
      out.write("                        <th>DELIVERY ADDRESS </th>\n");
      out.write("                        <th> MOBILE NUMBER</th>\n");
      out.write("                        <th>MODE OF PAYMENT</th>\n");
      out.write("                        <th>TIME</th>                        \n");
      out.write("                    </tr>  \n");
      out.write("                    ");
 try
            {
                String cid=(String)session.getAttribute("cid");
                String meid="";
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                PreparedStatement ps= cn.prepareStatement("select * from orders where custid=?");  
                ps.setString(1, cid);
                ResultSet rs=ps.executeQuery();
                while(rs.next()) 
                {
                    meid=rs.getString("mealid");
                  PreparedStatement  ps1= cn.prepareStatement("select * from meals where mealid=?");  
                ps1.setString(1, meid);
                ResultSet rs1=ps1.executeQuery();   
                if(rs1.next())
                {                                   
               
      out.write(" <tr>\n");
      out.write("                         <td> ");
      out.print(rs.getString("ORDERID"));
      out.write(" </td>                        \n");
      out.write("                         <td> ");
      out.print(rs.getString("EMAIL"));
      out.write(" </td>\n");
      out.write("                         <td> ");
      out.print(rs.getString("DATE"));
      out.write(" </td>\n");
      out.write("                         <td> ");
      out.print(rs1.getInt("m_price"));
      out.write(" </td>\n");
      out.write("                         <td> ");
      out.print(rs1.getString("t_pro"));
      out.write(" </td>\n");
      out.write("                         <td>");
      out.print(rs1.getString("meal_typ"));
      out.write("</td>     \n");
      out.write("                         <td> ");
      out.print(rs.getString("addr"));
      out.write(" </td>      \n");
      out.write("                         <td>");
      out.print(rs.getString("mob"));
      out.write("</td>\n");
      out.write("                         <td>");
      out.print(rs.getString("mode"));
      out.write("</td>\n");
      out.write("                         <td>");
      out.print(rs.getString("time"));
      out.write("</td>                                                 \n");
      out.write("                    </tr>");

                }
                }
                }
                catch(Exception ex)
                {}
                    
      out.write("                                   \n");
      out.write("            </table>\n");
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
