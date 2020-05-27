package thread;

public class RacingCondThread extends Thread{

	public static SynchronizedMethod sm = new SynchronizedMethod();
	public RacingCondThread(String name){
		super(name);
	}
	//Deposit 5 times Rs. 1000, total 5000Rs.
	public void run(){
		for(int i =0; i<5; i++)
		{
			sm.deposit(getName(), 1000);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
RacingCondThread r1 = new RacingCondThread("Ram");
RacingCondThread r2 = new RacingCondThread("Shyam");

r1.start();
r2.start();
	}

}
