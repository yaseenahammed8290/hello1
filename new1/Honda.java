class Honda
{
	static int count;
	public static void main(String[] args)
	{
		
		Runnable r2=()->
		{
			for(int x=0;x<5;x++)
				System.out.println(Thread.currentThread().getName()+"==>"+(count++));
		};
		Runnable r1=()->
		{
			for(int x=0;x<9;x++)
				System.out.println(Thread.currentThread().getName()+"==>"+(count++));
		};
		Thread t=new Thread(r2,"t1");
		t.start();
		Thread t1=new Thread(r1,"t2");
		t1.start();
		
	}
}