// -------------------------------------------------------
// Assignment 3
// Written by: Samuel Vachon 40281580
// For COMP 248 Section H – Fall 2023
// --------------------------------------------------------

//The here program is to add or subtract a user-decided amount of numbers together. 
import java.util.Scanner;

public class A3_Q1 {

	public static void main(String[] args) {
		
		//Creating a scanner variable for my inputs
		Scanner input = new Scanner(System.in);
		
		//Declaration of variables
		int choice;
		double nbToAdd, result;
		
		//Entry message
		System.out.println("Welcome to this calculator, offering Addition and subtraction");
		
		//Principal loop, won't stop until user decide to stop it.
		while (true){
			
			//Prompting user for the number of numbers they want to add or sub
			
			while (true) {
				System.out.print("Please select 1 for Addition or 2 for subtration: ");
				choice = input.nextInt();
				if (choice == 1 || choice == 2)
					break;
				else
					System.out.println("Operation not supported.");
			}
			
			//Prompting the user for the numbers they want to add or sub with the "ifs" to do either
			//Sub or add. In the said "ifs", the loops are there to add or sub the good amount of numbers.
			
			System.out.print("Please input your numbers: ");
			nbToAdd = input.nextInt();
			
			if (choice == 1) {
				result = input.nextDouble();
				for (int i=2;i<=nbToAdd;i++) {
					result += input.nextDouble();
				}
				System.out.println("The result of your addition is: "+result);
			}
			else {
				result=input.nextDouble();
				for (int i =2;i<=nbToAdd;i++) {
					result-=input.nextDouble();
				}
				System.out.println("The result of your subtraction is: "+result);
			}
			//Prompting the user to know if he wants to continue or not.
			System.out.print("Do you want to perform another operation? y/yes: ");
			String answer = new String(input.next());
			if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes"))
				continue;
			else
				break;
		}
		//Exit message.
		System.out.println("Goodbye!");
		input.close();
	}

}
