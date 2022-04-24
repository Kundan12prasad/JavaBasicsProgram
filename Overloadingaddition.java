public class Overloadingaddition
{
void add(int a, int b)
{
System.out.println("Integer addition is" +(a+b));
}
void add(float x,float y)
{
System.out.println(" Float addition is" +(x+y));
}
void add(String s1,String s2)
{
System.out.println("String addition is" +(s1+s2));
}
}

class ABC
{
public static void main(String args[])
{
Overloadingaddition ova=new Overloadingaddition();
ova.add(20,30);
ova.add((float)10.03,(float)20.09);
ova.add("Good","Morning");
}
}



