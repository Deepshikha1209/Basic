package thread;

public class DemoCloneCall implements Cloneable{

	DemoClone d;
	int b;
	
	public DemoCloneCall(int b,DemoClone d) {
		this.b=b;
		this.d=d;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		DemoClone d1=new DemoClone(d.a);
		DemoCloneCall d2=new DemoCloneCall(b,d1);
		return d2;
	}
	
	public static void main(String[] args) throws Exception{
		DemoClone d=new DemoClone(10);
		DemoCloneCall dd=new DemoCloneCall(20, d);
		System.out.println(dd.b+"----"+dd.d.a);
		DemoCloneCall ddd=(DemoCloneCall)dd.clone();
		ddd.b=200;
		ddd.d.a=100;
		System.out.println(dd.b+"----"+dd.d.a);
		System.out.println(ddd.b+"----"+ddd.d.a);
	}
}
