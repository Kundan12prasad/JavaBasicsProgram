import java.io.*;
import java.io.DataInputStream;

interface i1
{
void area();
final static double pi=3.14;
}

class Rect implements i1
{
double l,b;
Rect(double len,double bre)
{
l=len;
b=bre;
}
public void area()
{
double ar1=l*b;
System.out.println("Area of rectangle is:" +ar1);
}
}
class Circle implements i1
{
double r;
Circle(double rad)
{
r=rad;
}
public void area()
{
double ar2=(pi*r*r);
System.out.println("Area of Circle is" +ar2);
}
}

class ABC
{
public static void main(String args[]) throws IOException
{
DataInputStream len=new DataInputStream(System.in);
System.out.println("Enter the length of rectangle:");
int a=Integer.parseInt(len.readLine());

DataInputStream bred=new DataInputStream(System.in);
System.out.println("Enter the breadth of rectangle:");
int b=Integer.parseInt(bred.readLine());


DataInputStream rad=new DataInputStream(System.in);
System.out.println("Enter the radius of circle:");
int c=Integer.parseInt(rad.readLine());
Rect obj1=new Rect(a,b);
obj1.area();
Circle obj2=new Circle(c);
obj2.area();
}
}










