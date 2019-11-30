class Bharatvanshi
{
	public void fight()
	{
		 System.out.println("Bharatvanshi Fighter");	
	}
}

abstract class Pandavs extends Bharatvanshi
{
	public void obey()
	{
		 System.out.println("Pandavs Obedient");	
	}
	public abstract void kind()
	{
		 System.out.println("Pandavs Kind");	
	}
		
}
abstract class Kauravs extends Bharatvanshi
{
	public abstract void obey()
	{
		 System.out.println("Kauravs Obey");	
	}
	public abstract void kind()
	{
		 System.out.println("Kauravs Kind");	
	}
}
class Bheem entends Pandavs
{
	public void kind()
	{
		 System.out.println("Bheem Kind");	
	}
}
class Arjun entends Pandavs
{
	public void kind()
	{
		 System.out.println("Arjun Kind");	
	}
}
class Duryodhan entends Kauravs{}
class Vikarn entends Kauravs
{
	public void obey()
	{
		 System.out.println("Vikarn Obey");	
	}
	public void kind()
	{
		 System.out.println("Vikarn Kind");	
	}
}

class Test
{
	public static void main(String args[])
	{
		Bharatvanshi B =new Bharatvanshi();
		B.fight();
		Pandavs P =new Pandavs();
		P.fight();
		P.obey();
		P.kind();
		Kauravs K =new Kauravs();
		K.obey();
		K.kind();
		Bheem bh =new Bheem();
		bh.kind();
		Arjun ar =new Arjun();
		ar.kind();
		Duryodhan D =new Duryodhan();
		Vikarn V =new Vikarn();
		V.obey();
		V.kind();
		
	}
}











