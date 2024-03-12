<%-- 
    Document   : login
    Created on : 12 Mar, 2024, 8:16:23 PM
    Author     : shiva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            
        .login{
           width: 400px;
           height: 250px;
           background-color: #ff9999;
           box-shadow: 15px 15px 5px 20px #000000;
           border-radius: 30px;  
        }
        
    
        </style>
    </head>
    <body style="background:pink;margin-top: 100px;">
        <center>
     <div >
         <form action="login" method="get">
             <fieldset  class="login" >
                   <legand><h2 style="color:#00264d;">User Login</h2></legand>
                   <hr/>
             <table width=200px, height="150px">
            <tr width="30px" height="30px"><td width="10px"></td><td width="10px" align="center">
                    <select name="t1" style="width: 140px;height: 70;background-color: #009999;">
<option>..Select user type..</option><option value="Admin">Admin Login</option><option value="Employee">Employee Login</option></select></td><td width="10px"></td></tr> 
            
            <tr><td width="30px" align=center><lable><b>User_Id:</b></lable><lable style="color:red;">*</lable><td><input type=text name="t2"/></td></tr><tr height="10px"></tr>
            <tr><td width="30px" align=left><lable><b>Password:</b></lable><lable style="color:red;">*</lable></td><td><input type=password name="t3"/></td></tr><tr height="5px"></tr>
      <tr width="30px"><td width="10px"></td><td width="10px" align="center"><input type="submit" value="LogIn" style="width:70px;height: 25px;background-color: #ffdb4d;"></td><td width="10px"></td></tr>
      <tr height="10px"></tr>  <tr width="30px" height="20px"><td width="10px"></td><td width="10px" align="center"><a href="home.jsp"><h3>Back to Home Page..</h3></a></td><td width="10px"></td></tr> 

</table>
               
            
</fieldset>
          </form>
</div>
    </center>
    </body>
</html>
