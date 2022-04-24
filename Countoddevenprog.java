public class Countoddevenprog
{
public static void main(String args[])
{
int number[]={12,15,19,22,31,76};
int even=0;
int odd=0;
int i;
for(i=0;i<=5;i++)
{
if((number[i] % 2)==0)
{
even=even+1;
}
else
{
odd=odd+1;
}
}
System.out.println("Count of even number is: " +even);
System.out.println("Count of odd number is: "  +odd);

}

}