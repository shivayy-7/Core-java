import java.util.Arrays;

public class Sort_An_Array {
	
	public static void main(String[] args) {
		int[] x = {9,8,7,6,5,4,3,2,1,0};
		
//		for (int i = 0; i < x.length-1; i++) {
//			for (int j = 0; j < x.length-1; j++) {
//			
//			if(x[j]>x[j+1]) {
//				int temp = x[j];
//				x[j] = x[j+1];
//				x[j+1] = temp;
//			}
//		}
//		}
//		for (int s : x) {
//			System.out.print(s);
//		}
		
		//this mathod is helps us to sort an array 
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}

}
