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
    // Display Linked list...
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

    // Remove Duplicate From Linked list...
    public void removeDuplicate()
    {
        Node Save = First;
        Node temp = null;
        while (Save != null) 
        {
            temp = Save.link;
            while(temp != null)
            {
                if(Save.data == temp.data)
                {
                    Save.link = temp.link;
                }
                temp = temp.link;
            }
            Save = Save.link;
        }
    }
}
public class RemoveDuplicate 
{
    public static void main(String[] args) 
    {
        Linkedlist list = new Linkedlist();
        list.insertatfirst(40);
        list.insertatfirst(30);
        list.insertatfirst(20);
        list.insertatfirst(10);
        list.printlist();
        list.insertatlast(50);
        list.printlist();
        while(true)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 1 for Insert at First");
            System.out.println("Enter 2 for Insert at Last");
            System.out.println("Enter 3 for Delete at Order");
            System.out.println("Enter 4 for Remove Duplicate.");
            System.out.println("Enter 5 to Exit.");
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
                System.out.println("Enter Number that You Want to Delete : ");
                int x = sc.nextInt();
                list.deleteOrder(x);
            }
            else if(a==4)
            {
                list.removeDuplicate();
                System.out.println("Duplicate Node Deleted.");
                System.out.println("New Linked list is : ");
                list.printlist();
            }
            else if(a==5)
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