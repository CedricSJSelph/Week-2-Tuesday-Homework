package week_2_Homework;

import java.util.Scanner;

public class VolumeOfCylinder {

	public static void main(String[] args) {
		
		double Radius;
		double Length;
		double Area;
		double Volume;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the radius and length of a Cylinder: ");
		
		Radius = scan.nextDouble();
		Length = scan.nextDouble();
		
		Area = Radius * Radius * Math.PI;
		Volume = Area * Length;
		
		System.out.print("The Area is " + Math.round(Area*100)/100.0 + ".");
		System.out.print(" The Volume is: " + Math.round(Volume*100)/100.0 + ".");

	}
}
