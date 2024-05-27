class consstudent
{
int id;
String name;
consstudent(int i,String s)
{
id=i;
name=s;
}
consstudent(consstudent s1)
{
id=s1.id;
name=s1.name;
}
void display()
{

System.out.println(id+" "+name);
}
public static void main(String[]args)
{
consstudent st=new consstudent(1,"ram");
consstudent st2=new consstudent(st);
st.display();
st2.display();
}
}
