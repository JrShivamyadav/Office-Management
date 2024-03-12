<%-- 
    Document   : searchEmp
    Created on : 8 Mar, 2024, 11:15:13 AM
    Author     : shiva
--%>
<%@page import="admin.DBConnection" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="AdminHome.jsp" %>

<div>
    <center>
        <br>
        <span style="font-size: 30px;color:brown;font-style: normal;">Search Employee </span>
        <br><br>
        
       <% 
           if(request.getParameter("code")== null)
       { %>
       <form action="#">
            <table style="width: 500px; height: 250px; border:2px solid black;font-size: 20px;color: black;text-align:center; background-color: #ff9999; box-shadow: 15px 15px 5px 20px #000000;border-radius: 30px;">
               <tr><td>Enter Employee Code</td><td><input type="number" name="code"></td></tr>
               <tr><td><input type="submit" value="Submit" style="height: 40px;width: 100px; background-color: green;color: white;"></td>
                   <td><input type="reset" value="Reset" style="height: 40px;width: 100px; ;background-color: blue;color: white;"></td>
               </tr>
               
         
       <%
}
else{
               String code = request.getParameter("code");
               DBConnection db = new DBConnection();
               db.pstmt = db.con.prepareStatement("select * from emp_mstr where ecode=?");
               db.pstmt.setString(1,code);
               db.rst = db.pstmt.executeQuery();
               if(db.rst.next()){
                   String v1= db.rst.getString(1);
                   
                  out.println("<form action=UpdateEmp>");
                  out.println("<table width='500'bgcolor='pink' border='2' cellpadding='10' cellspacing='0'style='color:black'>");
                  out.println("<tr><td width='100'>Employee Name </td> <td><input type='text' name='code' value="+db.rst.getString(2)+"></td></tr>");
                  out.println("<tr><td width='100'>Date Of Birth </td> <td><input type='text' name='code' value="+db.rst.getString(3)+"></td></tr>");
                  out.println("<tr><td width='100'>Gender </td> <td><input type='text' name='code' value="+db.rst.getString(4)+"></td></tr>");
                  out.println("<tr><td width='100'>Post </td> <td><input type='text' name='code' value="+db.rst.getString(5)+"></td></tr>");
                  out.println("<tr><td width='100'> Address </td> <td><input type='text' name='code' value="+db.rst.getString(6)+"></td></tr>");
                  out.println("<tr><td width='100'>City </td> <td><input type='text' name='code' value="+db.rst.getString(7)+"></td></tr>");
                  out.println("<tr><td width='100'>Contact </td> <td><input type='number' name='code' value="+db.rst.getString(8)+"></td></tr>");
                  out.println("<tr><td width='100'>Email </td> <td><input type='text' name='code' value="+db.rst.getString(9)+"></td></tr>");
                  out.println("<tr><td width='100'>ID Name</td> <td><input type='text' name='code' value="+db.rst.getString(10)+"></td></tr>");
                  out.println("<tr><td width='100'>Id Number</td> <td><input type='number' name='code' value="+db.rst.getString(11)+"></td></tr>");
                
                  
                  out.println("<tr><td width='200'><input type='submit' value='Update'></td><td><a href=Block?user="+code+"><input type='button' value='Block'></a></td></tr>");
                  out.println("</table></form>");
                  
                  
                  
               }
               else{
                   out.println("<h1>Record Does Not Matched </h1>");
               }
}   
%>  
  </table>
  <br><br><br>
       </form>
    </center>
</div>
