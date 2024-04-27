class sortzero12
{
public static int m1(int arr[],int n)
{
int c0=0;
int c1=1;
int c2=2;
for(int i=0;i<n;i++)
{
if(arr[i]==0) 
{
c0++;
return c0;
}
if(arr[i]==1)
{
c1++;
return c1;
}
else {c2++;
return c2;
}
}
return -1;
}
public static void main(String[]args)
{
int arr[] ={1,2,0,0,1,2};
int n=arr.length;
int ans =m1(arr,n);
System.out.print(ans);
}
}