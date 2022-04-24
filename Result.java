class Student
{
int rollnumber;
void getnumber(int n)
{
rollnumber=n;
}
void putnumber()
{
System.out.println("Rollnumber is" +rollnumber);
}
}
class Test extends Student
{
float part1,part2;
void getmarks(float m1, float m2);
{
part1=m1;
part2=m2;
}
void putmarks()
{
System.out.println("Marks Obtained:");
System.out.println("Part1 is:" +part1);
System.out.println("Part2 is" +part2);
}
}

interface Sports
{
float sportwt=22.06F;
void putwt();
}

class Result extends Test implements Sports
{
float total;
public void putwt()
{
System.out.println("Sportswt is=" +sportwt);
}
void display()
{
total=(part1+ part2 + sportwt);
putnumber();
putmarks();
putwt();
System.out.println("Total score is= " + total);
}
}

class Hybrid
{
public static void main(String args[])
{
Result rt=new Result();
rt.getnumber(1234);
rt.getmarks(27.57F,34.08F);
rt.display();
}
}





