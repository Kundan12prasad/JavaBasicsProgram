import java.util.Scanner;
import java.io.DataInputStream;
 class Menudrivenprog
{
    public static void main(String[] args) throws Exception
    {
          
DataInputStream s1=new DataInputStream(System.in); 
      //  Scanner s=new Scanner(System.in);
        System.out.println("YOU HAVE FOLLOWING CHOICES : ");
        System.out.println("1. ADDITION");
        System.out.println("2. SUBTRACTION ");
        System.out.println("3. MULTIPLICATION ");
        System.out.println("4. DIVISION");
        System.out.println("ENTER YOUR CHOICE : ");


int i=Integer.parseInt(s1.readLine());

       // int i=s.nextInt();
           
        System.out.println("ENTER FIRST NUMBER ");
int a=Integer.parseInt(s1.readLine());
   
           
        System.out.println("ENTER SECOND NUMBER ");
int b=Integer.parseInt(s1.readLine());

       // int b=s.nextInt();
           
        double result=0;//'result' will store the result of operation
           
        switch(i)
        {
            case 1:
                result=a+b;
                break;
            case 2:
                result=a-b;
                break;
            case 3:
                result=a*b;
                break;
            case 4:
                if(b==0)//when denominator becomes zero
                {
                    System.out.println("DIVISION NOT POSSIBLE");
                    break;
                }
                else
                    result=a/b;
            
            default:
                System.out.println("YOU HAVE ENTERED A WRONG CHOICE");
            
        }
           
        System.out.println("RESULT = "+result);
    }
}
