public class Shape12
{
void circle()
{
double pi=3.14;
int r=5;
double cir=(3.14*r*r);
System.out.println("Area of circle is: " + cir);
}

void rectangle(int len,int bre)
{
int rect=(len*bre);
System.out.println("Area of rectangle is:" + rect);
}

int square()
{
int a=5;
int square=(a*a);
System.out.println("Area of square is:" + square);
return square;
}

double triangle(int base,int height)
{
double triangle=(0.5*base*height);
return triangle;
}

public static void main(String[] args)
{
Shape12 s=new Shape12();
s.circle();
s.rectangle(5,6);
s.square();
double t=s.triangle(6,7);
System.out.println("Area of triangle is:" +t);
}
}








