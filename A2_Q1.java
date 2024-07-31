// ------------------------------------------------------- 
//Assignment 2
// Written by: Samuel Vachon #40281580
// For COMP 248 Section H – Fall 2023
// --------------------------------------------------------
//The here program ask the user for both his height and weight and calculate the BMI, which is the indicator used
//to class people between overweight, healthy weight, overweight and obese and than prompt the user to see 
//if he wants reccomandations linked to his BMI


import java.util.Scanner;

public class A2_Q1 {

	public static void main(String[] args) 
	{
		//Welcome message
		System.out.println("-------****-------****-------****-------****-----****-----\n"
				+ "Welcome to BMI Calculator"
				+"\n-------****-------****-------****-------****-----****-----\n");
		
		//Creating variables
		
		double weight, height, bmi;
		String cat = new String("");
		String answer = new String();
		
		//Asking the user for his weight and height in kg and meters
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight (kg): ");
		weight = input.nextDouble();
		
		System.out.print("Enter height (m): ");
		height = input.nextDouble();
		
		//Results of BMI calculations
		
		bmi = weight/(height*height);
		
		System.out.println("Your BMI is "+bmi);
		
		//Sorting the categories of BMI
		
		if (bmi>=30.0)
			cat = "obese.";
		else
			if (bmi>=25.0)
				cat = "overweight.";
			else
				if (bmi>=18.5)
					cat = "within your healthy weight!";
				else
					cat = "underweight.";
		
		System.out.println("You are "+cat+
		"\nDo you want some tips according to your BMI?");
		
		//Sorting the exiting messages
		
		answer = input.next();
			
		if (answer.equals("yes") || answer.equals("y") || answer.equals("Y"))
		{
			if (cat.equals("obese."))
				System.out.print("Please contact our experts for professional help.");
			if (cat.equals("overweight."))
				System.out.print("Please watch out what you eat and do more exercises!");
			if (cat.equals("within your healthy weight!"))
				System.out.print("Congratulations, you are doing fairly well. Keep on going.");
			if (cat.equals("underweight."))
				System.out.print("Please eat well and do more exercises.");
		}
		else
			System.out.print("Nice to meet you too. Bye!");
			}

}
