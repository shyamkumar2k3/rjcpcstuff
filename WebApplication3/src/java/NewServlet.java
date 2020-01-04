/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    /**
     *
     * @param req
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
       
         String s1=req.getParameter("t1");
          String s2=req.getParameter("t2");
          int x=Integer.parseInt(s1);
           int y=Integer.parseInt(s2);
           int z=x*y;
           pw.write("product of "+x+"and "+y+"is "+z);
    }}
          

