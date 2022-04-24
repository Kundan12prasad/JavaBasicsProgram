import java.io.DataInputStream;
public class Datamarksinput
{
public static void main(String args[]) throws Exception
{
int marks1,marks2,marks3;
byte roll;
float avg=0;
DataInputStream s=new DataInputStream(System.in);
System.out.println("Please enter marks1");
marks1=Integer.parseInt(s.readLine());
System.out.println("Please enter marks2");
marks2=Integer.parseInt(s.readLine());
System.out.println("Please enter marks3");
marks3=Integer.parseInt(s.readLine());
avg=((marks1+marks2+marks3)/3);
System.out.println("Average of marks is" +avg);
}
}



