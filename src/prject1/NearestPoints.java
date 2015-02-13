package prject1;

import java.util.Scanner;

public class NearestPoints {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out
				.print("Enter the number of points for caclculating nearest points: ");
		int numberOfPoints = input.nextInt();

		double[][] pointArr = new double[numberOfPoints][2];
		System.out.print("Enter " + numberOfPoints + " points: ");
		for (int i = 0; i < pointArr.length; i++) {
			System.out.print("Enter the X coordinate of the point no."
					+ (i + 1) + " : ");
			pointArr[i][0] = input.nextDouble();
			System.out.print("Enter the Y coordinate of the point no."
					+ (i + 1) + " :  ");
			pointArr[i][1] = input.nextDouble();
		}
		input.close();

		shortestDistance(pointArr);
	}

	public static void shortestDistance(double[][] pointArr) {
		int point1 = 0, point2 = 1;
		double minDistance = distance(pointArr[point1][0], pointArr[point1][1],
				pointArr[point2][0], pointArr[point2][1]); 
															
		for (int i = 0; i < pointArr.length; i++) {
			for (int j = i + 1; j < pointArr.length; j++) {
				double distance = distance(pointArr[i][0], pointArr[i][1],
						pointArr[j][0], pointArr[j][1]);

				if (minDistance > distance) {
					point1 = i;
					point2 = j;
					minDistance = distance;
				}
			}
		}

		System.out.println(">>>> The closest two points are " + "("
				+ pointArr[point1][0] + ", " + pointArr[point1][1] + ") and ("
				+ pointArr[point2][0] + ", " + pointArr[point2][1] + ")");
	}

	// the distance of the two points
	public static double distance(double xCoordinate1, double yCoordinate1,
			double xCoordinate2, double yCoordinate2) {
		double dist =  Math.sqrt((xCoordinate2 - xCoordinate1)
				* (xCoordinate2 - xCoordinate1) + (yCoordinate2 - yCoordinate1)
				* (yCoordinate2 - yCoordinate1));
		return dist;
	}
}