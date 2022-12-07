import java.util.Scanner;

public class Km_To_Miles {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter distance in Kilometer: ");
		int km = s.nextInt();
		float miles = (float) (0.621371 * km);
		System.out.println(" your km " + km+ " is in miles: " + miles);
	}

}
