class Student
{
int admno;
String name;
Student(int admno,String name)
{
this.admno=admno;
this.name=name;
}
public String toString()
{
return "Admission no="+admno+"Name="+name;
}
}
class String2
{
public static void main(String args[])
{
Student s1=new Student(11,"SSS");
System.out.println(s1);
Student s2=new Student(54,"AAA");
System.out.println(s2);
}
}
