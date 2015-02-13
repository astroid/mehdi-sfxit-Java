package prject1;
/*
 * a program which reads two arrays from the console and compares them 
element by element in order to check if they are identical. 
The arrays are identical if their corresponding elements are equal.
 */


import java.util.Scanner;

public class ArrayComparision {

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of items of the arraye1 then the items of the array: ");
    int arrLenght1 = input.nextInt();
    int[] array1 = new int[arrLenght1];

    for (int i = 0; i < array1.length; i++) {
      array1[i] = input.nextInt();
    }

    System.out.print("Enter the number of items of the arraye2 then the items of the array: ");
    int arrLenght2 = input.nextInt();
    int[] array2 = new int[arrLenght2];

    for (int i = 0; i < array2.length; i++) {
      array2[i] = input.nextInt();
    }
    input.close();
    if (equal(array1, array2)) {
      System.out.println("The arrays are identical.");
    }
    else
      System.out.println("The arrays are not identical");
  }

  public static boolean equal(int[] array1, int[] array2)
  {
    if (array1.length != array2.length) {
      return false;
    }
    for (int i = 0; i < array1.length; i++) {
      if (array1[i] != array2[i])
        return false;
    }
    return true;
  }
}
