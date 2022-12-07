import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class WhichCharecter_Is_Occurs_moreThanOnes_printThat_InGivenString {
	
	 public static void main(String[] args) {
	      //for user input
			 System.out.println("Enter String: ");
			 Scanner scan = new Scanner(System.in);
			 String s = scan.nextLine();//"a aa bb b"
			 //replace the white space
			 s = s.replace(" ", "");
			 //make the string in char Array
			 char[] arr = s.toCharArray();//charecter Array
			 //apply the logic
			 int count = 0;
			 Map<Character, Integer> map = new TreeMap<>();
			 for (int i = 0; i < arr.length; i++) {
				 count = 0;
				 for (int j = 0; j < arr.length; j++) {
					if(arr[i]==arr[j]) {
						count ++;
				}
			}
			 //store the char and count
			 map.put(arr[i], count);
		}
	      Set<Character> keySet = map.keySet();
	      
	      for (Character ch : keySet) {
			if(map.get(ch)>1) {
				System.out.println("Character "+ ch + " repeating " + map.get(ch) +" times.");
			}
		}
	}

}
