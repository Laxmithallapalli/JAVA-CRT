//Demo Prgm for ARRAYLIST:
import java.util.*;
class ALDemo
{
    public static void main(String args[])
    {
        ArrayList a=new ArrayList();
        a.add("A");
        a.add(10);
        a.add("A");
        a.add(null);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.add(2,"m");
        a.add("n");
        System.out.println(a);
    }
}

/*
o/p:
[A, 10, A, null]
[A, 10, null]
[A, 10, m, null, n]
*/

