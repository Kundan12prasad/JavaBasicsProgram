public class Calculator
{
void add()
{
int a=30;
int b=20;
int sum=a+b;
System.out.println("Sum is" + sum);
}
void sub(int a, int b)
{
int sub=a-b;
System.out.println("Sub is" +sub);
}

int mul()
{
int a=30;
int b=20;
int mul=a*b;
//System.out.println("Mul is" +mul);
return mul;
}

int div(int a,int b)
{
int div=a/b;
System.out.println("Div is" + div);
return div;
}
}

class Demo
{

public static void main(String args[])
{
Calculator c=new Calculator();
c.add();
c.sub(20,10);
int m=c.mul();
System.out.println("Mul is" +m);
int d=c.div(200,20);
}

}




