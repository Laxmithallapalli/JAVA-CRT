//Tree traversal method for Binary Tree
import java.util.*;
class TraversalBST
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
            System.out.println("1.Insert\n2.pre-order\n3.in-order\n4.post-order\n5.Exit");
            System.out.println("Enter your choice");
            int ch=s.nextInt();
            if(ch==1)
            {
                System.out.println("Enter element");
                x=s.nextInt();
                root.insert(root,x);
            }
            else if(ch==2)
                root.preOrder(root);
            else if(ch==3)
               root.inOrder(root);
            else if(ch==4)
            root.postOrder(root);
            else if(ch==5)
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
void preOrder(Node root)
{
    if(root!=null)
    {
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
void inOrder(Node root)
{
    if(root!=null)
    {
        
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
}
void postOrder(Node root)
{
    if(root!=null)
    {
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}
}

/*
OUTOUT:
Enter root node
0

1.Insert
2.pre-order
3.in-order
4.post-order
5.Exit
Enter your choice
1
Enter element
1

1.Insert
2.pre-order
3.in-order
4.post-order
5.Exit
Enter your choice
1
Enter element
2

1.Insert
2.pre-order
3.in-order
4.post-order
5.Exit
Enter your choice
2
0 1 2 
1.Insert
2.pre-order
3.in-order
4.post-order
5.Exit
Enter your choice
3
1 0 2 
1.Insert
2.pre-order
3.in-order
4.pot-order
5.Exit
Enter your choice
4
1 2 0 
1.Insert
2.pre-order
3.in-order
4.post-order
5.Exit
Enter your choice
*/
