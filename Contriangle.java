class Contriangle
{
double base,height,area;
void findarea(double a,double b)
{
base=a;
height=b;
area=(0.5*base*height);
System.out.println("Area of triangle is" +area);
}
}
class ABC
{
public static void main(String args[])
{
Contriangle con[]=new Contriangle[3];
con[0]=new Contriangle();
con[1]=new Contriangle();
con[2]=new Contriangle();
con[0].findarea(6.9,3.3);
con[1].findarea(5.2,2.8);
con[2].findarea(7.9,4.5);
}
}


