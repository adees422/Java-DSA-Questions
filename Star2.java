class Star2
{
public static void main(String[]args)
{
for(int i=5;i>=1;i--)
{
for(int space=1;space<=(5-i);space++)
{
System.out.print(" ");
}
for(int j=1;j<=(5-i);j++)
{
System.out.print("* ");
}
System.out.println();
}
}
}