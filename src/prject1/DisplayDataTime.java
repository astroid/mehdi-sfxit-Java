package prject1;

import java.util.Date;
//A console application which 
//prints the current date and time.
public class DisplayDataTime {
	public static void main (String[] args){
	Date dateAndTime = new Date();
	System.out.println("Current Date and Time:"+ dateAndTime.toString());

	}
}