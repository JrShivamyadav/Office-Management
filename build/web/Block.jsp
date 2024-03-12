<%-- 
    Document   : Block
    Created on : 8 Mar, 2024, 6:17:08 PM
    Author     : shiva
--%>

<%@page import="admin.DBConnection" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="AdminHome.jsp" %>

<div>
    <center>
        <br>
        <span style="font-size: 30px;color:brown;font-style: normal;">Block Employee </span>
        <br><br>
        
       <% 
           if(request.getParameter("code")== null)
       { %>
       <form action="#">
           <table width="400" border="2" cellpadding="20">
               <tr><td>Enter Employee Code</td><td><input type="number" name="code"></td></tr>
               <tr><td><input type="submit" value="Submit"></td><td><input type="reset" value="Reset" ></td></tr>
         
       <%
}
else{
               String code = request.getParameter("code");
               DBConnection db = new DBConnection();
               db.pstmt = db.con.prepareStatement("select * from emp_mstr  where ecode=?");
               db.pstmt.setString(1,code);
               db.rst = db.pstmt.executeQuery();
               if(db.rst.next()){
                  
                   
                  out.println("<form action=Block>");
                  out.println("<table width='600'bgcolor='pink' border='1' cellpadding='10'>");
                  out.println("<tr><td width='200'>Employee Code </td> <td><input type='text' name='code' value="+db.rst.getString(1)+"></td></tr>");
                  out.println("<tr><td width='200'>Employee Name </td> <td><input type='text' name='name' value="+db.rst.getString(2)+"></td></tr>");
                  out.println("<tr><td width='200'>Employee Name </td> <td><input type='text' name='post' value="+db.rst.getString(5)+"></td></tr>");
                   out.println("<tr><td width='200'>Id Name </td> <td><input type='text' name='idname' value="+db.rst.getString(10)+"></td></tr>");
                  out.println("<tr><td width='200'>Id Number </td> <td><input type='text' name='idno' value="+db.rst.getString(11)+"></td></tr>");
                  
                
                  
                  out.println("<tr><td width='300'><input type='submit' value='Block'></td><td><input type='reset' value='Reset'></td></tr>");
                  out.println("</table></form>");
                  
               }
               else{
                   out.println("<h1>Record Does Not Matched </h1>");
               }
}   
%>  
  </table>
       </form>
    </center>
</div>

