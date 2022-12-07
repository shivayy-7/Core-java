import java.util.Scanner;

public class ReverceString_replaceOdd_place_In_0 {
	 public static void main(String[] args) {
		 System.out.println("Enter any thing: ");
		 Scanner scan = new Scanner(System.in);
		 String name = scan.nextLine();
			char[] word = name.toCharArray();
			for (int i = 0; i <= word.length-1; i++) {
				if(i%2!=0 ) {
					word[i]='0';
			}
			}
			for (int i =word.length-1; i >=0; i--) {
				System.out.print(word[i]+ " ");
			}
			
		}

}
