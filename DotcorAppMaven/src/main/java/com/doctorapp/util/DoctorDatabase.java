package com.doctorapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DoctorDatabase {
	static Connection connection;

    public static Connection openConnection() {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/voyatraining", "root", "root");
            System.out.println("Connected to Doctor databse...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
