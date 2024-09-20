import java.util.*;
class RCount
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
            System.out.println("1.Insert\n2.Print\n3.count\n4.Exit");
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
                System.out.println("Number of nodes: " + root.countNodes(root));
            else if(ch==4)
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
int countNodes(Node root) {
        if (root == null)
            return 0;
        else
            return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
