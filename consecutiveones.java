class consecutiveones
{
public static int m1(int arr[],int n)
{
int count=0;
int max=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==1)
{
count++;
}
else
{
count=0;
}}
max=Math.max(max,count);
return  max;
}
public static void main(String[]args)
{
int arr[]={1,1,0,1,1,1};
int n=6;
int ans = m1(arr,n);
System.out.print(ans+ " ");
}
}