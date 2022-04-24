public class Multi
{
public static void main(String args[])
{
int a[][]={{1,2},{3,4}};
int b[][]={{4,6},{6,5}};
int c[][]=new int[2][2];
int i,j,k;
for(i=0;i<2;i++)
{
for(k=0;k<2;k++)
{
for(j=0;j<2;j++)
{
c[i][k]=c[i][k]+(a[i][j]*b[j][k]);
if(j==1)
{
System.out.print(c[i][k]);
}
System.out.println();
}
}
}
}
}
