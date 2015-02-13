package prject1;
/*
 * a program that reads 10 numbers, get the average of these numbers, 
 * and find the number of the items greater than the average.
 */
import java.util.Scanner;

public class AboveAverage {

	public static void main(String[] args) {
		
		double[] arrNumbers = new double[10];
		double sum = 0;

		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter one of the numbers: ");
			arrNumbers[i] = input.nextDouble();
			sum += arrNumbers[i];
		}
		input.close();

		double averageNum = sum / 10;

		int counter = 0;
		for (int i = 0; i < 10; i++)
			if (arrNumbers[i] > averageNum)
				counter++;

		System.out.println("The average is " + averageNum);
		System.out
				.println("The number of the items greater than the average is "
						+ counter);
	}
}