package prject1;

/**
 * Calculating the sum of the digits in a number between 0 - 1000
 * @author mehdish - MEHDI
 */
import java.util.Scanner;

public class CalcSumOfDigit {
	public static void main(String[] args) {
		int number = 0;
		int sumOfDigits = 0;
		int remainder = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer number between 0 - 1000: ");
		number = input.nextInt();

		if (number > 0 && number < 1000) {
			System.out.print("The sum of the digits in " + number + " is: ");
			for (int i = 0; i < 3; i++) {
				remainder = number % 10;
				sumOfDigits += remainder;
				number = number / 10;
			}
			System.out.println(sumOfDigits);
		} else {
			System.out.println("the number is not between 0 - 1000");
		}
		input.close();
	}

}