public class AnonymusInnerClassInsideArguments{

	public static void main(String[] args) {

		Thread t = new Thread(

			new Runnable(){

				@Override

				public void run(){

					for (int  i = 0 ;i < 5 ; ++i) {
						
						System.out.println(Thread.currentThread().getName());
					}
				}
			}
		);

		t.start();
	}
}