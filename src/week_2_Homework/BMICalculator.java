package week_2_Homework;

import java.util.Scanner;

public class BMICalculator {
	
	public static void main(String[] args) {
		
		double weight;
		double height;
		double BMI;
		
		Scanner scan = new Scanner(System.in);
		
		//Gets Weight from user
		System.out.print("Enter weight in pounds: ");
		weight = scan.nextDouble();
		
		//Gets height from user
		System.out.print("Enter height in inches: ");
		height = scan.nextDouble();
		
		//Calculates and displays BMI
		BMI = 703 * weight / Math.pow(height, 2);
		System.out.print("BMI is " + (BMI));
		
	}
	
}
