package com.doctorapp.util;

public class DatabaseQuerries {

	public static final String INSERTQUERRY = "INSERT INTO doctor(doctor_name,speciality,experience,fees,ratings)values(?,?,?,?,?)";
	public static final String UPDATEQUERRY = "UPDATE doctor SET fees=? where doctor_id = ?";
	public static final String DELETEQUERRY = "DELETE FROM doctor WHERE doctor_id=?";
	public static final String FINDALLQUERRY = "SELECT * FROM doctor";
	public static final String FINDBYSPECIALITY = "SELECT * FROM doctor WHERE speciality=?";
	public static final String FINDBYSPECIALITYANDEXPERIENCE = "SELECT * FROM doctor WHERE speciality=? AND experience >=?";
	public static final String FINDSPECIALITYANDRATINGS = "SELECT * FROM doctor WHERE speciality= ? AND ratings >= ?";
	public static final String FINDBYSPECIALITYANDLESSFEES = "SELECT * FROM doctor WHERE speciality= ? AND fees <= ?";
	public static final String FINDBYSPECIALITYANDNAME = "SELECT * FROM doctor where speciality =? AND doctor_name like ?";
	public static final String FINDBYID = "SELECT * FROM doctor WHERE doctor_id = ?";
}
