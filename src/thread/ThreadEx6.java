package thread;

public class ThreadEx6 extends Thread{

	public void run()
	{
		for(int i =  0;i<10;i++)
			
			System.out.println("Child");
		
		Thread.yield();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ThreadEx6 t = new ThreadEx6();
	
	t.start();

	for(int i = 0;i<10;i++)
		
	{
		
		System.out.println("main");
	}
	}

}
