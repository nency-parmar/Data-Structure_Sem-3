import java.util.Scanner;
public class Reverse 
{
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

    Node first = null;

    public void printList()
    {

        if(first == null)
        {
            System.out.println("LinkedList is Empty");
            return;
        }
        else
        {
            Node cuurrentNode = first;

            while(cuurrentNode != null)
            {
                System.out.print(cuurrentNode.data + " -> ");
                cuurrentNode = cuurrentNode.link;
            }

            System.out.println("NULL");
        }
    }

    public void insertAtFirst(int data)
    {
        Node newNode = new Node(data);
        if(first == null)
        {
            first = newNode;
            return;
        }

        newNode.link = first;
        first = newNode;
    }

    public void insertAtLast(int data)
    {
        Node newNode = new Node(data);

        if(first == null)
        {
            first = newNode;
            return;
        }

        Node currentNode = first;

        while(currentNode.link != null)
        {
            currentNode = currentNode.link;
        }

        currentNode.link = newNode;
    }

    public void reverse()
    {

        if(first == null)
        {
            System.out.println("List is empty can't be Reversed.");
            return;
        }
        else if(first.link == null)
        {
            System.out.println("There is Only 1 Element.");
            return;
        }

        Node pred = null;
        Node currNode =  first;
        Node temp;

        while(currNode != null)
        {
            temp = currNode.link;
            currNode.link = pred;
            pred = currNode;
            currNode = temp;     
        }
        System.out.println("Reverse Linked list is : ");
        first = pred;
        
    }
    public static void main(String[] args) 
    {
        Reverse l1 = new Reverse();
        while (true) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number 1 for Insert at First");
            System.out.println("Enter 2 for Insert at Last");
            System.out.println("Enter 3 for Display List");
            System.out.println("Enter 4 for Reverse Linked List");
            System.out.println("Enter 5 to Close List.");
            int a = sc.nextInt();
            if(a == 1)
            {
                System.out.println("Enter Number that You Want to Insert : ");
                int x = sc.nextInt();
                l1.insertAtFirst(x);
                l1.printList();
            }
            else if(a == 2)
            {
                System.out.println("Enter Number that You Want to Insert at Last : ");
                int y = sc.nextInt();
                l1.insertAtLast(y);
                l1.printList();
            }
            else if(a == 3)
            {
                l1.printList();
            }
            else if(a == 4)
            {
                System.out.println("Link Before Reverse : ");
                l1.printList();
                l1.reverse();
                System.out.println("Link After Reverse : ");
                l1.printList();
            }
            else if(a == 5)
            {
                l1.printList();
                System.out.println("Linked list Closed.");
                break;
            }
            else
            {
                System.out.println("Enter Valid Number.");
            }
        }
    }
} 