//set matrix zeroes
import java.util.*;
class setmatzero
{
static void m1(ArrayList<ArrayList<Integer>>matrix,int n,int m,int i)
{
for(int j=0;j<m;j++)
{
if(matrix.get(i).get(j)!=0)
{
matirx.get(i).set(j,-1);
}}
}
static void m2(ArrayList<ArrayList<Integer>>matrix ,int n,int m)
{
for(int i=0;i<n;i++)
{
if(matrix.get(i).get(j)==0)
{
matrix.get(i).set(j,-1);
}
}
}
static zeromatrix(ArrayList<ArrayList<Integer>>matrix,int n,int m)
{
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
if(matrix.get(i).get(j)==0)
{
m1(matrix,n,m);
m2(matrix,n,m);
}
}
}
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{

if(matrix.get(i).get(j)==-1)
{
matrix.get(i).set(j,0);

}}}
return matrix;
}
public static void main(String[]args)
{
ArrayList<ArrayList<Integer>>matrix=new ArrayList<>();
matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
int n=matrix.size();
int m=matrix.get(0).size();
ArrayList<ArrayList<Integer>>ans=zeromatrix(matrix,n,m);
for(ArrayList<Integer>row:ans)
{
for(Integer ele:row)
{
System.out.print(ele);
}
System.out.println();
}}}