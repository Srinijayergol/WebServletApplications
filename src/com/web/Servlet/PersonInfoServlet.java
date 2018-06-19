package com.web.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class IndexServlet
 */
public class PersonInfoServlet extends HttpServlet {
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Step1 : Read the information
		
     	String bankName = request.getParameter("bankName");
     	String account = request.getParameter("account");
     	String ssn = request.getParameter("ssn");
     	
     	//Step2: Processing
     			//a. validation
     			//b. db interaction
     	HttpSession ses = request.getSession(true);
		
		ses.setAttribute("bankName", bankName);
		ses.setAttribute("account", account);
		ses.setAttribute("ssn", ssn);		
		
		//Step3 : Response
	//	PrintWriter out = response.getWriter();
		response.sendRedirect("jsp/personInfoOutput.jsp");
     	
	}

	

}
