package com.vastika.groupc.controller;

import java.util.Scanner;

import com.vastika.groupc.model.Customer;
import com.vastika.groupc.service.ProjectService;
import com.vastika.groupc.service.ProjectServiceImpl;
import com.vastika.uis.model.User;

public class ProjectController {

	ProjectService projectService = new ProjectServiceImpl();
	Customer customer = new Customer();

	// ---------------------------------BLOCK FOR OPENING NEW
	// ACCOUNTS-----------------------------------------//

	public void openAccount(Scanner scanner) {
		Customer customer = (Customer) getData(scanner);

		if (!doesExist(customer.getId())) {

			int pw = projectService.openAccount(customer);
			System.out.println("Account opened successfully. " + "Your initial password is [ " + pw + " ]."
					+ " Please Change your password ASAP to activate your account.");

		} else {
			System.out.println("!!!!!!!!!!Account already exits for this ID.!!!!!!!!!!");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		}

	}

	public Customer getData(Scanner scanner) {

		Customer tempCustomer = new Customer();
		System.out.println("~~~~~~~~~~~~~~~~~Please provide the necesary info~~~~~~~~~~~~~~~~~~");

		System.out.println("Enter your id:");
		tempCustomer.setId(scanner.nextLong());

		scanner.nextLine();

		System.out.println("Enter your id type:");
		tempCustomer.setUnique_id_type(scanner.nextLine());
		System.out.println("Enter account name:");
		tempCustomer.setAccount_name(scanner.nextLine());
		System.out.println("Enter Address: ");
		tempCustomer.setAddress(scanner.nextLine());
		System.out.println("Enter Mobile No.:");
		tempCustomer.setMobile_no(scanner.nextLong());
		scanner.nextLine();

		System.out.println("\nProcessing......\n");

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		return tempCustomer;
	}

	// ------------------------------------------------------------------------------------------------------------------------//

	public boolean doesExist(long id) {
		return projectService.doesExist(id);
	}

//------------------------------------------------------------------------------------------------------------------------//	

	public void deposit(long id, Scanner scanner) {
		// Sandeep

	}

//------------------------------------------------------------------------------------------------------------------------//	

	public void updateInfo(long id, Scanner scanner) {
		// Rachana
		System.out.println("Please enter your id:");
		long id1 = scanner.nextLong();
		customer.setId(id1);
		System.out.println("Enter what you want to change: \n 1.Password | 2.Address |3. Mobile No ");
		String choice = scanner.next();

		Customer customer = getData(scanner);
		switch (choice) {
		case "1":
			String updatedPassword = projectService.updateInfo(customer);
			if (!updatedPassword.equalsIgnoreCase(null)) {
				System.out.println("Customer info is updated in db successfully!!!");
			} else {
				System.out.println("error in db.");
			}
			break;
		case "2":

			break;

		case "3":

			break;

		default:
			break;
		}

		// write logic

	}

//------------------------------------------------------------------------------------------------------------------------//	

	public void withdraw(long id, Scanner scanner) {
		// Rajan
	}

//------------------------------------------------------------------------------------------------------------------------//	

	public void checkBalance(long id) {
		// sabaijana le garne yo
	}

//------------------------------------------------------------------------------------------------------------------------//	

	public void getTransactions(long id) {
		// Ram
		// Get transactions of a particular customer

	}

//------------------------------------------------------------------------------------------------------------------------//	

	public boolean verifyCustomer(long id, String password) {
		// returns true if both id and id_type match in database. following is just for
		// testing
		System.out.println("attempting to verify...");
		return projectService.verifyCustomer(id, password);
	}

	// ------------------------------BLOCK FOR HANDLING EXISTING
	// CUSTOMERS--------------------------------------//

	public void serveCustomer(Scanner scanner) {
		ProjectController projectController = new ProjectController();
		System.out.println("Enter your ID to continue");
		long id = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Enter your Password");
		String password = scanner.nextLine();

		if (projectController.verifyCustomer(id, password)) {

			boolean flag = true;
			while (flag) {

				printMenu();

				String choice = ("" + scanner.nextLine().charAt(0)).toLowerCase();

				switch (choice) {

				case "d":
					projectController.deposit(id, scanner);
					scanner.nextLine();
					break;

				case "w":
					projectController.withdraw(id, scanner);
					scanner.nextLine();
					break;

				case "c":
					projectController.checkBalance(id);
					break;

				case "u":
					projectController.updateInfo(id, scanner);
					break;

				case "t":
					projectController.getTransactions(id);
					break;

				case "q":
					flag = false;
					System.out.println("\n\t\t...Exiting...!");
					break;

				default:
					System.out.println("Wrong choice!");
					break;

				}
			}

		} else {
			System.out.println("\nID and Password didn't match. Try again later.\n");
		}
	}

	public static void printMenu() {
		System.out.println(" \n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~WHAT NEXT?~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("|          |          |               |             |                     |      |");
		System.out.println("| Deposit  | Withdraw | Check Balance | Update Info | Transaction-History | Quit |");
		System.out.println("|          |          |               |             |                     |      |");
		System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	// ----------

}
