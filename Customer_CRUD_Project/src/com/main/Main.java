package com.main;

import java.sql.SQLException;
import java.util.Scanner;
import com.dao.Customer_DAO;
import com.dao.Employee_DAO;
//import com.connection.Connection_Example;
import com.entity.Customer;
import com.entity.Employee;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome");
		while (true) {
			System.out.println("Press 1 for insert operation");
			System.out.println("Press 2 for Delete operation");
			System.out.println("Press 3 for Update operation");
			System.out.println("Press 4 for read/access the data ");
			System.out.println("press 5 for exit........");
			
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("Enter customer id = ");
				int cid = sc.nextInt();
				System.out.println("Enter customer name = ");
				String cname = sc.next();
				System.out.println("Enter biil number = ");
				int bill_no = sc.nextInt();
				System.out.println("enter the Amount = ");
				Double amount = sc.nextDouble();

				Customer c = new Customer(cid, cname, bill_no, amount);
				Customer_DAO.insert(c);
			} 
			else if (choice == 2) {
				System.out.println("Enter customer id = ");
				int cid = sc.nextInt();
				Customer_DAO.delete(cid);

			} else if (choice == 3) {
				System.out.println("Enter customer id to update= ");
				int cid = sc.nextInt();

				System.out.println("Enter name to update of this " + cid + " id = ");
				String cname = sc.next();
				System.out.println("Enter name to update of this " + cid + " id's biil number = ");
				int bill_no = sc.nextInt();
				System.out.println("enter the Amount = ");
				Double amount = sc.nextDouble();
				Customer c = new Customer(cid, cname, bill_no, amount);
				Customer_DAO.update(c);
				System.out.println(c);
			} 
			else if (choice == 4) {
				System.out.println("Enter customer id to read = ");
				int readCid = sc.nextInt();
				Customer c = new Customer();
				c.setCid(readCid);
				Customer_DAO.read(c);

			} else {
				break;
			}
		}

	}

}

