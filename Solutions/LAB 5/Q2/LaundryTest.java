class LaundryTest
{
	void unfit(int x) throws TshirtException,ShirtException,PantException,ClothException
	{
		if(x==1)
		{
			throw new TshirtException();
		}
		if(x==2)
		{
			throw new ShirtException();
		}
		if(x==3)
		{
			throw new PantException();
		}
		if(x==4)
		{
			throw new ClothException();
		}
	}

	public static void main(String args[])
	{
		LaundryTest l=new LaundryTest();
		int x=3;
		try
		{
			l.unfit(x);
		}
		catch(TshirtException e)
		{e.printStackTrace();}

		catch(ShirtException f)
		{f.printStackTrace();}

		catch(PantException g)
		{g.printStackTrace();}

		catch(ClothException g)
		{g.printStackTrace();}
	
		finally
		{
			System.out.println("In Finally");

		}
		System.out.println("Last Line Of main");
		
	}
}