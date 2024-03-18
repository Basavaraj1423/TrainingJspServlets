package com.employeeapp.controller;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.empapp.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/employeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String employeename = request.getParameter("employeename");
		String empId = request.getParameter("employeeId");
		int employeeId = Integer.parseInt(empId);
		String city = request.getParameter("city");
		String sal = request.getParameter("salary");
		double salary = Double.parseDouble(sal);
		String course = request.getParameter("courses");

		Employee emp = new Employee();
		emp.setEmployeeId(employeeId);
		emp.setEmployeename(employeename);
		emp.setCity(city);
		emp.setSalary(salary);
		emp.setCourse(course);

		request.setAttribute("employee", emp);
		RequestDispatcher dispatcher = request.getRequestDispatcher("empsuccess.jsp");
		dispatcher.forward(request, response);
	}

}
