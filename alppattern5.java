class alppattern5
{
public static void m1(int n)
{
for(int i=0; i<n;i++)
{
 //spaces printing

for(int j=1;j<=n-i;j++)
{
System.out.print(" ");
}

//characters printing
char ch ='A';
int breakpoint =(2*i+1)/2;
for( int j=1;j<=2*i+1;j++)
{
System.out.print(ch);
if(j<=breakpoint)ch++;
else ch--;}
for(int j=1;j<=n;j++)
{
System.out.print(" " );
}
System.out.println();
}
}
public static void main(String[]args)
{
int n=7;
m1(n);
}

}