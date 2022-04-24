public class Matrix
{
public static void main(String args[])
{
int ar[][]={{1,6},{2,5},{3,7}};
int br[][]={{1,3},{2,5},{3,9}};
int cr[][]=new int[3][2];
for(int i=0;i<3;i++)
{
for(int j=0;j<2;j++)
{
cr[i][j]=ar[i][j]+br[i][j];
}
}
for(int i=0;i<3;i++)
{
for(int j=0;j<2;j++)
{
System.out.println(cr[i][j]);
System.out.println(" ");
}
System.out.println();
}
}
}