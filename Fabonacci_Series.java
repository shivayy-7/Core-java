
public class Fabonacci_Series {
       public static void main(String[] args) {
		int n = 15;
		int f = 1;
		int s = 1;
		int t ;
		System.out.println(f);
		System.out.println(s);
		for (int i = 3; i <=n; i++) {
			t = f+s;
			System.out.print(t);
			f = s;
			s = t;
		}
	}
}
