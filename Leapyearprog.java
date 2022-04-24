public class Leapyearprog
{
public static void main(String args[])
{
int leap_year=2016;
if(leap_year % 4==0 && leap_year %100 !=0 || leap_year % 400 ==0)
{
System.out.println("Leap Year");

}

else
{
System.out.println("No Leap Year");

}
}
}