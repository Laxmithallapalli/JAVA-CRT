class A extends Thread
{
}
class C extends Thread
{
}
class TestM
{
public static void main(String args[])
{
A a1=new A();
B b1=new B();
C c1=new C();
a1.start();
b1.start();
c1.start();
System.out.println(Thread.currentThread().getName());
System.out.println(a1.getName());
System.out.println(b1.getName());
System.out.println(c1.getName());
b1.setName("satish");
System.out.println(b1.getName());
}
}