package com.doctorapp.repository;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.exceptions.IdNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.util.DatabaseQuerries;
import com.doctorapp.util.DoctorDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DoctorRepositoryImpl implements IDoctorRepository {
	 @Override
	    public void addDoctor(Doctor doctor) {
	        try {
	            Connection connection = DoctorDatabase.openConnection();
	            PreparedStatement statement = connection.prepareStatement(DatabaseQuerries.INSERTQUERRY);
	            //statement.setInt(1,doctor.getDoctorId());  //Auto incremented while creating the querry
	            // doctor_name,speciality,fees,ratings,experience
	            statement.setString(1, doctor.getDoctorName());
	            statement.setString(2, doctor.getSpeciality());
	            statement.setDouble(3, doctor.getFees());
	            statement.setInt(4, doctor.getRatings());
	            statement.setInt(5, doctor.getExperience());
	            
	            
	          
	            boolean result = statement.execute();
	            System.out.println("One row Inserted" + !result);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	    }

	    @Override
	    public void updateDoctor(int doctorId, double fees) {
	        try {
	            Connection connection = DoctorDatabase.openConnection();
	            PreparedStatement statement = connection.prepareStatement(DatabaseQuerries.UPDATEQUERRY);
	            statement.setInt(2, doctorId);
	            statement.setDouble(1, fees);
	            int result = statement.executeUpdate();
	            System.out.println("One row updated" + result);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteDoctor(int doctorId) {
	        try {
	            Connection connection = DoctorDatabase.openConnection();
	            PreparedStatement statement = connection.prepareStatement(DatabaseQuerries.DELETEQUERRY);
	            statement.setInt(1, doctorId);
	            boolean result = statement.execute();
	            System.out.println("One Row Deleted successfully : " + !result);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public Doctor findById(int doctorId) throws IdNotFoundException {
	        Doctor doctor = null;
	        try {
	            Connection connection = DoctorDatabase.openConnection();
	            PreparedStatement statement = connection.prepareStatement(DatabaseQuerries.FINDBYID);
	            statement.setInt(1, doctorId);
	            try {
	                ResultSet resultSet = statement.executeQuery();
	//doctor_name,speciality,fees,ratings,experience
	                while (resultSet.next()) {
	                    Integer doctorId1 = resultSet.getInt("doctor_id");
	                    String doctorName = resultSet.getString("doctor_name");
	                    String speciality = resultSet.getString("speciality");
	                    double fees = resultSet.getDouble("fees");
	                    int ratings = resultSet.getInt("ratings");
	                    int experience = resultSet.getInt("experience");
	                    doctor = new Doctor(doctorId1, doctorName, speciality, fees, ratings, experience);
	                }


	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return doctor;
	    }

	    @Override
	    public List<Doctor> findAll() {
	        List<Doctor> doctorList = new ArrayList<>();
	        try {
	            Connection connection = DoctorDatabase.openConnection();
	            PreparedStatement statement = connection.prepareStatement(DatabaseQuerries.FINDALLQUERRY);
	            ResultSet resultSet = statement.executeQuery();
	            while (resultSet.next()) {
	                int doctorId = resultSet.getInt("doctor_id");
	                String doctorName = resultSet.getString("doctor_name");
	                String speciality = resultSet.getString("speciality");
	                double fees = resultSet.getDouble("fees");
	                int ratings = resultSet.getInt("ratings");
	                int experience = resultSet.getInt("experience");
	                Doctor doctor = new Doctor(doctorId, doctorName, speciality, fees, ratings, experience);
	                doctorList.add(doctor);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return doctorList;
	    }

	    @Override
	    public List<Doctor> findBySpeciality(String speciality) throws DoctorNotFoundException {
	        List<Doctor> doctorList = new ArrayList<>();
	        try {
	            Connection connection = DoctorDatabase.openConnection();
	            PreparedStatement statement = connection.prepareStatement(DatabaseQuerries.FINDBYSPECIALITY);
	            statement.setString(1, speciality);
	            try {
	                ResultSet resultSet = statement.executeQuery();
	                while (resultSet.next()) {
	                    int doctorId = resultSet.getInt("doctor_id");
	                    String doctorName = resultSet.getString("doctor_name");
	                    String speciality1 = resultSet.getString("speciality");
	                    double fees = resultSet.getDouble("fees");
	                    int ratings = resultSet.getInt("ratings");
	                    int experience = resultSet.getInt("experience");
	                    Doctor doctor = new Doctor(doctorId, doctorName, speciality1, fees, ratings, experience);
	                    doctorList.add(doctor);
	                }
	            } catch (Exception e) {
	                e.printStackTrace();
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return doctorList;
	    }

	    @Override
	    public List<Doctor> findBySpecialityAndExperience(String speciality, int experience) throws DoctorNotFoundException {
	        List<Doctor> doctorList = new ArrayList<>();
	        try {
	            Connection connection = DoctorDatabase.openConnection();
	            PreparedStatement statement = connection.prepareStatement(DatabaseQuerries.FINDBYSPECIALITYANDEXPERIENCE);
	            statement.setString(1, speciality);
	            statement.setInt(2, experience);
	            try {
	                ResultSet resultSet = statement.executeQuery();
	                while (resultSet.next()) {
	                    int doctorId = resultSet.getInt("doctor_id");
	                    String doctorName = resultSet.getString("doctor_name");
	                    String speciality1 = resultSet.getString("speciality");
	                    double fees = resultSet.getDouble("fees");
	                    int ratings = resultSet.getInt("ratings");
	                    int experience1 = resultSet.getInt("experience");
	                    Doctor doctor = new Doctor(doctorId, doctorName, speciality1, fees, ratings, experience1);
	                    doctorList.add(doctor);
	                }

	            } catch (Exception e) {
	                e.printStackTrace();
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return doctorList;
	    }

	    @Override
	    public List<Doctor> findBySpecialityAndLessFees(String speciality, double fees) throws DoctorNotFoundException {
	        List<Doctor> doctorList = new ArrayList<>();
	        try {
	            Connection connection = DoctorDatabase.openConnection();
	            PreparedStatement statement = connection.prepareStatement(DatabaseQuerries.FINDBYSPECIALITYANDLESSFEES);
	            statement.setString(1, speciality);
	            statement.setDouble(2, fees);
	            try {
	                ResultSet executed = statement.executeQuery();
	                while (executed.next()) {
	                    //doctor_name,speciality,fees,ratings,experience
	                    Doctor doctor = new Doctor();
	                    doctor.setDoctorId(executed.getInt("doctor_id"));
	                    doctor.setDoctorName(executed.getString("doctor_name"));
	                    doctor.setSpeciality(executed.getString("speciality"));
	                    doctor.setFees(executed.getDouble("fees"));
	                    doctor.setRatings(executed.getInt("ratings"));
	                    doctor.setExperience(executed.getInt("experience"));
	                    doctorList.add(doctor);

	                }

	            } catch (Exception e) {
	                e.printStackTrace();
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return doctorList;
	    }

	    @Override
	    public List<Doctor> findBySpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException {
	        List<Doctor> doctorList = new ArrayList<>();
	        try {
	            Connection connection = DoctorDatabase.openConnection();
	            PreparedStatement statement = connection.prepareStatement(DatabaseQuerries.FINDSPECIALITYANDRATINGS);
	            statement.setString(1, speciality);
	            statement.setInt(2, ratings);
	            try {
	                ResultSet executed = statement.executeQuery();
	                while (executed.next()) {
	                    //doctor_name,speciality,fees,ratings,experience
	                    Doctor doctor = new Doctor();
	                    doctor.setDoctorId(executed.getInt("doctor_id"));
	                    doctor.setDoctorName(executed.getString("doctor_name"));
	                    doctor.setSpeciality(executed.getString("speciality"));
	                    doctor.setFees(executed.getDouble("fees"));
	                    doctor.setRatings(executed.getInt("ratings"));
	                    doctor.setExperience(executed.getInt("experience"));
	                    doctorList.add(doctor);

	                }

	            } catch (Exception e) {
	                e.printStackTrace();
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return doctorList;
	    }

	    @Override
	    public List<Doctor> findBySpecialityAndNameContainsWith(String speciality, String doctorName) throws DoctorNotFoundException {
	        List<Doctor> doctorList = new ArrayList<>();
	        try {
	            Connection connection = DoctorDatabase.openConnection();
	            PreparedStatement statement = connection.prepareStatement(DatabaseQuerries.FINDSPECIALITYANDRATINGS);
	            statement.setString(1, speciality);
	            statement.setString(2, "%" + doctorName + "%");
	            try {
	                ResultSet executed = statement.executeQuery();
	                while (executed.next()) {
	                    //doctor_name,speciality,fees,ratings,experience
	                    Doctor doctor = new Doctor();
	                    doctor.setDoctorId(executed.getInt("doctor_id"));
	                    doctor.setDoctorName(executed.getString("doctor_name"));
	                    doctor.setSpeciality(executed.getString("speciality"));
	                    doctor.setFees(executed.getDouble("fees"));
	                    doctor.setRatings(executed.getInt("ratings"));
	                    doctor.setExperience(executed.getInt("experience"));
	                    doctorList.add(doctor);

	                }

	            } catch (Exception e) {
	                e.printStackTrace();
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return doctorList;
	    }
}
