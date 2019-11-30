abstract class Animal{

abstract void makevoice();

}

class Lion extends Animal{
void makevoice(){
System.out.println("ROAR");}
}
class Cow extends Animal{
void makevoice(){
System.out.println("MOWWW");}
}
class Dog extends Animal{
void makevoice(){
System.out.println("Boww");}
}
class Pig extends Animal{
void makevoice(){
System.out.println("AWWWWW");}
}
class Goat extends Animal{
void makevoice(){
System.out.println("MEEEE");}
}



class Voice{
Animal animal[];
void preparevoice(){
animal=new Animal[5];
animal[0]=new Lion();
animal[1]=new Cow();
animal[2]=new Dog();
animal[3]=new Pig();
animal[4]=new Goat();
}
void hear(){
for(int i=0;i<5;i++)
{
animal[i].makevoice();
}
}


}


class Test{
public static void main(String args[])
{
Voice v=new Voice();
v.preparevoice();
v.hear();
}
}