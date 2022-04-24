class Cone
{
double area,volume;
int radius;
double height;
final double pi=3.14;
Cone(int radius,double height)
{
this.radius=radius;
this.height=height;
}
public double con_area()
{
area=(pi*radius*radius*height);
System.out.println("Area of Cone is" +area);
return area;
}

public double con_volume()
{
volume=((4/3)*pi*(radius*radius)*height);
System.out.println("Volume of Cone is" +volume);
return volume;
}
}
class ABC
{
public static void main(String args[])
{
Cone obj=new Cone(3,3.5);
obj.con_area();
obj.con_volume();
}
}



