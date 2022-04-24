import java.io.*;
import java.io.DataInputStream;
public class Circleinputarea
{
public static void cirarea(double r)
{
double area=3.14*r*r ;
System.out.println("Area of circle is" +area);
}

public static void main(String args[]) throws Exception
{
DataInputStream s1=new DataInputStream(System.in);
System.out.println("Enter the radius of circle:");
double rad=Double.parseDouble(s1.readLine());
Circleinputarea.cirarea(rad);
}
}


