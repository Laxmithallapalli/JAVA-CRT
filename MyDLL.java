import java.util.*;
class MyDLL
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
DoubleList d1=new DoubleList();
for(;;)
{
System.out.println();
System.out.println("1.create\n2.Print\n3.InsertFirst\n4.Insert Position\n5.Delete First\n6.Delete Last\n7.Delete Position\n8.Exit");
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
{
System.out.println("Enter an element");
int x=s.nextInt();
d1.insertFirst(x);
}
else if(ch==4)
{
int x,pos;
System.out.println("Enter an element");
 x=s.nextInt();
 pos=s.nextInt();
d1.insertPosition(x,pos);
}
else if(ch==5)
{
d1.deleteFirst();
}
else if(ch==6)
d1.deleteLast();
else if(ch==7)
{
int pos;
System.out.println("Enter position");
pos=s.nextInt();
d1.deletePosition(pos);
}
else if(ch==8)
break;
else 
System.out.println("Wrong choice");
}
}
}
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
{
head=tail=n;
}
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

void insertFirst(int x)
{
Node n=new Node(x);
if(head==null)
{
head=tail=n;
}
else
{
head.prev=n;
n.next=head;
head=n;
}
}

void insertPosition(int x,int pos)
{
Node n=new Node(x);
if(head==null)
{
head=tail=n;
}
else
{
Node temp=head;
int count =1;
while(count<pos && temp.next!=null)
{
count=count+1;
temp=temp.next;
}
if(temp.next==null)
{
temp.next=n;
n.prev=temp;
tail=n;
}
else
{
n.next=temp;
n.prev=temp.prev;
temp.prev.next=n;
temp.prev=n;
}
}
}
void deleteFirst()
{
if(head==null)
{
System.out.println("List is empty");
return;
}
Node temp=head;
if(head.next==null)
{
head=tail=null;
}
else
{
temp=head;
head=head.next;
head.prev=null;
temp=null;
}
}
 
void deleteLast()
{
if(head==null)
{
System.out.println("List is empty");
return;
}
Node temp=head;
if(tail.prev==null)
{
head=tail=null;
}
else
{
temp=tail;
tail=tail.prev;
tail.next=null;
temp=null;
}
}

void deletePosition(int pos)
{
if(head==null)
{
System.out.println("List is empty");
return;
}
int count=1;
Node temp=head;
while(count<pos && temp.next!=null)
count=count+1;
temp=temp.next;
if(temp.next==null)
{
temp.prev.next=null;
tail=temp.prev;
temp=null;
}
else
{
temp.prev.next=temp.next;
temp.next.prev=temp.prev;
temp=null;
}
}
}


