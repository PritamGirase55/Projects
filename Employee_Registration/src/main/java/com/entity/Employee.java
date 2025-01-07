package com.entity;

public class Employee {

	public static final long serialverionUID = 11;
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", firstname=" + firstname + ", lastname=" + lastname + ", username="
				+ username + ", password=" + password + ", address=" + address + ", contact=" + contact + "]";
	}
	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid2) {
		this.empid = empid2;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Employee(String empid, String firstname, String lastname, String username, String password, String address,
			String contact) {
		super();
		this.empid = empid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.address = address;
		this.contact = contact;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	private String empid;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private String address;
	private String contact;

}
