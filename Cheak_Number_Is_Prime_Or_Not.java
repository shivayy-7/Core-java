import java.util.Scanner;

public class Cheak_Number_Is_Prime_Or_Not {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = s.nextInt();
		boolean prime = true;
		
		for (int i = 2; i < n; i++) {
			if(n%i==0) {
				prime = false;
				break;
			}
		}
		System.out.println(prime);
	}

}
