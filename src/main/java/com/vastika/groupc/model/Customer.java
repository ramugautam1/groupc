package com.vastika.groupc.model;

public class Customer {
	
	
	private long id;
	private String unique_id_type;
	private String account_name;
	private String address;
	private long mobile_no;
	private double balance;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUnique_id_type() {
		return unique_id_type;
	}

	public void uique_id_type(String unique_id_type) {
		this.unique_id_type = unique_id_type;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}

	public double getBalance() {
		return balance;
	}
	

	

}
