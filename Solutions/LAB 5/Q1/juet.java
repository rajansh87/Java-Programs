class Juet
{
	void t1(boolean strangerThings)
	{
		System.out.println(strangerThings);
		University univ = new University();
		try
		{
			univ.exam(strangerThings);
		}
		catch(ExamSuspendException e)
		{ e.printStackTrace();}
	}
}