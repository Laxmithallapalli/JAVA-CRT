
import java.util.*;
public class HM
{
public static void main(String args[])
{
HashMap h1=new HashMap();
h1.put(101,"sss");
h1.put(123,"kkk");
h1.put(105,"bbb");
System.out.println(h1);
h1.put(333,666);
h1.put("aaa","ddd");
h1.put("mths",88);
System.out.println(h1);
h1.put(106,"sss");
System.out.println(h1);
h1.put(101,"rrr");
System.out.println(h1);
}
}
Note: /tmp/hEGjcg9M5K/Test.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
java -cp /tmp/hEGjcg9M5K/Test
{101=sss, 105=bbb, 123=kkk}
{aaa=ddd, mths=88, 101=sss, 105=bbb, 123=kkk, 333=666}
{aaa=ddd, mths=88, 101=sss, 105=bbb, 106=sss, 123=kkk, 333=666}
{aaa=ddd, mths=88, 101=rrr, 105=bbb, 106=sss, 123=kkk, 333=666}
