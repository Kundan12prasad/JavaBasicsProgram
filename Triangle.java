public class Triangle
{
double base,height,area;
public void Triangle(int a, int b)
{
base=a;
height=b;
}
void trianglearea()
{
 area=(0.5*base*height);
System.out.println("Area of rectangle is" +area);
}
}

class ABC
{
public static void main(String args[])
{
Triangle t=new Triangle();
t.base=5;
t.height=6;
//t.Triangle(4,5);
t.trianglearea();
}
}



