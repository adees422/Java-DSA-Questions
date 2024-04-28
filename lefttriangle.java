//left triangle
class lefttriangle
{
public static void main(String[]args)
{
int n=5;
for(int i=0;i<5;i++)
{
for(int space=2*(n-i);space>=0;space--)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
System.out.print("* ");
}
System.out.println();
}
}}