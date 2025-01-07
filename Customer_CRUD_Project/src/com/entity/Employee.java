package com.entity;

import java.io.InputStream;

public class Employee {
    private int emp_id;
    private String emp_name;
    private InputStream emp_image;

    public Employee(int emp_id, String emp_name, InputStream emp_image) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_image = emp_image;
    }

   


    public Employee(int emp_id2) {
		// TODO Auto-generated constructor stub
	}




	public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public InputStream getEmp_image() {
        return emp_image;
    }

    public void setEmp_image(InputStream emp_image) {
        this.emp_image = emp_image;
    }
}
