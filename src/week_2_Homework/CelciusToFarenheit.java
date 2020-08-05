package week_2_Homework;
import java.util.Scanner;

public class CelciusToFarenheit {

	public static void main(String[] args) {
		
		double Converted_Temp;
		int Celcius;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter degrees in celcius:");
		Celcius = scan.nextInt();
		
		Converted_Temp = ((9.0/5.0) * Celcius) + 32;
		
		System.out.print(Celcius + " Celcius is " + Converted_Temp + " Farenheit.");;
		
	}
}
