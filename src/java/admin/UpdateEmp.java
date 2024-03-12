

package admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateEmp extends HttpServlet {

 
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          String code = request.getParameter("code");
          String name = request.getParameter("name");
          String dob = request.getParameter("dob");
          String post = request.getParameter("post");
          String addr = request.getParameter("addr");
          String city = request.getParameter("city");
          String cont = request.getParameter("cont");
          String mail = request.getParameter("mail");
          String idname = request.getParameter("idname");
          String idno = request.getParameter("idno");
          String gen = request.getParameter("gen");
          
         DBConnection db = new DBConnection();
         db.pstmt = db.con.prepareStatement("update emp_mstr set ename=?, edob=?,egender=?,epost=?,eaddr=?,ecity=?,econt=?,email=?,idname=?,idno=? where ecode=?");
         db.pstmt.setString(1, name);
         db.pstmt.setString(2, dob);
         db.pstmt.setString(3, gen);
         db.pstmt.setString(4, post);
         db.pstmt.setString(5, addr);
         db.pstmt.setString(6, city);
         db.pstmt.setString(7, cont);
         db.pstmt.setString(8, mail);
         db.pstmt.setString(9, idname);
         db.pstmt.setString(10, idno);
         db.pstmt.setString(11, code);
         
         int i = db.pstmt.executeUpdate();
         if(i>0){
             response.sendRedirect("AdminHome.jsp? msg= Record Updated SuccesssFully");
         }
        }
    
    catch(Exception e){
    e.printStackTrace();
}
    }
}
