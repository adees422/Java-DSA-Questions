//lower bound
import java.util.*;
class lowerbound
{
public static int m1(int arr[],int n,int x)
{
int ans=n;

int low=0;
int high=n-1;
while(low<=high)
{
int mid=(low+high)/2;
if(arr[mid]>=x)
{
ans=mid;
high=mid-1;
}
else
{
low=mid+1;
ans=mid;
}
}
return ans;
}
public static void main(String[]args)
{
//int n=arr.length;
int[]arr={3,4,6,7};
int n=4;
int x=4;
int ans=m1(arr,n,x);
System.out.print(ans);
}
}
