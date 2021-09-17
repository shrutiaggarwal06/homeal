package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Bootstrap link -->\n");
      out.write("         <script src=\"https://maps.googleapis.com/maps/api/js?v=3.exp\"></script> \n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0\" crossorigin=\"anonymous\"></script>\n");
      out.write("<!-- Fontawesome link -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<!-- jquery link -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<!-- select2-->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/select2@4.1.0-rc.0/dist/css/select2.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/select2@4.1.0-rc.0/dist/js/select2.min.js\"></script>\n");
      out.write("<!-- Sweetalert cdn -->\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js\"></script>\n");
      out.write("        <style>.mynav{\n");
      out.write("        height:15vh;\n");
      out.write("        width:100vw;\n");
      out.write("        background-color:#8d5cf6;\n");
      out.write("    }\n");
      out.write("    .navlinks{\n");
      out.write("        color:white !important;\n");
      out.write("        font-weight:bold;\n");
      out.write("        font-size:17px;\n");
      out.write("    }\n");
      out.write("    .mylogo{\n");
      out.write("        color:white !important;\n");
      out.write("        font-weight:bold;\n");
      out.write("        font-size:28px;\n");
      out.write("    }</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg mynav navbar-dark\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <a class=\"navbar-brand mylogo\" href=\"#\">CoviSource</a>\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("          </button>\n");
      out.write("          <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link navlinks\" aria-current=\"page\" href=\"#\">Home</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link navlinks\" href=\"#\">About</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link navlinks\" href=\"#\">Registration</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link navlinks\" href=\"#\">Login</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link navlinks\" href=\"#\">Search Resources</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link navlinks\" href=\"#\">Contact Us</a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("        <section class=\"text-gray-600 body-font\">\n");
      out.write("  <div class=\"container px-5 py-24 mx-auto flex flex-wrap items-center\">\n");
      out.write("    <div class=\"lg:w-3/5 md:w-1/2 md:pr-16 lg:pr-0 pr-0\">\n");
      out.write("      <h1 class=\"title-font font-medium text-3xl text-gray-900\">THANK YOU OF BEING SUCH A GREAT HELP!! </h1>\n");
      out.write("       <p class=\"leading-relaxed mt-4 font-medium\">Hope everyone gets recovered soon..</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"lg:w-2/6 md:w-1/2 bg-gray-100 rounded-lg p-8 flex flex-col md:ml-auto w-full mt-10 md:mt-0\">\n");
      out.write("      <h2 class=\"text-gray-900 text-lg font-medium title-font mb-5\">Sign In</h2>\n");
      out.write("      <div class=\"relative mb-4\">\n");
      out.write("          <form action=\"loginback.jsp\">\n");
      out.write("        <label for=\"full-name\" class=\"leading-7 text-sm text-gray-600\">Email id</label>\n");
      out.write("        <input type=\"text\" id=\"full-name\" name=\"email\" class=\"w-full bg-white rounded border border-gray-300 focus:border-purple-500 focus:ring-2 focus:ring-purple-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"relative mb-4\">\n");
      out.write("        <label for=\"email\" class=\"leading-7 text-sm text-gray-600\">Password</label>\n");
      out.write("        <input type=\"password\" id=\"email\" name=\"pass\" class=\"w-full bg-white rounded border border-gray-300 focus:border-purple-500 focus:ring-2 focus:ring-purple-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out\">\n");
      out.write("      </div>\n");
      out.write("      <button type=\"submit\" class=\"text-white bg-purple-500 border-0 py-2 px-8 focus:outline-none hover:bg-purple-600 rounded text-lg\">Login</button>\n");
      out.write("      <p class=\"text-xs text-gray-500 mt-3\"></p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
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
