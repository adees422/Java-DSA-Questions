//finding first and last occurence
class firstnlast
{
public static int m1(int arr[],int n,int x)
{
int low=0;
int high=n-1;
while(low<=high)
{
int ans=-1;
int mid=(low+high)/2;
if(arr[mid]>=x)
{
ans=mid;
high=mid-1;
}
else
{
low=mid+1;
}
}
return ans;
}
//finding first and last occurence

public static int m2(int arr[],int n,int x)
{
int low=0;
int high=n-1;
while(low<=high)
{
int ans=-1;
int mid=(low+high)/2;
if(arr[mid]>x)
{
ans=mid;
high=mid-1;
}
else
{
low=mid+1;
}
}
return ans;
}
public static int m3(int arr[],int n,int x)
{
if(m1==n  || m1!=x) return 0;
return m1(arr,n,x),m2(arr,n,x);
}
public static void main(String[]args)
{
int  arr[]={3,4,13,13,13,20,40};
int n=arr.length;
int x=13;
int ans=m3(arr,n,x);
System.out.print(ans);
}
}

