class Two extends Thread
{
	public static void main(String args[])
	{
		Two onea= new Two();
		Two oneb= new Two();
		onea.setName("A");
		oneb.setName("B");
		onea.start();
		oneb.start();
	}
	public void run()
	{
		if(Thread.currentThread().getName().equals("A"))
		{
			for(int i=0;i<=10;i++)
			{	
				System.out.println("2 X "+i+" = "+2*i);	
			}
		}
		if(Thread.currentThread().getName().equals("B"))
		{
			for(int i=0;i<=10;i++)
			{
				try{
					Thread.sleep(200);}		
				catch(InterruptedException e){
					e.printStackTrace();}
				System.out.println("3 X "+i+" = "+3*i);
				
			}
		}		
	}
	
}