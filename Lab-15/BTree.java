import java.util.*;
class BinaryTree
{
    class TreeNode
    {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public TreeNode ConvertToBT(int[] arr , int i)
    { 
        TreeNode root = null;
        if(i<arr.length)
        {
            TreeNode newNode = new TreeNode(arr[i]);
            root = newNode;
            root.left = ConvertToBT(arr,(2*i + 1));
            root.right = ConvertToBT(arr, (2*i + 2));
        }
        else
        {
            return null;
        }
        return root;
    }

    // Display With Inorder...
    public void Inorder(TreeNode root)
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
    public void Postorder(TreeNode root)
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
    public void Preorder(TreeNode root)
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

public class BTree
{
    public static void main(String[] args) 
    {
        BinaryTree t = new BinaryTree();
        BinaryTree.TreeNode root = null;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter 1 for Insert in Tree");
            System.out.println("Enter 2 for Display in Inorder Tree");
            System.out.println("Enter 3 for Display in Preorder Tree");
            System.out.println("Enter 4 for Display in Postorder Tree");
            System.out.println("Enter 5 to Exit");
            System.out.println("Enter your choice: ");
            int a = sc.nextInt();

            if(a == 1)
            {
                System.out.println("Enter Size of Tree : ");
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i=0;i<arr.length;i++)
                {
                    System.out.println("Enter Node Data at : "+i);
                    arr[i] = sc.nextInt();
                }
                root = t.ConvertToBT(arr, 0);
            }
            else if(a == 2)
            {
                System.out.println("Inorder Traversal : ");
                t.Inorder(root);
                System.out.println();
            }
            else if(a == 3)
            {
                System.out.println("Preorder Traversal : ");
                t.Preorder(root);
                System.out.println();
            }
            else if(a == 4)
            {
                System.out.println("Postorder Traversal : ");
                t.Postorder(root);
                System.out.println();
            }
            else if(a == 5)
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
