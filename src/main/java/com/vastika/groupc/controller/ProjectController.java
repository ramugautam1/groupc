package com.vastika.groupc.controller;

import java.util.Scanner;

import com.vastika.groupc.model.Customer;
import com.vastika.groupc.service.ProjectService;
import com.vastika.groupc.service.ProjectServiceImpl;

public class ProjectController {
	
	ProjectService projectService= new ProjectServiceImpl();
	Customer customer= new Customer();
	
	public void updateInfo(Scanner scanner) {
				
	}
	
	public void openAccount(Scanner scanner) {
		
		//ask for id and id_type. call checkCustomer with id and id_type
		//if checkCustomer returns false, continue to ask for more info 
		//then call the openAccount() on ProjectService. 		
	}
	
	public void deposit(Scanner scanner) {

		
	}
	
	public void withdraw(Scanner scanner) {
		
	}
	
	public void checkBalance(Scanner scanner) {
		
	}
	
	
	public int checkCustomer(int id, String id_type) {
		//returns true if both id and id_type match in database
		return 0;
	}
	

}
