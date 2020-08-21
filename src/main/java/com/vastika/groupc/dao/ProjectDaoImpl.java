package com.vastika.groupc.dao;

import com.vastika.groupc.model.Customer;

public class ProjectDaoImpl implements ProjectDao{

	@Override
	public int updateInfo(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deposit(long id, double amount) {
		// set amount to deposit, add amount to balance
		return 0;
	}

	@Override
	public int withdraw(long id, double amount) {
		// set amount to withdraw, subtract amount from balance
		return 0;
	}

	@Override
	public double checkBalance(long id) {
		// use ID to check balance
		return 0;
	}

	@Override
	public double openAccount(Customer customer) {
		// Open account, update both tables
		return 0;
	}

	@Override
	public int checkCustomer(long id, String unique_id_type) {
		// check if the customer already has an account or not
		return 0;
	}
	
	

}
