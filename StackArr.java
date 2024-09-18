import java.util.Scanner;
class MyStack
{
int a[];
int size;
int top;

MyStack(int n)
{
top=-1;
size=n;
a=new int[n];
}
void push(int x)
{
if(top==size-1)
{
System.out.println("Stack is overflow");
return;
}
top++;
a[top]=x;
}
void pop()
{
if(top==-1)
{
System.out.println("Stack is underflow");
return;
}
System.out.println(a[top]+"is deleted");
top--;
}
void display()
{
if(top==-1)
{
System.out.println("Stack is empty");
return;
}
for(int i=top;i>=0;i--)
{
System.out.print(a[i]+" ");
}
}
}
class StackArr
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter size of stack");
int n=s.nextInt();
MyStack s1=new MyStack(n);
for(;;)
{
System.out.println();
System.out.println("1.PUSH\n2.POP\n3.PRINT\n4.EXIT");
System.out.println("Enter yoyr choice");
int ch=s.nextInt();
if(ch==1)
{
System.out.println("Enter an element");
int x=s.nextInt();
s1.push(x);
}
else if(ch==2)
s1.pop();
else if(ch==3)
s1.display();
else if(ch==4) 
break;
else
System.out.println("Invalid choice");
}
}
}














