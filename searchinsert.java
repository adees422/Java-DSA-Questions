class searchinsert
{
public static int m1(int arr[],int x)
{int ans=-1;
int n=arr.length;
int low=0;
int high=n-1;
while(low<=high)
{
int mid =(low+high)/2;
if(arr[mid]>=x)
{
ans =mid;
high=mid-1;
}
else{
low=mid+1;
}}
return  ans;
}
public static void main(String[]args)
{
int []arr={3,5,8,15,18};
int x=6;
int ans=m1(arr,x);
System.out.print(ans);
}
}