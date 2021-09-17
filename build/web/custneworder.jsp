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
</head>
<body>
  <main class="page payment-page">
    <section class="payment-form dark">
      <div class="container">
        <div class="block-heading">
          <h2>ORDER STATUS</h2>
          </div>
          <form name="f" method="POST">
              <p style="font-size:24;color:green">Refresh Your Page Frequently To Know Your Order Status Update</p>
     <%      
                String cid=(String)session.getAttribute("cid");  
                int oid=(Integer)session.getAttribute("oid");
                String status="";
         try
            {                
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection cn= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                PreparedStatement ps= cn.prepareStatement("select * from orders where orderid=?");      
                ps.setInt(1, oid);
                 ResultSet rs=ps.executeQuery();             
                   if(rs.next()) 
                {   %>
                <%                         
                                
                       String tid=rs.getString("tf_id");
                       String meid=rs.getString("mealid");
                    Connection cn1= DriverManager.getConnection("jdbc:derby://localhost:1527/tiffin");
                  PreparedStatement  ps1= cn1.prepareStatement("select * from meals where mealid=? and tf_id=?");  
                ps1.setString(1, meid);
                ps1.setString(2, tid);
                ResultSet rs1=ps1.executeQuery();   
                if(rs1.next())
                { 
                   %>
                   
                   <div class="products">
            <h3 class="title">Description</h3>
            <div class="item">
              <span class="price"> <%=rs.getString("ORDERID")%></span>
              <p class="item-name">Orderid</p>             
            </div>
              <div class="item">
              <span class="price"><%=rs1.getString("meal_typ")%></span>
              <p class="item-name">Meal type</p>             
            </div>
              <div class="item">
              <span class="price"><%=rs1.getString("m_det")%></span>
              <p class="item-name">Meal contains</p>             
            </div>
              <div class="item">
              <span class="price"> <%=rs1.getString("t_pro")%></span>
              <p class="item-name">Tiffin Provider</p>             
            </div>   
              <div class="item">
              <span class="price"><%=rs.getString("DATE")%> </span>
              <p class="item-name">Order date</p>             
            </div> 
              <div class="item">
              <span class="price"><%=rs.getString("days")%></span>
              <p class="item-name">No. of days</p>             
            </div> 
              <div class="item">
              <span class="price"><%=rs.getString("amount")%></span>
              <p class="item-name">Amount</p>             
            </div> 
              <div class="item">
              <span class="price"><%=rs.getString("name")%></span>
              <p class="item-name">Name</p>             
            </div> 
               <div class="item">
              <span class="price"><%=rs.getString("email")%></span>
              <p class="item-name">Email</p>             
            </div>   
           <div class="item">
              <span class="price"><%=rs.getString("addr")%></span>
              <p class="item-name">Address</p>
        
            </div>
            <div class="item">
              <span class="price"><%=rs.getString("mob")%></span>
              <p class="item-name">Mobile no</p>
             
            </div>
             <div class="item">
              <span class="price"><%=rs.getString("mode")%></span>
              <p class="item-name">Mode</p>
            </div>                    
            <div class="total">Status<span class="price"><%=rs.getString("status")%></span></div>                                   
              <div class="form-group col-sm-12">
                  <div class="total">                    
                    <input type="submit" class="btn btn-danger" value="BACK TO HOME" formaction="index.jsp">             
              </div>
             </form>
                   
                   <% 
                   status= rs.getString("status");               
                cn1.close();
                }                                   
                 }                
               cn.close();
            }                    
                catch(Exception ex)
                {
                    out.print(ex);
                }
                if(status.equals("accept"))
{
    %><p>order confirmed by tiffin provider</p><%
} 
                else if(status.equals("reject"))
                {
                    %><br><br><b><p style="font-size:24;color:green">Order has been cancelled by HomeChef due to some issue.. <br> We are very sorry for the 
                    inconvenience caused to you..<BR>The paid amount will be returned to the original source of payment 
                    within 48 hours.. <br> You will notified about the same..</p></b><%
                }
                %>    