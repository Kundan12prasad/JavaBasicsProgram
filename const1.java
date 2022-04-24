public class const1
{
const1()
{
System.out.println("This is the first class constructor:");
}
const1(int a)
{
System.out.println("This is the constructor with the argument:" +a);

} 
 const1(int a, double b)
{

System.out.println("This is the constructor with second argument: First argument value is:" +a+ "   second argument value is:" +b);

}

}


class Dem
{
public static void main(String args[])
{
const1 obj1 =new const1();
const1 obj2 =new const1(20);
const1 obj3=new const1(50,60.9887);

}
}