class movezerolast
{
public static int[] m1(int arr[])
{
int n=arr.length;
int j=-1;
for(int i=0;i<n;i++)
{
if(arr[i]==0)
{
j=i;
break;
}
}
for(int i=j+1;i<n;i++)
{
if(arr[i] !=0)
{
//swapping
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
j++;
}}
return arr;
}
public static void main(String[]args)
{

int arr[]={1,2,0,0,6,7};
int n=arr.length;
int[] ans=m1(arr);
for(int i=0;i<n;i++){
System.out.print(ans[i]+ " ");
}}
}

