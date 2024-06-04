class Outer{

	class Inner{

		public void m1(){

			System.out.println("\nhey i am normal/regular inner class.");
		}
	}
}
public class NormalInnerClass{
	public static void main(String[] args) {
		//in different ways we can call the m1();

		//Type-1
		Outer outer1 = new Outer();

		Outer.Inner inner1 = outer1.new Inner();

		inner1.m1();


		//Type-2
		Outer.Inner inner2 = new Outer().new Inner();
		inner2.m1();

		//Type-3
		new Outer().new Inner().m1();

	}
}