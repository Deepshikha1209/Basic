package thread;

public class ThreadEx1 {

	public void run()
	{
		for(int i=0;i<10;i++)
			
			System.out.println(i);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadEx1 t = new ThreadEx1();
		
		t.run();
		
for(int i=0;i<10;i++)
			
			System.out.println("Hello");

	}

}
