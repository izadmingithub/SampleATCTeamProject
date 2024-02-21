package saurabh;

public class CallingOfStaticMethodInsideNonStaticMethod {
	public static void m1()
	{
		System.out.println("m1 method is executing");
	}
	
	
	public void m3()
	{
		m1();
	}
public static void main(String[] args) {
	CallingOfStaticMethodInsideNonStaticMethod mtd = new CallingOfStaticMethodInsideNonStaticMethod() ;
	mtd.m3();
} 
}
