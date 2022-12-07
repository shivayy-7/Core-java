import java.util.Scanner;

public class Find_Leap_Year {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any year: ");
		Integer year = s.nextInt();
		
		if(year % 400==0) {
			System.out.println("year " + year + " is a leap year");
		}else if(year % 4==0 && year % 100!=0) {
			System.out.println("year " + year + " is a leap year");
		}else {
			System.out.println("year " + year+ " is not a leap year");
		}
	}

}
