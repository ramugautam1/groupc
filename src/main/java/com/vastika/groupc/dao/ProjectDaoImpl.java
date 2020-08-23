package com.vastika.groupc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import com.vastika.groupc.model.Customer;
import com.vastika.groupc.util.DBUtil;

public class ProjectDaoImpl implements ProjectDao{
	
	
	private static final String OPEN_ACCOUNT_SQL = "insert into account_info_tbl(id , account_name, password, address, mobile_no , unique_id_type) values (?,?,?,?,?,?)";
	private static final String OPEN_ACCOUNT_SQL_BalanceTbl = "insert into account_balance_tbl(account_info_id,balance) values(?,?)";
	
	
	private static final String DEPOSIT_SQL="";
	private static final String DEPOSIT_SQL_BalanceTbl="";
	
	private static final String WITHDRAW_SQL="";
	private static final String CHECK_BALANCE_SQL="";
	
	private static final String UPDATE_INFO_SQL="";
	private static final String VERIFY_CUSTOMER_SQL="select count(id) from account_info_tbl where id=? and password=?";
	private static final String DOES_EXIST_SQL = "select id from account_info_tbl where id=?";	private static final String GET_TRANSACTIONS_SQL="select id from account_info_tbl where id=?";
	
	
//============================================================================================================================
	//Rachana
	//update password, address, mobile_no in account_info_tbl
	
	@Override
	public int updateInfo(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}
//============================================================================================================================
	//Sandeep
	//it should insert to transaction_tbl and update the value of balance in account_balance_tbl
	
	@Override
	public int deposit(long id, double amount) {
		// set amount to deposit, add amount to balance
		return 0;
	}
//============================================================================================================================
	@Override
	public int withdraw(long id, double amount) {
		// set amount to withdraw, subtract amount from balance
		return 0;
	}
//============================================================================================================================
	@Override
	public double checkBalance(long id) {
		// use ID to check balance
		return 0;
	}

	
//=============================================================================================================================	
	
	@Override
	public int openAccount(Customer customer) {
		
	try(Connection connection = DBUtil.getConnection();
			PreparedStatement ps1= connection.prepareStatement(OPEN_ACCOUNT_SQL);
			PreparedStatement ps2=connection.prepareStatement(OPEN_ACCOUNT_SQL_BalanceTbl)){
		
		
		Random rand= new Random();
		int theRandom=rand.nextInt(9999);
		if(theRandom<1000) {
			theRandom+=1000;
		}
		
		String randomPW= Integer.toString(theRandom);

		    
	
		ps1.setLong(1, customer.getId());
		ps1.setString(2,customer.getAccount_name());
		ps1.setString(3,randomPW);
		ps1.setString(4,customer.getAddress());
		ps1.setLong(5,customer.getMobile_no());
		ps1.setString(6, customer.getUnique_id_type());
		
		ps2.setLong(1,customer.getId());
		ps2.setDouble(2, 0.00);
		
		
		int r1=ps1.executeUpdate();
		
		int r2=ps2.executeUpdate();
		
		if(r1>=1&&r2>=1) {
			return theRandom;
		}
		
		
	} catch (SQLException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return 0;	
	}
	
//===========================================================================================================================
	
	@Override
	public boolean verifyCustomer(long id, String password) {
		
		try(Connection connection = DBUtil.getConnection();
				PreparedStatement ps= connection.prepareStatement(VERIFY_CUSTOMER_SQL);
			){
			ps.setLong(1, id);
			ps.setString(2, password);
			ResultSet resultSet= ps.executeQuery();
			
			if(resultSet.next()) {
				return true;
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("Not match id password");
		}
		return false;
	}

//============================================================================================================================

	@Override
	public List<Double> getTransactions(long id) {
		// TODO Auto-generated method stub
		return null;
	}

//============================================================================================================================

	@Override
	public boolean doesExist(long id) {
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement ps = connection.prepareStatement(DOES_EXIST_SQL);) {
			ps.setLong(1, id);

			ResultSet resultSet = ps.executeQuery();

			if (resultSet.next()) {
				return true;

			} else {
				return false;
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return true;
		}

	}
	

}
