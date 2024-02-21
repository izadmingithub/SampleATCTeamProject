package saurabh;

public class MethodWithReturnTypeAndWithArgument {
	public static String calc(int a, String b)
	{
		String d = a+b;
		
		return d;
	}
public static void main(String[] args) {
		
	String uidname	= calc(80, "John");
	
	String s = uidname+"california";
	
	System.out.println(s);//80JohnCalifornia
}
}
