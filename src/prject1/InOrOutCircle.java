package prject1;
/* 30 jan
 * a program that prompts the user to enter a point (x, y) and checks 
* whether the point is within the circle centered at (0, 0) with radius 10.
 */
import java.util.Scanner;

public class InOrOutCircle {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 double x, y;
		 double radius;
		  
		 System.out.print("Enter x-coordinator of the point:");
		 x = input.nextDouble();
		 System.out.print("Enter y-coordinator of the point:");
		 y = input.nextDouble();
		 input.close(); 
		 radius = Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);
		  
		 if(radius <= 10) {
		  System.out.print(">>> The point (" + x + ", " + y + ") is inside the circle.");
		 } else {
		  System.out.print(">>> The point (" + x + ", " + y + ") is outside the circle.");
		 }
		 ;
	}
}
