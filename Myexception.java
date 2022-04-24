import java.lang.Exception;
class Myexception extends Exception
{
Myexception(String message)
{
 super(message);
}

}
class Testmyexception
{
public static void main(String args[])
{
int x=5,y=1000;
try
{
float z= ((float) x / (float) y);
if(z<0.01)
{
throw new Myexception("Number is too small");
}
}
catch(Myexception e)
{
System.out.println("Caught my Exception");
System.out.println(e.getMessage());
}

finally
{
System.out.println("I am always here");
}

}
}
