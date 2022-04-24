import java.lang.*;
import java.util.*;
import java.io.*;
public class stropr
{
	public static void main(String[] args)
	{
		//String s1="abc" + "xyz";
		//System.out.println(s1);
		//String s2="abc";
		//String s3="xyz";
		//String s4=s2.concat(s3);
		//System.out.println("Concatenated String is:" +s4);
		//String s5=2+5+ "abc" +2+4;
		//System.out.println(s5);
		//String s6=2+4+7+8+ "";
		//System.out.println(s6);
		String s7="ABC";
		String s8="XYZ";
	
		System.out.println(s8.compareTo(s7));
		String s9="Welcome";
		String s10=s9.substring(2);
		System.out.println("Extracted String is:"  +s10);
		String s11=s9.substring(2,6);
		System.out.println(s11);
		System.out.println(s9.charAt(5));
		System.out.println(s9.indexOf('e'));
		System.out.println(s9.lastIndexOf('e'));
		System.out.println(s9.length());
		String s20=" Hello World  ";
		System.out.println("Printed string is:" +s20);
		System.out.println(s20.length());
		System.out.println(s20.trim());
		String s21=s20.trim();
		System.out.println(s20.length());
		
		//System.out.println(s21.length());
		
		
		
		
		
		
		
		
		
		
	}
}