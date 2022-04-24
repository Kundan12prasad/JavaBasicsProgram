public class Pattern_space_star
{
public static void main(String args[])
{
int i,j;
int d=4;
for(i=1;i<=4;i++)
{
for(int s=1;s<=d;s++)
{
System.out.println(" ");
}
for(j=1;j<=i;j++)
System.out.println("* ");
System.out.println(" ");
d=d-1;
}
}
}