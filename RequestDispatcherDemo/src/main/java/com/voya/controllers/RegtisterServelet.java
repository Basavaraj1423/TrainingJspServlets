package com.voya.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegtisterServelet
 */
@WebServlet("/register")
public class RegtisterServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegtisterServelet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// set the content type for the browser
		response.setContentType("text/html");
		// get the values from the form details
		String employeename = request.getParameter("employeename");
		String city = request.getParameter("city");
		String sal = request.getParameter("salary");
		double salary = Double.parseDouble(sal);
		String mob = request.getParameter("mobile");
		long mobile = Long.parseLong(mob);
		String course = request.getParameter("courses");
		String[] hobbies = request.getParameterValues("hobby");

		// Set the attribute to send the object to the next page
		request.setAttribute("employeeName", employeename);
		request.setAttribute("city", city);
		request.setAttribute("salary", salary);
		request.setAttribute("mobile", mobile);
		request.setAttribute("course", course);
		request.setAttribute("hobby", hobbies);
		PrintWriter writer = response.getWriter();
		writer.print("Hey Hi bro");
//		//create the request dispatcher to send to the next page
		RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
//		//forward request and response
		dispatcher.forward(request, response);
//	
		// response.sendRedirect(course);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
