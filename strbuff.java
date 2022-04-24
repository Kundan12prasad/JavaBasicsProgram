import java.lang.*;
import java.util.*;
public class strbuff
{
	public static void main(String args[])
	{
		StringBuffer s1=new StringBuffer("    Welcome");
		s1.append(" To");
		s1.append(" my");
		s1.append(" Country");
		s1.append(" INDIA");
		String s2=s1.toString().trim();
		System.out.println("Resulted String is:" +s2);
		System.out.println(s1.reverse());
	}
}
		
		
		


