class Objectrectangle
{
int length;
int width;
public void getdata(int length,int width)
{
this.length=length;
this.width=width;
}
public int rectarea()
{
int area=length*width;

System.out.println("Area of rectangle is" + area);
return area;
}
}
class ABC
{
public static void main(String args[])
{
Objectrectangle ob=new Objectrectangle();
//ob.getdata(10,20);
//ob.rectarea();
ob.length=10;
ob.width=20;
ob.rectarea();



}
}



