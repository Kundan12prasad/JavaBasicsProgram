public class cc
{
	int i=10;
	cc()
	{
		System.out.println("Const1");		
	}
	public static void main(String args[])
	{
		cc obj1=new cc();
		obj1.i=90;
		cc obj2= new cc();
		cc obj3=obj2;
		obj3.i=50;
		System.out.println(obj1.i);
		System.out.println(obj2.i);
		System.out.println(obj3.i);		
	}
}