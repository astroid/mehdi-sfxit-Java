package prject1;

/*
 * Write a program which finds the most frequently occurring element in an array. 
 * Example: {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3}. Result: 4 (5 times).
 */

public class MaxOcurrence {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 6, 7 };
		maxOcr(arr);
	}

	public static int maxOcr(int[] array) {
		int maxCount = 1;
		int maxElement = array[0];
		for (int i = 0; i < array.length; i++) {
			int counter = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j])
					counter++;
			}
			if (maxCount < counter) {
				maxCount = counter;
				maxElement = array[i];
			}
		}

		// System.out.println("Maximum number is "+ maxElement+
		// " and the occurrence is "+maxCount);
		System.out.println("Result: the number of " + maxElement + " ("
				+ maxCount + " times)");

		return maxElement;
	}
}
