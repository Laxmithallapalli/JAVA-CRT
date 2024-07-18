import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class TestRemove
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Integer n=s.nextInt();
Integer a[]=new Integer[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int pos=s.nextInt();
//int value=s.nextInt();
ArrayList<Integer>a1=new ArrayList<>
(Arrays.asList(a));
a1.remove(pos);
for(Integer r:a1)
{
System.out.print(r+" ");
}
}
}
