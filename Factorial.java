import java.io.DataInputStream;
class Factorial
{
public static void main(String args[]) throws Exception
{
DataInputStream s1=new DataInputStream(System.in);
System.out.println("Please enter the number");
int num=Integer.parseInt(s1.readLine());
int i;
long fact=1;
for(i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.println("Factorial is:" +fact);
}
}