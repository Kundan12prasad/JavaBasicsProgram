class Room_super
{
int length;
int breadth;
Room_super(int a,int b)
{
length=a;
breadth=b;
}
public int area()
{
return (length*breadth);
//System.out.println("area of room is" +roomarea);
}
}
class Bedroom extends Room_super
{
int height;
Bedroom(int x,int y,int z)
{ 
   super(x,y);
 height=z;
}
public int volume()
{ 
return (length*breadth*height);
//System.out.println("Volume of room is" +roomvolume);
}
}
class ABC
{
public static void main(String args[])
{
Bedroom bd=new Bedroom(10,20,30);
//int area1=bd.area();
//int volume1=bd.volume();
System.out.println("area of room is:" +(bd.area));
System.out.println("Volume of room is:" +(bd.volume));
}
}





