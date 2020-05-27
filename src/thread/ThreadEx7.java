package thread;

public class ThreadEx7 extends Thread{
	
	static Thread t;
	
	public void run()
	{
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	for(int i= 0;i<10;i++) 
	{
		System.out.println("Child Thread");
	
	
	}
	}
}
