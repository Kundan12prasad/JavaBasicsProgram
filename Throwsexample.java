class Throwsexample
{
static void divide_m() throws ArithmeticException
{
int x=22,y=0;
int z;
z=(x/y);
}
public static void main(String args[])
{
try
{
divide_m();
}
catch(ArithmeticException e)
{
System.out.println("caught the Exception:" +e);
}

}
}