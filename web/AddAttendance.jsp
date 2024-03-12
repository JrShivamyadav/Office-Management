<%-- 
    Document   : AddAttendance
    Created on : 8 Mar, 2024, 2:08:34 PM
    Author     : shiva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="EmployeeHome.jsp" %>
<center>
    <h1>Add Attendance</h1>
 <br><br><br>
 <table width="500">
 <tr><td width="250"><a href="Attendancee?atnd=1"><input type="button" name="btn" 
value="Check IN" style="width:140px;height:40px;background-color:brown;color:white;font-size:20px;"></a></td>
 <td width="250"><a href="Attendancee?atnd=0"><input type="button" name="btn" value="Check 
Out" style="width:140px;height:40px;background-color:brown;color:white;font-size:20px;"></a></td></tr>
 </table>
</center>