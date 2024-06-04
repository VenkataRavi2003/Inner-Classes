/*
Method Local Inner-Class means , declaring the class inside an method.
*/

class Outer{

	public void m1(){

		class Inner{

			public void sum(int a,int b){

				System.out.println("\nsum : "+(a+b));
			}
		}

		Inner inner = new Inner();

		inner.sum(10,30);
		inner.sum(100,300);
		inner.sum(1000,3000);
	}
}
public class MethodLocalInnerClass{

	public static void main(String[] args) {

		Outer outer = new Outer();
		outer.m1();
	}
}