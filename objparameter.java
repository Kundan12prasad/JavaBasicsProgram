class objparameter
{
int i=10;
void test()
{
System.out.println("Test-A");
}
}
class objparameter1 extends objparameter
{
int j=20;
void test()
{
System.out.println("Test-B");
}
}
class ABC
{
static void meth(objparameter obj)
{
System.out.println(obj.i);
//System.out.println(obj.j);
obj.test();
}
public static void main(String args[])
{
objparameter ob1=new objparameter();
if(ob2 instanceof objparameter)
{
	System.out.println("Yes");
	
}
ABC.meth(ob1);
objparameter1 ob2=new objparameter1();
if(ob2 instanceof objparameter)
{
	System.out.println("No");
}
ABC.meth(ob2);
}
}




