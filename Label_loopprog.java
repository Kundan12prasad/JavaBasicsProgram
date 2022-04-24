public class Label_loopprog
{
public static void main (String args[])
{
int i,j;
Loop1:for(i=1;i<100;i++)
{
System.out.println(" ");
if(i>=6) 
break;
for(j=1;j<100;j++)
{
System.out.println("*");
if(j==i) 
continue Loop1;
}
}
System.out.println("Exit from program");
}
}