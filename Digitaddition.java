public class Digitaddition
{
public static void main(String args[])
{
int num=98;
int rem,quo,sum=0;
while(num!=0)
{
rem=(num%10);
sum=sum+rem;
num=(num/10);
}
System.out.println("Addition of digit is:" +sum);

}
}