package thread;

public class ThreadEx8 extends ThreadEx7 {

	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			ThreadEx7.t= Thread.currentThread();
			
			ThreadEx8 tt = new ThreadEx8();
			
			tt.start();
			
			tt.join(6000);
			
			for(int i= 0;i<10;i++) 
			{
				System.out.println("Main Thread");
			
			}
			
			Thread.sleep(2000);
			
			
			
		}



	}


