package prject1;

/* 30 jan 
 * a program which reads the coefficients a, b and c of 
 * a quadratic equation ax^2 + bx + c = 0 and solves it 
 */
import java.util.Scanner;

public class QuadEquition {
	public static void main(String[] args) {
		double a, b, c;
		double root1, root2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the values of a");
		a = input.nextDouble();
		System.out.println("Enter the values of b");
		b = input.nextDouble();
		System.out.println("Enter the values of c");
		c = input.nextDouble();
		input.close();
		double m = (b * b) - 4 * a * c;
		if (m < 0) {
			System.out.println("The equation has no real roots");
		} else {
			double l = Math.sqrt(m);
			root1 = (-b - l) / 2 * a;
			root2 = (-b + l) / 2 * a;
			if (root1 == root2) {
				System.out.println("The equation has one root :" + root1);

			} else
				System.out.println("The equation has two roots " + root1
						+ " and " + root2);
		}
	}
}