package thread;

public class Account {

	double bal;
	
	public void setbal(double amount)
	{
		bal = amount;
	}
	
	public double getbal() throws InterruptedException
	{
		Thread.sleep(1000);
		return bal;
	}
	
	public void deposit(double amt) throws InterruptedException
	{
synchronized(this)
	{
		setbal(getbal()+amt);
		System.out.println("Current Balance is " + getbal());
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
