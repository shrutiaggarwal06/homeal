package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("\n");
      out.write("    <title>Menu</title>\n");
      out.write("<!-- \n");
      out.write("\n");
      out.write("Timeless Template \n");
      out.write("\n");
      out.write("http://www.templatemo.com/tm-517-timeless\n");
      out.write("\n");
      out.write("-->\n");
      out.write("    <!-- load CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400\">\n");
      out.write("    <!-- Google web font \"Open Sans\" -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"menucss/bootstrap.min.css\">\n");
      out.write("    <!-- https://getbootstrap.com/ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"menucss/templatemo-style.css\">\n");
      out.write("    <!-- Templatemo style -->\n");
      out.write("    <style>\n");
      out.write("        .im1{\n");
      out.write("    height:100px;\n");
      out.write("width:200px;\n");
      out.write("float:right;\n");
      out.write("}\n");
      out.write("#menu{\n");
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
      out.write("background-color:red;\n");
      out.write("}\n");
      out.write(".d4{\n");
      out.write("height:100px;\n");
      out.write("border:1px solid black;\n");
      out.write("box-shadow:12px;\n");
      out.write("border-radius:4px;\n");
      out.write("margin:3px auto;\n");
      out.write("background-color:rgba(0,0,0,0.3);\n");
      out.write("background-attachment:fixed;\n");
      out.write("}\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
String id=(String)request.getParameter("tid"),chef="",name="",email="",mob="",add="";
String type="";
String price[]=new String[4];
String det[]=new String[4];
int i=0;
det[0]="chef is not providing the particular meal type";
det[1]="chef is not providing the particular meal type";
det[2]="chef is not providing the particular meal type";
                try
                {            
                 Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin"); 
                 PreparedStatement ps= cn.prepareStatement("select * from tiffin_provider where tf_id=?");
                ps.setString(1,id);
                 ResultSet rs=ps.executeQuery();
                   while(rs.next())
                  {
                      chef=rs.getString("kitchen_name");
                      name=rs.getString("name");
                      email=rs.getString("emailid");
                      mob=rs.getString("mob");
                      add=rs.getString("address");                                                      
                       PreparedStatement ps1= cn.prepareStatement("select * from meals where tf_id=?");
                       ps1.setString(1,id);
                       ResultSet rs1 = ps1.executeQuery();
                       while(rs1.next())
                       {                                                    
                           type=rs1.getString("meal_typ");
                           if(type.equals("breakfast"))
                           {
                           det[0]=rs1.getString("m_det");
                      price[0]=rs1.getString("m_price");
                           }
                           else if(type.equals("lunch"))
                           {
                           det[1]=rs1.getString("m_det");
                      price[1]=rs1.getString("m_price");
                           }
                             else  if(type.equals("dinner"))
                           {
                           det[2]=rs1.getString("m_det");
                      price[2]=rs1.getString("m_price");
                           }
                       }             
                  }
                                          cn.close();    
                }
                                catch(Exception ex)
                                        {}

      out.write("   \n");
      out.write("\n");

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

      out.write("                 \n");
      out.write("<div>\n");
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
      out.write("   </div></div> \n");
      out.write("        <br><br><br>     \n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <header class=\"text-center tm-site-header\">\n");
      out.write("                    <div class=\"tm-site-logo\"></div>\n");
      out.write("                    <h1 class=\"pl-4 tm-site-title\">HOMEAL</h1>\n");
      out.write("                </header>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <div class=\"tm-video-container\">\n");
      out.write("                    <img src=\"images/slider-image.jpg\" id=\"tm-welcome-video\" class=\"tm-welcome-video\">\n");
      out.write("                       \n");
      out.write("                        <div id=\"tm-video-text-overlay\" class=\"tm-video-text-overlay d-none\">\n");
      out.write("                            <h1>\n");
      out.write("                                <div id=\"rotate\" class=\"tm-video-text\">\n");
      out.write("                                    <div>This is timeless</div>\n");
      out.write("                                    <div>We are invincible</div>\n");
      out.write("                                    <div>Quite unbeatable</div>\n");
      out.write("                                    <div>and indestructible</div>\n");
      out.write("                                </div>\n");
      out.write("                            </h1>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container tm-container-2\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h2 class=\"tm-welcome-text\">WELCOME TO ");
      out.print(chef);
      out.write("</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row tm-section-mb\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    ");
 if(price[0]!=null)
                    {
      out.write("\n");
      out.write("                    <div class=\" tm-timeline-item\">\n");
      out.write("                        <div class=\"tm-timeline-item-inner\">\n");
      out.write("                            <img src=\"images/breakfast1.jpg\" alt=\"Image\" class=\"rounded-circle tm-img-timeline\">\n");
      out.write("                            <div class=\"tm-timeline-connector\">\n");
      out.write("                                <p class=\"mb-0\">&nbsp;</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"tm-timeline-description-wrap\">\n");
      out.write("                                <div class=\"tm-bg-dark tm-timeline-description\">\n");
      out.write("                                    <h3 class=\"tm-text-green tm-font-400\">BREAKFAST MENU</h3>\n");
      out.write("                                    <p style=\"font-family: 'Allura', cursive;font-size:40;text-transform:capitalize\">we are happy to provide you with best quality meal,something which will remind you of your ghar ka khana</p>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                                    <p style=\"color:#ecf5f5;font-size: 20px;font-family: 'Allura',cursive\">Meal Available From 7am.</p>\n");
      out.write("                                    <p style=\"color:#ecf5f5;font-size: 20px;font-family: 'Allura',cursive\">Meal Consists Of:");
      out.print(det[0]);
      out.write("</p>\n");
      out.write("                                    <p style=\"color:#ecf5f5;font-size: 20px;font-family: 'Allura',cursive\">Price:");
      out.print(price[0]);
      out.write("</p>\n");
      out.write("                                      <button type='button' onclick=\"window.location.href='booking.jsp'\">book</button>\n");
      out.write("                                    <p class=\"tm-text-green float-right mb-0\">");
      out.print(chef);
      out.write("</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"tm-timeline-connector-vertical\"></div>\n");
      out.write("                    </div>\n");
}
                     if(price[1]!=null)
                    {
      out.write("\n");
      out.write("                    <div class=\"tm-timeline-item\">\n");
      out.write("                        <div class=\"tm-timeline-item-inner\">\n");
      out.write("                            <img src=\"images/lunch.jfif\" alt=\"Image\" class=\"rounded-circle tm-img-timeline\">\n");
      out.write("                            <div class=\"tm-timeline-connector\">\n");
      out.write("                                <p class=\"mb-0\">&nbsp;</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"tm-timeline-description-wrap\">\n");
      out.write("                                <div class=\"tm-bg-dark-light tm-timeline-description\">\n");
      out.write("                                    <h3 class=\"tm-text-cyan tm-font-400\">LUNCH MENU</h3>\n");
      out.write("                                    <p style=\"color:#ecf5f5;font-size: 25px;font-weight: 900;font-family: 'Allura',cursive\">Available from 2pm</p>\n");
      out.write("                                     <p style=\"color:#ecf5f5;font-size: 25px;font-weight: 900;font-family: 'Allura',cursive\">meal consists of:");
      out.print(det[1]);
      out.write("</p>\n");
      out.write("                                    <p style=\"color:#ecf5f5;font-size: 25px;font-weight: 900;font-family: 'Allura',cursive\">price:");
      out.print(price[1]);
      out.write("</p>\n");
      out.write("                                     <button type='button' onclick=\"window.location.href='bookinng.jsp'\">book</button>\n");
      out.write("                                    <p class=\"tm-text-cyan float-right mb-0\">");
      out.print(chef);
      out.write("</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"tm-timeline-connector-vertical\"></div>\n");
      out.write("                    </div>\n");
}
                      if(price[2]!=null)
                    {
      out.write("\n");
      out.write("                    <div class=\"tm-timeline-item\">\n");
      out.write("                        <div class=\"tm-timeline-item-inner\">\n");
      out.write("                            <img src=\"img/img-03.jpg\" alt=\"Image\" class=\"rounded-circle tm-img-timeline\">\n");
      out.write("                            <div class=\"tm-timeline-connector\">\n");
      out.write("                                <p class=\"mb-0\">&nbsp;</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"tm-timeline-description-wrap\">\n");
      out.write("                                <div class=\"tm-bg-dark tm-timeline-description\">\n");
      out.write("                                    \n");
      out.write("                                    <h3 class=\"tm-text-yellow tm-font-400\">DINNER MENU</h3>\n");
      out.write("                                   \n");
      out.write("                                    <p style=\"color:#ecf5f5;font-size: 25px;font-weight: 900;font-family: 'Allura',cursive\">Available from 7pm</p>\n");
      out.write("                                     <p style=\"color:#ecf5f5;font-size: 25px;font-weight: 900;font-family: 'Allura',cursive\">Meal consists of:");
      out.print(det[2]);
      out.write("</p>\n");
      out.write("                                    <p style=\"color:#ecf5f5;font-size: 25px;font-weight: 900;font-family: 'Allura',cursive\">Price:");
      out.print(price[2]);
      out.write("</p>\n");
      out.write("                                      <button type='button' onclick=\"window.location.href='booking.jsp'\">book</button>\n");
      out.write("                                    <p class=\"tm-text-yellow float-right mb-0\">");
      out.print(chef);
      out.write("</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                      \n");
}
      out.write("\n");
      out.write("                   \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--  row -->\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"row tm-section-mb tm-section-mt\">\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-sm-12 pr-lg-5 mb-md-0 mb-4\">\n");
      out.write("                    <h3 class=\"mt-2 mb-3 tm-text-gray\">CONTACT THROUGH MAIL</h3>\n");
      out.write("                    <p>If you have any queries regarding  <br> anything\n");
      out.write("                        you can email us on the<br>email id given below,we will be <br> happy to help you.<br><u style=\"color:#ecf5f5;font-size: 20px;font-weight: 900;font-family: 'Allura',cursive\">");
      out.print(email);
      out.write("</u></p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-sm-12 pr-lg-5 mb-md-0 mb-4\">\n");
      out.write("                    <h3 class=\"mt-2 mb-3 tm-text-gray\"><b><u>CONTACT THROUGH PHONE</u></b></h3>\n");
      out.write("                    <p>For any feedback or any other specific change you can<br>call us and tell us about it.<br>we will pay attention to it<br><u style=\"color:#ecf5f5;font-size: 20px;font-weight: 900;font-family: 'Allura',cursive\">");
      out.print(mob);
      out.write("</u></p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-sm-12\">\n");
      out.write("                    <h3 class=\"mt-2 mb-3 tm-text-gray\">CHEF'S LOCATION</h3>\n");
      out.write("                    <p>If you want to visit us<br>and see how we work and for any <br> other thing you are free to come and meet us<br><u style=\"color:#ecf5f5;font-size: 20px;text-transform:capitalize;font-weight: 900;font-family: 'Allura',cursive\">");
      out.print(add);
      out.write("</u></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"row tm-section-mt\">\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <h3 class=\"mb-4 tm-text-gray\">Our Location</h3>\n");
      out.write("                    <!-- GOOGLE MAP -->\n");
      out.write("                    <div id=\"google-map\" class=\"text-center mb-5\">\n");
      out.write("                    <!-- How to change your own map point\n");
      out.write("                           1. Go to Google Maps\n");
      out.write("                           2. Click on your location point\n");
      out.write("                           3. Click \"Share\" and choose \"Embed map\" tab\n");
      out.write("                           4. Copy only URL and paste it within the src=\"\" field below\n");
      out.write("                       -->\n");
      out.write("                       <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3647.3030413476204!2d100.5641230193719!3d13.757206847615207!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xf51ce6427b7918fc!2sG+Tower!5e0!3m2!1sen!2sth!4v1510722015945\"\n");
      out.write("                       class=\"google-map-iframe\" width=\"500\" height=\"300\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>\n");
      out.write("                   </div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"col-lg-6 mb-5\">\n");
      out.write("                <h3 class=\"mb-4 tm-text-gray\">FEEDBACK FOR THE CHEF</h3>\n");
      out.write("                <form action=\"\" method=\"post\" class=\"tm-contact-form\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"form-group col-xl-6\">\n");
      out.write("                            <input type=\"text\" id=\"contact_name\" name=\"name\" class=\"form-control\" placeholder=\"Name...\" required/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-xl-6\">\n");
      out.write("                            <input type=\"email\" id=\"contact_email\" name=\"email\" class=\"form-control\" placeholder=\"Email...\" required/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <textarea id=\"contact_message\" name=\"message\" class=\"form-control\" rows=\"6\" placeholder=\"Your Feedback...\" required></textarea>\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn  tm-btn-send\">POST</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer class=\"row mt-5 mb-5\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <p class=\"text-center tm-text-gray tm-copyright-text mb-0\">Copyright &copy;\n");
      out.write("                    <span class=\"tm-current-year\">2021</span>HOMEAL\n");
      out.write("                    \n");
      out.write("                    | Design: <a href=\"http://templatemo.com/tm-517-timeless\" class=\"tm-text-white\">HOMEAL</a>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </div>\n");
      out.write("    <!-- .container -->\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <!-- <script src=\"js/jquery-3.2.1.slim.min.js\"></script> -->\n");
      out.write("    <script src=\"js/templatemo-script.js\"></script>\n");
      out.write("\n");
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
