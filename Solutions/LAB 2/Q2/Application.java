 class Mother{
int x;
void show(){
System.out.println("Hello World");}}
class Child extends Mother{
void show(){
System.out.println("Hello Juet");}}
class Application{
public static void main(String args[]){
Mother m=new Mother();
m.show();
Child ch=new Child();
ch.show();}}