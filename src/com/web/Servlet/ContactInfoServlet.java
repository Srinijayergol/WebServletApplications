package com.web.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ContactInfoServlet
 */
public class ContactInfoServlet extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String strfname = request.getParameter("fname");
		String strlname = request.getParameter("lname");
		String strmname = request.getParameter("mname");
		String strgender = request.getParameter("gender");
		
		HttpSession session = request.getSession(true);
		session.setAttribute("firstName", strfname); 			
		session.setAttribute("lastName", strlname);
		session.setAttribute("middleName", strmname);
		session.setAttribute("gender", strgender);
		
		response.sendRedirect("html/contactinfo.html");
				
	}

}
