package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>Payment</title>\n");
      out.write("    \n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\">\n");
      out.write("  <style>\n");
      out.write("      .payment-form{\n");
      out.write("\tpadding-bottom: 50px;\n");
      out.write("\tfont-family: 'Montserrat', sans-serif;\n");
      out.write("}\n");
      out.write(".payment-form.dark{\n");
      out.write("\tbackground-color: #f6f6f6;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".payment-form .content{\n");
      out.write("\tbox-shadow: 0px 2px 10px rgba(0, 0, 0, 0.075);\n");
      out.write("\tbackground-color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".payment-form .block-heading{\n");
      out.write("    padding-top: 50px;\n");
      out.write("    margin-bottom: 40px;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".payment-form .block-heading p{\n");
      out.write("\ttext-align: center;\n");
      out.write("\tmax-width: 420px;\n");
      out.write("\tmargin: auto;\n");
      out.write("\topacity:0.7;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".payment-form.dark .block-heading p{\n");
      out.write("\topacity:0.8;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".payment-form .block-heading h1,\n");
      out.write(".payment-form .block-heading h2,\n");
      out.write(".payment-form .block-heading h3 {\n");
      out.write("\tmargin-bottom:1.2rem;\n");
      out.write("\tcolor: #3b99e0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".payment-form form{\n");
      out.write("\tborder-top: 2px solid #5ea4f3;\n");
      out.write("\tbox-shadow: 0px 2px 10px rgba(0, 0, 0, 0.075);\n");
      out.write("\tbackground-color: #ffffff;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tmax-width: 600px;\n");
      out.write("\tmargin: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".payment-form .title{\n");
      out.write("\tfont-size: 1em;\n");
      out.write("\tborder-bottom: 1px solid rgba(0,0,0,0.1);\n");
      out.write("\tmargin-bottom: 0.8em;\n");
      out.write("\tfont-weight: 600;\n");
      out.write("\tpadding-bottom: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".payment-form .products{\n");
      out.write("\tbackground-color: #f7fbff;\n");
      out.write("    padding: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".payment-form .products .item{\n");
      out.write("\tmargin-bottom:1em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".payment-form .products .item-name{\n");
      out.write("\tfont-weight:600;\n");
      out.write("\tfont-size: 0.9em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".payment-form .products .item-description{\n");
      out.write("\tfont-size:15px;\t        \n");
      out.write("}\n");
      out.write("\n");
      out.write(".payment-form .products .item p{\n");
      out.write("\tmargin-bottom:0.2em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".payment-form .products .price{\n");
      out.write("\tfloat: right;\n");
      out.write("\tfont-weight: 600;\n");
      out.write("\tfont-size: 0.9em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".payment-form .products .total{\n");
      out.write("\tborder-top: 1px solid rgba(0, 0, 0, 0.1);\n");
      out.write("\tmargin-top: 10px;\n");
      out.write("\tpadding-top: 19px;\n");
      out.write("\tfont-weight: 600;\n");
      out.write("\tline-height: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".payment-form .card-details{\n");
      out.write("\tpadding: 25px 25px 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".payment-form .card-details label{\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\tfont-weight: 600;\n");
      out.write("\tmargin-bottom: 15px;\n");
      out.write("\tcolor: #79818a;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".payment-form .card-details button{\n");
      out.write("\tmargin-top: 0.6em;\n");
      out.write("\tpadding:12px 0;\n");
      out.write("\tfont-weight: 600;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".payment-form .date-separator{\n");
      out.write(" \tmargin-left: 10px;\n");
      out.write("    margin-right: 10px;\n");
      out.write("    margin-top: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media (min-width: 576px) {\n");
      out.write("\t.payment-form .title {\n");
      out.write("\t\tfont-size: 1.2em; \n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.payment-form .products {\n");
      out.write("\t\tpadding: 40px; \n");
      out.write("  \t}\n");
      out.write("\n");
      out.write("\t.payment-form .products .item-name {\n");
      out.write("\t\tfont-size: 1em; \n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.payment-form .products .price {\n");
      out.write("    \tfont-size: 1em; \n");
      out.write("\t}\n");
      out.write("\n");
      out.write("  \t.payment-form .card-details {\n");
      out.write("    \tpadding: 40px 40px 30px; \n");
      out.write("    }\n");
      out.write("\n");
      out.write("  \t.payment-form .card-details button {\n");
      out.write("    \tmargin-top: 2em; \n");
      out.write("    } \n");
      out.write("}\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <main class=\"page payment-page\">\n");
      out.write("    <section class=\"payment-form dark\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"block-heading\">\n");
      out.write("          <h2>Payment Description</h2>\n");
      out.write("          </div>\n");
      out.write("         <form name=\"f\" method=\"POST\">\n");
      out.write("             ");

                 String chefid=(String)session.getAttribute("chef_id");
                 String meal_type=request.getParameter("mtype");
                 String chef_name=request.getParameter("chefname");
                 String cust_name=request.getParameter("custname");
                 String det=request.getParameter("det");
                 String email=request.getParameter("email");
                 String phno =request.getParameter("phno");                
                 String nod=request.getParameter("days");       
                 String date=request.getParameter("date"); 
                 String mealid=request.getParameter("mealid"); 
                 String addr=request.getParameter("add");
                 String pincode=request.getParameter("pincode");
                 String price ="";          
                 
                           try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin"); 
                PreparedStatement ps= cn.prepareStatement("select * from meals where tf_id=? and meal_typ=?");
                       ps.setString(1,chefid);
                       ps.setString(2, meal_type);
                       ResultSet rs = ps.executeQuery();
                       while(rs.next())
                       {    
                            price=rs.getString("m_price");
                       }                                   
                 }
                 catch(Exception ex)
                 {
                     out.print(ex);
                 }
                 
                 int mprice= Integer.parseInt(price)*Integer.parseInt(nod);
                double scharge=(Integer.parseInt(price)*2)/100.00;
                int del=20;
                int delcharge=Integer.parseInt(nod)*del;
                double total=mprice+delcharge+(scharge*1.00);                              
                 session.setAttribute("mealtype",meal_type);
                session.setAttribute("chefname",chef_name);
                session.setAttribute("custname",cust_name);
                session.setAttribute("mealdet",det);
                session.setAttribute("email",email);
                session.setAttribute("phone",phno);
                session.setAttribute("days",nod);
                session.setAttribute("startdate",date);
                 session.setAttribute("price",total);
                 session.setAttribute("mealid", mealid);
                 session.setAttribute("pincode",pincode);
                 session.setAttribute("addr", addr);
               
             
      out.write("\n");
      out.write("          <div class=\"products\">\n");
      out.write("            <h3 class=\"title\">Description</h3>\n");
      out.write("            <div class=\"item\">\n");
      out.write("              <span class=\"price\"> ");
      out.print(chef_name);
      out.write("</span>\n");
      out.write("              <p class=\"item-name\">Chef Name</p>             \n");
      out.write("            </div>\n");
      out.write("              <div class=\"item\">\n");
      out.write("              <span class=\"price\"> ");
      out.print(meal_type);
      out.write("</span>\n");
      out.write("              <p class=\"item-name\">Meal Type</p>             \n");
      out.write("            </div>\n");
      out.write("              <div class=\"item\">\n");
      out.write("              <span class=\"price\"> ");
      out.print(det);
      out.write("</span>\n");
      out.write("              <p class=\"item-name\">Meal Contains</p>             \n");
      out.write("            </div>\n");
      out.write("              <div class=\"item\">\n");
      out.write("              <span class=\"price\"> ");
      out.print(cust_name);
      out.write("</span>\n");
      out.write("              <p class=\"item-name\">Name</p>             \n");
      out.write("            </div>   \n");
      out.write("              <div class=\"item\">\n");
      out.write("              <span class=\"price\"> ");
      out.print(email);
      out.write("</span>\n");
      out.write("              <p class=\"item-name\">Email</p>             \n");
      out.write("            </div> \n");
      out.write("              <div class=\"item\">\n");
      out.write("              <span class=\"price\"> ");
      out.print(phno);
      out.write("</span>\n");
      out.write("              <p class=\"item-name\">Phone Number</p>             \n");
      out.write("            </div> \n");
      out.write("              <div class=\"item\">\n");
      out.write("              <span class=\"price\"> ");
      out.print(date);
      out.write("</span>\n");
      out.write("              <p class=\"item-name\">Start From</p>             \n");
      out.write("            </div> \n");
      out.write("              <div class=\"item\">\n");
      out.write("              <span class=\"price\"> ");
      out.print(nod);
      out.write("</span>\n");
      out.write("              <p class=\"item-name\"> Number Of Days</p>             \n");
      out.write("            </div> \n");
      out.write("               <div class=\"item\">\n");
      out.write("              <span class=\"price\"> ");
      out.print(addr);
      out.write(',');
      out.print(pincode);
      out.write("</span>\n");
      out.write("              <p class=\"item-name\">Delivery Address</p>             \n");
      out.write("            </div>   \n");
      out.write("           <div class=\"item\">\n");
      out.write("              <span class=\"price\">Rs ");
      out.print(mprice);
      out.write("</span>\n");
      out.write("              <p class=\"item-name\">Meal Price</p>\n");
      out.write("              <p class=\"item-description\">");
      out.print(price);
      out.write('*');
      out.print(nod);
      out.write("</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("              <span class=\"price\">Rs ");
      out.print(scharge);
      out.write("</span>\n");
      out.write("              <p class=\"item-name\">Service charges</p>\n");
      out.write("              <p class=\"item-description\">2% *");
      out.print(price);
      out.write("</p>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"item\">\n");
      out.write("              <span class=\"price\">Rs ");
      out.print(delcharge);
      out.write("</span>\n");
      out.write("              <p class=\"item-name\">Delivery Charges</p>\n");
      out.write("              <p class=\"item-description\">");
      out.print(del);
      out.write('*');
      out.print(nod);
      out.write("</p>\n");
      out.write("            </div>                    \n");
      out.write("            <div class=\"total\">Net Amount<span class=\"price\">Rs ");
      out.print(total);
      out.write("</span></div>                                   \n");
      out.write("              <div class=\"form-group col-sm-12\">\n");
      out.write("                  <div class=\"total\">                    \n");
      out.write("                    <input type=\"submit\" class=\"btn btn-danger\" value=\"PAY\" formaction=\"paymentd.jsp\">             \n");
      out.write("              </div>\n");
      out.write("             </form>\n");
      out.write("    </section>\n");
      out.write("  </main>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
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
