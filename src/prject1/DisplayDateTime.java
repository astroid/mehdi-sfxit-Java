package prject1;
/* A console application which 
 * prints the current date and time.
 */
import java.time.LocalDateTime;
	public class DisplayDateTime {
		public static void main (String[] args){
			LocalDateTime currentTime = LocalDateTime.now();     
		      System.out.println("Current Date and Time: " + currentTime);
		      
		}
	}


