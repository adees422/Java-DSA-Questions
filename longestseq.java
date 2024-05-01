import java.util.*;
class longestseq
{
public static boolean m1(int arr[],int num)
{
int n =arr.length;
for(int i=0;i<n;i++)
{
if(arr[i]==num)
return true;
}
return false;
}
public static int m2(int arr[])
{
int n=arr.length;
int longest=1;
for(int i=0;i<n;i++)
{
int x=arr[i];
int cnt=1;
while(m1(arr,x+1)==true)
{
x+=1;
cnt+=1;
}
longest =Math.max(longest,cnt);
}
return longest;
}
public static void main (String[]args)
{
int arr[]={200,100,1,2,3,4,5};
int ans= m2(arr);
System.out.print(ans);

}}