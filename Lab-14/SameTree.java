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

    // Check For Trees Are Same Or Not...
    public boolean Check(Node r1,Node r2)
    {
        if(r1 == null && r2 == null)
        {
            return  true;
        }
        if(r1 == null || r2 == null)
        {
            return false;
        }
        return (r1.data == r2.data) && Check(r1.left, r2.left) && Check(r1.right, r2.right);
    }
    public boolean  Checkans(BinaryTree t1 , BinaryTree t2) 
    {
        return  Check(t1.root , t2.root);
    }

}

public class SameTree 
{
    public static void main(String[] args) 
    {
        BinaryTree t1 = new BinaryTree();
        t1.InsertBST(3);
        t1.InsertBST(4);
        t1.InsertBST(2);

        BinaryTree t2 = new BinaryTree();
        t2.InsertBST(3);
        t2.InsertBST(4);
        t2.InsertBST(2);

        System.out.println(t1.Checkans(t1, t2));
    }    
}
