abstract class Parent
{
void m1()
{
System.out.println("m1 method in parent");
}
public abstract void m2();
}

class Child extends Parent
{
void m3()
{
System.out.println("m3 method in child");
}
public void m2()
{
System.out.println("m2 abstarct method in Child");
}
}
class Abstract1
{
public static void main(String args[])
{
Child c1=new Child();
c1.m1();
c1.m2();
c1.m3();
}
}
