package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Dashboard Admin Template by Tooplate.com</title>\n");
      out.write("    <!--\n");
      out.write("\n");
      out.write("    Template 2108 Dashboard\n");
      out.write("\n");
      out.write("\thttp://www.tooplate.com/view/2108-dashboard\n");
      out.write("\n");
      out.write("    -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,600\">\n");
      out.write("    <!-- https://fonts.google.com/specimen/Open+Sans -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/fontawesome.min.css\">\n");
      out.write("    <!-- https://fontawesome.com/ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/fullcalendar.min.css\">\n");
      out.write("    <!-- https://fullcalendar.io/ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <!-- https://getbootstrap.com/ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/tooplate.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"reportsPage\">\n");
      out.write("    <div class=\"\" id=\"home\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-12\">\n");
      out.write("                    <nav class=\"navbar navbar-expand-xl navbar-light bg-light\">\n");
      out.write("                        <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                            <i class=\"fas fa-3x fa-tachometer-alt tm-site-icon\"></i>\n");
      out.write("                            <h1 class=\"tm-site-title mb-0\">Dashboard</h1>\n");
      out.write("                        </a>\n");
      out.write("                        <button class=\"navbar-toggler ml-auto mr-0\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\n");
      out.write("                            aria-label=\"Toggle navigation\">\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                            <ul class=\"navbar-nav mx-auto\">\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link active\" href=\"#\">Dashboard\n");
      out.write("                                        <span class=\"sr-only\">(current)</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item dropdown\">\n");
      out.write("                          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"                                      >\n");
      out.write("                                        Reports\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Daily Report</a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Weekly Report</a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Yearly Report</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"products.html\">Products</a>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"accounts.html\">Accounts</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item dropdown\">\n");
      out.write("                                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("                                        aria-expanded=\"false\">\n");
      out.write("                                        Settings\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Profile</a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Billing</a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Customize</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <ul class=\"navbar-nav\">\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link d-flex\" href=\"login.html\">\n");
      out.write("                                        <i class=\"far fa-user mr-2 tm-logout-icon\"></i>\n");
      out.write("                                        <span>Logout</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- row -->\n");
      out.write("            <div class=\"row tm-content-row tm-mt-big\">\n");
      out.write("                <div class=\"tm-col tm-col-big\">\n");
      out.write("                    <div class=\"bg-white tm-block h-100\">\n");
      out.write("                        <h2 class=\"tm-block-title\">Latest Hits</h2>\n");
      out.write("                        <canvas id=\"lineChart\"></canvas>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"tm-col tm-col-big\">\n");
      out.write("                    <div class=\"bg-white tm-block h-100\">\n");
      out.write("                        <h2 class=\"tm-block-title\">Performance</h2>\n");
      out.write("                        <canvas id=\"barChart\"></canvas>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"tm-col tm-col-small\">\n");
      out.write("                    <div class=\"bg-white tm-block h-100\">\n");
      out.write("                        <canvas id=\"pieChart\" class=\"chartjs-render-monitor\"></canvas>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"tm-col tm-col-big\">\n");
      out.write("                    <div class=\"bg-white tm-block h-100\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-8\">\n");
      out.write("                                <h2 class=\"tm-block-title d-inline-block\">Top Product List</h2>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-4 text-right\">\n");
      out.write("                                <a href=\"products.html\" class=\"tm-link-black\">View All</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <ol class=\"tm-list-group tm-list-group-alternate-color tm-list-group-pad-big\">\n");
      out.write("                            <li class=\"tm-list-group-item\">\n");
      out.write("                                Donec eget libero\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"tm-list-group-item\">\n");
      out.write("                                Nunc luctus suscipit elementum\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"tm-list-group-item\">\n");
      out.write("                                Maecenas eu justo maximus\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"tm-list-group-item\">\n");
      out.write("                                Pellentesque auctor urna nunc\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"tm-list-group-item\">\n");
      out.write("                                Sit amet aliquam lorem efficitur\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"tm-list-group-item\">\n");
      out.write("                                Pellentesque auctor urna nunc\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"tm-list-group-item\">\n");
      out.write("                                Sit amet aliquam lorem efficitur\n");
      out.write("                            </li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"tm-col tm-col-big\">\n");
      out.write("                    <div class=\"bg-white tm-block h-100\">\n");
      out.write("                        <h2 class=\"tm-block-title\">Calendar</h2>\n");
      out.write("                        <div id=\"calendar\"></div>\n");
      out.write("                        <div class=\"row mt-4\">\n");
      out.write("                            <div class=\"col-12 text-right\">\n");
      out.write("                                <a href=\"#\" class=\"tm-link-black\">View Schedules</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"tm-col tm-col-small\">\n");
      out.write("                    <div class=\"bg-white tm-block h-100\">\n");
      out.write("                        <h2 class=\"tm-block-title\">Upcoming Tasks</h2>\n");
      out.write("                        <ol class=\"tm-list-group\">\n");
      out.write("                            <li class=\"tm-list-group-item\">List of tasks</li>\n");
      out.write("                            <li class=\"tm-list-group-item\">Lorem ipsum doloe</li>\n");
      out.write("                            <li class=\"tm-list-group-item\">Read reports</li>\n");
      out.write("                            <li class=\"tm-list-group-item\">Write email</li>\n");
      out.write("                            \n");
      out.write("                            <li class=\"tm-list-group-item\">Call customers</li>\n");
      out.write("                            <li class=\"tm-list-group-item\">Go to meeting</li>\n");
      out.write("                            <li class=\"tm-list-group-item\">Weekly plan</li>\n");
      out.write("                            <li class=\"tm-list-group-item\">Ask for feedback</li>\n");
      out.write("                            \n");
      out.write("                            <li class=\"tm-list-group-item\">Meet Supervisor</li>\n");
      out.write("                            <li class=\"tm-list-group-item\">Company trip</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <footer class=\"row tm-mt-small\">\n");
      out.write("                <div class=\"col-12 font-weight-light\">\n");
      out.write("                    <p class=\"d-inline-block tm-bg-black text-white py-2 px-4\">\n");
      out.write("                        Copyright &copy; 2018 Admin Dashboard . Created by\n");
      out.write("                        <a rel=\"nofollow\" href=\"https://www.tooplate.com\" class=\"text-white tm-footer-link\">Tooplate</a>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <!-- https://jquery.com/download/ -->\n");
      out.write("    <script src=\"js/moment.min.js\"></script>\n");
      out.write("    <!-- https://momentjs.com/ -->\n");
      out.write("    <script src=\"js/utils.js\"></script>\n");
      out.write("    <script src=\"js/Chart.min.js\"></script>\n");
      out.write("    <!-- http://www.chartjs.org/docs/latest/ -->\n");
      out.write("    <script src=\"js/fullcalendar.min.js\"></script>\n");
      out.write("    <!-- https://fullcalendar.io/ -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- https://getbootstrap.com/ -->\n");
      out.write("    <script src=\"js/tooplate-scripts.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        let ctxLine,\n");
      out.write("            ctxBar,\n");
      out.write("            ctxPie,\n");
      out.write("            optionsLine,\n");
      out.write("            optionsBar,\n");
      out.write("            optionsPie,\n");
      out.write("            configLine,\n");
      out.write("            configBar,\n");
      out.write("            configPie,\n");
      out.write("            lineChart;\n");
      out.write("        barChart, pieChart;\n");
      out.write("        // DOM is ready\n");
      out.write("        $(function () {\n");
      out.write("            updateChartOptions();\n");
      out.write("            drawLineChart(); // Line Chart\n");
      out.write("            drawBarChart(); // Bar Chart\n");
      out.write("            drawPieChart(); // Pie Chart\n");
      out.write("            drawCalendar(); // Calendar\n");
      out.write("\n");
      out.write("            $(window).resize(function () {\n");
      out.write("                updateChartOptions();\n");
      out.write("                updateLineChart();\n");
      out.write("                updateBarChart();\n");
      out.write("                reloadPage();\n");
      out.write("            });\n");
      out.write("        })\n");
      out.write("    </script>\n");
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
