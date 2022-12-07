
public class Hightest_Number_Of_Array_Without_Sorting {
	
	public static void main(String[] args) {
		int[] anArray = {-2,100,60,-3,10,8};
		int largest = anArray[0];
		
		for (int i = 0; i < anArray.length; i++) {
			if(anArray[i] > largest) {
				largest = anArray[i];
			}
		}
		System.out.println(largest);
	}

}
