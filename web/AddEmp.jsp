<%-- 
    Document   : AddEmp
    Created on : 8 Mar, 2024, 10:38:35 AM
    Author     : shiva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="AdminHome.jsp" %>

<div>
    <center><br><br><br>
        <span style="font-size:30px;color: brown;font-style:normal;">Add New Employee</span> <br><br><br>
        <form action="AddEmployee">
            
            <table style="width: 600px; height: 550px; border:2px solid black;font-size: 20px;color: black;text-align:center; background-color: #ff9999; box-shadow: 15px 15px 5px 20px #000000;border-radius: 30px;">
                <tr><td width="300">Employee Code(User)</td> <td><input type="number" name="code"></td></tr>
                <tr><td width="300">Password</td><td><input type="password" name="pswd"></td></tr>
                <tr><td width="300">Employee Name</td><td><input type="text" name="name"></td></tr>
                <tr><td width="300">Date Of Birth</td><td><input type="date" name="dob"></td></tr>
                <tr><td width="300">Gender</td><td><input type="radio" name="gen" value="male">Male
                <input type="radio" name="gen" value="female">Female</td></tr>
                
                <tr><td width="300">Post</td><td><input type="text" name="post"></td></tr>
                 <tr><td width="300">Address</td><td><input type="text" name="addr"></td></tr>
                  <tr><td width="300">City</td><td><input type="text" name="city"></td></tr>
                   <tr><td width="300">Contact</td><td><input type="text" name="cont"></td></tr>
                    <tr><td width="300">Email</td><td><input type="text" name="mail"></td></tr>
                     <tr><td width="300">Id Name</td><td><input type="text" name="idname"></td></tr>
                      <tr><td width="300">Id Number</td><td><input type="text" name="idno"></td></tr>
                      <tr><td width="300"><input type="submit" value="Register"></td><td><input type="reset" value="Reset"></td> </tr>
                      
            </table>
        </form>
    </center>
    <br><br><br>
</div>
