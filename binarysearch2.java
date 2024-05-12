import java.util.*;
class binarysearch2
{
public static int m1(int arr[])
{
int low=0;
int high=arr.length;
int ans=Integer.MIN_VALUE;
while(low<=high)
{
int mid=(low+high)/2;
if(arr[low]<=arr[high])
{
ans =Math.min(ans,arr[low]);
break;
}
if(arr[low]<=arr[mid])
{
ans=Math.min(ans,arr[low]);
low=mid+1;
}
else
{
ans = Math.min(ans,arr[mid]);
high=mid-1;
}
}
return ans;
}
public static void main(String[]args)
{
int arr[]={4,5,6,7,0,1,2,3};
int ans=m1(arr);
System.out.print("The minimum ele is :" + ans);
}
}

