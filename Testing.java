public class Testing
{
static void Test1()
{
System.out.println("Test1");
}

void Test2()
{
System.out.println("Test2");
}


public static void main(String args[])
{
Test1();    //static function
Testing t=new Testing();
t.Test2();
}
}
