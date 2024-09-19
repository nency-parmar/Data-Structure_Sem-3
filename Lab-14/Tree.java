import java.util.Scanner;

class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
class BinaryTree
{
    int data;
    Node root;

    // Insert in Binary Search Tree...
    public Node InsertBST(int data)
    {
        if(root == null)
        {
            Node n = new Node(data);
            root = n;
            return root;
        }
        Node current = root;
        Node n = new Node(data);

        while(current != null)
        {
            if(current.data == n.data)
                {
                    break;
                }
            if(current.data > n.data)
            {
                if(current.left == null)
                {
                    current.left = n;
                    break;
                }
                else
                {
                    current = current.left;
                }
            }
            else if(current.data < n.data)
            {
                if(current.right == null)
                {
                    current.right = n;
                    break;
                }
                else
                {
                    current = current.right;
                }
            }
        }
        return root;
    }

    // Delete in Binary Tree...
    public Node Delete(int x, Node root)
    {
        if(root == null)
        {
            System.out.println("Tree is Empty.");
            return null;
        }
        if (root.data == x) 
        {
            return replace(root);
        }
        if (root.data < x)
        {
            root.right = Delete(x , root.right);
        }
        if (root.data > x)
        {
            root.left = Delete(x , root.left);
        }
        return root;
    }
    public Node replace(Node root)
    {
        if (root.left == null && root.right == null)
        {
            return null;
        }
        if (root.right == null)
        {
            return root.left;
        }
        if (root.left == null)
        {
            return root.right;
        }
        Node temp = root.right;
        if (temp.left == null) 
        {
            temp.left = root.left;
        }
        else 
        {
            Node curr = temp;
            while (curr.left != null) 
            {
                curr = curr.left;
            }
            curr.left = root.left;
        }
        return temp;
    }

    // Search in Binary Tree...
    public Node Search(int x)
    {
        return SearchNode(x, root);
    }
    public Node SearchNode(int x,Node root)
    {
        if(root == null)
        {
            System.out.println("Tree is Empty.");
        }
        else if(root.data == x)
        {
            System.out.println("Node Found...");
        }
        else if(root.data < x)
        {
            SearchNode(x, root.right);
        }
        else if(root.data > x)
        {
            SearchNode(x , root.left);
        }
        else
        {
            System.out.println("Node not Found.");
        }
        return root;
    }

    // Display With Inorder...
    public void Inorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    // Display With Postorder...
    public void Postorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+" ");
    }

    // Display With Preorder...
    public void Preorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }

} 

public class Tree 
{
    public static void main(String[] args) 
    {
        BinaryTree t = new BinaryTree();
        Node root = null;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter 1 for Insert in Tree");
            System.out.println("Enter 2 for Delete in Tree");
            System.out.println("Enter 3 for Search in Tree");
            System.out.println("Enter 4 for Inorder Traversal");
            System.out.println("Enter 5 for Preorder Traversal");
            System.out.println("Enter 6  for Postorder Traversal");
            System.out.println("Enter 7 to Exit");
            System.out.println("Enter your choice: ");
            int a = sc.nextInt();

            if(a == 1)
            {
                System.out.println("Enter Data : ");
                int data = sc.nextInt();
                root = t.InsertBST(data);
            }
            else if(a == 2)
            {
                System.out.println("Enter Data to Delete : ");
                int data = sc.nextInt();
                System.out.println("Entered Data Deleted.");
                root = t.Delete(data , root);
            }
            else if(a == 3)
            {
                System.out.println("Enter Data to Search : ");
                int data = sc.nextInt();
                root = t.Search(data);
            }
            else if(a == 4)
            {
                System.out.println("Inorder Traversal : ");
                t.Inorder(root);
                System.out.println();
            }
            else if(a == 5)
            {
                System.out.println("Preorder Traversal : ");
                t.Preorder(root);
                System.out.println();
            }
            else if(a == 6)
            {
                System.out.println("Postorder Traversal : ");
                t.Postorder(root);
                System.out.println();
            }
            else if(a == 7)
            {
                System.out.println("Tree Closed.");
                break;
            }
            else
            {
                System.out.println("Enter Valid Number.");
            }
        }
        sc.close();
    }    
}