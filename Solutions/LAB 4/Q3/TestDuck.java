class TestDuck
{
	public static void main(String args[])
	{
		RD ob1=new RD();
		WD ob2=new WD();
		RHD ob3=new RHD();
		LD ob4=new LD();
System.out.println("Rubber Duck");
ob1.swim();
ob1.fly();
ob1.squeak();
System.out.println();

System.out.println("Wooden Duck");
ob2.swim();
ob2.fly();
ob2.squeak();
System.out.println();

System.out.println("Red Head Duck");
ob3.swim();
ob3.fly();
ob3.quack();
System.out.println();

System.out.println("Water Duck");
ob4.swim();
ob4.fly();
ob4.quack();

}
}