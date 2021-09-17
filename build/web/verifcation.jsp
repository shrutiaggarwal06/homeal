<%-- 
    Document   : verifcation
    Created on : 4 Feb, 2021, 11:00:46 AM
    Author     : HP
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
<style>
body{
background:url(images/LO1.jpeg);
background-size:cover;
background-repeat:no-repeat;
}
.frosted{
border-radius:1em;
width:600px;
height:100%;
background-color:rgba(211,211,211,0.3);
position:relative;
overflow:hidden;
margin:0 auto;
padding-left:4rem;
padding-bottom:2rem;
color: white;
}

#Message,#ps,#g,#dts,#dr,#qw,#fu,#Mess,#mes,#b,#l,#d,#mes1,#mes2,#mes3{   
        color:red ; 
       font-weight: bold ; 
       font-size:16px ; 
}
#submit{
    font-size:20px;
    font-family:'Times New Roman';
}

.im1{
    height:100px;
width:200px;
float:right;
}
#menu{
float:right;
margin-right:30px;
}
#menu ul
{
list-style : none ;
margin: 0;
}
#menu ul li
{
font-size : 20px ;
width : 150px ;
height : 60px ;
text-align : center ;
line-height : 60px ;
float : left ;
position : relative ;
}
#menu ul li a
{
text-decoration : none ;
color : white ;
display : block ;
line-height:100px;
}
#menu ul ul li a{
    width:100%;
    height:100%;
    background-color:rgba(0,0,0,0.3);
    line-height: 60px;
}
#menu ul ul
{
    margin-top:1px;
position : relative ;
display : none ;
}
#menu ul li:hover > ul
{
display : block ;
background-color:red;
}
.d4{
height:100px;
border:1px solid black;
box-shadow:12px;
border-radius:4px;
margin:3px auto;
background-color:rgba(0,0,0,0.3);
background-attachment:fixed;
}

</style>
<script>
    function fn()
    {
        var x=document.getElementById("t1").checked;
        if(x==true)
        {
            document.getElementById("m1").readOnly=false;
            document.getElementById("p1").readOnly=false;     
            document.getElementById("mes1").innerHTML="";
        }
        if(x==false)
        {
            document.getElementById("m1").readOnly=true;
            document.getElementById("p1").readOnly=true;   
            
        }
         var x1=document.getElementById("t2").checked;
        if(x1==true)
        {
            document.getElementById("m2").readOnly=false;
            document.getElementById("p2").readOnly=false; 
            document.getElementById("mes2").innerHTML="";
        }
        if(x1==false)
        {
            document.getElementById("m2").readOnly=true;
            document.getElementById("p2").readOnly=true;          
        }
         var x2=document.getElementById("t3").checked;
        if(x2==true)
        {
            document.getElementById("m3").readOnly=false;
            document.getElementById("p3").readOnly=false;
            document.getElementById("mes3").innerHTML="";
          
        }
        if(x2==false)
        {
            document.getElementById("m3").readOnly=true;
            document.getElementById("p3").readOnly=true;          
        }
    }
    function check()
    {
        var x=document.getElementById("t1").checked;
        var x1=document.getElementById("t2").checked;
        var x2=document.getElementById("t3").checked;
        if((x!=true)&& (x1!=true)&&(x2!=true))
        {
            alert("select atleast one checkbox");
            return false;
        }
    }
    function fn2()
    {
        var x=document.f1.ac.value;
        document.getElementById("Mess").innerHTML="" ;
        if((isNaN(x))||((x.length<12)||(x.length>12)))
                {
                        document.getElementById("Mess").innerHTML="Invalid Aadhar number Format<br> aadhar Number must contain only <br>numeric digits and exact : 12 digts" ;
                        return false;
                }              
    }
    function mp1()
    {
        var x=document.f1.mealpb.value;               
        document.getElementById("b").innerHTML="" ;                
        if((isNaN(x))||(x.length<0))
        {
               document.getElementById("b").innerHTML="Enter a valid input" ; 
               return false;
        }                                    
    }
    function mp2()
    {
        var x1=document.f1.mealpl.value;
        document.getElementById("l").innerHTML="" ;
        if((isNaN(x1))||(x1.length<0))
                {
                        document.getElementById("l").innerHTML="Enter a valid input" ;                        
                        return false;
                }         
    }
    function mp3()
    {
         var x2=document.f1.mealpd.value;
        document.getElementById("d").innerHTML="" ;
         if((isNaN(x2))||(x2.length<0))
                {
                        document.getElementById("d").innerHTML="Enter a valid input" ;                     
                        return false;
                    }    
    }
    function pop1()
    {
        var x=document.getElementById("t1").checked;
        if(x==false)
        {
            
            document.getElementById("mes1").innerHTML="Select the above checkbox" ;  
        }         
    }
    function pop2()
    {
        var x=document.getElementById("t2").checked;
        if(x==false)
        {
            
            document.getElementById("mes2").innerHTML="Select the above checkbox" ;  
        }       
    }
    function pop3()
    {
        var x=document.getElementById("t3").checked;
        if(x==false)
        {
            
            document.getElementById("mes3").innerHTML="Select the above checkbox" ;  
        }        
    }
</script>
</head>
<body>
        <br><br><br>    
<div class="frosted"> 
        <form style="line-height:5px" name = "f1" action="verificationupdate.jsp" method="POST" onsubmit="return check()"  >      
            <table style="line-height:20px">
                
                <tr>
                    <td colspan="2">
                        <font style="font-size:30px;color:#c2c2f0"><u>VERIFICATION</u></font><br></td>
                </tr>
                <br>                
                <tr>
                    <td> <br><font style="font-size:22px ; color:#141452">Aadhar Card:      </td><br>
                </tr>
                <tr>
                    <td class="td1"> <input type="text" name="ac" placeholder="Aadhar number" size="40" required onfocusout="fn2()"><br><span id="Mess"></span></td><br>                  
                </tr>  
                <tr>
                    <td> <br><font style="font-size:22px ; color:#141452">Tiffin Provider Name:      </td><br>
                </tr>
                <tr>
                    <td> <input type="text" name="tf" placeholder="tiffin provider name" size="40" required ><br></td><br>                  
                </tr>    
                <tr>
                    <td> <br><font style="font-size:22px ; color:#141452">Kitchen Address     </td><br>
                </tr>
                <br>
                <tr>
                    <td><textarea name="ka" placeholder="Enter address where the food is being cooked" size="40" required ></textarea><br></td><br>                  
                </tr>    
                <tr><td><br><input type="checkbox"  name="mealb" value="breakfast" id="t1"  onclick="fn()">Breakfast<br><span id="mes1"></span>     </tr>         
                 <tr>
                     <td> <font style="font-size:22px;color:#141452">Meal Details </td><br>
                </tr>
                <tr>
                    <td><textarea name="mealdb" placeholder="details like items for breakfast" cols="40" id="m1"  readonly required onclick="pop1()"></textarea></font><br></td>                    
                    </tr>
                 <tr>
                     <td><br> <font style="font-size:22px;color:#141452"> Meal Price </td><br>
                </tr>
                <tr>
                    <td><input type="text" name="mealpb" placeholder="meal price" size="40" id="p1" readonly required oninput="mp1()" onclick="pop1()"/><br></font></td>
                </tr>
                <tr>
                    <td><br><input type="checkbox"  name="meall" value="lunch" id="t2" onclick="fn()">Lunch<br> <span id="mes2"></span> 
                </tr>         
                 <tr>
                     <td><font style="font-size:22px;color:#141452">Meal Details </td><br>
                </tr>
                <tr>
                    <td><textarea name="mealdl" placeholder="details like items for lunch" cols="40" id="m2" readonly required onclick="pop2()"></textarea></font></td>                    
                </tr>
                 <tr>
                     <td><font style="font-size:22px;color:#141452"> Meal Price </td><br>
                </tr>
                <tr>
                    <td><input type="text" name="mealpl" placeholder="meal price" size="40" id="p2" readonly required oninput="mp2()" onclick="pop2()"/><br></font> <span id="l"></span></td>
                </tr>
                <tr>
                    <td><br><input type="checkbox"  name="meald" value="dinner" id="t3" onclick="fn()">Dinner<br><span id="mes3"></span>
                </tr>         
                 <tr>
                     <td><font style="font-size:22px;color:#141452">Meal Details </td><br>
                </tr>
                <tr>
                    <td><textarea name="mealdd" placeholder="details like items for dinner" cols="40" id="m3" readonly required onclick="pop3()"></textarea></font></td>                    
                </tr>
                 <tr>
                     <td><font style="font-size:22px;color:#141452"> Meal Price </td><br>
                </tr>
                <tr>
                    <td><input type="text" name="mealpd" placeholder="meal price" size="40" id="p3" readonly required oninput="mp3()" onclick="pop3()"/><br></font><span id="d"></span></td> </td>
                </tr> 
                <tr>
                    <td colspan="2">
                        <br><font style="font-size:20px ;color:burlywood"><u>Don'T Press Back Button</u></font> <br>  </td>
                </tr> 
            </table>
                <center>    <br><br><br><input type="submit" id="submit" value="SUBMIT"  /></center> 
        </form>                
</div>
 <br>
</body></html>

