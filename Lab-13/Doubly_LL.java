import java.util.Scanner;

class Node
{
    int data;
    Node lptr;
    Node rptr;
    Node(int data)
    {
        this.data = data;
        this.lptr = null;
        this.rptr = null;
    }
}

class DoublyLinkedlist
{
    Node First = null;
    Node Last = null;
    // Insert at First in Doubly Linked list...
    public void insertatFirst(int data) 
    { 
        Node newNode = new Node(data);
        if (First == null) 
        {
            System.out.println("Linked list Empty...");
            First = Last = newNode;
        } 
        else 
        {
            newNode.rptr = First;
            First.lptr = newNode;
            First = newNode;
        }
    }

    // Insert at Last in Doubly Linked list...
    public void insertAtLast(int data)
    {
        Node newNode=new Node(data);
        if(Last == null)
        {
            First = Last = newNode;
        }
        else
        {
            Last.rptr = newNode;
            newNode.lptr = Last;
            Last = newNode;
        }
    }

    // Insert at any Position in Doubly Linked list...
    public void insertPosition(int position,int data)
    {
        Node newNode = new Node(data);
        Node temp = First;
        int currPosi = 1;
        if(position == 1)
        {
            insertatFirst(data);
            return;
        }
        while(temp != null  && currPosi < position)
        {   
            temp = temp.rptr;
            currPosi++; 
        }
        if(currPosi == position)
        {
            newNode.rptr = temp;
            newNode.lptr = temp.lptr;
            newNode.lptr.rptr = newNode;
            temp.lptr = newNode;
        }
        if(temp == null)
        {
            insertAtLast(data);
            return;
        } 
    }

    // Delete at any Position in Doubly Linked list...
    public void DeleteAddress(int data)
    {
        if(First == null)
        {
            System.out.println("Linked list is Empty.");
            return;
        }
        else
        {
            Node temp = First;
            while(temp != null && temp.data != data)
            {
                temp = temp.lptr;
            }
            if(temp == null)
            {
                System.out.println("Node not Found.");
                return;
            }
            else if(temp == First)
            {
                First = First.rptr;
            }
            else if(temp.data == data)
            {
                temp.rptr.lptr = temp.lptr;
                temp.lptr.rptr = temp.rptr;
            }
        }
    }

    // Count Node...
    public void countNode()
    {
        int count = 0;
        if(First == null)
        {
            count = 0;
        }
        else
        {
            Node temp = First;
            while(temp != null)
            {
                count++;
                temp = temp.rptr;
            }
            System.out.println("Counted Node = "+count);
        }
    }
 
    // Display Node...
    public void display()
    {
        if(First == null)
        {
            System.out.println("Linked list is Empty.");
            return;
        }
        else
        {
            System.out.print("NULL <-> ");
            Node temp = First;
            while(temp != null)
            {
                System.out.print(temp.data+" <-> ");
                temp = temp.rptr;
            }
            System.out.println("NULL");
        }
    }
}

public class Doubly_LL 
{
    public static void main(String[] args) 
    {
        DoublyLinkedlist dl = new DoublyLinkedlist();

        dl.insertatFirst(20);
        dl.insertatFirst(10);
        dl.insertAtLast(30);

        while (true) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 for Insert at First");
            System.out.println("Enter 2 for Insert at Last");
            System.out.println("Enter 3 for Insert at Any Position");
            System.out.println("Enter 4 for Delete Any Node");
            System.out.println("Enter 5 for Count Node in Linked List : ");
            System.out.println("Enter 6 to Display List.");
            System.out.println("Enter 7 to Break Linked List.");
            System.out.println("Enter Your Choice : ");
            int a = sc.nextInt();    

            if(a == 1)
            {
                System.out.println("Enter an Element that You Want to Insert at First : ");
                int x = sc.nextInt();
                dl.insertatFirst(x);
                dl.display();
            }
            else if(a == 2)
            {
                System.out.println("Enter an Element that You Want to Insert at Last : ");
                int y = sc.nextInt();
                dl.insertAtLast(y);
                dl.display();
            }
            else if(a == 3)
            {
                System.out.println("Enter an Index Where You Want to add Element : ");
                int index = sc.nextInt();
                System.out.println("Enter an Element that You Want to Delete : ");
                int z = sc.nextInt();
                dl.insertPosition(index, z);
                dl.display();
            }
            else if(a == 4)
            {
                System.out.println("Enter an Element that You Want to Delete : ");
                int n = sc.nextInt();
                dl.DeleteAddress(n);
                dl.display();
            }
            else if(a == 5)
            {
                dl.countNode();
            }
            else if(a == 6)
            {
                System.out.println("Circular Linked List is : ");
                dl.display();
            }
            else if(a == 7)
            {
                System.out.println("Linked List Closed.");
                break;
            }
            else
            {
                System.out.println("Enter Valid Number.");
            }
        }
    }    
}
