package saurabh;

public class CallingOfNonStaticAnotherNonStaticMethod {
	public void m1()
	{
		System.out.println("M1 method is executing");
	}
	
	public void m2()
	{
		m1();
		System.out.println("M2 method is executing");
	}
	
	public static void main(String[] args) {
		
		
		CallingOfNonStaticAnotherNonStaticMethod a = new CallingOfNonStaticAnotherNonStaticMethod();
		
		a.m2();
		
	}
}
