//Implementing using Cursors
import java.util.*;
public class Cur
{
public static void main(String args[])
{
LinkedList<Integer> l1=new LinkedList<>();
l1.add(45);
l1.add(20);
l1.add(100);
System.out.println(l1);
System.out.println("reverse using for loop");
for(int i=l1.size()-1;i>=0;i--)
System.out.println(l1.get(i));
System.out.println("for each");
for(Integer ele:l1)
{
System.out.println(ele);
}
Iterator itr=l1.iterator();
System.out.println("Iterator");
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}
