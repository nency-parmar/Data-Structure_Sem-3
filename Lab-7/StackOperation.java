import java.util.Scanner;
class Stack
{
    int top;
    int []arr;
    int length;
    Stack(int length)
    {
        this.length = length;
        this.top = -1;
        arr = new int[length];
    }

    public void push(int p)
    {
        if(top>=length-1)
        {
            System.out.println("Stack Overflow.");
        }
        else
        {
            top++;
            arr[top]=p;
            System.out.println("Element is Inserted");
        }
    }

    public void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            top--;
            System.out.println(arr[top+1]);
        }
    }

    public void peep(int j)
    {
        if((top-j+1)<=0)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            System.out.println(arr[top-j+1]);
        }
    }

    public void change(int nu,int i)
    {
        if((top-i+1)<=0)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            arr[top-i+1]=nu;
            System.out.println("Element has been Changed.");
            System.out.println(arr[top-i+1]);
        }
    }
    public void display(int c)
    {
        for(int i=0;i<=c;i++)
        {
            System.out.println("arr["+i+"]"+arr[i]);
        }
    }

}
public class StackOperation 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length of Stack : ");
        int length = sc.nextInt();
        Stack s = new Stack(length);
        int k = 0;
        int c = 0;
        while(k!=5)
        {
            System.out.println("Enter Number-1 for Push...Number-2 for Pop...Number-3 for Peep...Number-4 for Change...Number-5 for Display : ");
            int k1 = sc.nextInt();
            c = c+1;
            switch (k1) 
            {
                case 1:
                System.out.println("Enter the Element that You Want to Push : ");
                int p=sc.nextInt();
                    s.push(p);
                    break;
            
                case 2:
                s.pop();
                break;
            
                case 3:
                System.out.println("Enter an Index of Element that You Want : ");
                int j=sc.nextInt();
                s.peep(j);
                break;
        
                case 4:
                System.out.println("Enter the that Element You Want to Put : ");
                int nu=sc.nextInt();
                System.out.println("Enter an Index of Element that You Want : ");
                int i=sc.nextInt();
                s.change(nu,i);
                break;
        
                case 5:
                s.display(c);
                continue;
    
                default:
                break;
            }
        }
        sc.close();
    }
}