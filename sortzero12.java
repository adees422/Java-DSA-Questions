import java.util.*;
class sortzero12
{
public static void m1(ArrayList<Integer>arr,int n)
{
int low =0;
int mid=0;
int high=n-1;
while(mid<=high)
{
if(arr.get(mid)==0)
{
int temp =arr.get(low);
arr.set(low,arr.get(mid));
arr.set(mid,temp);
low++;
mid++;
}
if(arr.get(mid)==1)
{
mid++;
}
else
{
int temp = arr.get(mid);
arr.set(mid,arr.get(high));
arr.set(high,temp);
high--;
}
}
}
public static void main(String[]args)
{
ArrayList<Integer>arr=new ArrayList<>(Array.asList(new Integer[]{0,2,2,0,1}));
m1(arr,n);
for(int i=0;i<n;i++)
{
System.out.print(arr.get(i));
}
System.out.println();
}
}