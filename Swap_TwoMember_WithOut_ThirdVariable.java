

public class Swap_TwoMember_WithOut_ThirdVariable {
	
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		b = b+a;
		a = b-a;
		b = b-a;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
	}

}
