class Human
{
int age ;
String name;
void run ()
{
System.out.print(name+"is of "+age+"and is running");
}
void set Data (String name , int age)
{
this.name =name;
this.age = age;
}
}
class Human Viewer{
public void static main(String[]args)
   Human h1=new Human();
String name = args[0];
int age = Integer.parseInt(args[1]);
h1.set Data(name,age);
h1.run();
}