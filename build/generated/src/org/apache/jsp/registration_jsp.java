package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\n");
      out.write("body{\n");
      out.write("background:url(aboutcss/img/banner-bg.png);\n");
      out.write("background-attachment:fixed;\n");
      out.write("background-size:cover;\n");
      out.write("background-repeat:no-repeat;\n");
      out.write("}\n");
      out.write(".frosted{\n");
      out.write("border-radius:1em;\n");
      out.write("width:600px;\n");
      out.write("height:100%;\n");
      out.write("background-color:rgba(211,211,211,0.3);\n");
      out.write("position:relative;\n");
      out.write("overflow:hidden;\n");
      out.write("margin:0 auto;\n");
      out.write("padding-left:4rem;\n");
      out.write("padding-bottom:2rem;\n");
      out.write("color: white;\n");
      out.write("}\n");
      out.write("#Message,#ps,#g,#dts,#dr,#qw,#fu,#Mess,#mes{   \n");
      out.write("        color:black; \n");
      out.write("        font-family:Cursive,Brush Script MT;\n");
      out.write("       font-weight: bold ; \n");
      out.write("       font-size:20px ; \n");
      out.write("}\n");
      out.write("#submit{\n");
      out.write("    font-size:20px;\n");
      out.write("    font-family:'Times New Roman';\n");
      out.write("}\n");
      out.write("\n");
      out.write(".im1{\n");
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
      out.write("background-color:rgba(0,0,0,0.5);\n");
      out.write("background-attachment:fixed;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("    <script>\n");
      out.write("                function fn()\n");
      out.write("             {\n");
      out.write("                        var e=document.f1.em.value;\n");
      out.write("                        var filter=/^([A-Za-z])+([0-9.$%&#A-Za-z0-9])+\\@(([a-zA-Z])+\\.)+([a-zA-Z]{2,3})+$/ ;\n");
      out.write("               if(e==\"\")\n");
      out.write("               {\n");
      out.write("                   document.getElementById(\"Message\").innerHTML=\"Field cannot be empty\" ;\n");
      out.write("               }\n");
      out.write("                  else if((!filter.test(e)))\n");
      out.write("                {\n");
      out.write("                     document.getElementById(\"Message\").innerHTML=\"Invalid Email Format <br>(Vaild Format:example@exam.em)\" ;\n");
      out.write("                    return false;                \n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                   document.getElementById(\"Message\").innerHTML=\" \"\n");
      out.write("                   return 1;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("             function fn1(){\n");
      out.write("    \n");
      out.write("                var p = document.f1.pass.value;\n");
      out.write("        var pa = /^((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,100})+$/;\n");
      out.write("                   if(p==\"\")\n");
      out.write("               {\n");
      out.write("                   document.getElementById(\"ps\").innerHTML=\"Field cannot be empty\";\n");
      out.write("               }\n");
      out.write("                 else if((!pa.test(p)))\n");
      out.write("                 {\n");
      out.write("                     document.getElementById(\"ps\").innerHTML=\"*Invalid Password Format<br><br> Password must contain atleast <br>one uppercase letter<br>one lower case letter <br> one numeric digits <br>min limit is :4\" ;\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                     document.getElementById(\"ps\").innerHTML=\" \" ;        \n");
      out.write("                     return 1;\n");
      out.write("                }    \n");
      out.write("            }\n");
      out.write("            function fn2()\n");
      out.write("            {\n");
      out.write("                var ph = document.f1.pi.value;\n");
      out.write("                 if(ph==\"\")\n");
      out.write("               {\n");
      out.write("                   document.getElementById(\"Mess\").innerHTML=\"Field cannot be empty\" ;\n");
      out.write("                   \n");
      out.write("        }\n");
      out.write("               else if(isNaN(ph))\n");
      out.write("                {\n");
      out.write("                        document.getElementById(\"Mess\").innerHTML=\"Invalid Phone Number Format<br> Phone Number must contain only\" ;\n");
      out.write("                        return false;\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                     if((ph.length<10)||(ph.length>10))\n");
      out.write("                     {\n");
      out.write("                        document.getElementById(\"Mess\").innerHTML=\" Invalid Phone Number Format<br> Phone Number must contain exact : 10 digts\" ;\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                   else\n");
      out.write("                   {    \n");
      out.write("                        document.getElementById(\"Mess\").innerHTML=\" \" ;        \n");
      out.write("                        return 1;\n");
      out.write("                   }\n");
      out.write("                 }                \n");
      out.write("               }\n");
      out.write("            \n");
      out.write("                 function fn4()\n");
      out.write("                 {\n");
      out.write("                 if(f1.sec_ques.selectedIndex==0)\n");
      out.write("                 {\n");
      out.write("                     document.getElementById(\"dr\").innerHTML=\"Select Atleast one \" ;\n");
      out.write("                    return false;\n");
      out.write("                 }\n");
      out.write("                \n");
      out.write("                else{\n");
      out.write("                    document.getElementById(\"dr\").innerHTML=\" \" ;\n");
      out.write("                    return 1;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            }  \n");
      out.write("            function fn6()\n");
      out.write("            {\n");
      out.write("                var c = document.f1.fname.value ;\n");
      out.write("                if( c==\"\")            \n");
      out.write("                {\n");
      out.write("                     document.getElementById(\"fu\").innerHTML=\"Field cannot be empty\" ;\n");
      out.write("                     \n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                        document.getElementById(\"fu\").innerHTML=\" \" ;\n");
      out.write("                        return 1;\n");
      out.write("                }\n");
      out.write("            }    \n");
      out.write("             function fn7()\n");
      out.write("            {\n");
      out.write("                var sc = document.f1.seca.value ;\n");
      out.write("                if( sc==\"\")            \n");
      out.write("                {\n");
      out.write("                     document.getElementById(\"qw\").innerHTML=\"Field cannot be empty\" ; \n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                        document.getElementById(\"qw\").innerHTML=\" \" ;\n");
      out.write("                        return 1;\n");
      out.write("                }\n");
      out.write("            }    \n");
      out.write("            function check()\n");
      out.write("            {\n");
      out.write("                var choice1=document.getElementById(\"t1\");\n");
      out.write("                var choice2=document.getElementById(\"t2\");\n");
      out.write("                var b=document.getElementById(\"dateid\").value;\n");
      out.write("                var form;\n");
      out.write("                var form1;\n");
      out.write("                if((choice1.checked)||(choice2.checked))\n");
      out.write("                {\n");
      out.write("                    form=\"true\";\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    form=\"false\";\n");
      out.write("                }\n");
      out.write("                 if(b==\"\")\n");
      out.write("                 {\n");
      out.write("                     form1=\"false1\";\n");
      out.write("                 }\n");
      out.write("                 else\n");
      out.write("                 {\n");
      out.write("                     form1=\"true1\";\n");
      out.write("                 }\n");
      out.write("                 \n");
      out.write("                if((form1==\"true1\")&&(form==\"true\")&&(fn()==1)&&(fn1()==1)&&(fn2()==1)&&(fn4()==1)&&(fn7()==1)&&(fn6()==1))\n");
      out.write("                    {  \n");
      out.write("                        return true;\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {  \n");
      out.write("                            if(form==\"false\")\n");
      out.write("                            {\n");
      out.write("                               document.getElementById(\"g\").innerHTML=\"Select Atleast one\";\n");
      out.write("                            }\n");
      out.write("                            if(form1==\"false1\")\n");
      out.write("                             {\n");
      out.write("                                document.getElementById(\"dts\").innerHTML=\"Select Atleast one\";\n");
      out.write("                             }\n");
      out.write("                             alert(\"something is wrong\");\n");
      out.write("                            return false;\n");
      out.write("                    }\n");
      out.write("            }\n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
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
      out.write("    <div>\n");
      out.write("        <div class=\"d4\">\n");
      out.write("   <div id = \"menu\">\n");
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
      out.write("   </div></div> \n");
      out.write("        <br><br><br>    \n");
      out.write("<div class=\"frosted\"> \n");
      out.write("        <form style=\"line-height:5px\" name = \"f1\" action=\"newregister.jsp\" method=\"POST\" onsubmit=\"return check()\"  >\n");
      out.write("             ");

                    String ph= "";
                    String fn = "";                    
                    String sa = "";
                    String dt = "";
                    String pr = "";
                    String em1="";
                    String pr1="";
                    
                if(request.getParameter("e")!=null)
            {
                if(request.getParameter("e").equals("exists"))
                {
                    pr="Email Id Exist<br> Try Another";                      
                    ph=(String)session.getAttribute("ph1");                        
                    fn=(String)session.getAttribute("fn1");                                                                   
                    sa=(String)session.getAttribute("sa1");                        
                    dt=(String)session.getAttribute("dt1");
                }
            }
                if(request.getParameter("p")!=null)
            {
                if(request.getParameter("p").equals("1exists"))
                {
                    pr1="phone number exist<br> Try Another";                      
                    em1=(String)session.getAttribute("em1");                        
                    fn=(String)session.getAttribute("fn1");                                                                 
                    sa=(String)session.getAttribute("sa1");                        
                    dt=(String)session.getAttribute("dt1");
                }
            }
 
      out.write(" \n");
      out.write("            <table style=\"line-height:20px\">\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                        <font style=\"font-size:30px;color:black\">REGISTRATION</font> <br><br>  </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"font-size:20px;color:black\"><label for=\"usertype\">USER TYPE</label><BR>\n");
      out.write("                    <select name=\"ut\" REQUIRED>\n");
      out.write("                    <option value=\"\" disabled selected hidden >SELECT</option>\n");
      out.write("                    <option value=\"CUST\">CUSTOMER</option>\n");
      out.write("                    <option value=\"TF\">TIFFIN PROVIDER</option>\n");
      out.write("                    </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> <font style=\"font-size:18px ; color:white\">EMAIL ID:      </td><br>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> <input type=\"text\" name=\"em\" placeholder=\"Email Id\" size=\"40\" value= \"");
      out.print(em1);
      out.write("\" onfocusout=\"fn()\">&nbsp &nbsp &nbsp</font> <br><span id=\"Message\"></span></td>\n");
      out.write("                    <td><td> <p id =\"mes\"><font style=\"font-size:18px\">");
      out.print(pr);
      out.write("   </p>   </td></td>\n");
      out.write("                </tr>  \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td><br> <font style=\"font-size:18px; color:black\"> PASSWORD : </td><br>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"password\" name=\"pass\" placeholder=\"Password\" size=\"40\"  onfocusout=\"fn1()\" >&nbsp &nbsp &nbsp</font><br><span id=\"ps\"></span></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                     <td><br> <font style=\"font-size:18px;color:white\"> PHONE NO  </td><br>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"text\" name=\"pi\" placeholder=\"Phone Number\" size=\"40\" value = \"");
      out.print(ph);
      out.write("\"onfocusout=\"fn2()\" />&nbsp &nbsp &nbsp<br><span id=\"Mess\"></span></font></td>\n");
      out.write("                    <td><td> <p id =\"mes\"><font style=\"font-size:18px\">");
      out.print(pr1);
      out.write("   </p>   </td></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                     <td><br> <font style=\"font-size:18px;color:black\"> SECURITY QUESTION : </td><br>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> <select  name=\"sec_ques\" onclick=\"fn4()\">\n");
      out.write("                            <option>Select</option>\n");
      out.write("                            <option value=\"q1\">what is your father's middle name?</option>\n");
      out.write("                            <option value=\"q2\">what was your first pets name?</option>\n");
      out.write("                            <option value=\"q3\">Where is your hometown?</option>\n");
      out.write("                            <option value=\"q4\">What is your common password?</option>\n");
      out.write("                         </select>&nbsp &nbsp &nbsp<span id=\"dr\"></span></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><br> <font style=\"font-size:18px;color:whitesmoke\"> SECURITY ANSWER: : </td><br>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"text\" name=\"seca\" placeholder=\"Security Answer\" size=\"40\" value=\"");
      out.print(sa);
      out.write("\" onfocusout=\"fn7()\"/><br><span id=\"qw\"></span></font></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><br> <font style=\"font-size:18px;color:black\"  > DATE OF BIRTH : </td><br>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"date\" name=\"date\" id=\"dateid\" min=\"1990-12-31\" max=\"2000-12-31\" value=\"");
      out.print(dt);
      out.write("\">&nbsp &nbsp &nbsp<br> <span id=\"dts\"></span></font></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><br> <font style=\"font-size:18px;color:whitesmoke\"> FIRST NAME : </td><br>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"text\" name=\"fname\" placeholder=\"First Name\" size=\"40\" value=\"");
      out.print(fn);
      out.write("\"onfocusout=\"fn6()\" /><br><span id=\"fu\" ></span></font></td>\n");
      out.write("                </tr>     \n");
      out.write("                 <tr>\n");
      out.write("                     <td> <br><font style=\"font-size:18px;color:black\"> GENDER: </td><br>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"font-size:18px;color:orange\"><input type=\"radio\"  name=\"gender\" value=\"Male\" id=\"t1\">Male</td></tr>\n");
      out.write("                <tr>    <td style=\"font-size:18px;color:black\"><input type=\"radio\"  name=\"gender\" value=\"Female\" id =\"t2\">Female &nbsp &nbsp &nbsp<span id=\"g\"></span></td><tr>\n");
      out.write("                <tr>  <td style=\"font-size:18px;color:orange\"><input type=\"radio\"  name=\"gender\" value=\"rather not say\" id =\"t3\">Rather not say &nbsp &nbsp &nbsp<span id=\"g\"></span></td>\n");
      out.write("                </tr> \n");
      out.write("              <!-- <tr><td><INPUT NAME=\"file\" TYPE=\"file\" required>  </td></tr>-->\n");
      out.write("            </table>\n");
      out.write("                <center>    <br><br><br><input type=\"submit\" id=\"submit\" value=\"REGISTER\"  /></center> \n");
      out.write("        </form>\n");
      out.write("                <br><font style=\"font-size:20px;color:white\">ALREADY A MEMBER?&nbsp <a style=\"font-size:20px;color:black\"href=\"login.jsp\">LOGIN</a> </font> \n");
      out.write("                <br><br><font style=\"font-size:20px;color:white\">CHANGED YOUR MIND?&nbsp &nbsp<a style=\"font-size:20px;color:black\" href=\"index.html\">HOME</a> </font>    \n");
      out.write("</div>\n");
      out.write(" <br>\n");
      out.write("</body></html>");
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
