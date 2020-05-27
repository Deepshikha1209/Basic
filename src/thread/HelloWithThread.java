package thread;

public class HelloWithThread extends Thread{

	private String name;
	
	public HelloWithThread(String n)
	{
		this.name=n;
	}
	public void run(){
		for(int i =0;i<10;i++){
			System.out.println(i+"#"+name);
		}
	}
public static void main(String[] args){
	HelloWithThread t1 = new HelloWithThread("Thread 1");
	HelloWithThread t2 = new HelloWithThread("Thread 2");
	for(int i =0; i<10;i++){
	System.out.println(i+"#"+"Main");
	}
	t1.start();
	t2.start();
	
	
}
}