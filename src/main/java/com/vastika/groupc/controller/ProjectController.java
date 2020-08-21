package com.vastika.groupc.controller;

import java.util.Scanner;

import com.vastika.groupc.model.Customer;
import com.vastika.groupc.service.ProjectService;
import com.vastika.groupc.service.ProjectServiceImpl;

public class ProjectController {
	
	ProjectService projectService= new ProjectServiceImpl();
	Customer customer= new Customer();
	
//------------------------------------------------------------------------------------------------------------------------//	

	public void openAccount(Scanner scanner) {
		
		//ask for id. call doesExist(long id) with id
		//if checkCustomer returns false, continue to ask for more info 
		//then call the openAccount() on ProjectService. 	
		
		
	}

//------------------------------------------------------------------------------------------------------------------------//	
	
	public boolean doesExist(long id) {
		return projectService.doesExist(id);
	}

//------------------------------------------------------------------------------------------------------------------------//	
	
	public void deposit(long id, Scanner scanner) {

		
	
	}

//------------------------------------------------------------------------------------------------------------------------//	
	
	public void updateInfo(long id,Scanner scanner) {
		System.out.println("Enter what you want to change: \n Password | Address | Mobile No ");
		
		//write logic
		
	}
	
	
//------------------------------------------------------------------------------------------------------------------------//	
	
	public void withdraw(long id,Scanner scanner) {
		
	}
	
//------------------------------------------------------------------------------------------------------------------------//	

	
	public void checkBalance(long id) {
		
	}
	
//------------------------------------------------------------------------------------------------------------------------//	

	public void getTransactions(long id) {
		
	}
	
//------------------------------------------------------------------------------------------------------------------------//	
	
	public boolean verifyCustomer(long id, String password ) {
		//returns true if both id and id_type match in database. following is just for testing
		System.out.println("attempting to verify...");
		return projectService.verifyCustomer(id, password);
	}
	
	
	
	
	
	

//------------------------------------------------------------------------------------------------------------------------//	
	
	public void serveCustomer(Scanner scanner) {
		ProjectController pController = new ProjectController();
		System.out.println("Enter your ID to continue");
		long id = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Enter your Password");
		String password = scanner.nextLine();

		if (pController.verifyCustomer(id, password)) {
			boolean flag = true;
			while (flag) {
				printMenu();
				String choice = (""+ scanner.nextLine().charAt(0)).toLowerCase();
				switch(choice) {
				
				case "d":
					pController.deposit(id,scanner);
					break;
				case "w":
					pController.withdraw(id,scanner);
					break;
				case "c":
					pController.checkBalance(id);
					break;
				case "u":
					pController.updateInfo(id,scanner);
					break;
				case "t":
					pController.getTransactions(id);
				case "q":
					flag=false;
					System.out.println("\n\t\t...Exiting...!");
					break;
				default:
					System.out.println("Wrong choice!");
					break;			
				
				}
			}

		}
	}
	
	public static void printMenu() {
		System.out.println("\n\t\t\tWHAT NEXT?");
		System.out.println("\n Deposit | Withdraw | Check Balance | Update Info | Transaction-History | Quit ");
	}
//------------------------------------------------------------------------------------------------------------------------//	

}
