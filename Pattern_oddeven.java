public class Pattern_oddeven
{
public static void main(String args[])
{
int i,j;
int k=1;
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
{
if(k % 2==0)
System.out.println("#");
else
System.out.println("*");
k++;
}
System.out.println(" ");
}
}
}