package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class lunch_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\n");
      out.write("    <title>Breakfast</title>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400\" rel=\"stylesheet\" />    \n");
      out.write("\t<link href=\"css1/templatemo-style.css\" rel=\"stylesheet\" />\n");
      out.write("      \n");
      out.write("         \n");
      out.write("         <style>\n");
      out.write("             #menu{\n");
      out.write("float:right;\n");
      out.write("margin-right:30px;\n");
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
      out.write("font-family: 'Allura', cursive;\n");
      out.write("}\n");
      out.write("#menu ul li a\n");
      out.write("{\n");
      out.write("text-decoration : none ;\n");
      out.write("color : white ;\n");
      out.write("display : block ;\n");
      out.write("line-height:100px;\n");
      out.write("font-family: 'Allura', cursive;\n");
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
      out.write("background-color:red;\n");
      out.write("}\n");
      out.write(".im1{\n");
      out.write("    height:100px;\n");
      out.write("width:200px;\n");
      out.write("float:right;\n");
      out.write("}\n");
      out.write(".gfg{\n");
      out.write("    \n");
      out.write("    position:relative;\n");
      out.write("}\n");
      out.write(".first {\n");
      out.write("    position:absolute;\n");
      out.write("    bottom:20px;\n");
      out.write("    left:10px;\n");
      out.write("    font-size:20px;\n");
      out.write("    font-family:'Cursive';\n");
      out.write("    text-transform:uppercase;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<!--\n");
      out.write("\n");
      out.write("Simple House\n");
      out.write("\n");
      out.write("https://templatemo.com/tm-539-simple-house\n");
      out.write("\n");
      out.write("-->\n");
      out.write("<body> \n");
      out.write("    ");

                                String a="";
                                String b="";
                                if(session.getAttribute("cid")!=null)
                                {
                                        a="customerprofile.jsp";
                                        b="PROFILE";
                                        
                                  
                                 }
                                  else
                                 {
                                   a="login.jsp";
                                   b="Login";
                                 }    

      out.write("                   \n");
      out.write(" \n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t<!-- Top box -->\n");
      out.write("\t\t<!-- Logo & Site Name -->\n");
      out.write("\t\t<div class=\"placeholder\">\n");
      out.write("\t\t\t<div class=\"parallax-window\" data-parallax=\"scroll\" data-image-src=\"img/simple-house-01.jpg\">\n");
      out.write("                            <div id = \"menu\">\n");
      out.write("<ul>\n");
      out.write("    <li> <a href=\"index.html\"><img class = \"im1\" src=\"images/logo.png\" style=\"line-height:0px;\"></a></li>\n");
      out.write("<li><a href = \"index.jsp\"> Home&nbsp </a></li>\n");
      out.write("   \n");
      out.write("<li><a href = \"breakfast.jsp\"> Meals</a></li>\n");
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
      out.write("   </div>\n");
      out.write("<br><br><br>\n");
      out.write("<br><br>\n");
      out.write("<br> <br><br><br>\n");
      out.write("<center><h1 style=\"font-family: 'fantasy',Papyrus;text-shadow: 2px 2px 5px #FAFAD2;font-size:40;text-transform:capitalize;color:#FAFAD2\"><i>sirf pyaar se pet nhi bharta sahab,<br>\n");
      out.write("            breakfast lunch or dinner time se kiya karo</i>\n");
      out.write("</h1>\n");
      out.write("    </center>                         \n");
      out.write("    <div class=\"tm-header\">\n");
      out.write("\t\t\t\t\t<div class=\"row tm-header-inner\">\n");
      out.write("                                           \n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-6 col-12\">\n");
      out.write("\t\t\t\t\t\t<!--<img src=\"img/simple-house-logo.png\" alt=\"Logo\" class=\"tm-site-logo\" />-->\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("                                                <div class=\"tm-site-text-box\">\n");
      out.write("                                                    \n");
      out.write("\t\t\t\t\t\t\t\t<h1 class=\"tm-site-title\"></h1>\n");
      out.write("\t\t\t\t\t\t\t\t<h6 class=\"tm-site-description\"></h6>\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<nav class=\"col-md-6 col-12 tm-nav\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</nav>\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<main>\n");
      out.write("\t\t\t<header class=\"row tm-welcome-section\">\n");
      out.write("\t\t\t\t<h2 class=\"col-12 text-center tm-section-title\">Welcome To Our Food Menu</h2>\n");
      out.write("\t\t\t\t<p class=\"col-12 text-center\"> You Will Find Different Food Prepared With Love By Our Lovely Home Chef's.</p>\n");
      out.write("\t\t\t</header>\n");
      out.write("\t\t\t");
 int c=0;
      out.write("\n");
      out.write("\t\t\t<div class=\"tm-paging-links\">\n");
      out.write("\t\t\t\t<nav>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li class=\"tm-paging-item\"><a href=\"breakfast.jsp\" class=\"tm-paging-link \">Breakfast</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"tm-paging-item\"><a href=\"lunch.jsp\" class=\"tm-paging-link active\">Lunch</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"tm-paging-item\"><a href=\"dinner.jsp\" class=\"tm-paging-link\">Dinner</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Gallery -->\n");
      out.write("                        \n");
      out.write("                        <div class=\"row tm-gallery\">\n");
                                    
    String chef="",meal_type="lunch", id="",price="",det="";
                try
                {            
                 Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin"); 
                 PreparedStatement ps= cn.prepareStatement("select * from tiffin_provider where status=?");
                ps.setString(1,"1");
                 ResultSet rs=ps.executeQuery();
                  while(rs.next())
                  {
                      chef=rs.getString("kitchen_name");
                      id=rs.getString("tf_id");  
                     //out.print(id);
                     Connection cn1= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin"); 
                       PreparedStatement ps1= cn1.prepareStatement("select * from meals where tf_id=? and meal_typ=?");
                       ps1.setString(1,id);
                        ps1.setString(2,meal_type);
                       ResultSet rs1 = ps1.executeQuery();
                       if(rs1.next())
                       {
                      price=rs1.getString("m_price");
                      det=rs1.getString("M_DET");
                    //  out.print(price);
                     
                               
      out.write("  \n");
      out.write("                              \n");
      out.write("\t\t\t\t<div id=\"tm-gallery-page-pizza\" class=\"tm-gallery-page\">\n");
      out.write("\t\t\t\t\t<article class=\"col-lg-3 col-md-4 col-sm-6 col-12 tm-gallery-item\">\n");
      out.write("\t\t\t\t\t\t<figure>\n");
      out.write("                                                    <div class=\"gfg\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/breakfast.jpg\" alt=\"Image\" height=\"150\" width=\"250\"/>\n");
      out.write("                                                        <h3 class=\"first\">");
      out.print(chef);
      out.write("</h3>\n");
      out.write("                                                    </div>\n");
      out.write("\t\t\t\t\t\t\t<figcaption>\n");
      out.write("                                                               \n");
      out.write("                                                                <p style=\"font-family: 'Allura', cursive;font-size:30;text-transform:uppercase\">");
      out.print(meal_type);
      out.write("</p>\n");
      out.write("                                                                <p style=\"text-shadow: 2px 2px 5px #FAFAD2;font-family: 'Allura', cursive;font-size:30;font-weight:800;text-transform:uppercase;color:#2F956D\">");
      out.print(det);
      out.write(" </p>\n");
      out.write("\t\t\t\t\t\t\t\t<p style=\"font-family: 'Allura', cursive;font-size:30;text-transform:uppercase\">RS ");
      out.print(price);
      out.write(" </p>\n");
      out.write("                                                                <button class=\"tm-paging-link\" type='button' onclick=\"window.location.href='menu.jsp?tid=");
      out.print(id);
      out.write("'\">view</button>\n");
      out.write("\t\t\t\t\t\t\t</figcaption>\n");
      out.write("\t\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t\t</article>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div> <!-- gallery page 1 -->\n");
      out.write("\t\t\t\t");

                      
                       }
                  cn1.close();}
                                          cn.close();    }
                                catch(Exception ex)
                                        {}
      out.write("         \n");
      out.write("                                        <!-- gallery page 2 -->       <br>\n");
      out.write("                        </div> <br>                                        \n");
      out.write("\t\t\t<div class=\"tm-section tm-container-inner\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t<figure class=\"tm-description-figure\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/menu-image1.jpg\" alt=\"Image\" class=\"img-fluid\" />\n");
      out.write("\t\t\t\t\t\t</figure>\n");
      out.write("                                            <br>\n");
      out.write("                                        \n");
      out.write("                                        </div>\n");
      out.write("                                    <br><br>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"tm-description-box\"> \n");
      out.write("                                                    <br>\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"tm-gallery-title\">Homeal</h4>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"tm-mb-45\">Here we will provide you with exciting food , mouth-watering dishes.that you will love to eat and enjoy.\n");
      out.write("                                                            for any <a href=\"contactus.jsp\">queries</a> or <a href=\"feedback.jsp\">feedback</a> you can contact us.\n");
      out.write("                                                            we will try to solve your every queries.Hope you like it.We will try our best to provide you with best quality and safe food.<span>HAPPY CUSTOMER HAPPY WE.</span></p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"About.jsp\" class=\"tm-btn tm-btn-default tm-right\">Read More</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("\t\t</main>\n");
      out.write("\n");
      out.write("\t\t<footer class=\"tm-footer text-center\">\n");
      out.write("                    <p>Copyright &copy; 2021 Homeal</p> \n");
      out.write("            \n");
      out.write("            \n");
      out.write("\t\t</footer>\n");
      out.write("\t</div>\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"js/parallax.min.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t\t\t// Handle click on paging links\n");
      out.write("\t\t\t$('.tm-paging-link').click(function(e){\n");
      out.write("\t\t\t\te.preventDefault();\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tvar page = $(this).text().toLowerCase();\n");
      out.write("\t\t\t\t$('.tm-gallery-page').addClass('hidden');\n");
      out.write("\t\t\t\t$('#tm-gallery-page-' + page).removeClass('hidden');\n");
      out.write("\t\t\t\t$('.tm-paging-link').removeClass('active');\n");
      out.write("\t\t\t\t$(this).addClass(\"active\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
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
