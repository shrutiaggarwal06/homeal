<%-- 
    Document   : paymentd
    Created on : 10 Mar, 2021, 4:52:29 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
      <%@page import="java.sql.*"%>
<style>

body{margin-top:20px;} 
.container{
    width:50%;
    height:100%;
    margin-top:80px;
}
.credit-card{ background-color: #f4f4f4;
             height: 100%; width: 100%;
             display: flex; flex-direction: column;
             justify-content: center; align-items: center; }
.card-holder { margin: 2em 0; }
.img-box { padding-top: 20px; display: flex; justify-content: center; } 
.card-box { font-weight: 800; padding: 1em 1em; border-radius: 0.25em; box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2); } 
.bg-news { background: -webkit-linear-gradient(70deg, #f54d70 40%, #ffffff 40%);
          background: -o-linear-gradient(70deg, #f54d70 40%, #ffffff 40%);
          background: -moz-linear-gradient(70deg, #f54d70 40%, #ffffff 40%); 
          background: linear-gradient(70deg, #f54d70 40%, #ffffff 40%); } 
.btn-primary{ background-image: -webkit-linear-gradient(315deg, #f54d70 0%, #fd8965 100%);
             background-image: -moz- oldlinear-gradient(315deg, #f54d70 0%, #fd8965 100%);
             background-image: -o-linear-gradient(315deg, #f54d70 0%, #fd8965 100%); 
             background-image: linear-gradient(135deg, #f54d70 0%, #fd8965 100%); 
             -webkit-filter: hue-rotate(0deg); filter: hue-rotate(0deg); 
             border: none !important; } 
.credit-card form{ 	background-color: #ffffff; 	
                   padding: 0; 	max-width: 600px; 	
                   margin: auto; } 
.credit-card .title{ 	font-family: 'Abhaya Libre', serif; 
        font-size: 30px; 	color: #2C3E50; 	
        border-bottom: 1px solid rgba(0,0,0,0.1); 
        margin-bottom: 0.8em; 	font-weight: 600; 
        padding-bottom: 8px; }
.credit-card .card-details{ 	padding: 25px 25px 15px; } 
.inner-addon { position: relative; } 
.inner-addon .fas, .inner-addon .far { position: absolute; padding: 10px; pointer-events: none; 
      color: #bcbdbd !important; }
.right-addon .fas, .right-addon .far { right: 0px; top: 40px;} 
.right-addon input { padding-right: 30px; } 
.credit-card .card-details label{ 	font-family: 'Abhaya Libre', serif; 
                     font-size: 20px; 	font-weight: 400; 	
                     margin-bottom: 15px; 	color: black; 	
                     text-transform: uppercase; }
.credit-card .card-details input[type="text"] { 	font-family: "Poppins", sans-serif; 
                                                 font-size: 16px; 	font-weight: 500; 
                                                 padding: 10px 10px 10px 5px; 	-webkit-appearance: none; 
                                                 display: block; 	background: #fafafa; 	color: #636363;
                                                 border: none; 	border-radius: 0; 	
                                                 border: 1px solid #757575;	 } 
.credit-card .card-details input[type="text"]:focus { outline: none; } 
.credit-card .card-details button{ 	margin-top: 0.6em; 	padding:12px 0; 
                      font-weight: 600; }
.credit-card .date-separator{ 	margin-left: 10px; margin-right: 10px; margin-top: 5px; }
@media (max-width: 768px) { 	.credit-card{ 	 height: 250vh; 	 width: 100%; 	} 	
                             .credit-card .title { 		font-size: 1.2em; 	} 	
                             .credit-card .row .col-lg-6 { 		margin-bottom: 40px; 	} 	
                             .credit-card .card-details { 	padding: 40px 40px 30px; } 	
                             .credit-card .card-details button { 	margin-top: 2em; } }
.container1{
  text-align: center;  
}
.btn{
  border: 1px solid #f54d70;
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
      
<section class="credit-card"> 		 
<div class="container"> 		 			
<div class="card-holder"> 			
<div class="card-box bg-news"> 		
<div class="row"> 				
<div class="col-lg-6"> 				                        				                         				                       		
</div> 				
<div class="col-lg-6"> 				 				
<form action="" method="POST">                            
<div class="card-details"> 					
<h1 class="title">PAYMENT MODE</h1> 		                                
<div class="row"> 					
<div class="form-group col-sm-7"> 					 
<div class="inner-addon right-addon"> 
   <label for="card-number">SAVED CARDS</label> <i class="far fa-credit-card"></i> 
    <%
                      
                    String cno="";
                    String cid=(String)session.getAttribute("cid");
                    String pr="";
                    try
                    {
                         Class.forName("org.apache.derby.jdbc.ClientDriver");
                         Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                    PreparedStatement ps= cn.prepareStatement("select * from card where CUSTID=?");
                    ps.setString(1, cid); 
                      ResultSet rs=ps.executeQuery();
                      if(rs.next())
                      {
                           rs=ps.executeQuery();                     
                      while(rs.next())
                      {                       
                       cno=rs.getString("cardno");                      
                   %> 
                   <br><br>  <input type="radio" id="roundtrip" name="card" value="<%=cno%>"><%=cno%>
<%
     }  
                      %>   <input type="submit" class ="btn" value="Pay" formaction="cardpayment.jsp?crdno=<%=cno%>"></div><%
                      }               
                      else
                      {
                          out.print("no saved cards");
                      }
                    cn.close();
                    }                          
                    catch(Exception ex)
                            {
                                out.print(ex);
                            }%>

<div class="total">                    
                    <input type="submit" class="btn btn-danger" value="New Card" formaction="cardpayment.jsp">             
              </div>


</div></div></div> 				
</form>
</div> </div> </div> </div>
</div>				
</section>
</body>
</html>
