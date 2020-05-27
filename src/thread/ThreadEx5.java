package thread;

public class ThreadEx5 extends Thread {

	public void run()
	{
		for(int i =0; i<10;i++)
			System.out.println("Child");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ThreadEx5 t = new ThreadEx5();
		
		t.start();
		
		t.join();
		
		for(int i =0;i<10;i++)
		{
			System.out.println("main");
			}
		
	}

}
