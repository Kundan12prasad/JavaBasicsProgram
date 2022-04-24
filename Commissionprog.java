public class Commissionprog
{
public static void main(String args[])
{
int sales_amount=200;
double comm;

if(sales_amount<100)
{
comm=0.0;
System.out.println("No Commission" + comm);
}

else if (sales_amount>=100 && sales_amount<1000)
{ 
comm=(0.10*sales_amount);
System.out.println("Commission is" + comm);
}

else 
{
comm=(0.20*sales_amount);
System.out.println("Commission is" + comm);

}


}

}