public class AnonymusInnerClassImplementingRunnableInterface{

	public static void main(String[] args) {
		
		Runnable r = new Runnable(){

			@Override
			public void run(){

				for (int i = 0; i < 5 ; ++i) {
					
					System.out.println(Thread.currentThread().getName());
				}
			}
		};

		Thread t1 = new Thread(r);

		t1.start();
	}
}