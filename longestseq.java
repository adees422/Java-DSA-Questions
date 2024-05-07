import java.util.*;
class longestseq
{
public static int m1(int arr[])
{
int n =arr.length;
Arrays.sort(arr);

int lastsmaller=Integer.MIN_VALUE;
int longest=1;
int cnt=0;
for(int i=0;i<n;i++)
{
if(arr[i]-1==lastsmaller)
{
cnt+=1;
lastsmaller=arr[i];
}
else if(arr[i]!=lastsmaller)
{
cnt=1;
lastsmaller=arr[i];
}
longest=Math.max(longest,cnt);
}
return longest;
}
public static void main(String[]args)
{
int arr[]={100,200,1,2,3,4};
int ans =m1(arr);
System.out.print(ans);
}
}