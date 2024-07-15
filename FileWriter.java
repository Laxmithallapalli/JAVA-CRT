import java.io.*;
class TestFile
{
public static void main(String args[])throws IOException
{
FileWriter fw=new FileWriter("abc.txt");
fw.write("W");
fw.close();
}
}
