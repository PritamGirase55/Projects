package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.connection.Connector;
import com.entity.Employee;

public class EmployeeDAO {
    public int register(Employee e) throws ClassNotFoundException, SQLException {
        Connection conn = Connector.createConnection();
        String q = "INSERT INTO users (empid, firstname, lastname, username, password, address, contact) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(q);
        ps.setString(1, e.getEmpid());
        ps.setString(2, e.getFirstname());
        ps.setString(3, e.getLastname());
        ps.setString(4, e.getUsername());
        ps.setString(5, e.getPassword());
        ps.setString(6, e.getAddress());
        ps.setString(7, e.getContact());

        int result = ps.executeUpdate();
        
        return result;
    }
    public int update(Employee e) throws ClassNotFoundException, SQLException {
        Connection conn = Connector.createConnection();
        String q = "update users set (firstname = ?, lastname = ?, username = ?, password = ?, address = ?, contact = ? WHERE empid = ?)";
        PreparedStatement ps = conn.prepareStatement(q);
        ps.setString(1, e.getFirstname());
        ps.setString(2, e.getLastname());
        ps.setString(3, e.getUsername());
        ps.setString(4, e.getPassword());
        ps.setString(5, e.getAddress());
        ps.setString(6, e.getContact());
        ps.setString(7, e.getEmpid());

        int result = ps.executeUpdate();
        return result;
    }

    public int delete(String empid) throws ClassNotFoundException, SQLException {
        Connection conn = Connector.createConnection();
        String q = "delete from users where empid = ?";
        PreparedStatement ps = conn.prepareStatement(q);
        ps.setString(1, empid);

        int result = ps.executeUpdate();
        return result;
    }
}
