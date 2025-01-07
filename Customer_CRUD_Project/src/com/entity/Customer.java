package com.entity;

public class Customer {
	// TODO Auto-generated method stub
	private int cid;
	private String cname;
	private int bill_no;
	private double amount;

	public Customer(int cid, String cname, int bill_no, double amount) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.bill_no = bill_no;
		this.amount = amount;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", bill_no=" + bill_no + ", amount=" + amount + "]";
	}

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getBill_no() {
		return bill_no;
	}

	public void setBill_no(int bill_no) {
		this.bill_no = bill_no;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
