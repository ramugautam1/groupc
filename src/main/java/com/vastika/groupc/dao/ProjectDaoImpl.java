package com.vastika.groupc.dao;

import java.util.List;

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
	public int openAccount(Customer customer) {
		// Open account, update both tables
		return 0;
	}

	@Override
	public boolean verifyCustomer(long id, String password) {
		// check if the customer already has an account or not
		return true;
	}

	@Override
	public List<Double> getTransactions(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean doesExist(long id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
