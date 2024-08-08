import java.util.Scanner;
class Node
{
    int data;
    Node link;
    Node(int data)
    {
        this.data=data;
        this.link=null;
    }
}
class Linkedlist
{
    public Node First = null;

    //Insert at First in Singly Linked List...

    public void insertatfirst(int x)
    {
        Node new_Node = new Node(x);
        if(First == null)
        {
            First = new_Node;
            return;
        }
        new_Node.link = First;
        First = new_Node;
    }

    //Insert at Orderd in Singly Linked List...
    public void insord(int x) 
    {
        Node new_Node = new Node(x);
        
        if (First == null && x <= First.data) 
        { 
            new_Node.link = First;
            First = new_Node;
        } 
        else
        {
            Node save = First;
            while (save.link != null && x > save.link.data) 
            {
                save = save.link;
            }
            new_Node.link = save.link;
            save.link = new_Node;
        }
    }

    public void printlist() 
    {
        if(First == null)
        {
            System.out.println("Linked List is Empty.");
            return;
        }
        Node node = First;
        while (node != null) 
        {
            System.out.print(node.data+" -> ");
            node = node.link;
        }
        System.out.println("NULL");
    }

    //Delete at Order In Singly Linked List...
    public void deleteOrder(int x)
    {
        if(First == null)
        {
            System.out.println("Stack Underflow.");
        }
        else 
        {
            if(First.data==x)
            {
                First=First.link;
            }
            Node pred = First;
            Node save = First.link;
            while(save!=null && save.data!=x)
            {
                save = save.link;
                pred = pred.link;
            }
            if(save == null)
            {
                System.out.println("Node not Found.");
                return;
            }
            pred.link=save.link;
            printlist();
            System.out.println("Entered Node Deleted.");
        }
    }
    public void countNode()
    {
        int count=1;
        if(First == null)
        {
           count=0; 
        }
        else
        {
            Node save=First;
            do
            {
                count++;
                save=save.link;
            }
            while(save.link!=null);
        }
        System.out.println("Counted Node = "+count);
    }
    // To Sort Linked List...
    public void sort()
    {
        if(First == null)
        {
            System.out.println("Linked list is Empty It Can't Sort...");
            return;
        }
        Node current;
        Node index;
        int temp;
        for (current = First; current.link != null; current = current.link) 
        {
            for (index = current.link; index != null; index = index.link) 
            {
                if (current.data > index.data) 
                {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
            }
        }
    }
}
public class SortLL 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Linkedlist list = new Linkedlist();
        while(true)
        {
            System.out.println("Enter 1 for Insert at First");
            System.out.println("Enter 2 for Insert at Ordered");
            System.out.println("Enter 3 for Delete at Order");
            System.out.println("Enter 4 for Count Node in Linked List : ");
            System.out.println("Enter 5 for Sort Linked List");
            System.out.println("Enter 6 to Exit.");
            System.out.println("Enter Your Choice : ");
            int a = sc.nextInt();

            if(a == 1)
            {
                System.out.println("Enter an Element that You Want to Insert at First : ");
                int x = sc.nextInt();
                list.insertatfirst(x);
                list.printlist();
            }
            else if(a == 2)
            {
                System.out.println("Enter an Element that You Want to Insert at Ordered : ");
                int z = sc.nextInt();
                list.insord(z);
                System.out.println("New Inserted Linked list is : ");
                list.printlist();
            }
            else if(a == 3)
            {
                System.out.println("Enter Number that You Want to Delete : ");
                int x = sc.nextInt();
                list.deleteOrder(x);
            }
            else if(a == 4)
            {
                list.countNode();
            }
            else if(a == 5)
            {
                System.out.println("Sorted Linked List is : ");
                list.sort();
                list.printlist();
            }
            else if(a == 6)
            {
                System.out.println("Linked list Closed.");
                return;
            }
            else
            {
                System.out.println("Enter Valid Number.");
            }
        }

    }    
}