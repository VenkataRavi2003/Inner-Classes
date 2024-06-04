/*Anonymus inner class means , the class which without name.

Anonymus Inner-classes are mainly used for one-time purpose.

if any requirement that requires only once then we go for Anonymus Inner-Classes.*/

//Anonymus Inner-Class extends Thread Class.

public class AnonymusInnerClass{

	public static void main(String[] args) {
		
		Thread t1 = new Thread(){

			@Override
			public void run(){

				for (int i = 0 ; i < 5 ; ++i) {
					
					System.out.println(Thread.currentThread().getName());
				}
			}
		};

		t1.setName("Anonymus Inner-Class");
		t1.start();
	}
}