package prject1;
/* 30 jan
 * A short value is stored in 16 bits. Write a program that prompts the user to enter a short integer 
 * and displays the 16 bits for the integer. 
 */
import java.util.Scanner;

public class IntTo16Bit {

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an Integer : ");
    int shortInt = input.nextInt();
    input.close();
    System.out.print("The bits are ");
    int mask = 1;
    for (int i = 15; i >= 0; i--) {
      int temp = shortInt >> i;
      
      int bit = temp & mask;
      System.out.print(bit);
    }
  }
}
