class Two
{
	public static void main(String args[])
	{
		
		int i,j;
		for(i=1;i<=4;i++)
		{
			for(j=3;j>=i;j--)
			{
				System.out.print(" ");	
			}
			for(j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("\n");
		}		

	}
}