import java.util.*;

class Stack 
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
    Node top = null;

    public void Push(int data) 
    {
        Node new_node = new Node(data);
        if (top == null) 
        {
            top = new_node;
            return;
        }
        Node temp = top;
        top = new_node;
        top.link = temp;
    }

    public int Pop() 
    {
        Node save;
        if (top == null) 
        {
            System.out.println("Stack Underflow");
        } 
        else 
        {
            top = top.link;
        }
        return top.data;
    }

    // public void peep(int j)
    // {
    //     if((top-j+1)<=0)
    //     {
    //         System.out.println("Stack Underflow");
    //     }
    //     else
    //     {
    //         System.out.println(arr[top-j+1]);
    //     }
    // }

    public void displaystack()
    {
        if(top == null)
        {
            System.out.println("Linked list is Empty.");
        }
        Node node = top;
        while (node != null) 
        {
            System.out.print(node.data + "->");
            node = node.link;
        }
        System.out.println("NULL");
    }
}

public class Stack_LL 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        s.Push(1);
        s.displaystack();
        while (true) 
        {
            System.out.println("Enter 1 to Push");
            System.out.println("Enter 2 to Pop");
            System.out.println("Enter 3 to Display Stack");
            System.out.println("Enter 4 to Exit");
            int a = sc.nextInt();
            if (a == 1) 
            {
                System.out.println("Enter element you want to push in stack:");
                int b = sc.nextInt();
                s.Push(b);
                s.displaystack();
            }
            else if (a == 2) 
            {
                s.Pop();
                s.displaystack();
            }
            else if (a == 3) 
            {
                s.displaystack();
            }
            else if (a == 4) 
            {
                System.out.println("Linked List is Closed.");
                break;
            }
            else
            {
                System.out.println("Enter Valid Number.");
            }
        }
    }
}
