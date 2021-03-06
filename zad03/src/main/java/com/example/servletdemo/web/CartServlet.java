package com.example.servletdemo.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.servletdemo.domain.Phone;
import com.example.servletdemo.service.StorageService;

@WebServlet(urlPatterns = "/cart")
public class CartServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		StorageService ss = (StorageService) getServletContext().getAttribute("storage_service");
		
		List<Phone> allPhones = ss.getShoppingCart();

		out.append("<html><body><h2>Your cart:</h2>");

		for (Phone phone: allPhones) {
			out.append("<p>Id: " + phone.getId() + "</p>");
			out.append("<p>Producer: " + phone.getProducer() + "</p>");
			out.append("<p>Made date: " + phone.getProductionDate() + "</p>");
			out.append("<p>Price: " + phone.getPrice() + "</p>");
			out.append("<p>Is Reserved: " + phone.isReserved() + "</p></br>");
		}

		out.append("</br><li><a href='index'>Index</a></li>");
		out.append("</body></html>");
		out.close();
	}
	
	@Override
	public void init() throws ServletException {

		// application context
		getServletContext().setAttribute("storage_service", new StorageService());
	}
}
