import java.util.Scanner;

public class Find_ArmStrong_Number {
	public static void main(String[] args) {
		int n,arm = 0,reminder,c;
		System.out.println("Enter Any Number: ");
		Scanner r = new Scanner(System.in);
		n = r.nextInt();
		c = n;
		
		while(n>0) {
			reminder = n%10;
			arm = (reminder*reminder*reminder) + arm;
			n = n/10;
		}
		if(c==arm) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not Armstrong Number");
		}
	}

}
