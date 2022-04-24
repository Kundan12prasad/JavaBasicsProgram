public class Buffer
{
public static void main(String args[])
{
StringBuffer ob=new StringBuffer("Democracy");
System.out.println(ob);
StringBuffer st=new StringBuffer("India");
StringBuffer st1=ob.append(st);
System.out.println(st1);
int cap=ob.capacity();
System.out.println("capacity of string is:" + cap);
System.out.println("Ensure Capacity of String is:");
ob.ensureCapacity(60);
int cap1=ob.capacity();
System.out.println("Capacity is:" +cap1);
char ch=ob.charAt(2);
System.out.println("Character at 2 is" +  ch);
StringBuffer st2=ob.delete(4,6);
System.out.println("String after the delete operation is:"+ st2);
StringBuffer st3=ob.deleteCharAt(1);
System.out.println("Deleting @char1 :" + st3);
int index=ob.indexOf("D",0);
StringBuffer st4=ob.insert(11,1947);
System.out.println("Inserting 1974 :" + st4);
int len=ob.length();
System.out.println(len);
ob.setCharAt(3,'x');
ob.setLength(5);
String st5=ob.substring(1,4);
System.out.println(st5);
String st6=ob.toString();
System.out.println(st6);
}
}










