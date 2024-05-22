class countrotation
{
public static int m1(int arr[])
{
int n=arr.length;
int ans=Integer.MAX_VALUE;
int index=-1;
for(int i=0;i<n;i++)
{
if(arr[i]<ans){
ans=arr[i];
index=i;
}}
return index;
}
public static void main(String[]args)

{
int arr[]={5,6,7,0,1,2,3,4};
int ans=m1(arr);
System.out.print(ans);
}
}