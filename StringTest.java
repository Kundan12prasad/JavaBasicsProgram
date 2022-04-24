public class StringTest
{
public static void main(String args[])
{
String s1="Test";
String s2="CLASS";
int a=123;
char br[]=new char[5];
char ch=s1.charAt(2);
int flag1=s1.compareTo(s2);
boolean flag2=s1.equals(s2);
boolean flag3=s1.equalsIgnoreCase(s2);
//char index=s1.indexOf('e');
int len1=s1.length();
int len2=s2.length();
String s3=s2.toLowerCase();
String s4=s1.toUpperCase();
String s5=Integer.toString(a);
String s6=s1.substring(0,2);
String s7=s2.trim();
String s8=s1.valueOf("T");
char cr[]=s2.toCharArray();
System.out.println("The Character at 3rd position is:" +ch);
System.out.println("Compare between string 1 and string 2 is" +flag1);
System.out.println("Equal between string1 and string2 is" +flag2);
System.out.println("Comparison between string1 and string2 ignoring case is" +flag3);
//System.out.println("Value of index of 'e':" +index);
System.out.println("length of string 1 is" +len1);
System.out.println("length of string 2 is" +len2);
System.out.println("Converting string2 to lowercase" +s3);
System.out.println("Converting string1 to uppercase" +s4);
System.out.println("Converting Integer to string" +s5);
System.out.println("Substring of 1st string is" +s6);
System.out.println("trim" +s7);
//System.out.println("Valueof" +s8);

for(int i=0;i<s2.length();i++)
System.out.println("Character array is" +cr[i]);
}
}





