package A;

public class C {
	public static void main(String[] args) {
		for (int i = 0; i <=5; i++) {
			for (int j = 0; j <=5; j++) {
				if(i==0 && j==0 || i==1 && j==0 || i==2 && j==0 || i==3 && j==0 || i==4 && j==0 || i==5 && j==0) {
					System.out.print(" 1");
				}
				else if(i==1 && j==1 || i==2 && j==1 || i==3 && j==1 || i==4 && j==1 || i==5 && j==1) {
					System.out.print(" *");
				}
				else if(i==2 && j==2 || i==3 && j==2 || i==4 && j==2 || i==5 && j==2) {
					System.out.print(" 3");
				}
				else if(i==3 && j==3 || i==4 && j==3 || i==5 && j==3 || i==5 && j==2) {
					System.out.print(" *");
				}
				else if(i==4 && j==4 || i==5 && j==4 ) {
					System.out.print(" 5");
				}
				else if(i==5 && j==5 ) {
					System.out.print(" *");
				}
			}
			System.out.print("\n");
		}
	}

}
