class pascalrt
{
public static void main(String[]args)
{
int i,j,space,rows=10;
for( i=1;i<=rows;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("* ");
}
System.out.println();
}
for(i=rows-1;i>=0;i--)
{
for(j=1;j<=i;j++)
{
System.out.print("* ");
}
System.out.println();
}
}
}