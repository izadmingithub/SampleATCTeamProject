package saurabh;

public class CallingOfNonStaticMethodInsideStaticMethod {
	public void m1()
	{
		System.out.println("m1 is executing");
	}
	
	public static void m2()
	{
		CallingOfNonStaticMethodInsideStaticMethod cons = new CallingOfNonStaticMethodInsideStaticMethod();
		
		cons.m1();
	}
	
	public static void main(String[] args) {
		m2();
	}
}
