package com.sushma.springweb;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet{	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter writer = response.getWriter();	
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>SampleSpring Web App from scratch</title>");
		writer.println("<body>");
		writer.println("<h1> Hello World </h1>");
		writer.println("</body>");
		writer.println("</head>");
		writer.println("</html>");
	}
	
}