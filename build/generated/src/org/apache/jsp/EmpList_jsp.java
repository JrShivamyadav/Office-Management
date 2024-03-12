package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import admin.DBConnection;

public final class EmpList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/AdminHome.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<title>Office Manager</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/coin-slider.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/droid_sans_400-droid_sans_700.font.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/coin-slider.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"main\">\n");
      out.write("  <div class=\"header\">\n");
      out.write("    <div class=\"header_resize\">\n");
      out.write("     \n");
      out.write("      <div class=\"logo\">\n");
      out.write("        <h1><a href=\"index_1.html\"><span>OFFICE MANAGER  (Admin)</span></a></h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("      <div class=\"menu_nav\" style=\"width:1000px; \">\n");
      out.write("        <ul>\n");
      out.write("          <li class=\"active\"><a href=\"addEmp.jsp\"><span>Add Employee</span></a></li>\n");
      out.write("          <li><a href=\"searchEmp.jsp\"><span>Search Employee</span></a></li>\n");
      out.write("          <li><a href=\"EmpList.jsp\"><span>Employee List</span></a></li>\n");
      out.write("          <li><a href=\"AtndRep.jsp\"><span>Attendance Report</span></a></li>\n");
      out.write("          <li><a href=\"ChngPswd.jsp\"><span>Change Password</span></a></li>\n");
      out.write("          <li><a href=\"logout.jsp\"><span>Logout</span></a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("      <div class=\"slider\" >\n");
      out.write("        <div id=\"coin-slider\"> <a href=\"#\"><img src=\"images/slide1.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a> <a href=\"#\"><img src=\"images/om5.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a> <a href=\"#\"><img src=\"images/slide2.jpg\" width=\"960\" height=\"360\" alt=\"\" /> </a><a href=\"#\"><img src=\"images/slide3.jpg\" width=\"960\" height=\"360\" alt=\"\" /> </a> <a href=\"#\"><img src=\"images/om.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a><a href=\"#\"><img src=\"images/om2.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a><a href=\"#\"><img src=\"images/om3.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a><a href=\"#\"><img src=\"images/om4.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a></div>\n");
      out.write("       <div class=\"clr\"></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div></br></br></br>\n");
      out.write("    <center>\n");
      out.write("     \n");
      out.write("    </center><br/><br/>\n");
      out.write("<div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"fbg\">\n");
      out.write("    <div class=\"fbg_resize\">\n");
      out.write("      <div class=\"col c1\">\n");
      out.write("        <h2><span>Image</span> Gallery</h2>\n");
      out.write("        <a href=\"#\"><img src=\"images/gal1.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> <a href=\"#\"><img src=\"images/gal2.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> <a href=\"#\"><img src=\"images/gal3.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> <a href=\"#\"><img src=\"images/gal4.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> <a href=\"#\"><img src=\"images/gal5.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> <a href=\"#\"><img src=\"images/gal6.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> </div>\n");
      out.write("      <div class=\"col c2\">\n");
      out.write("        <h2><span>Services</span> Overview</h2>\n");
      out.write("        <p>Curabitur sed urna id nunc pulvinar semper. Nunc sit amet tortor sit amet lacus sagittis posuere cursus vitae nunc.Etiam venenatis, turpis at eleifend porta, nisl nulla bibendum justo.</p>\n");
      out.write("        <ul class=\"fbg_ul\">\n");
      out.write("          <li><a href=\"#\">Lorem ipsum dolor labore et dolore.</a></li>\n");
      out.write("          <li><a href=\"#\">Excepteur officia deserunt.</a></li>\n");
      out.write("          <li><a href=\"#\">Integer tellus ipsum tempor sed.</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col c3\">\n");
      out.write("        <h2><span>Contact</span> Us</h2>\n");
      out.write("        <p></p>\n");
      out.write("        <p class=\"contact_info\"> <span>Address:</span> <br />\n");
      out.write("          <span>&nbsp;</span><br />\n");
      out.write("          <span></span> <br />\n");
      out.write("          <span>FAX:</span> <br />\n");
      out.write("          <span>E-mail:</span> <a href=\"#\"></a> </p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"footer\">\n");
      out.write("    <div class=\"footer_resize\">\n");
      out.write("      <p class=\"lf\">&copy; Copyright <a href=\"#\"></a>.</p>\n");
      out.write("      \n");
      out.write("      <div style=\"clear:both;\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("  </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("<center>\n");
      out.write("    <br>\n");
      out.write("    <span style=\"font-size: 30px;color:dodgerblue;font-style: normal;\">Employee List</span>\n");
      out.write("    <table width=\"1000\" border=\"2\" bgcolor=\"white\" cellpadding=\"5\" cellspacing=\"0\">\n");
      out.write("        <br>\n");
      out.write("        <tr bgcolor=\"yellow\"><th>S.No </th><th> Employee Code </th><th>Employee Name </th>\n");
      out.write("            <th>Date Of Birth </th><th>Gender </th><th>Post </th><th>Address </th>\n");
      out.write("            <th>City </th><th>Contact </th><th>E. mail </th><th>Id name </th>\n");
      out.write("            <th>Id Number </th> </tr>\n");
      out.write("        ");

            int count=1;
            try{
                DBConnection db = new DBConnection();
                db.pstmt = db.con.prepareStatement("select * from emp_mstr");
                db.rst = db.pstmt.executeQuery();
                while(db.rst.next()){
                    out.println("<tr><td bgcolor=cyan>"+count+"</td><td> " +db.rst.getString(1)+"</td><td>"
                    +db.rst.getString(2)+"</td><td>"+db.rst.getString(3)+"</td><td>"+db.rst.getString(4)+"</td><td>"
                    +db.rst.getString(5)+"</td><td>"+db.rst.getString(6)+"</td><td>"+db.rst.getString(7)+"</td><td>"
                    +db.rst.getString(8)+"</td><td>"+db.rst.getString(9)+"</td><td>"+db.rst.getString(10)+"</td><td>"
                    +db.rst.getString(11)+"</td></tr>");
                    count++;
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
      out.write("\n");
      out.write("    </table>\n");
      out.write("</center>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
