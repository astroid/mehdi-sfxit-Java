package prject1;

/*  a program that displays the area and perimeter of circle that
has radius of 5.5. Use Math.PI */

import java.lang.Math;

public class Circle {

    public static double circlePerimeter (double radius) {
        return 2 * Math.PI * radius;
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        
    	double radius = 5.5;
        System.out.println("Perimeter: "+ circlePerimeter (radius));
        System.out.println("Area: "+ circleArea(radius));

        }
}