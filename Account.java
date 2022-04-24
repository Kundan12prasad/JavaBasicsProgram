public class Account
{
int accno;
int age;
public Account(int acno, int ag)
{
accno=acno;
age=ag;

//this.accno=accno;
//this.age=age;
}
public static void main(String[] args)
{
Account a1=new Account(124,30);
Account a2=new Account(130,45);
System.out.println("Customer1:AccountNo=" +a1.accno+ "   Age=" +a1.age);
System.out.println("Customer1:AccountNo=" +a2.accno+ "   Age=" +a2.age);
}
}