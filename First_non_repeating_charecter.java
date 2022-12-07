
public class First_non_repeating_charecter {
	
	public static void main(String[] args) {
		  String inputStr ="hhhHheeeeelllloowoorwld";
		  
		  for (char i : inputStr.toCharArray()) {
			if(inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
				System.out.println("First non-repeating charecter is: " +i);
				break;
			}
		}
		

}

}
