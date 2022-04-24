import java.io.*;
class employee
{
String name;
static int c=0;
employee()
{
c++;
}
void getcount()
{
System.out.println("No of employee is:" +c);
}
void getname() throws IOException
{
InputStreamReader br= new InputStreamReader(System.in);
BufferedReader y=new BufferedReader(br);
System.out.println("Enter the name of Employee:");
name=y.readLine();
}
public static void main(String args[]) throws IOException

{
employee ob1=new employee();
ob1.getname();
ob1.getcount();
employee ob2=new employee();
ob2.getname();
ob2.getcount();
employee ob3=new employee();
ob3.getname();
ob3.getcount();

}


}


