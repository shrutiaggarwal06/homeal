package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class verificationupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("               \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          ");
 
            String tf, mealb="",meall="",meald="",mealdb="",mealdl="",mealdd="",ka,ac,mealpb,mealpl,mealpd;
            ac=request.getParameter("ac");
            tf=request.getParameter("tf");
            mealb=request.getParameter("mealb");
            meall=request.getParameter("meall");
            meald=request.getParameter("meald");
            mealdb=request.getParameter("mealdb");
            mealdl=request.getParameter("mealdl");
            mealdd=request.getParameter("mealdd");
            ka=request.getParameter("ka");
            mealpb=request.getParameter("mealpb");
            mealpl=request.getParameter("mealpl");
            mealpd=request.getParameter("mealpd");
            String ph =(String)session.getAttribute("ph");
            String em1=(String)session.getAttribute("em1");                        
            String fn=(String)session.getAttribute("fn1");                                                                 
            String sa=(String)session.getAttribute("sa1");                        
            String dt=(String)session.getAttribute("dt1");
            String pass=(String)session.getAttribute("pas");
            String sq=(String)session.getAttribute("sq1");
            String g=(String)session.getAttribute("g1");
            int uid=(Integer)session.getAttribute("uid");
            int meid=0;
            out.print(meald);
            out.print(ph);
           try
            {
                 ResultSet rs=null,rs2=null,rs1=null;
             Class.forName("org.apache.derby.jdbc.ClientDriver");
             Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
              PreparedStatement ps= cn.prepareStatement("select max(MEALID) from meals");
                 rs=ps.executeQuery();               
                if(rs.next())
                {
                        if(rs.getInt(1)!=0)
                    {
                         meid=rs.getInt(1)+1;
                    }
                }
              ps= cn.prepareStatement("insert into TIFFIN_PROVIDER values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
                       ps.setString(1, fn);
                       ps.setInt(2,uid);
                       ps.setString(3, em1); 
                       ps.setString(4, pass);
                       ps.setString(5,ph);
                       ps.setString(6, sq);
                       ps.setString(7, g);
                       ps.setString(8, dt);
                       ps.setString(9, ka);
                       ps.setString(10, ac);
                       ps.setString(11, tf);
                       ps.setString(12, sa);
                       ps.setString(13, "1");
                       ps.executeUpdate();
                      out.print("registered");
             if(mealb.equals("breakfast"))
             {
                 ps= cn.prepareStatement("insert into MEALS values(?,?,?,?,?,?)");               
                ps.setString(1, mealb);
                ps.setString(2, mealpb);
                ps.setString(3, mealdb);
                ps.setString(4, tf);
                ps.setInt(5, uid);
                ps.setInt(6,meid);                
                ps.executeUpdate();
             }
             if(meall.equals("lunch"))
             {
               meid=meid+1;
                 ps= cn.prepareStatement("insert into MEALS values(?,?,?,?,?,?)");               
                ps.setString(1, meall);
                ps.setString(2, mealpl);
                ps.setString(3, mealdl);
                ps.setString(4, tf);
                ps.setInt(5, uid);
                ps.setInt(6,meid); 
                ps.executeUpdate();
                out.print(meall);
             }
             if(meald.equals("dinner"))
             {
                meid=meid+1;
                 ps= cn.prepareStatement("insert into meals values(?,?,?,?,?,?)");               
                ps.setString(1, meald);
                ps.setString(2, mealpd);
                ps.setString(3, mealdd);
                ps.setString(4, tf);
                ps.setInt(5, uid);
                ps.setInt(6,meid); 
                ps.executeUpdate(); 
             }                       
             response.sendRedirect("http://localhost:8080/tiffin/confirmed.jsp");
            }
            catch(Exception ex)
            {
              
            }
        
      out.write("\n");
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
