package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.dao.EmployeeDAO;
import com.entity.Employee;

//@WebServlet("/registeremp")
public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private EmployeeDAO employeeDao;

    public void init() {
        employeeDao = new EmployeeDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String empid = request.getParameter("empid");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");
        
        Employee e = new Employee();
        e.setEmpid(empid);
        e.setFirstname(firstname);
        e.setLastname(lastname);
        e.setUsername(username);
        e.setPassword(password);
        e.setAddress(address);
        e.setContact(contact);

        try {
            int result = employeeDao.register(e);
            if (result > 0) {
            	response.sendRedirect(request.getContextPath() + "/success.jsp");
            } else {
                response.sendRedirect("error");
            }
        } catch (SQLException e1) {
            e1.printStackTrace(); 
            
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace(); 
            
        }
        
        try {
            int result = employeeDao.update(e);
            if (result > 0) {
                response.sendRedirect(request.getContextPath() + "/success.jsp");
            } else {
                response.sendRedirect(request.getContextPath() + "/error.jsp");
            }
        } catch (SQLException | ClassNotFoundException e1) {
            e1.printStackTrace();
           
        }
    }@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	super.doGet(req, resp);
    }
    
}
