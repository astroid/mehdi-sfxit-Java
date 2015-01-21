package prject1;
/* Assume a runner runs 14 kilometers in 45 minutes 
and 30 seconds. Write a program that displays the average
speed in miles per hour. (1 mile is 1.6 kilometers)*/

public class AverageSpeedOfRunner {

   public static void main (String[] args)
   {
       double averageSpeed ;
       double distance = (14.0 / 1.6);
       double time = (45.0 / 60.0) + (30.0 / 3600.0);
       averageSpeed = distance / time;
	   System.out.println(">>>> " + averageSpeed+ " miles per hour of the runner");
   }
}
