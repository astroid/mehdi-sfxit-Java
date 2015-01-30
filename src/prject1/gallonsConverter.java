package prject1;

import java.util.Scanner;

/*
 Write a program that reads number 
 in gallons and converts it to liters. 
 There are 3.7854 liters in a US gallon.
 */
public class gallonsConverter {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number in Gallon to convert to liter: ");
		double gallons = input.nextDouble();

		System.out.println("The converted number in liter " + gallons * 3.785);
		input.close();
	}
}