// -------------------------------------------------------
// Assignment 3
// Written by: Samuel Vachon 40281580
// For COMP 248 Section H – Fall 2023
// --------------------------------------------------------

/*The goal of the here program is to sort the results of a skiing contest in order to know at any time
 * who is on the podium and what is their time.
 */

import java.util.Scanner;

public class A3_Q2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Declaring the Arrays and variables.
		double tempTimes;
		String tempNames;
		String[] names = new String[20];
		double[] times = new double[20];
		
		//Welcome message
		System.out.println("Welcome to Mont-Halloween Skiing Contest Ranker."
				+ "\nWhenever a skier makes it to the finish line, enter their name and skiing time.");
		
		
		for (int i=0;i<20;i++) {
			
			//Prompting the user for the skier time and name.
			System.out.print("Please input the skier's name: ");
			names[i] = input.next();
			System.out.print("Please input the skier's time: ");
			times[i] = input.nextDouble();
			
			/*Here, I sort the time by increasing order and make sure to keep the names in the same index
			 * as their times, to make sure to keep the non-zero value in front of the zero value
			 * the sorting stops at the index we just changed by prompting the user. This way, we know the first 
			 * time is at index 0, the second one is index 1 and so on.
			 */
			for (int a=0;a<=i;a++) {
				for (int b=a;b<=i;b++) {
					if (times[b]<times[a]) {
						tempTimes = times[a];
						times[a] = times[b];
						times[b] = tempTimes;
						
						tempNames = names[a];
						names[a] = names[b];
						names[b] = tempNames;
					}
				}
			}
			/*Displaying the current podium positions, times and names to the user. The ifs are to ensure 
			 * we only display non-zero values.
			 */
			System.out.println("First podium goes to "+names[0]+" who made it in "+times[0]+" second(s)");
			if (i>0)
				System.out.println("Second podium goes to "+names[1]+" who made it in "+times[1]+" second(s)");
			if (i>1)
				System.out.println("Third podium goes to "+names[2]+" who made it in "+times[2]+" second(s)");
			
			//Prompting the user to see if there is other skier to add
			System.out.print("Do you want to add another skier? y/yes: ");
			String choice = input.next();
			if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
			}
			else {
				i=20;
			}
		}
		
		//Closing message
		System.out.println("Goodbye!");
		input.close();
	}

}
