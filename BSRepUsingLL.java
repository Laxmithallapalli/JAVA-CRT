import java.util.*;
class RepBSLL
{
    public static void main(String args[])
    {
        int x;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter root node");
        x=s.nextInt();
        Node root=new Node(x);
        while(true)
        {
            System.out.println();
            System.out.println("1.Insert\n2.Print\n3.Exit");
            System.out.println("Enter your choice");
            int ch=s.nextInt();
            if(ch==1)
            {
                System.out.println("Enter element");
                x=s.nextInt();
                root.insert(root,x);
            }
            else if(ch==2)
                root.printTree(root);
            else if(ch==3)
                break;
            else
                System.out.println("Invalid choice");
        }
    }
}
class Node
{
int data;
Node left,right;
Node(int x)
{
    data=x;
    left=null;
    right=null;
}
void insert(Node root,int x)
{
    Queue<Node>que=new LinkedList<>();
    que.add(root);
    while(!que.isEmpty())
    {
        Node temp=que.poll();
        if(temp.left==null)
        {
            temp.left=new Node(x);
            break;
        }
        else
        que.add(temp.left);
        if(temp.right==null)
         {
             temp.right=new Node(x);
             break;
         }
         else
         que.add(temp.right);
    }
}
void printTree(Node root)
{
    if(root!=null)
    {
        printTree(root.left);
        System.out.print(root.data+" ");
        printTree(root.right);
    }
}
}
/* 
OUTPUT:
Enter root node
5

1.Insert
2.Print
3.Exit
Enter your choice
1
Enter element
3

1.Insert
2.Print
3.Exit
Enter your choice
1
Enter element
8

1.Insert
2.Print
3.Exit
Enter your choice
2
3 5 8 
1.Insert
2.Print
3.Exit
Enter your choice
1
Enter element
11

1.Insert
2.Print
3.Exit
Enter your choice
1
Enter element
55

1.Insert
2.Print
3.Exit
Enter your choice
2
11 3 55 5 8 
1.Insert
2.Print
3.Exit
Enter your choice
1
Enter element
99

1.Insert
2.Print
3.Exit
Enter your choice
1
Enter element
44

1.Insert
2.Print
3.Exit
Enter your choice
2
11 3 55 5 99 8 44 
1.Insert
2.Print
3.Exit
Enter your choice
*/
