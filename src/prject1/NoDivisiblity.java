package prject1;
/* 30 jan
 * Write a program that prints all the numbers from 1 to N 
 * which are not divisible by both 3 and 7.
 */
import java.util.Scanner;

public class NoDivisiblity {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the upper numeber to check for not divisiblty by 3 and 7 :");
		int upperNumber = input.nextInt();
		input.close();
		for (int i = 1; i <= upperNumber; i++) {
			if (!((i % 3 == 0) && (i % 7 == 0)))
				System.out.println("The number of " + i
						+ " is not divisble by both 3 and 7 ");
		}
	}

}