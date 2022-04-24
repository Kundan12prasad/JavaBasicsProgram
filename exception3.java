public class exception3 
{
	public static void main(String[] args)
	{
		System.out.println("Main1");
		try
		{
			int i=10/0;   //exception does not identify here
			System.out.println("try");
			
		}
		//int i=6;  //unreachable statement
		catch(ArithmeticException e)
		{
			int i=40;
			System.out.println(e); 
			System.out.println("catch");   // catch block will not be executed
		}
		System.out.println("Main2");
	}
}
