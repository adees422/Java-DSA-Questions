//copy constructor
class copycons
{
int id;
String name;
copycons(int i,String n)
{
id=i;
name=n;
}
copycons(copycons t)
{
id=t.id;
name=t.name;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String[]args)
{
copycons o=new copycons(202,"jaahil");
copycons p=new copycons(o);
o.display();
p.display();
} }