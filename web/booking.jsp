<%-- 
    Document   : booking
    Created on : 7 Mar, 2021, 7:33:43 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

	<title>HOMEAL</title>

	<!-- Google font -->
	<link href="https://fonts.googleapis.com/css?family=PT+Sans:400" rel="stylesheet">

	<!-- Bootstrap -->
	<link type="text/css" rel="stylesheet" href="bookingcss/bootstrap.min.css" />

	<!-- Custom stlylesheet -->
	<link type="text/css" rel="stylesheet" href="bookingcss/style.css" />

	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->

</head>

<body>
    <%
        String meal=(String)request.getParameter("meal");
        String mealid=(String)request.getParameter("mealid");
        String b="disabled", l="disabled", d="disabled";
       if(meal.equals("b"))
       {
            b="checked";                 
       }
       else if(meal.equals("l"))
       {
            l="checked";                
       }
        else if(meal.equals("d"))
       {
            d="checked"; 
       }
      String chefs=(String)session.getAttribute("chef");
     String mdet=(String)request.getParameter("det");     
    %>
<div id="booking" class="section">
<div class="section-center">
<div class="container">
<div class="row">
<div class="booking-form">
    <form method="POST" action="payment.jsp">
        <input type="hidden" name="mealid" value="<%=mealid%>">
<div class="form-group">
<div class="form-checkbox">
<label for="roundtrip">
<input type="radio" id="roundtrip" name="mtype" value="breakfast" <%=b%>>
<span></span>BREAKFAST
</label>
    <label for="one-way">
<input type="radio" id="one-way" name="mtype" value="lunch" <%=l%>>
<span></span>LUNCH
    </label>
    <label for="multi-city">
<input type="radio" id="multi-city" name="mtype" value="dinner" <%=d%>>
<span></span>DINNER
    </label>
</div>
</div>
<div class="row">
    <div class="col-md-3">
<div class="form-group">
    <span class="form-label">HOMECHEF</span>
    <input class="form-control" type="text" name= "chefname" value="<%=chefs%>" readonly>
</div>
    </div>
<div class="col-md-3">
    <div class="form-group">
        <span class="form-label">MEAL DETAILS</span>
        <input class="form-control" type="text" name="det" value="<%=mdet%>" readonly>
    </div>
</div>
<div class="col-md-3">
<div class="form-group">
<span class="form-label">EMAIL ADDRESS</span>
<input class="form-control" type="text" placeholder="enter a valid email address" name="email" required>
                                                                            </div>
                                                                    </div>
                                                                    <div class="col-md-3">
                                                                            <div class="form-group">
										<span class="form-label">NAME</span>
										<input class="form-control" type="text" placeholder="name" name="custname" required>
									</div>
								</div>        
							</div>
							<div class="row">
								<div class="col-md-3">
									<div class="form-group">
										<span class="form-label">PHONE NUMBER</span>
										<input class="form-control" type="text" placeholder="phone number" name="phno" required>
									</div>
								</div>
								<div class="col-md-3">
									<div class="form-group">
										<span class="form-label">START FROM</span>
										<input class="form-control" type="date" name="date" required>
									</div>
								</div>
								<div class="col-md-2">
									<div class="form-group">
										<span class="form-label">HOW MANY DAYS</span>
										<select class="form-control" name="days" required>
											<option>7</option>
											<option>15</option>											
                                                                                        <option>30</option>
										</select>
										<span class="select-arrow"></span>
									</div>
								</div>
								<div class="col-md-2">
									<div class="form-group">
										<span class="form-label">PINCODE</span>
										<input class="form-control" type="text" name="pincode" required>
										<span class="select-arrow"></span>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-3">
									<div class="form-group">
										<span class="form-label">ADDRESS</span>
										<input class="form-control" type="text" placeholder="Enter delivery address" name="add" required>
										<span class="select-arrow"></span>
									</div>
								</div>
								<div class="col-md-3">
									<div class="form-btn">
                                                                            <input type="submit" class="submit-btn" value="book meal">
									</div>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>