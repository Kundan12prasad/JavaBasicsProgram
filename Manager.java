public class Manager
{
static int i=90;
int j=100;
public static void main(String[] args)
{
System.out.println(Manager.i);
Manager obj1=new Manager();
System.out.println(obj1.j);
obj1.j=50;
System.out.println(obj1.j);
Manager obj2=new Manager();
System.out.println(obj2.j);
}
}
