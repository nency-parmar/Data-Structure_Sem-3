import java.util.*;
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

class CircularLinkedList
{
    Node First;
    Node Last = null;

    // Insert a Node at First Position...
    public void insertAtFirst(int data)
    {
        Node newNode = new Node(data);
        if(First == null)
        {
            First = Last = newNode;
            First.link = newNode;
        }
        else
        {
            newNode.link = First;
            Last.link=newNode;
            First=newNode;
        }
    }

    // Insert a Node at Last Position...
    public void insertAtLast(int data)
    {
        Node newNode = new Node(data);
        if(First == null)
        {
            First = Last = newNode;
            newNode = newNode.link;
        }
        else
        {
            First = newNode.link;
            newNode = Last.link;
            newNode = Last;
        }
    }

    // Delete a Node at Any Position...
    public void DeletePosition(int data)
    {
        if(First == null)
        {
            System.out.println("Linked list is Empty.");
            return;
        }
        else
        {
            Node pred = null;
            Node Save = First;

            int count = 1;
            while(count != data && Save != Last)
            {
                count++;
                pred = Save;
                Save = Save.link;
                if(data == 1)
                {
                    First = First.link;
                    Last.link = First;
                }
                else if(First == Last)
                {
                    System.out.println("There is Only 1 Element.");
                    First = Last = null;
                }
                else if(count == data)
                {
                    pred.link = Save.link;
                }
                else 
                {
                    System.out.println("Node not Found.");
                }
            }
        }
    }

    // Count Node...
    public void countNode()
    {
        int count = 1;
        if(First == null)
        {
            count = 0;
        }
        //else
        
            Node temp = First;
            while(temp != Last)
            {
                count++;
                temp = temp.link;
            }
            System.out.println("Counted Node = "+count);
        
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
            Node temp = First;
            // System.out.println(First);
            while(temp.link!= First)
            {
                System.out.print(temp.data+" -> ");
                temp = temp.link;
            }
            System.out.println(temp.data);
        }
    }
}

public class CircularLL 
{
    public static void main(String[] args) 
    {
        CircularLinkedList cl = new CircularLinkedList();

        cl.insertAtFirst(10);
        cl.insertAtFirst(20);
        cl.insertAtFirst(30);
        cl.insertAtLast(40);

        while (true) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 for Insert at First");
            System.out.println("Enter 2 for Insert at Last");
            System.out.println("Enter 3 for Delete at Any Position");
            System.out.println("Enter 4 for Count Node in Linked List : ");
            System.out.println("Enter 5 to Display List.");
            System.out.println("Enter 6 to Break Linked List.");
            System.out.println("Enter Your Choice : ");
            int a = sc.nextInt();    

            if(a==1)
            {
                System.out.println("Enter an Element that You Want to Insert at First : ");
                int x = sc.nextInt();
                cl.insertAtFirst(x);
              //  cl.display();
            }
            else if(a==2)
            {
                System.out.println("Enter an Element that You Want to Insert at Last : ");
                int y = sc.nextInt();
                cl.insertAtLast(y);
                cl.display();
            }
            else if(a==3)
            {
                System.out.println("Enter an Element that You Want to Delete : ");
                int z = sc.nextInt();
                cl.DeletePosition(z);
                System.out.println("Deleted Node at "+z+"Position.");
            }
            else if(a==4)
            {
                cl.countNode();
            }
            else if(a==5)
            {
                System.out.println("Circular Linked List is : ");
                cl.display();
            }
            else if(a==6)
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