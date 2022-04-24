class Runerrorhandle
{
public static void main(String args[])
{
int a=10;
int b=5;
int c=5;
int x,y;
try
{
x=a/(b-c); //Exception here
}
catch (ArithmeticException e)
{
System.out.println("Division by Zero");  //Exception handle


}
y=a/(b+c);
System.out.println("Value of y is: " +y);
}
}