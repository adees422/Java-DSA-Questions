class ultatri
{
public static void main(String[]args)
{
int i,j,space,rows=8;
for(i=1;i<=rows;i++)
{
for(space=1;space<=i;space++)
{
System.out.print(" ");
}
for(j=8;j>=i;j--)
{
System.out.print("* ");

}
System.out.println();
}
}
}