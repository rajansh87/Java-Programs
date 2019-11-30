class One extends Thread
{
	public static void main(String args[])
	{
		One onea= new One();
		One oneb= new One();
		onea.setName("A");
		oneb.setName("B");
		onea.start();
		oneb.start();
	}
	public void run()
	{
		if(Thread.currentThread().getName()=="A")
		{
			for(int i=0;i<=50;i++)
				System.out.println("2 X "+i+" = "+2*i);
		}
		if(Thread.currentThread().getName()=="B")
		{
			for(int i=0;i<=50;i++)
				System.out.println("3 X "+i+" = "+3*i);
		}		
	}
	
}