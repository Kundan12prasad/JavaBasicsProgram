class Complex
{
int real;
int img;
public com add(int c1,int c2)
{
return new(c1+c1.real,c2+c2.img);
}

public com sub(int c1,int c2)
{
return new(c1+c1.real,c2+c2.img);

}
}

class ABC
{
public static void main(String args[])
{
Complex obj1=new Complex();
Complex obj2=new Complex();
obj1.add(3,5);
obj2.sub(5,6);
}
}

