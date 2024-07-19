import java.util.*;
class A extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("From thread A:"+i);
}
System.out.println("Exit from A");
}
}
class B extends Thread
{
public void run()
{
for(int j=1;j<=5;j++)
{
System.out.println("From thread B:"+j);
}
System.out.println("Exit from B");
}
}
class C extends Thread
{
public void run()
{
for(int k=1;k<=5;k++)
{
System.out.println("From thread C:"+k);
}
System.out.println("Exit from C");
}
}
class Multithread
{
public static void main(String args[])
{
A a1=new A();
B b1=new B();
C c1=new C();
a1.start();
b1.start();
c1.start();
}
}
