public class Fibbanicco
{
public static void main(String args[])
{
int a=0;
int b=1;
int c;
int i;
System.out.println(+a);
System.out.println(+b);
for(i=2;i<=5;i++)
{
c=a+b;
System.out.println(+c);
a=b;
b=c;
}
}
}


