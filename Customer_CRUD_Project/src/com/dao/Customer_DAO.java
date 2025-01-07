package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.entity.Customer;
import com.connection.Connection_Example;

public class Customer_DAO {
//	Customer c;

	public static void insert(Customer c) throws ClassNotFoundException, SQLException {
		Connection conn = Connection_Example.createConnection();
		String q = "insert into customer_tbl(cid,cname,bill_no,amount) values(?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(q);

		ps.setInt(1, c.getCid());
		ps.setString(2, c.getCname());
		ps.setInt(3, c.getBill_no());
		ps.setDouble(4, c.getAmount());

		int result = ps.executeUpdate();
		if (result > 0) {
			System.out.println("data insserted successfully");
		} else {
			System.out.println("something went wrog");
		}
	}

	public static void delete(int cid) throws ClassNotFoundException, SQLException {
		Connection conn = Connection_Example.createConnection();
		String q = "delete from customer_tbl where cid=?";
		PreparedStatement ps = conn.prepareStatement(q);
		ps.setInt(1, cid);
		int result = ps.executeUpdate();
		if (result > 0) {
			System.out.println(cid + "record deleted successfully");
		} else {
			System.out.println(cid + "record not found");
		}

	}

	public static void update(Customer c) throws ClassNotFoundException, SQLException {
		Connection conn = Connection_Example.createConnection();
		System.out.println("===============================================================");
		String q = "update customer_tbl set cname=?, bill_no=?, amount=? where cid=?";
		PreparedStatement ps = conn.prepareStatement(q);

		ps.setString(1, c.getCname());
		ps.setInt(2, c.getBill_no());
		ps.setDouble(3, c.getAmount());
		ps.setInt(4, c.getCid());

		int result = ps.executeUpdate();
		if (result > 0) {
			System.out.println("Record updated successfully for customer ID: " + c.getCid());
		} else {
			System.out.println("Record not found for customer ID: " + c.getCid());
		}
	}

	public static void read(Customer c) throws ClassNotFoundException, SQLException {
		Connection conn = Connection_Example.createConnection();
		String q = "select * from customer_tbl where cid=?";
		PreparedStatement ps = conn.prepareStatement(q);
		ps.setInt(1, c.getCid());
		ResultSet rs = ps.executeQuery();

//		while (rs.next()) {
//			String cid = rs.getString("cid");
//			String cname = rs.getString("cname");
//			String bill_no = rs.getString("bill_no");
//			String amount = rs.getString("amount");
//
//			System.out.println("cid:- " + cid + " " + "cname:- " + " " + "bill_no:- " + bill_no + "amount:- " + amount);
//		}

        if (rs.next()) {
            c.setCname(rs.getString("cname"));
            c.setBill_no(rs.getInt("bill_no"));
            c.setAmount(rs.getDouble("amount"));
            System.out.println("Record found: " + c);
        } else {
            System.out.println("Record not found for customer ID: " + c.getCid());
        }
        
	}
}
