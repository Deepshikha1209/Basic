package thread;

public class ThreadEx4 implements Runnable {

	public void run(){
		for(int i=0;i<10;i++)
			System.out.println("Child :)");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadEx4 t = new ThreadEx4();
		
		Thread tt = new Thread();
		
		tt.start();
		
		System.out.println("Main !!");
		
		t.run();
		
		
	}

}
