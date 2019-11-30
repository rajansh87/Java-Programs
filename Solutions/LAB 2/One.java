class Mother
{
	public static void show()
{
System.out.println("value of x is : "+x);
}	

	
}

class Child extends Mother
{

}

class Application 
{
public static void main(String args[])
{
Mother m=new Mother();
m.show();
Child ch=new Child();
ch.show();

}

}