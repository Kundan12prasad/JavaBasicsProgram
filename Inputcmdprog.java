import java.io.DataInputStream;
 class Inputcmdprog
{
public static void main(String args[]) throws Exception
{
int sum=0;
DataInputStream s1=new DataInputStream(System.in);
System.out.println("Enter the first value:");
int a=Integer.parseInt(s1.readLine());
System.out.println("Enter the Second value:");
int b=Integer.parseInt(s1.readLine());
sum=(a+b);
System.out.println("Addition of two number is:" +sum);
}

}