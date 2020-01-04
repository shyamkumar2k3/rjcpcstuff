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

    protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        
                
        float s=Float.parseFloat(req.getParameter("tsal"));
        float HRA=s*8/100;
        float DA=s*6/100;
        float PF=s*9/100;
        float Nsal=s+HRA+DA+PF;
        pw.print("<body bgcolor=grey>");
        pw.print("<img src=Lighthouse.jpg width=200 height=100>");
        pw.print("<table><center>");
        pw.print("<tr><td>BASIC SALARY</td><td>"+s+"</td></tr>");
        pw.print("<tr><td>HRA</td><td>"+HRA+"</td></tr>");
        pw.print("<tr><td>DA</td><td>"+DA+"</td></tr>");
        pw.print("<tr><td>PF</td><td>"+PF+"</td></tr>");
        pw.print("<tr><td>NSAL</td><td>"+Nsal+"</td></tr>");
        pw.print("</table></center></body>");
    }}