package com.doctorapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorapp.model.Doctor;



/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/doctorservlet")
public class DoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String doctorname = request.getParameter("docterName");
		String docId = request.getParameter("doctorId");
		int doctorId = Integer.parseInt(docId);
		String speciality = request.getParameter("speciality");
		String fee = request.getParameter("fees");
		double fees = Double.parseDouble(fee);
		String rating = request.getParameter("ratings");
		int ratings = Integer.parseInt(rating);
		String exp = request.getParameter("experience");
		int experience = Integer.parseInt(exp);
		
		Doctor doctor = new Doctor();
		doctor.setDocterId(doctorId);
		doctor.setDocterName(doctorname);
		doctor.setSpeciality(speciality);
		doctor.setFees(fees);
		doctor.setRatings(ratings);
		doctor.setExperience(experience);
		request.setAttribute("doctor", doctor);
		RequestDispatcher dispatcher = request.getRequestDispatcher("docsuccess.jsp");
		dispatcher.forward(request, response);
	}

}
