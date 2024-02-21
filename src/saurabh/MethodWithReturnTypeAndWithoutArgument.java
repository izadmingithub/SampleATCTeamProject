package saurabh;

public class MethodWithReturnTypeAndWithoutArgument {
	public static int m1()
	{
		int i = 10;
		int j = 20;
		int k = i+j;
		
		System.out.println(k);
		
		return 100;
	}
	
	public static void main(String[] args) {
		int f = m1();
		
		System.out.println(f);//100
	} 
}
