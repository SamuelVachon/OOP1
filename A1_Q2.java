//------------------------------------------------------------------
//Assignment 1
//Written by: Samuel Vachon #40281580
//For COMP 248 section H - Fall 2023
//------------------------------------------------------------------

import java.util.Scanner;	//importing Scanner

public class A1_Q2 
{
	public static void main(String[] args) 
	{
		//Creating different variables
		Scanner input = new Scanner(System.in);
		int distKm, days;
		final double mileSpeed = 28000;
		final double kmSpeed = 1.609344*mileSpeed;
		
		//This section is to get the distance from the users.
		
		System.out.print("Please enter the distance (in km) between the Earth and the extraterrestrial body: ");
		distKm = input.nextInt();
		
		//Computation section
		
		days = (int)((distKm/kmSpeed)/24.0);
	
		//Display the results
		
		System.out.println("Project-S spaceship, constantly travelling at "+(int)mileSpeed+"mi/h, will take approximately");
		System.out.println(days+" \'Earth-based days\' to get to its foreknown extraterestrial destination.\n");
		
		System.out.print("Thank you for your contribution to Project-S.");
		
		//Closing the Scanner "input"
		
		input.close();	
	}

}
