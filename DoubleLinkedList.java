import java.util.*;
class Node
{
int data;
Node next,prev;
Node(int x)
{
data=x;
prev=null;
next=null;
}
}
class DoubleList
{
Node head,tail;
DoubleList()
{
head=tail=null;
}
void create(int x)
{
Node n=new Node(x);
if(head==null)
head=tail=n;
else
{
tail.next=n;
n.prev=tail;
tail=n;
}
}
void rshow()
{
if(head==null)
{
System.out.println("List is empty");
return;
}
Node temp=head;
while(temp!=null)
{
System.out.print(temp.data+" ");
temp=temp.next;
}
}
void lshow()
{
if(head==null)
{
System.out.println("List is empty");
return;
}
Node temp=tail;
while(temp!=null)
{
System.out.print(temp.data+" ");
temp=temp.prev;
}
}
}
class TestDLL
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
DoubleList d1=new DoubleList();
for(;;)
{
System.out.println();
System.out.println("1.create\n2.Print\n3.Exit");
System.out.println("Enter your choice");
int ch=s.nextInt();
if(ch==1)
{
System.out.println("Enter an element");
int x=s.nextInt();
d1.create(x);
}
else if(ch==2)
{
System.out.println("Which way to traverse\n1.Forward\n2.Backward");
int r=s.nextInt();
if(r==1)
d1.rshow();
else if(r==2)
d1.lshow();
else
System.out.println("Invalid choice");
}
else if(ch==3)
break;
else 
System.out.println("Wrong choice");
}
}
}
