import java.util.*;
class MaxSubArrSum
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i;j<n;j++)
{
int sum=0;
for(int k=i;k<=j;k++)
{
sum=sum+a[k];
}
System.out.println(sum);
System.out.println();
}
}
}
}
