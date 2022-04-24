import java.io.*;
class Writebytes
{
public static void main(String[] args)
{
byte cities []={'k','u','n','d','a','n', '\n',  'A','n','i','s','h','\n','A','b','h','i','\n'};
FileOutputStream fs=null;
try
{
fs=new FileOutputStream("city.txt");
fs.write(cities);
fs.close();
}
catch(IOException e)
{
System.out.println(e);
System.exit(-1);
}
}
}
