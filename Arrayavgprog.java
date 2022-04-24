public class Arrayavgprog
{
public static void main(String args[])
{
int marks[]={10,15,16,23,30};

float avg=0;
int sum=0;
for(int i=0;i<=4;i++)
{
sum=sum+marks[i];
}
avg=(sum/5);
System.out.println("Average of marks is" + avg);
}

}

