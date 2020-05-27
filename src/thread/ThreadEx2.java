package thread;

public class ThreadEx2 {

	String name;
	
	public ThreadEx2(String name)
	{
		this.name=name;
	}
	
	public void run(){
for(int i=0;i<10;i++)
			
			System.out.println("Hello"+i+name);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadEx2 t = new ThreadEx2("Ok");
		ThreadEx2 t1 = new ThreadEx2("Oko");
		
		t.run();
		t1.run();
		
for(int i=0;i<10;i++)
			
			System.out.println("Hi" +i);

		
	}

}
