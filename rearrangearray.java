import java.util.*;
class rearrangearray
{
    public static int[]m1(int arr[],int n)
    {
        ArrayList<Integer>pos = new ArrayList<>();
        ArrayList<Integer>neg =new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0) pos.add(arr[i]);
            else neg.add(arr[i]);
        }
        for(int i=0;i<n/2;i++)
    {
        arr[2*i]=pos.get(i);
        arr[2*i+1]=neg.get(i);
    }
    return arr;
        
    }
    public static void main(String[]args)
    {
        int arr[]={1,2,-4,-5};
        int n=arr.length;
        int[]ans =m1(arr,n);
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]);
    }
    }
}