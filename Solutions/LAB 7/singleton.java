class tank{
	private static tank instance=null;
	private tank()
	{
		//empty contructor
	}
	public static synchronized tank getinstance()
	{
		if(instance==null)
			instance= new tank();
		return instance;
	}
	public void supplywater()
	{
		System.out.println("WATER SUPPLY TO HOUSE HAS BEGUN.");
	}
}
class house{
	public void getwater()
	{
		tank obj=tank.getinstance();
		obj.supplywater();
	}
}
class test{
	public static void main(String args[]){
		house h1= new house();
		house h2= new house();
		house h3= new house();
		h1.getwater();
		h2.getwater();
		h3.getwater();
	}
}