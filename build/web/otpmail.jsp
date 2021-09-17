<%-- 
    Document   : otpmail
    Created on : 10 Mar, 2021, 8:30:09 PM
    Author     : HP
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*,javax.mail.*"%>
<%@ page import="javax.mail.internet.*" %>
<%@page import="java.util.Random" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
                String email =(String)session.getAttribute("email");
                
              //Creating a result for getting status that messsage is delivered or not!
                Random rd=new Random();
                int x= rd.nextInt(9000)+1000;
                session.setAttribute("otp",x);
                double amt=(Double)session.getAttribute("price");
                String card=(String)session.getAttribute("cardno");  
               Long card1=Long.parseLong(card);
        
               String result;
           //   Get recipient's email-ID, message & subject-line from index.html page
                final String to = email;
                final String subject = "OTP for payment ";
                final String messg = "Dear Customer\n\nGreetings from your bank\n\n "+ x +""
                        + " is your OTP for txn of INR "+amt+" at HOMEAL on your bank card "+card1+
                        ".\n\nOTPs are sensitive data.\nDONOT DISCLOSE IT TO ANYONE."
                        + "\nBank Never asks for OTPs";
            // Sender's email ID and password needs to be mentioned
            final String from = "homeal9859@gmail.com";
            final String pass = "greatgitu";
            // Defining the gmail host
            String host = "smtp.gmail.com";
            // Creating Properties object
            Properties props = new Properties();
            // Defining properties
            props.put("mail.smtp.host", host);
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.user", from);
            props.put("mail.password", pass);
            props.put("mail.port", "587");

            // Authorized the Session object.
            Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from, pass);
                }
            });

            try {
                // Create a default MimeMessage object.
                MimeMessage message = new MimeMessage(mailSession);
                // Set From: header field of the header.
                message.setFrom(new InternetAddress(from));
                // Set To: header field of the header.
                message.addRecipient(Message.RecipientType.TO,
                        new InternetAddress(to));
                // Set Subject: header field
                message.setSubject(subject);
                // Now set the actual message
                message.setText(messg);
                // Send message
                Transport.send(message);           
                response.sendRedirect("checkotp.jsp");
            } catch (MessagingException mex) {
                //mex.printStackTrace();
                out.println(mex);
                result = "Error: unable to send mail....";
            }
        %>
    </body>
</html>
