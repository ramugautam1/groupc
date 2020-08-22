package com.vastika.groupc.service;

import java.util.List;

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
	public int openAccount(Customer customer) {
		return projectDao.openAccount(customer);
	}

	@Override
	public boolean verifyCustomer(long id, String password) {
		
		return projectDao.verifyCustomer(id, password);
	}

	@Override
	public List<Double> getTransactions(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean doesExist(long id) {
		return projectDao.doesExist(id);
	}

	

}
