class Mother
{	
	
	public static void show()
{
int x=10;
System.out.println("value of x is : "+x);
}	
}	


class Child extends Mother
{

}

class One 
{
public static void main(String args[])
{
Mother m=new Mother();
m.show();
Child ch=new Child();
ch.show();

}

}