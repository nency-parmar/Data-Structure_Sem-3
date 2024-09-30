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

    // Find Smallest Element From Tree...
    // public int FindMin(Node root)
    {
        if(root == null)
        {
            System.out.println("Tree is Empty.");
        }
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
}

public class SmallLarge 
{
    public static void main(String[] args) 
    {
        
    }    
}
