public class Palindromeprog
{
public static void main(String args[])
{
int num=121;
int rem;
int rev=0;
while(num!=0)
{
rem=(num%10);
rev=((rev*10)+rem);
num=(num/10);
}
if (num==rev)
{
System.out.println("Number is palindrome");
}
else
{
System.out.println("Number is not palindrome");
}
}
}
