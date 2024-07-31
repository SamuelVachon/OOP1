// ------------------------------------------------------- 
//Assignment 2
// Written by: Samuel Vachon 40281580
// For COMP 248 Section H – Fall 2023
// --------------------------------------------------------

//In this program, we ask the user the score of a student and than we return the corresponding grade. 
//We also test his answer and give him two chance to give a valid answer or else we stop the program.

import java.util.Scanner;

public class A2_Q2 {

	public static void main(String[] args) {
		
		//Welcome message
		System.out.println("-------****-------****-------****-------****-----****-----\n"
				+ "Welcome to Grade Calculator\n"
				+ "-------****-------****-------****-------****-----****-----\n");

		//Initiating variables
		
		double score;
		char grade = 'A';
		boolean invalid = false;
		
		//User prompt
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the student's score (out of 100): ");
		score = input.nextDouble();
		
		if (score > 100)
		{
			System.out.println("The score has to be below 100. Please try again.");
			score = input.nextDouble();
			invalid = true;
		}
		else
			if (score < 0)
			{	
				System.out.println("The score has to be zero or above. Please try again.");
				score = input.nextDouble();
				invalid = true;
			}
		
		if ((score > 100 || score < 0) && invalid)
			System.out.print("It is still an invalid input. Bye!");
		else
		{
			switch ((int)score/10) 
			{
			case 10:
				grade = 'A';
				break;
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				break;
			}	
			System.out.print("The student's grade is: "+grade);
		}
		
		
	}

}
