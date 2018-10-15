package com.example.serverletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
				
		out.println("<html><body><h1> LeBron James <br> Koszykarz grajacy dla Los Angles Lakers. <br><br> Mistrz NBA w: <ul><li>2012</li><li>2013</li><li>2016</li></ul> </h1></body></html>");
		
	}
	

}
