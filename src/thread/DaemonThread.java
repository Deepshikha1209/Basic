package thread; 

public class DaemonThread extends Thread{
public void run(){
	System.out.println("Daemon Thread Started"+Thread.currentThread());

while(true){
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Daemon Thread: woke up again");
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DaemonThread t = new DaemonThread();
t.setDaemon(true);
t.start();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("Leaving main method");
System.out.println("JVM will Exit");
	}

}
