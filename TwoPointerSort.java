import java.util.*;
class TwoPointerSort
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
int t=s.nextInt();
int low=0,high=a.length-1;
while(low<high)
{
if(a[low]+a[high]==t)
{
System.out.println(low+" "+high);
return;
}
else if(a[low]+a[high]>t)
high--;
else
low++;
}
System.out.println("-1");
}
}
