import java.util.Scanner;
class StackLL
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
MyStack s1=new MyStack();
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
class Node
{
int data;
Node next;
Node(int x)
{
data=x;
next=null;
}
}
class MyStack
{
Node head;
MyStack()
{
head=null;
}
void push(int x)
{
Node n=new Node(x);
if(n==null)
{
System.out.println("Stack is overflow");
return;
}
if(head==null)
head=n;
else
{
n.next=head;
head=n;
}
}
void pop()
{
if(head==null)
{
System.out.println("Stack is underflow");
return;
}
System.out.println(head.data+"is deleted");
head=head.next;
}
void display()
{
if(head==null)
{
System.out.println("Stack is empty");
return;
}
Node temp;
for(temp=head;temp!=null;temp=temp.next)
{
System.out.print(temp.data+" ");
}
}
}





