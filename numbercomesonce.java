class numbercomesonce
{
public static int  m1(int arr[])
{
int n =arr.length;
int xor =0;

for(int i=0;i<n;i++)
{
xor =xor ^ arr[i];
}
return xor;
}

public static void main(String[]args)
{
int arr[]={11,12,12,14,14};

int ans =m1(arr);
System.out.println(ans+ " ");
}
}