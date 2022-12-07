import java.util.Arrays;

public class Remove_Duplicates_From_Array {
	
	public static void main(String[] args) {
		int[] x = {1,1,2,3,4,4,5,6,6,7,8,8,9,9};
		int[] temp = new int[x.length];
		int j = 0;
		
		for (int i = 0; i < x.length-1; i++) {
			if(x[i]!= x[i+1]) {
				temp[j] = x[i];
				j++;
			}
		}
		temp[j] = x[x.length-1];
		for (int s : temp) {
			System.out.println(s);
		}
		
	}

}
