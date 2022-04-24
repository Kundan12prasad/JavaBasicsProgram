import java.io.DataInputStream;
class Prime
{
public static void main(String args[]) throws Exception
{
DataInputStream s1=new DataInputStream(System.in);
System.out.println("please enter number");
int num=Integer.parseInt(s1.readLine());
int i;
int count=0;
for(i=1;i<=num;i++)
{
if(num % i==0)
count=count+1;
}
if(count==2)
System.out.println("Number is prime");
else
System.out.println("Number is not prime");
}
}


