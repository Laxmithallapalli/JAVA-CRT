//Access ArrayList Elements
import java.util.*;
class AccessArrE
{
    public static void main(String args[])
    {
        ArrayList<String>animals=new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");
        System.out.println("ArrayList:"+animals);
        String str=animals.get(1);
        System.out.print("Elements at index 1:"+str);
    }
}

/*
O/P:
ArrayList:[Cat, Dog, Cow]
Elements at index 1:Dog
  */
