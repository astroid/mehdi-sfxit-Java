package prject1;
/* 
 * 30 jan - 
 * a program that prompts the user to enter a string 
 * and displays the string in reverse order.
 */ 
import java.util.Scanner;

public class ReverseString {

	public static void main(String args[]) {
		String str, revStr = "";
		Scanner input = new Scanner(System.in);
		System.out.print(">>> Enter the string to reverse : ");
		str = input.next();
		input.close();

		for (int i = str.length() - 1; i >= 0; i--)
			revStr = revStr + str.charAt(i);
			System.out.println(">>> The reversed string is: " + revStr);
	}
}

