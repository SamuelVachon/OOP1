//------------------------------------------------------------------
//Assignment 1
//Written by: Samuel Vachon #40281580
//For COMP 248 section H - Fall 2023
//------------------------------------------------------------------

public class A1_Q1 {

	public static void main(String[] args) {
		//Algorithm 1: Simple Cipher Program
		
		// First two line to print
		System.out.println("Project-S Access System: 6-Piece Puzzle Authentification Challenge:");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		//Creation of the 2 lines that includes the calculation values.
		int x, y;String line1= new String();String line3= new String();
		x = 7;
		y = 5;
		line1 += x+" @ "+y+"   ";
		line3 += "  "+(x/y+x%y)+"  ";
		
		x = 8;
		y = 3;
		line1 += x+" @ "+y+"   ";
		line3 += "     "+(x/y+x%y)+"  ";
		
		x = 4;
		y = 2;
		line1 += x+" @ "+y+"   ";
		line3 += "     "+(x/y+x%y)+"  ";
		
		x = 20;
		y = 14;
		line1 += x+" @ "+y+"   ";
		line3 += "      "+(x/y+x%y)+"  ";
		
		x = 9;
		y = 3;
		line1 += x+" @ "+y+"   ";
		line3 += "      "+(x/y+x%y)+"  ";
		
		x = 45;
		y = 20;
		line1 += x+" @ "+y+"   ";
		line3 += "      "+(x/y+x%y)+"  ";
		
		//Output for the rest of the program.
		System.out.println(line1);
		System.out.println("  |       |       |        |        |        |");
		System.out.println(line3);
		System.out.println("At Project-S, we employ multi-factor authentification because one password is never enough.");
		}
}
