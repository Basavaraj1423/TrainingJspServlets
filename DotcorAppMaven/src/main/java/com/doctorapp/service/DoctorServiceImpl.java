package com.doctorapp.service;
import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.exceptions.IdNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.repository.DoctorRepositoryImpl;
import com.doctorapp.repository.IDoctorRepository;

import java.util.Collections;
import java.util.List;

public class DoctorServiceImpl implements IDoctorService {
    IDoctorRepository repository = new DoctorRepositoryImpl();

    @Override
    public void addDoctor(Doctor doctor) {
        repository.addDoctor(doctor);
    }

    @Override
    public void updateDoctor(int doctorId, double fees) {
        repository.updateDoctor(doctorId, fees);
    }

    @Override
    public void deleteDoctor(int doctorId) {
        repository.deleteDoctor(doctorId);
    }

    @Override
    public Doctor getById(int doctorId) throws IdNotFoundException {
        Doctor doctor = repository.findById(doctorId);
        if (doctor == null) {
            throw new IdNotFoundException("Doctor with this id not found");
        }
        return doctor;
    }

    @Override
    public List<Doctor> getAll() {
        List<Doctor> doctors = repository.findAll();
        if (doctors.isEmpty()) {
            System.out.println("There are no Doctors in the Database");
        }
        return doctors;
    }

    @Override
    public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {
        List<Doctor> doctors = repository.findBySpeciality(speciality);
        if (doctors.isEmpty()) {
            throw new DoctorNotFoundException("Doctor with this speciality not found");
        }
        Collections.sort(doctors, (d1, d2) -> d1.getDoctorName().compareTo(d2.getDoctorName()));
        return doctors;
    }

    @Override
    public List<Doctor> getBySpecialityAndExperience(String speciality, int experience) throws DoctorNotFoundException {
        List<Doctor> doctors = repository.findBySpecialityAndExperience(speciality, experience);
        if (doctors.isEmpty()) {
            throw new DoctorNotFoundException("Doctor with this speciality and experience not found");
        }
        Collections.sort(doctors, (d1, d2) -> ((Integer) (d2.getExperience())).compareTo(d1.getExperience()));
        return doctors;
    }

    @Override
    public List<Doctor> getBySpecialityAndLessFees(String speciality, double fees) throws DoctorNotFoundException {
        List<Doctor> doctors = repository.findBySpecialityAndLessFees(speciality, fees);
        if (doctors.isEmpty()) {
            throw new DoctorNotFoundException("Doctor with this speciality and fees not found");
        }
        Collections.sort(doctors, (d1, d2) -> ((Double) (d1.getFees())).compareTo(d2.getFees()));
        return doctors;
    }

    @Override
    public List<Doctor> getBySpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException {
        List<Doctor> doctors = repository.findBySpecialityAndRatings(speciality, ratings);
        if (doctors.isEmpty()) {
            throw new DoctorNotFoundException("Doctor with this speciality and ratings not found");
        }
        Collections.sort(doctors, (d1, d2) -> ((Integer) (d1.getRatings())).compareTo(d1.getRatings()));
        return doctors;
    }

    @Override
    public List<Doctor> getBySpecialityAndNameContainsWith(String speciality, String doctorName) throws DoctorNotFoundException {
        List<Doctor> doctors = repository.findBySpecialityAndNameContainsWith(speciality, doctorName);
        if (doctors.isEmpty()) {
            throw new DoctorNotFoundException("Doctor with this Speciality and Name not found");
        }
        Collections.sort(doctors, (d1, d2) -> (d2.getDoctorName().compareTo(d2.getDoctorName())));
        return doctors;
    }
}
