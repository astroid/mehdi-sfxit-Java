package prject1;
/* 
Write a program which reads your age from the console 
and prints how old you will be in ten years' time. 
*/
import java.util.Scanner;

public class YourAge {
	public static void main(String[] args)
	{
		Scanner getAge = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int yourAge = getAge.nextInt();
		
		System.out.println();
		int afterTenYears = yourAge +10;
		System.out.println("Your age after 10 years is "+ afterTenYears);
		getAge.close();
	}
}
