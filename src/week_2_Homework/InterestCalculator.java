package week_2_Homework;

import java.util.Scanner;

public class InterestCalculator {
	
	public static void main(String[] args) {
		
		double interest;
		double balance;
		double annualInterestRate;
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		
		//gets balance and interest from user
		balance = scan.nextDouble();
		annualInterestRate = scan.nextDouble();
		
		//Calculates next months interest
		interest = balance * (annualInterestRate/1200);
		
		System.out.print("The interest is " + interest + ".");
	}

}
