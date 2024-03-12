package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminChngPswd_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    <style>\n");
      out.write("        .blockk{\n");
      out.write("            height: 60px;\n");
      out.write("            width: 180px;\n");
      out.write("            background:red;\n");
      out.write("            margin-right: 20px;\n");
      out.write("            border-radius: 10px;  \n");
      out.write("        }\n");
      out.write("       \n");
      out.write("          .unblockk{\n");
      out.write("            height: 60px;\n");
      out.write("            width: 180px;\n");
      out.write("            background:greenyellow;\n");
      out.write("            margin-right: 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("             \n");
      out.write("        }\n");
      out.write("         .blockk:hover, .unblockk:hover{\n");
      out.write("            height: 60px;\n");
      out.write("            width: 180px;\n");
      out.write("            background:blue;\n");
      out.write("            margin-right: 20px;\n");
      out.write("            border-radius: 10px; \n");
      out.write("        }\n");
      out.write("    </style>\n");
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
      out.write("        <h1><a href=\"AdminHome.jsp\"><span>OFFICE MANAGER  (Admin)</span></a></h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("      <div class=\"menu_nav\" style=\"width:1300px; \">\n");
      out.write("        <ul>\n");
      out.write("\n");
      out.write("          <li class=\"active\">\n");
      out.write("              <a href=\"AddEmp.jsp\"><span>Add Employee</span></a></li>\n");
      out.write("          <li><a href=\"searchEmp.jsp\"><span>Search Employee</span></a></li>\n");
      out.write("          <li><a href=\"EmpList.jsp\"><span>Employee List</span></a></li>\n");
      out.write("          <li><a href=\"AdminAttendanceReport.jsp\"><span>Attendance Report</span></a></li>\n");
      out.write("          <li><a href=\"ChngPswd.jsp\"><span>Change Password</span></a></li>\n");
      out.write("          <li><a href=\"logout\"><span>Logout</span></a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("      <div class=\"slider\" >\n");
      out.write("        <div id=\"coin-slider\"> <a href=\"#\"><img src=\"images/slide1.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a> <a href=\"#\"><img src=\"images/om5.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a> <a href=\"#\"><img src=\"images/slide2.jpg\" width=\"960\" height=\"360\" alt=\"\" /> </a><a href=\"#\"><img src=\"images/slide3.jpg\" width=\"960\" height=\"360\" alt=\"\" /> </a> <a href=\"#\"><img src=\"images/om.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a><a href=\"#\"><img src=\"images/om2.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a><a href=\"#\"><img src=\"images/om3.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a><a href=\"#\"><img src=\"images/om4.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a></div>\n");
      out.write("        <div> <button class=\"blockk\"><a href=\"Block.jsp\" style=\"color: white; font-size: 30px;text-decoration: none;\">Block</a></button>\n");
      out.write("        <button class=\"unblockk\"><a href=\"UnBlock.jsp\" style=\"color: white; font-size: 30px;text-decoration: none;\">UnBlock</a></button></div>\n");
      out.write("       <div class=\"clr\"></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("   \n");
      out.write("\n");
      out.write("   \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("  </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("<div>\n");
      out.write("    <center>\n");
      out.write("        <br>\n");
      out.write("        <span style=\"font-size: 30px;color:brown;font-style: normal;\">Change Password </span>\n");
      out.write("        <br><br>\n");
      out.write("        <form action=\"ChngPswd\">\n");
      out.write("            <table width=\"600\" border=\"1\" cellpadding=\"20\">\n");
      out.write("                <tr><td> Enter Old Password </td><td><input type=\"password\" name=\"opswd\"></td></tr>\n");
      out.write("                <tr><td> Enter New Password </td><td><input type=\"password\" name=\"npswd\"></td></tr>\n");
      out.write("                <tr><td> Confirm New Password </td><td><input type=\"password\" name=\"cpswd\"></td></tr>\n");
      out.write("                <tr><td><input type=\"submit\" value=\"Submit\"></td><td><input type=\"reset\" value=\"Reset\"></td></tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("</div>\n");
      out.write("\n");
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
