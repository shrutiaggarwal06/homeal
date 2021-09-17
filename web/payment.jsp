<%-- 
    Document   : payment
    Created on : 10 Mar, 2021, 1:43:33 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Payment</title>
    <%@page import="java.sql.*" %>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
  <style>
      .payment-form{
	padding-bottom: 50px;
	font-family: 'Montserrat', sans-serif;
}
.payment-form.dark{
	background-color: #f6f6f6;
}

.payment-form .content{
	box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.075);
	background-color: white;
}

.payment-form .block-heading{
    padding-top: 50px;
    margin-bottom: 40px;
    text-align: center;
}

.payment-form .block-heading p{
	text-align: center;
	max-width: 420px;
	margin: auto;
	opacity:0.7;
}

.payment-form.dark .block-heading p{
	opacity:0.8;
}

.payment-form .block-heading h1,
.payment-form .block-heading h2,
.payment-form .block-heading h3 {
	margin-bottom:1.2rem;
	color: #3b99e0;
}

.payment-form form{
	border-top: 2px solid #5ea4f3;
	box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.075);
	background-color: #ffffff;
	padding: 0;
	max-width: 600px;
	margin: auto;
}

.payment-form .title{
	font-size: 1em;
	border-bottom: 1px solid rgba(0,0,0,0.1);
	margin-bottom: 0.8em;
	font-weight: 600;
	padding-bottom: 8px;
}

.payment-form .products{
	background-color: #f7fbff;
    padding: 25px;
}

.payment-form .products .item{
	margin-bottom:1em;
}

.payment-form .products .item-name{
	font-weight:600;
	font-size: 0.9em;
}

.payment-form .products .item-description{
	font-size:15px;	        
}

.payment-form .products .item p{
	margin-bottom:0.2em;
}

.payment-form .products .price{
	float: right;
	font-weight: 600;
	font-size: 0.9em;
}

.payment-form .products .total{
	border-top: 1px solid rgba(0, 0, 0, 0.1);
	margin-top: 10px;
	padding-top: 19px;
	font-weight: 600;
	line-height: 1;
}

.payment-form .card-details{
	padding: 25px 25px 15px;
}

.payment-form .card-details label{
	font-size: 12px;
	font-weight: 600;
	margin-bottom: 15px;
	color: #79818a;
	text-transform: uppercase;
}

.payment-form .card-details button{
	margin-top: 0.6em;
	padding:12px 0;
	font-weight: 600;
}

.payment-form .date-separator{
 	margin-left: 10px;
    margin-right: 10px;
    margin-top: 5px;
}

@media (min-width: 576px) {
	.payment-form .title {
		font-size: 1.2em; 
	}

	.payment-form .products {
		padding: 40px; 
  	}

	.payment-form .products .item-name {
		font-size: 1em; 
	}

	.payment-form .products .price {
    	font-size: 1em; 
	}

  	.payment-form .card-details {
    	padding: 40px 40px 30px; 
    }

  	.payment-form .card-details button {
    	margin-top: 2em; 
    } 
}
  </style>
  <script>
      function fn()
      {
           if (confirm("Order once accepted cannot be cancelled and no refund will be issued thereafter")) 
           {
             window.location="http://localhost:8080/tiffin/paymentd.jsp";      
           }
           else 
           {
                   window.location="http://localhost:8080/tiffin/payment.jsp";
           }
       }
      </script>
</head>
<body>
  <main class="page payment-page">
    <section class="payment-form dark">
      <div class="container">
        <div class="block-heading">
          <h2>Payment Description</h2>
          </div>
         <form name="f" method="POST">
             <%
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
               
             %>
          <div class="products">
            <h3 class="title">Description</h3>
            <div class="item">
              <span class="price"> <%=chef_name%></span>
              <p class="item-name">Chef Name</p>             
            </div>
              <div class="item">
              <span class="price"> <%=meal_type%></span>
              <p class="item-name">Meal Type</p>             
            </div>
              <div class="item">
              <span class="price"> <%=det%></span>
              <p class="item-name">Meal Contains</p>             
            </div>
              <div class="item">
              <span class="price"> <%=cust_name%></span>
              <p class="item-name">Name</p>             
            </div>   
              <div class="item">
              <span class="price"> <%=email%></span>
              <p class="item-name">Email</p>             
            </div> 
              <div class="item">
              <span class="price"> <%=phno%></span>
              <p class="item-name">Phone Number</p>             
            </div> 
              <div class="item">
              <span class="price"> <%=date%></span>
              <p class="item-name">Start From</p>             
            </div> 
              <div class="item">
              <span class="price"> <%=nod%></span>
              <p class="item-name"> Number Of Days</p>             
            </div> 
               <div class="item">
              <span class="price"> <%=addr%>,<%=pincode%></span>
              <p class="item-name">Delivery Address</p>             
            </div>   
           <div class="item">
              <span class="price">Rs <%=mprice%></span>
              <p class="item-name">Meal Price</p>
              <p class="item-description"><%=price%>*<%=nod%></p>
            </div>
            <div class="item">
              <span class="price">Rs <%=scharge%></span>
              <p class="item-name">Service charges</p>
              <p class="item-description">2% *<%=price%></p>
            </div>
             <div class="item">
              <span class="price">Rs <%=delcharge%></span>
              <p class="item-name">Delivery Charges</p>
              <p class="item-description"><%=del%>*<%=nod%></p>
            </div>                    
            <div class="total">Net Amount<span class="price">Rs <%=total%></span></div>                                   
              <div class="form-group col-sm-12">
                  <div class="total">                    
                    <input type="submit" class="btn btn-danger" value="PAY" formaction="paymentd.jsp" onclick="fn()">             
              </div>
             </form>
    </section>
  </main>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>