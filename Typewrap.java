public class Typewrap
{
public static void main(String args[])
{
System.out.println("Variable Created");
char c='k';
byte b=50;
short s=1996;
int i=88888;
long lt=1234567895L;
float ft=87.98F;
double db=0.98699464;
System.out.println("c=" + c);
System.out.println("b=" + b);
System.out.println("s=" + s);
System.out.println("i=" + i);
System.out.println("lt=" +lt);
System.out.println("ft=" + ft);
System.out.println("db=" + db);
System.out.println("Type Converted");
short s1=(short) b;
short s2=(short) i;
float ft1=(float) i;
int i1=(int) ft;
System.out.println("s1=" + s1);
System.out.println("s2=" + s2);
System.out.println("ft1=" +ft1);
System.out.println("i1=" +i1);
}
}
 
