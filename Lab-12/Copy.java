import java.util.Scanner;

class Node
{
    int data;
    Node link;

    Node(int data)
    {
        this.data = data;
        this.link = null;
    }
}
class LinkedList
{
    Node first=null;
    Node save=first;

    Node head = null;
    Node n = head;

    public void insertatFirst(int data)
    {
        Node newNode = new Node(data);
        if(first==null)
        {
            first = newNode;
            save = newNode;
        }
        else
        {
            save.link = newNode;
            save = newNode;
        }
    }

    public void copyList()
    {
        while(save != null)
        {
            Node newNode = new Node(save.data);
            if(head == null)
            {
                head = newNode;
                n = newNode;
            }
            else
            {
                n.link = newNode;
                n = newNode;
            }

            save = save.link;
        }
        // System.out.println("Copied Linked List : ");
    }

    public void display()
    {
        Node n=first;
        while(n!=null)
        {
            System.out.print(n.data+" -> ");
            n=n.link;
        }
        System.out.println("NULL");
    }
}
public class Copy 
{
    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList();
        while(true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 for Insert at First");
            System.out.println("Enter 2 to Display List.");
            System.out.println("Enter 3 to Copy Linked List.");
            System.out.println("Enter 4 to close Linked List.");
            int a = sc.nextInt();

            if(a == 1)
            {
                System.out.println("Enter an Element that You Want to Insert at First : ");
                int x = sc.nextInt();
                list.insertatFirst(x);
                list.display();
            }
            else if(a == 2)
            {
                list.display();
            }
            else if(a == 3)
            {
                System.out.println("Linked list Before Copy : ");
                list.display();
                list.copyList();
                System.out.println("Linked list After Copy : ");
                list.display();
            }
            else if(a == 4)
            {
                list.display();
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