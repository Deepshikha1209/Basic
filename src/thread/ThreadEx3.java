package thread;

public class ThreadEx3 extends Thread {
	
	public void run()
	{
for(int i=0;i<10;i++)
			
			System.out.println("Hello");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadEx3 t = new ThreadEx3();
		
		t.start();
		
for(int i=0;i<10;i++)
			
			System.out.println("Hi");

	}

}
