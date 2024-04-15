import java.util.*;
class secsmallest
{
static private int secsmallest(int arr[],int n)
{
if(n<2)
{
return -1;
}
int small=Integer.MAX_VALUE;
int secsmall=Integer.MAX_VALUE;
int i;
for(i=0;i<arr.length;i++)
{
if(arr[i]<small)
{
secsmall=small;
small=arr[i];
}
else if(arr[i]<secsmall && arr[i]!=small)
{
secsmall=arr[i];}
}
return secsmall;
}
public static void main(String[]args)
{
int arr[]={2,49,432,42,24};
int n=5;
int Ss=secsmallest(arr,5);
System.out.println(Ss);
}
}