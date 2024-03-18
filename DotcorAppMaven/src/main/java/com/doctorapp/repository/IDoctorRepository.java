package com.doctorapp.repository;

import java.util.List;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.exceptions.IdNotFoundException;
import com.doctorapp.model.Doctor;

public interface IDoctorRepository {
	void addDoctor(Doctor doctor);

    void updateDoctor(int doctorId, double fees);

    void deleteDoctor(int doctorId);
    Doctor findById(int doctorId) throws IdNotFoundException;
    List<Doctor> findAll();
    List<Doctor> findBySpeciality(String speciality)throws DoctorNotFoundException;
    List<Doctor> findBySpecialityAndExperience(String speciality, int experience)throws DoctorNotFoundException;
    List<Doctor> findBySpecialityAndLessFees(String speciality, double experience)throws DoctorNotFoundException;
    List<Doctor> findBySpecialityAndRatings(String speciality, int ratings)throws DoctorNotFoundException;
    List<Doctor> findBySpecialityAndNameContainsWith(String speciality, String doctorName)throws DoctorNotFoundException;
}
