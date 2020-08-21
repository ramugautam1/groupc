package com.vastika.groupc.service;

import com.vastika.groupc.dao.ProjectDao;
import com.vastika.groupc.dao.ProjectDaoImpl;
import com.vastika.groupc.model.Customer;

public class ProjectServiceImpl implements ProjectService{
	
	ProjectDao projectDao= new ProjectDaoImpl();

	@Override
	public int updateInfo(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deposit(long id, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int withdraw(long id, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double checkBalance(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double openAccount(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int checkCustomer(long id, String unique_id_type) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
