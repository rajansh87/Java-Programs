class table2 implements Runnable
{
	public static void main(String args[]) throws InterruptedException
	{
		table2 tab=new table2();
                Thread thread2=new Thread(tab);
                Thread thread3=new Thread(tab);
		thread2.setName("Thread 2");
		thread3.setName("Thread 3");
		thread2.start();
		
		thread3.start();
	}
	public void run()
	{
		printTable();
		
	}

        synchronized void printTable()
	{
          	int n;
		for(int i=1;i<=10;i++)
		{
			
			if(Thread.currentThread().getName()=="Thread 2")
				n=2;
			else
				n=3;
			System.out.print(n+" * "+i+" = ");
			int m=n*i;
			System.out.println(m);
			
		}
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException ie)
		{  
			ie.printStackTrace();
		}

        }
}