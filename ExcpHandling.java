import java.util.*;
class ExcpHandling
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
try
{
System.out.println(10/n);
}
catch(ArithmeticException e)
{
System.out.println(10/2);
}
}
}
