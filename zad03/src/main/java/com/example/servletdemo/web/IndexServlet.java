package com.example.servletdemo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/index")
public class IndexServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body><h1>Welcome into my store!</h1> <br>" +
                "Menu: <br>" +
                "<ul>" +
                "<li><a href='add-phone'>Add phone</a></li>" +
                "<li><a href='all-phones'>Show phones</a></li>" +
                "<li><a href='cart'>Shopping card</a></li>" +
                "</ul>" +
                "</body></html>");
        out.close();
    }

}
