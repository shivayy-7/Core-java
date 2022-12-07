
public class Prove_String_Is_Immutable {
	public static void main(String[] args) {
		String s1 = "java";//"java" string created in pool and referemce assigned to s1
		 String s2 = s1;//s2 is also having the same reference to "java" in the pool
		 
		 System.out.println(s1==s2);//prof that s1 and s2 have same reference
          System.out.println(s2);//prints "java" supporting the fact that original string value is unchanged, hence string is immutable
		
	}

}
