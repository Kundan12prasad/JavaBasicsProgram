import java.io.DataInputStream;
 class Factor_input_test
{
public static void main(String args[]) throws Exception
{
DataInputStream s1=new DataInputStream(System.in);
System.out.println("PLEASE ENTER THE NUMBER");
int num=Integer.parseInt(s1.readLine());
int i;
int count=0;
for(i=1;i<=num;i++)
if(num % i==0)
{
count=count+1;
}
System.out.println("Number of factor is:" +count);
}
}

