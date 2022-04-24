public class Stringorder
{
//static 
public static void main(String args[])
{
String name[]={"Kundan","Anish","Mukesh","Mohit"};

int len=name.length;
String temp=null;
for(int i=0;i<len;i++)
{
for(int j=i+1;j<len;j++)
{
if(name[j].compareTo(name[i])<0)
{
temp=name[i];
name[i]=name[j];
name[j]=temp;
 }
 }
}
for(int i=0;i<len;i++)
{
System.out.println(name[i]);
}
}
}
