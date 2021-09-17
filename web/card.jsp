<%-- 
    Document   : card
    Created on : 12 Feb, 2021, 7:13:10 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <%@page import="java.sql.*"%>
         <style scoped="">
        .button-success,
        .button-error,
        .button-warning,
        .button-secondary {
            color: white;
            border-radius: 3px;
            text-shadow: 0 1px 1px rgba(0, 0, 0, 0.2);
            font-size: 125%;
        }

        .button-success {
            background: rgb(28, 184, 65);
            /* this is a green */
        }
        </style>
    </head>
    <body>
      <%  String cid="";
                    String name="";                 
                    String cno="";
                    String bnk="";
                    String expm="";
                     String expy="";
                    cid=(String)session.getAttribute("cid");
                    String pr="";
          if(request.getParameter("c")!=null)
            {
                 if(request.getParameter("c").equals("yes"))
                {
                    pr="CARD SUCCESFULLY DELETED";
                }
            }
           %> <p id ="mes"><font style="font-size:18px"><%=pr%>  </p> </font>
               <%
               
                     try
                    {
                         Class.forName("org.apache.derby.jdbc.ClientDriver");
                         Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                    PreparedStatement ps= cn.prepareStatement("select * from card where CUSTID=?");
                    ps.setString(1, cid); 
                      ResultSet rs=ps.executeQuery();
                     if(rs.next())
                      {
                       %><h1 style="font-size:40px;font-family:Cursive,Brush Script MT;color:white;">&nbsp CARD INFORMATION</h1><%
      }
                      else
                     {
                         out.print("no saved cards");
                      }
                      rs=ps.executeQuery();
                          while(rs.next())
                      {
                       name= rs.getString("cname");
                       cno=rs.getString("cardno");
                       bnk= rs.getString("bname");                      
                       expm=rs.getString("expm");
                      expy=rs.getString("expy");  
                   %>
          
              
              
                <hr style="border-color:white ; width:400px" >
                 <h1 style="font-size:25px;font-family:Cursive,Brush Script MT;color:greenyellow;text-transform:capitalize">&nbsp Name : <%=name%></h1>               
                  <h1 style="font-size:25px;font-family:Cursive,Brush Script MT;color:whitesmoke;text-transform:capitalize">&nbsp Card number : <%=cno%></h1>               
                  <h1 style="font-size:25px;font-family:Cursive,Brush Script MT;color:greenyellow;text-transform:capitalize">&nbsp Bank name:  <%=bnk%></h1>
                  <h1 style="font-size:25px;font-family:Cursive,Brush Script MT;color:whitesmoke;text-transform:capitalize">&nbsp Expiry date : <%=expm%>/<%=expy%></h1>       
                  &nbsp &nbsp <a class="button-success pure-button" href ="updatecard.jsp?cno=<%=cno%>">&nbsp Delete card &nbsp </a> 
                                
                <%
                }  
                     
                    cn.close();
                    }                          
                    catch(Exception ex)
                            {
                                out.print(ex);
                            }%>
                     </body>
</html>
