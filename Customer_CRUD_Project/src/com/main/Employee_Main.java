package com.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;
import com.dao.Employee_DAO;
import com.entity.Employee;

public class Employee_Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 for insert operation");
            System.out.println("Press 2 for Delete operation");
            System.out.println("Press 3 for Update operation");
            System.out.println("Press 4 for read/access the data ");
            System.out.println("Press 5 for exit........");

            int choice = sc.nextInt();
            if (choice == 1) {
            	System.out.println("Enter employee id = ");
            	int emp_id = sc.nextInt();
            	System.out.println("Enter employee name = ");
            	String emp_name = sc.next();

            	Employee e = new Employee(emp_id, emp_name, null);
            	Employee_DAO.insert(e);
            } else if (choice == 2) {
                System.out.println("Enter employee id = ");
                int emp_id = sc.nextInt();
                Employee_DAO.delete(emp_id);
            } else if (choice == 3) {
                System.out.println("Enter employee id = ");
                int emp_id = sc.nextInt();
                System.out.println("Enter employee name = ");
                String emp_name = sc.next();
                System.out.println("Enter image path = ");
            
                String emp_image = sc.next();

                FileInputStream fis = new FileInputStream(emp_image);
                Employee e = new Employee(emp_id, emp_name, fis);
                Employee_DAO.update(e);
            } else if (choice == 4) {
                System.out.println("Enter employee id = ");
                int emp_id = sc.nextInt();
                
                Employee e = new Employee(emp_id);
                Employee_DAO.read(e);
                System.out.println(e);
            } 
            else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}
