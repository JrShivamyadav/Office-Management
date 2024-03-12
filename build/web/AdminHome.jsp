


<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <style>
        .blockk{
            height: 60px;
            width: 180px;
            background:red;
            margin-right: 20px;
            border-radius: 10px;  
        }
       
          .unblockk{
            height: 60px;
            width: 180px;
            background:greenyellow;
            margin-right: 20px;
            border-radius: 10px;
             
        }
         .blockk:hover, .unblockk:hover{
            height: 60px;
            width: 180px;
            background:blue;
            margin-right: 20px;
            border-radius: 10px; 
        }
    </style>
<title>Office Manager</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/coin-slider.css" />
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/droid_sans_400-droid_sans_700.font.js"></script>
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/coin-slider.min.js"></script>
</head>
<body>
<div class="main">
  <div class="header">
    <div class="header_resize">
     
      <div class="logo">
        <h1><a href="AdminHome.jsp"><span>OFFICE MANAGER  (Admin)</span></a></h1>
      </div>
      <div class="clr"></div>
      <div class="menu_nav" style="width:1300px; ">
        <ul>

          <li class="active">
              <a href="AddEmp.jsp"><span>Add Employee</span></a></li>
          <li><a href="searchEmp.jsp"><span>Search Employee</span></a></li>
          <li><a href="EmpList.jsp"><span>Employee List</span></a></li>
          <li><a href="AdminAttendanceReport.jsp"><span>Attendance Report</span></a></li>
          <li><a href="ChngPswd.jsp"><span>Change Password</span></a></li>
          <li><a href="logout"><span>Logout</span></a></li>
        </ul>
      </div>
      <div class="clr"></div>
      <div class="slider" >
        <div id="coin-slider"> <a href="#"><img src="images/slide1.jpg" width="960" height="360" alt="" /></a> <a href="#"><img src="images/om5.jpg" width="960" height="360" alt="" /></a> <a href="#"><img src="images/slide2.jpg" width="960" height="360" alt="" /> </a><a href="#"><img src="images/slide3.jpg" width="960" height="360" alt="" /> </a> <a href="#"><img src="images/om.jpg" width="960" height="360" alt="" /></a><a href="#"><img src="images/om2.jpg" width="960" height="360" alt="" /></a><a href="#"><img src="images/om3.jpg" width="960" height="360" alt="" /></a><a href="#"><img src="images/om4.jpg" width="960" height="360" alt="" /></a></div>
        <div> <button class="blockk"><a href="Block.jsp" style="color: white; font-size: 30px;text-decoration: none;">Block</a></button>
        <button class="unblockk"><a href="UnBlock.jsp" style="color: white; font-size: 30px;text-decoration: none;">UnBlock</a></button></div>
       <div class="clr"></div>
      </div>
      <div class="clr"></div>
    </div>
  </div>
   

   
  </div>
</div>
  </body>
</html>