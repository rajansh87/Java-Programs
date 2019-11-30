class University
{
	void exam(boolean strangerThings) throws ExamSuspendException
	{
		System.out.println(strangerThings);
		if(strangerThings==true)
		{
                  throw new ExamSuspendException();
                }
		else

		{
                  System.out.println("Exam");
                }
	}	
}