class Outer{

	static class Inner{
		public void m1(){
			System.out.println("\nStatic nested class m1().");
		}
	}
}
public class StaticNestedClass{
	public static void main(String[] args) {
		
		Outer.Inner in = new Outer.Inner();
		in.m1();
	}
}