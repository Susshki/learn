package com.sushma.springweb.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sushma.springweb.service.UserValidationService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserValidationService validationService = new UserValidationService(); 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(validationService.isValidUser(request.getParameter("username"), request.getParameter("password"))) {
			request.setAttribute("username", request.getParameter("username"));
			request.getRequestDispatcher("WEB-INF/views/welcome.jsp").forward(request, response);
		}else {
			request.setAttribute("errorMessage", "InvalidCredentials");
			request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
		}
	}

}
