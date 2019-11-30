class TwoB
{
	public static void main(String args[])
	{
		
		int i,j;
		for(i=4;i>=1;i--)
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