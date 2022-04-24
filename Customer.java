import java.io.*;
class Customer
{
int custid;
String acctype;
double balance;


Customer(int id,String atype,double bal)
{
custid=id;
acctype=atype;
balance=bal;
}
void deposit(double amount)
{
balance=balance+amount;
System.out.println("Amount has been deposited in the customer account" +custid);
}
void withdrawl(double amount)
{
if((balance-amount)<100)
{
System.out.println("Amount has not withdrawl from the Customer account" +custid);
}
else
{
balance=balance-amount;
System.out.println("Amount has withdrawal from customer account" +custid);

}
}

void print()
{
System.out.println("Customerid" +custid);
System.out.println("Accounttype" +acctype);
System.out.println("Balance" +balance);
}

public static void main(String args[]) throws IOException
{
Customer obj[]=new Customer[3];
obj[0]=new Customer(10,"A",5000);
obj[1]=new Customer(11,"B",6000);
obj[2]=new Customer(12,"C",4000);
obj[3]=new Customer(13,"D",2000);

obj[0].print();
obj[1].print();
obj[2].print();
obj[3].print();
obj[0].deposit(500);
obj[0].print();
obj[0].withdrawl(3000);
obj[0].print();
}
}



