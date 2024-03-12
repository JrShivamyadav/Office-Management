<%-- 
    Document   : AdminAttendanceReport
    Created on : 11 Mar, 2024, 3:53:16 PM
    Author     : shiva
--%>

<%@page import="admin.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="AdminHome.jsp" %>
<center><h2>Attendance Report</h2>
    <form action="#">
        <br><b>Search Employee Attendance :
            <input type="search" name="code" placeholder="Enter Employee Code"></b></br><br>
            <table width="1000" cellspacing="0" cellpadding="5" border="1" bgcolor="lightpink">
                <tr bgcolor="lightblue"><td>SNo.</td><td>Employee Code</td><td>Employee Name </td>
                    <td>Employee Gender </td><td>E Mail Address </td> <td>Attendance Date </td><td>Time IN </td><td>Time Out</td></tr>
                <%
                    try {
                        if (request.getParameter("code")!=null){
                            String user = request.getParameter("code");
                            DBConnection db = new DBConnection();
                            db.pstmt = db.con.prepareStatement("select emp_mstr.ecode,emp_mstr.ename,emp_mstr.egender,emp_mstr.email,emp_attendance.atnd_date,emp_attendance.time_in,emp_attendance.time_out from emp_mstr,emp_attendance where emp_mstr.ecode = emp_attendance.ecode and emp_attendance.ecode=?");
                            db.pstmt.setString(1,user);
                            db.rst = db.pstmt.executeQuery();
                            int count =1;
                            while(db.rst.next()){
                                out.println("<tr><td bgcolor=dodgerblue style='color:white;'>"+count+"</td><td>"+db.rst.getString(1)+"</td>"
                                        + "<td>"+db.rst.getString(2)+"</td><td>"+db.rst.getString(3)+"</td>"
                                        + "<td>"+db.rst.getString(4)+"</td><td>"+db.rst.getString(5)+"</td>"
                                        + "<td>"+db.rst.getString(6)+"</td><td>"+db.rst.getString(7)+"</td><tr>");
                                count++;
                                
                            }
                        }
                        else{
                            DBConnection db = new DBConnection();
                            db.pstmt = db.con.prepareStatement("select emp_mstr.ecode,emp_mstr.ename,emp_mstr.egender,emp_mstr.email,emp_attendance.atnd_date,emp_attendance.time_in,emp_attendance.tim_out from emp_mstr,emp_attendance where emp_mstr.ecode=emp_attendance.ecode");
                            db.rst = db.pstmt.executeQuery();
                            int count=1;
                            while(db.rst.next()){
                                out.println("<tr><td bgcolor=dodgerblue style='color:white;'>"+count+"</td><td>"+db.rst.getString(1)+"</td>"
                                        + "<td>"+db.rst.getString(2)+"</td><td>"+db.rst.getString(3)+"</td><td>"+db.rst.getString(4)+"</td><td>"
                                        + "<td>"+db.rst.getString(4)+"</td><td>"+db.rst.getString(5)+"</td><td>"+db.rst.getString(6)+"</td><td>"+db.rst.getString(7)+"</td></tr>");
                                count++;
                            }
                        }
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
                    %>
            </table>
                
    </form>
