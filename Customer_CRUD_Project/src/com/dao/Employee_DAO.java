package com.dao;

import com.connection.Connection_Employee;
import com.connection.Connection_Example;
import com.entity.Customer;
import com.entity.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Employee_DAO {

    public static void insert(Employee e) throws ClassNotFoundException, SQLException, FileNotFoundException {
        Connection conn = Connection_Employee.createConnection();
        String q = "INSERT INTO imagetbl (emp_id, emp_name, emp_image) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(q);

        ps.setInt(1, e.getEmp_id());
        ps.setString(2, e.getEmp_name());
        ps.setBinaryStream(3, e.getEmp_image());

        int result = ps.executeUpdate();
        if (result > 0) {
            System.out.println("Record inserted successfully");
        } else {
            System.out.println("Insertion failed");
        }


    }

    public static void delete(int emp_id) throws ClassNotFoundException, SQLException {
        Connection conn = Connection_Employee.createConnection();
        String q = "DELETE FROM imagetbl WHERE emp_id=?";
        PreparedStatement ps = conn.prepareStatement(q);
        ps.setInt(1, emp_id);
        int result = ps.executeUpdate();
        if (result > 0) {
            System.out.println(emp_id + " record deleted successfully");
        } else {
            System.out.println(emp_id + " record not found");
        }

    }

    public static void update(Employee e) throws ClassNotFoundException, SQLException {
        Connection conn = Connection_Employee.createConnection();
        String q = "UPDATE imagetbl SET emp_name=?, emp_image=? WHERE emp_id=?";
        PreparedStatement ps = conn.prepareStatement(q);

        ps.setString(1, e.getEmp_name());
        ps.setBinaryStream(2, e.getEmp_image());
        ps.setInt(3, e.getEmp_id());

        int result = ps.executeUpdate();
        if (result > 0) {
            System.out.println("Record updated successfully for employee ID: " + e.getEmp_id());
        } else {
            System.out.println("Record not found for employee ID: " + e.getEmp_id());
        }

    }
    public static void read(Employee e) throws ClassNotFoundException, SQLException {
		Connection conn = Connection_Example.createConnection();
		String q = "select * from customer_tbl where emp_id=?";
		PreparedStatement ps = conn.prepareStatement(q);
		ps.setInt(1, e.getEmp_id());
		ResultSet rs = ps.executeQuery();
		 if (rs.next()) {
	            e.setEmp_name(rs.getString("emp_name"));
	            
	            e.set(rs.get("amount"));
	            System.out.println("Record found: " + e);
	        } else {
	            System.out.println("Record not found for customer ID: " + e.getEmp_id());
	        }
	        
		
		
    }
}
