import java.util.*;
class seclargest
{
static  int findseclargest(int arr[],int n){
if(n<2)
{
return -1;
}
int largest=Integer.MAX_VALUE;
int secondlargest=Integer.MAX_VALUE;
int i;
for(i=0;i<n;i++)
{
if(arr[i]>largest)
{
secondlargest=largest;
largest=arr[i];
}
else if(arr[i]>secondlargest && arr[i]!=largest)
{
secondlargest=arr[i];
}
}
return secondlargest;
}
public static void main(String[]args)
{
int arr[]={1,2,3,4,56};
int n=arr.length;

int SL= findseclargest(arr,n);
System.out.println(SL);
}
}
