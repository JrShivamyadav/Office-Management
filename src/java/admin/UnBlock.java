
package admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UnBlock extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
               String user = request.getParameter("code");
               DBConnection db = new DBConnection();
               db.pstmt = db.con.prepareStatement("UPDATE login SET ac_status =1 WHERE user=? ");
               db.pstmt.setString(1,user);
               int i1 = db.pstmt.executeUpdate();
               if(i1>0){
                   db.pstmt = db.con.prepareStatement("update emp_status set last_work_date= CURDATE() where ecode=?");
               db.pstmt.setString(1,user);
               int i2= db.pstmt.executeUpdate();
               
               if(i1>0 && i2>0){
                   response.sendRedirect("AdminHome.jsp?msg=Account has been  UnBlocked");
               }            
        }
        }catch(Exception e){
                    e.printStackTrace();
                    }
    }
    
}
