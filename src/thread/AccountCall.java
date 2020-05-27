package thread;

public class AccountCall extends Thread {

	static Account a = new Account();
	
	public void run(){
		
		for(int i =0;i<10;i++)
			try {
				a.deposit(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountCall t1 = new AccountCall();
		AccountCall t2 = new AccountCall();
		AccountCall t3 = new AccountCall();
		
		t1.start();
		
		t2.start();
		
		t3.start();
	}
}
