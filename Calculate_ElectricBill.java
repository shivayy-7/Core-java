import java.time.LocalDate;
import java.util.Scanner;

public class Calculate_ElectricBill {
	//write a java program to calculate electric amount for that month
	//based on user input date.for 1-10th day of month no penalty. on
	//11th day onwards delay for each day penalty will be 1% on original
	//amount. original amount is 100
	
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		//yyyy-mm-dd format
		System.out.println("Enter Date: ");
		
		LocalDate enteredDate = LocalDate.parse(x.nextLine());
		int k = enteredDate.getDayOfMonth();
		double amount = 100;
		
		for (int i = 11; i <=k; i++) {
			amount = amount + (amount*0.01);
		}
		System.out.println("Amount is " + amount);
		
		
		
	}

}
