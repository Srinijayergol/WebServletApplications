package com.web.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BankInfoServlet
 */
public class BankInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		String straddress = request.getParameter("address");
		String strcity = request.getParameter("city");
		String strstate = request.getParameter("state");
		String strcountry = request.getParameter("country");
		String strphone = request.getParameter("phone");
		
		HttpSession session = request.getSession(true);
		session.setAttribute("address", straddress);
		session.setAttribute("city", strcity);
		session.setAttribute("state", strstate);
		session.setAttribute("country", strcountry);
		session.setAttribute("phone", strphone);
		
		response.sendRedirect("html/bankinfo.html");
	}

}
