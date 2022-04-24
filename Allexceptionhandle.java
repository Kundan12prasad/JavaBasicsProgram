class Allexceptionhandle
{
public static void main(String args[])
{
try
{
int data=20;
int val=(data/0);
}
catch(ArithmeticException e)
{
System.out.println("Division by Zero:");
}

try
{
int a[]=new int[5];
a[10]=20;
}

catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array index error");
}
}
}


