package javapractice;
import java.util.Scanner;

import java.io.*;
public class switchcalculator {

	 public static void main(String args[])
		        throws IOException {
		 
	/* BufferedReader br = new BufferedReader(
		            new InputStreamReader(System.in)); */
		
		Scanner input = new Scanner(System.in);

		
		
		
		System.out.println("enter a number");
		int num1 = input.nextInt();
				
		System.out.println("enter second number");
		int num2 = input.nextInt();
		
		System.out.println("select operator");
		System.out.println("1 for addition");
		System.out.println("2 for substraction");
		System.out.println("3 for multiplicatio ");
		System.out.println("4 for division");
		int operator = input.nextInt();

		int ans;
		switch(operator) {
		case 1:
			ans= num1+num2;
			System.out.println(num1 + " + " + num2 +" = " +ans);
			break;
		case 2:
			ans= num1-num2;
			System.out.println(num1 + " - " + num2 +" = " +ans);
			break;
		case 3:
			ans= num1*num2;
			System.out.println(num1 + " * " + num2 +" = " +ans);
			break;
		case 4:
			ans= num1/num2;
			System.out.println(num1 + " / " + num2 +" = " +ans);
			break;	
		default:
			System.out.println("invalid operator");
			
		}
		
		input.close();
	}

}
