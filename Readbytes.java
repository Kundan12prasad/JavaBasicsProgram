import java.io.*;
class Readbytes
{
public static void main(String args[])
{
FileInputStream fs=null;
int b;
try
{
fs=new FileInputStream(args[0]);
while((b=fs.read())!=-1)
{
System.out.println((char) b);

}
fs.close();
}
catch(IOException e)
{
System.out.println(e);

}
}
}