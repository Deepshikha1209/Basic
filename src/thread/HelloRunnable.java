package thread;

public class HelloRunnable implements Runnable{
	private String name;
	public HelloRunnable(String n){
		this.name = n;
	}
	public void run() {
		for(int i=1;i<10;i++){
			System.out.println(i+"#"+name);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HelloRunnable h = new HelloRunnable("Thread 1");
HelloRunnable h1 = new HelloRunnable("Thread 2");

Thread t = new Thread(h);
t.start();
Thread t1 = new Thread(h1);
t1.start();


	}

}
