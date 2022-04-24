public class Arraydivisionprog
{
public static void main(String args[])
{
int rollno[] = {111,112,113,114}; 
int marks[]= {46,52,62,82};  
for(int i=0;i<=3;i++)
{
if(marks[i]>79)
{
System.out.println("Honourable marks" + rollno[i]);
}
else if(marks[i]>59)
{
System.out.println("First Division" + rollno[i]);
}
else if(marks[i]>49)
{
System.out.println("Second Division" + rollno[i]);
}
else
{
System.out.println("Fail"  + rollno[i]);
}
}
}

}