package thread;

public class ThreadMe extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Java");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(2);
		System.out.println(Thread.currentThread().getPriority());
		
		ThreadMe t = new ThreadMe();
		
		t.start();
		
		System.out.println(t.getName());
		System.out.println(t.getId());
		System.out.println(t.getThreadGroup());
		System.out.println(t.getState());
		
		
		
	}

}
