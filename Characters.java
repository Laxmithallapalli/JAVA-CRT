import java.util.*;
class Characters
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char ch=s.next().charAt(0);
if(Character.isLetterOrDigit(ch))
{
System.out.println("Alpaha-Numeric");
if(Character.isLetter(ch))
{
System.out.println("Alpahabet");
if(Character.isUpperCase(ch))
{
System.out.println("Upper Case");
}
else
{
System.out.println("Lower Case");
}
}
else
{
System.out.println("Digit");
}
}
else
{
System.out.println("Special Symbol");
}
}
}
