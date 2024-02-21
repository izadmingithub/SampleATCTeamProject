package saurabh;

public class CallingOfStaticIntoAnotherStaticMethod {
	 public static void m1()
		{
			System.out.println("m1 method is executing");
		}
		
		public static void m2()
		{
		CallingOfStaticIntoAnotherStaticMethod.m1();
			
			System.out.println("m2 method is executing");
		}
		
		public static void main(String[] args) {
			
			m2();
			
		}
}
