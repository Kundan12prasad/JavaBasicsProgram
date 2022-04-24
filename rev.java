import java.util.Scanner;
import java.io.*;
public class rev
{
	public static void main(String[] args)
	{
		String s1="Welcome";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
			
		}
		System.out.println("Reverse : " +s2);
	}
}
		

