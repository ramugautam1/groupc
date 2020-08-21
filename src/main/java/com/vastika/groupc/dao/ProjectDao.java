package com.vastika.groupc.dao;

import com.vastika.groupc.model.Customer;

public interface ProjectDao {
	
	int updateInfo(Customer customer);
	int deposit(long id, double amount);
	int withdraw(long id, double amount);
	double checkBalance(long id);
	double openAccount(Customer customer);
	int checkCustomer(long id, String unique_id_type);
}
