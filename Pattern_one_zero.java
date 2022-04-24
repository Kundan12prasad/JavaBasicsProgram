public class Pattern_one_zero
{
public static void main(String args[])
{
int i,j;
int k=1;
for(i=1;i<=5;i++)
{
       for(j=1;j<=i;j++)
       if(k % 2==0)
       System.out.println("0");
       else 
       System.out.println("1");
       k++;
}
System.out.println(" ");
}
}

