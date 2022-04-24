
import java.io.*;
import java.io.DataInputStream;
abstract class Shape
{
abstract void area();
}

class Triangle extends Shape
{
double base,height;
Triangle(double a,double b)
{
base=a;
height=b;
}
void area()
{
double ar=(0.5*base*height);
System.out.println("Area of triangle is" +ar);
}
}
 class  Circle extends Shape
{
double radius;
Circle(double c)
{ 
radius =c;
}
void area()
{ 
double ar=(3.14*radius*radius);
System.out.println("Area of circle is" +ar);
}
}
class Square extends Shape
{
double side;
Square (double s)
{
side =s;
}
void area()
{
double ar=(side*side);
System.out.println("Area of square is"+ar);
}
}
class Demo
{
public static void main(String args[]) throws Exception

{

DataInputStream s1=new DataInputStream(System.in);
System.out.println("Please Enter the base:");
double b=Double.parseDouble(s1.readLine());

System.out.println("Please Enter the height:");
double h=Double.parseDouble(s1.readLine());

System.out.println("Please Enter the radius:");
double r=Double.parseDouble(s1.readLine());


System.out.println("Please Enter the side:");
double s=Double.parseDouble(s1.readLine());
Triangle ob1=new Triangle(b,h);
ob1.area();
Circle ob2=new Circle(r);
ob2.area();
Square ob3=new Square(s);
ob3.area();
}
}













