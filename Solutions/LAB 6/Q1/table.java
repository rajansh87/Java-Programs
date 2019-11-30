class table extends Thread
{
	public static void main(String args[])
	{
		one thread2=new one();
		one thread3=new one();
		thread2.setName("Thread 2");
		thread3.setName("Thread 3");
		thread2.start();
		thread3.start();
	}
	public void run()
	{
		int n;
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread "+Thread.currentThread().getName() + " is running.");
			if(Thread.currentThread().getName()=="Thread 2")
				n=2;
			else
				n=3;
			System.out.print(n+" * "+i+" = ");
			int m=n*i;
			System.out.println(m);
		}
		
	}
}