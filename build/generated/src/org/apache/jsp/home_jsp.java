package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        .login{\n");
      out.write("           width: 400px;\n");
      out.write("           height: 250px;\n");
      out.write("           background-color: #ff9999;\n");
      out.write("           box-shadow: 15px 15px 5px 20px #000000;\n");
      out.write("           border-radius: 30px;  \n");
      out.write("        }\n");
      out.write("        \n");
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
      out.write("        <h1><a href=\"home.jsp\"><span>OFFICE MANAGER (Home)</span></a></h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("      <div class=\"menu_nav\" style=\"width:1300px; \">\n");
      out.write("        <ul>\n");
      out.write("          <li class=\"active\"><a href=\"home.jsp\"><span>Home</span></a></li>\n");
      out.write("          <li><a href=\"AboutUs.jsp\"><span>About Us</span></a></li>\n");
      out.write("          \n");
      out.write("          <li><a href=\"ContactUs.jsp\"><span>Contact Us</span></a></li>\n");
      out.write("          <li><a href=\"Services.jsp\"><span>Our Services</span></a></li>\n");
      out.write("          <li><a href=\"login.jsp\"><span>Login</span></a></li>\n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("      <div class=\"slider\" >\n");
      out.write("        <div id=\"coin-slider\"> <a href=\"ImgOffice.jsp\"><img src=\"images/slide1.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a> <a href=\"#\"><img src=\"images/om5.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a> <a href=\"#\"><img src=\"images/slide2.jpg\" width=\"960\" height=\"360\" alt=\"\" /> </a><a href=\"#\"><img src=\"images/slide3.jpg\" width=\"960\" height=\"360\" alt=\"\" /> </a> <a href=\"#\"><img src=\"images/om.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a><a href=\"#\"><img src=\"images/om2.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a><a href=\"#\"><img src=\"images/om3.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a><a href=\"#\"><img src=\"images/om4.jpg\" width=\"960\" height=\"360\" alt=\"\" /></a></div>\n");
      out.write("       <div class=\"clr\"></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div></br></br></br>\n");
      out.write("    <center>\n");
      out.write("     <div style=\"width:400px;height:350px;\">\n");
      out.write("         <form action=\"login\" method=\"get\">\n");
      out.write("             <fieldset  class=\"login\" >\n");
      out.write("                   <legand><h2 style=\"color:#00264d;\">User Login</h2></legand>\n");
      out.write("                   <hr/>\n");
      out.write("             <table width=200px, height=\"150px\">\n");
      out.write("            <tr width=\"30px\" height=\"30px\"><td width=\"10px\"></td><td width=\"10px\" align=\"center\">\n");
      out.write("                    <select name=\"t1\" style=\"width: 140px;height: 70;background-color: #009999;\">\n");
      out.write("<option>..Select user type..</option><option value=\"Admin\">Admin Login</option><option value=\"Employee\">Employee Login</option></select></td><td width=\"10px\"></td></tr> \n");
      out.write("            \n");
      out.write("            <tr><td width=\"30px\" align=center><lable><b>User_Id:</b></lable><lable style=\"color:red;\">*</lable><td><input type=text name=\"t2\"/></td></tr><tr height=\"10px\"></tr>\n");
      out.write("            <tr><td width=\"30px\" align=left><lable><b>Password:</b></lable><lable style=\"color:red;\">*</lable></td><td><input type=password name=\"t3\"/></td></tr><tr height=\"5px\"></tr>\n");
      out.write("      <tr width=\"30px\"><td width=\"10px\"></td><td width=\"10px\" align=\"center\"><input type=\"submit\" value=\"LogIn\" style=\"width:70px;height: 25px;background-color: #ffdb4d;\"></td><td width=\"10px\"></td></tr>\n");
      out.write("      \n");
      out.write("\n");
      out.write("</table>\n");
      out.write("               \n");
      out.write("            \n");
      out.write("</fieldset>\n");
      out.write("          </form>\n");
      out.write("</div>\n");
      out.write("    </center><br/><br/>\n");
      out.write("<div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"fbg\">\n");
      out.write("    <div class=\"fbg_resize\">\n");
      out.write("        <div class=\"col c1\"> <a href=\"ImgOffice.jsp\">\n");
      out.write("        <h2><span>Image</span> Gallery</h2>\n");
      out.write("        <a href=\"#\"><img src=\"images/gal1.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> <a href=\"#\"><img src=\"images/gal2.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> <a href=\"#\"><img src=\"images/gal3.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> <a href=\"#\"><img src=\"images/gal4.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> <a href=\"#\"><img src=\"images/gal5.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> <a href=\"#\"><img src=\"images/gal6.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> \n");
      out.write("            </a></div>\n");
      out.write("        <div class=\"col c2\"><a href=\"Services.jsp\">\n");
      out.write("        <h2><span>Services</span> Overview</h2>\n");
      out.write("        <p>Curabitur sed urna id nunc pulvinar semper. Nunc sit amet tortor sit amet lacus sagittis posuere cursus vitae nunc.Etiam venenatis, turpis at eleifend porta, nisl nulla bibendum justo.</p>\n");
      out.write("        <ul class=\"fbg_ul\">\n");
      out.write("          <li><a href=\"#\">Lorem ipsum dolor labore et dolore.</a></li>\n");
      out.write("          <li><a href=\"#\">Excepteur officia deserunt.</a></li>\n");
      out.write("          <li><a href=\"#\">Integer tellus ipsum tempor sed.</a></li>\n");
      out.write("        </ul>\n");
      out.write("            </a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col c3\">\n");
      out.write("        <h2><span>Contact</span> Us</h2>\n");
      out.write("        <p></p>\n");
      out.write("        <p class=\"contact_info\"> <span>Address:IET_RMLAU,Ayodhya </span> \n");
      out.write("          \n");
      out.write("          <span></span> <br />\n");
      out.write("          <span>Contact: 6387190768</span> <br /><br>\n");
      out.write("          <span>E-mail: shivamyadav343343@gmail.com</span> <a href=\"#\"></a> </p>\n");
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
