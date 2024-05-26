class rotatenumber
{
public static int m1(int arr[])
{
int low=0;
int high=n-1;
int n=arr.length;

while(low<=high)
{
int mid=(low+high)/2;
if(arr[low]<=arr[high])
{
index=low;
ans=arr[low];
}
break;
}
if(arr[low]<=arr[mid])
{
index=low;
ans=arr[low];
}
low=mid+1;
}
else
{
if(arr[mid]<ans)
{
index=mid;
ans=arr[mid];
}
high=mid-1;
}}
return index;
}
public static void main(String[]args)
{
int arr[]={4,5,6,7,0,1,2,3};
int ans=m1(arr);
System.out.print(ans);
}
}