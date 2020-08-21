package com.vastika.groupc;

import java.util.Scanner;

import com.vastika.groupc.controller.ProjectController;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ProjectController pController = new ProjectController();

		while (true) {

			System.out.println("Select\n 1---> Open Account\n 2---> Already have an account ");

			int selection = scanner.nextInt();
			
			switch (selection) {	
			
			case 1:				
				pController.openAccount(scanner);
				break;

			case 2:
				pController.serveCustomer(scanner);
				break;
			default:
				System.out.println("wrong choice !!!");
				break;
			}
		}

	}



}
