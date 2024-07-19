import java.util.*;
import java.lang.*;
class Stack 
{
    // Stack<character> s = new Stack<character>(0);
    int top = -1;
    int max;
    char[] arr;

    Stack(int max)
    {
        this.max = max;
        arr = new char[max];
    }

    public void push(char x)
    {
        if(top>=max-1)
        {
            System.out.println("Stack Overflow.");
        }
        else
        {
            top++;
            arr[top]=x;
            // System.out.println("Element is Inserted");
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
            // System.out.println(arr[top+1]);
        }
    }

    public char peep() 
    {
        if (top == -1) 
        {
            System.out.println("Stack is Empty.");
            return '0';
        }
        return arr[top];
    }

    public void display(int c)
    {
        for(int i=0;i<=c;i++)
        {
            System.out.println("arr["+i+"]"+arr[i]);
        }
    }
}


public class Recognize
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        int n = str.length();

        Stack s = new Stack(n);
        int i = 0;
        while (str.charAt(i) != 'c')
        {
            s.push(str.charAt(i));
            i++;
        }
        i++;
        boolean flag = true;
        for(int j=i;j<n;j++)
        {
            char ch = s.peep();

            if(ch != str.charAt(j))
            {
                flag = false;
                System.out.println("This is Invalid String.");
                break;
            }
            s.pop();
        }
        if(flag)
        {
            if(s.top == -1)
            {
                System.out.println("This is Valid String.");
            }
            else 
            {
                System.out.println("This is Invalid String.");
            }
        }
    }
}