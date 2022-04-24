public class Oddnumsum
{
public static void main(String args[])
{
int i;
int sum=0;
float avg=0;
int c=0;
for(i=1;i<=5;i++)
{
if(i%2 !=0)
sum=sum+i;
c++;
}
System.out.println("Summation of odd numbers are:" +sum);
avg=(sum/c);
System.out.println("average of odd numbers are:" +avg);


}
}

