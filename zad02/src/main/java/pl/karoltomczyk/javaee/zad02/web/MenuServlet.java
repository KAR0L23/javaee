package pl.karoltomczyk.javaee.zad02.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("menu")
public class MenuServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletResponse.setContentType("text/html");

        PrintWriter out = httpServletResponse.getWriter();

        out.println("<html><body><ul><li><a href='/zad02/date'>Date</a></li><li><a href='/zad02/about'>About Me</a></li></ul></body></html>");
    }
}
