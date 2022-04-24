import java.io.*;
import java.io.DataInputStream;
import java.lang.*;
import java.util.Scanner;
class scan1
{
	static double pi=3.14;
	void cir(double rad)
	{
		
		double cirarea=(pi*rad*rad);
		System.out.println("Area of circle is:" +cirarea);
	}
	void rect(int len, int bre)
	{
		int rectarea=(len*bre);
		System.out.println("Area of rectangle is:" +rectarea);
	}
	int square(int side)
	{
		int sqarea=(side*side);
		System.out.println("Area of Square is:" +sqarea);
		return sqarea;
	}
}
class ABC
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of radius");
		double r=sc.nextDouble();
		scan1 s1=new scan1();
		s1.cir(r);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the value of length");
		int l=sc1.nextInt();	
	
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter the value of breadth");
		int b=sc2.nextInt();
		scan1 s2=new scan1();
		s2.rect(l,b);
		
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter the value of side:");
		int side=sc3.nextInt();
		scan1 s3=new scan1();
		s3.square(side);		
		
		
	}
}
		
		
		
		
	
		
		