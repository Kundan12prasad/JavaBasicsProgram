interface Area
{
static final double pi=3.14;
double compute(double x,double y);

}
class Rectangle implements Area
{
public double compute(double x, double y)
{
double rect=(x*y);
System.out.println("Area of Rectangle is" +rect);
return rect;
}
}
class Circle implements Area
{
public double compute(double x,double y)
{
double cir=(pi*x*x);
System.out.println("Area of circle is" +cir);
return cir;
}
}

class ABC
{
public static void main(String[] args)
{
Rectangle obj1=new Rectangle();
obj1.compute(10,20);

Circle obj2=new Circle();
obj2.compute(10,0);
}
}





