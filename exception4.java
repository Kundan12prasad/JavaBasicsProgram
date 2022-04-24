public class exception4
{
	public static void main(String args[])
	{
		System.out.println("Main1");
		try
		{
			int i=90/0;
			try
			{
				int i=100/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		}
			catch(ArithmeticException ex)
			{
				System.out.println("Catch-2");
				try
				{
					int i=50/0;
				}
				catch(ArithmeticException e)
				{
					System.out.println(e);
				}
				System.out.println("Main2");
			}
	}
}