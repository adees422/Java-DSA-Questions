class alppattern3
{
public static void m1(int n)
{
for(int i=1;i<=n;i++)
{
for(char ch='A';ch<='A'+n-i-1;j++)
{
System.out.print(ch + " ");
}
System.out.println();
}

public static void main(String[]args)
{
int n=5;
m1(n);
}
}
