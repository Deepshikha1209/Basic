package thread;

public class SynchronizedMethod {

	private int balance;
	
	public synchronized void deposit(String msg, int amt){
		int bal = getBalance()+amt;
		setBalance(bal);
		System.out.println(msg + "new balance" + bal);
	}
	public int getBalance(){
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return balance;
	}
	public void setBalance(int balance){
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.balance=balance;
	}
}
