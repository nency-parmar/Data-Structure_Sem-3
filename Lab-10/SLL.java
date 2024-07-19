import java.util.Scanner;

// Lab-10 
// Programm Number - 56 , 57 , 58
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

    //Insert at Last in Singly Linked List...

    public void insertatlast(int x)
    {
        Node new_Node=new Node(x);
        
        if(First==null)
        {
            new_Node.link = First;
            First = new_Node;
        }
        else
        {
            Node save=First;
            while(save.link!=null)
            {
                save=save.link;
            }
        save.link=new_Node;
        }
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

    //Delete at First in Singly Linked List...

    public void deleteFirst()
    {
        if(First == null)
        {
            System.out.println("Stack Underflow.");
        }
        else
        {
            First = First.link;
        }
    }

    //Delete at Last In Singly Linked List...
    Node Save;
    public void deleteLast()
    {
        if(First == null)
        {
            System.out.println("Stack Underflow.");
        }
        else
        {
            Save = First;
            while (Save.link.link != null) 
            {
                Save = Save.link;    
            }
            Save.link = null;
        }
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
}
public class SLL 
{
    public static void main(String[] args) 
    {
        Linkedlist list = new Linkedlist();
        list.insertatfirst(40);
        list.insertatfirst(30);
        list.insertatfirst(20);
        list.insertatfirst(10);
        list.insord(25);
        list.insord(21);
        list.printlist();
        list.insertatlast(50);
        list.printlist();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Insert at First");
        System.out.println("Enter 2 for Insert at Last");
        System.out.println("Enter 3 for Insert at Ordered");
        System.out.println("Enter 4 for Delete at First");
        System.out.println("Enter 5 for Delete at Last");
        System.out.println("Enter 6 for Delete at Order");
        System.out.println("Enter 7 for Count Node in Linked List : ");
        System.out.println("Enter Your Choice : ");
        int a = sc.nextInt();

        if(a==1)
        {
            System.out.println("Enter an Element that You Want to Insert at First : ");
            int x = sc.nextInt();
            list.insertatfirst(x);
            list.printlist();
        }
        else if(a==2)
        {
            System.out.println("Enter an Element that You Want to Insert at Last : ");
            int y = sc.nextInt();
            list.insertatlast(y);
            list.printlist();
        }
        else if(a==3)
        {
            System.out.println("Enter an Element that You Want to Insert at Ordered : ");
            int z = sc.nextInt();
            list.insord(z);
            System.out.println("New Inserted Linked list is : ");
            list.printlist();
        }
        else if(a==4)
        {
            list.deleteFirst();
            list.printlist();
            System.out.println("Deleted Node at First Position.");
        }
        else if(a==5)
        {
            list.deleteLast();
            list.printlist();
            System.out.println("Deleted Node at Last Position.");
        }
        else if(a==6)
        {
            System.out.println("Enter Number that You Want to Delete : ");
            int x = sc.nextInt();
            list.deleteOrder(x);
        }
        else if(a==7)
        {
            list.countNode();
        }
        else
        {
            System.out.println("Enter Valid Number.");
        }
    }
}