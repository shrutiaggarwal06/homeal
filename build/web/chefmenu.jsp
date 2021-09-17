<%-- 
    Document   : chefmenu
    Created on : 17 Mar, 2021, 8:44:00 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <%@page import="java.sql.*"%>
        <title>JSP Page</title>
        <style>
             .frost{
border-radius:1em;
width:600px;
height:auto;
background:white;
position:relative;
z-index:0;
overflow:hidden;
margin:0 auto;
padding:2rem;
box-sizing:border-box;
box-shadow:0 0.5em 1em rgba(0,0,0,0.3);
}
.frost::before
{
content:"";
position:absolute;
z-index:-1;
top:0; right:0; bottom:0; left:0;
background:inherit;
box-shadow:inset 0 0 3000px rgba(255,255,255,0.5);
filter:blur(10px);
margin:-20px;
}
 .btn{
  border: 1px solid black;
  background:#f54d70;
  padding: 10px 20px;
  font-size: 15px;
  font-family: "montserrat";
  margin: 10px;
  transition: 0.8s;
  position: relative;
  overflow: hidden;
  color: #fff;
}
.btn:hover{
     background:#fff; 
  color: #f54d70;
}
            </style>
    </head>
    <body>
        <%
    String id=request.getParameter("tid");
    String chef="",name="",email="",mob="",add="";
String type="";
String price[]=new String[4];
String det[]=new String[4];
String mealid[]=new String[4];
int i=0;
                try
                {                         
                 Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");                                                                     
                       PreparedStatement ps= cn.prepareStatement("select * from meals where tf_id=?");
                       ps.setString(1,id);
                       ResultSet rs1 = ps.executeQuery();
                       while(rs1.next())
                       {                                                    
                           type=rs1.getString("meal_typ");
                           if(type.equals("breakfast"))
                           {
                           det[0]=rs1.getString("m_det");
                      price[0]=rs1.getString("m_price");
                      mealid[0]=rs1.getString("mealid");
                           }
                           else if(type.equals("lunch"))
                           {
                           det[1]=rs1.getString("m_det");
                      price[1]=rs1.getString("m_price");
                       mealid[1]=rs1.getString("mealid");
                           }
                             else  if(type.equals("dinner"))
                           {
                           det[2]=rs1.getString("m_det");
                      price[2]=rs1.getString("m_price");
                       mealid[2]=rs1.getString("mealid");
                           }                                
                  }           
                                          cn.close();    
                }
                                catch(Exception ex)
                                        {out.print(ex);}
%> 
<div class="frost">
 <% if(price[0]!=null)
 {%>
 
     <h3 style="color:#f54d70;font-size:32px"><u>BREAKFAST MENU</u></h3>					
<p style="color:black;font-size: 20px;font-family: 'Allura',cursive">Meal Available From 7am.</p>
<p style="color:black;font-size: 20px;font-family: 'Allura',cursive">Meal Consists Of:<%=det[0]%></p>
<p style="color:black;font-size: 20px;font-family: 'Allura',cursive">Price:<%=price[0]%></p>
<%}
 if(price[1]!=null)
 {%>
 <h3 style="color:#f54d70;font-size:32px" ><u>LUNCH MENU</u></h3>
<p style="color:black;font-size: 20px;font-family: 'Allura',cursive">Meal Available from 2pm</p>
<p style="color:black;font-size: 20px;font-family: 'Allura',cursive">Meal consists of:<%=det[1]%></p>
<p style="color:black;font-size: 20px;font-family: 'Allura',cursive">Price:<%=price[1]%></p>                                   
<%}
if(price[2]!=null)
{%>
<h3 style="color:#f54d70;font-size:32px"><u>DINNER MENU</u></h3>                                          
<p style="color:black;font-size: 20px;font-family: 'Allura',cursive">Meal Available from 7pm</p>
<p style="color:black;font-size: 20px;font-family: 'Allura',cursive">Meal consists of:<%=det[2]%></p>
<p style="color:black;font-size: 20px;font-family: 'Allura',cursive">Price:<%=price[2]%></p>                                                          
<%}%> 
 
 </div>
 
    </body>
</html>