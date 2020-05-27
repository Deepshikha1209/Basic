package thread;

public class ThreadInfo extends Thread{

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t = new Thread("My Thread");
		
		log("",t);
		
	}*/

	public static void log(String indent, Thread t) {
		
		System.out.println(indent + "Thread name" + t.getName());
		System.out.println(indent + "Id" + t.getId());
		System.out.println(indent + "Priority" + t.getPriority());
		System.out.println(indent + "State" + t.getId());
		System.out.println(indent + "Thread group" + t.getThreadGroup().getName());
		System.out.println(indent + "Is Alive" + t.isAlive());
		System.out.println(indent + "Is Daemon" + t.isDaemon());
		
	}
	public static void info(String indent, ThreadGroup tg) {
		
	int threadcount = tg.activeCount();
	Thread[] threads = new Thread[threadcount];
	tg.enumerate(threads);
	
	System.out.println(indent + "Thread group name" + tg.getName());
	System.out.println(indent + "IsDaemon" + tg.isDaemon());
	
	for(int i=0;i<threads.length;i++)
	{
		log(indent + "\t" , threads[i]);
}

	int groupcount = tg.activeGroupCount();
	ThreadGroup[] groups = new ThreadGroup[groupcount];
	tg.enumerate(groups);
	
	for(int i=0;i<groups.length;i++)
	{
		info(indent + "\t" , groups[i]);
}
	
	
	}
	

public static void main(String[] args) {
	
	Thread t = new Thread("My Thread");
	
	log("",t);
	
	Thread tt = Thread.currentThread();
	
	ThreadGroup tg =tt.getThreadGroup();
	
	while(tg.getParent()!=null)
	{
		tg=tg.getParent();
	}
}
}

/*HelloWithThread t1 = new HelloWithThread("Deep");

t1.setPriority(1);
HelloWithThread t2 = new HelloWithThread("Dee");*/


