import java.lang.*;
import java.io.*;
import java.util.*;
public class strcomp
{
	public static void main(String args[])
	{
		String s1=new String("ABC");
		String s2="ABC";
		String s3="ABC";
		String s4=new String("abc");
		System.out.println(s1.toString()==s2.toString());
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s4);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
	}
}