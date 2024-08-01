import java.util.Scanner;
class Queue
{
    int R = -1;
    int F = -1;
    int n;
    int queue[];
    Queue(int n)
    {
        this.n = n;
        queue = new int[n];
    }
    // Insert an Element in Queue...
    public void enqueue(int x)
    {
        if(R > n)
        {
            System.out.println("Queue Overflow...");
            return;
        }
        else
        {
            R = R + 1;
            queue[R] = x;
            if(F == -1)
            {
                F = 0;
                return;
            }
        }
    }
    // Delete an Element in Queue...
    public void dequeue()
    {
        if(F == -1)
        {
            System.out.println("Queue Underflow...");
            return;
        }
        else if(F == R)
        {
            F = R = -1;
        }            
        else
        {
            F = F + 1;
        }
    }
    // Display Queue...
    public void display()
    {
        for(int i=F;i<=R;i++)
        {
            System.out.print("|"+queue[i]+"|");
        }
        System.out.println();
    }
}

public class QueueOperation
{
    public static void main(String[] args) 
    {
        Queue q = new Queue(10);
        q.enqueue(10);
        q.enqueue(20);
        while (true) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 for Enqueue...");
            System.out.println("Enter 2 for Dequeue...");
            System.out.println("Enter 3 for Display...");
            System.out.println("Enter 4 to Exit Queue...");
            System.out.println("Enter Your Choice : ");
            int a = sc.nextInt();
            if(a == 1)
            {
                System.out.println("Enter an Element that You Want to Enqueue : ");
                int x = sc.nextInt();
                q.enqueue(x);
                q.display();
            }
            else if(a == 2)
            {
                q.dequeue();
                q.display();
            }
            else if(a == 3)
            {
                q.display();
            }
            else if(a == 4)
            {
                System.out.println("Queue Closed.");
                break;
            }
            else
            {
                System.out.println("Enter Valid Number...");
            }
        }
    }
}