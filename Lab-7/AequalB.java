import java.util.Scanner;
class Equal
{
    int top=-1;
    int max;
    char[] stack;
    Equal(int max)
    {
        this.max=max;
        stack=new char[max];
    }
    public void Push(char x)
    {
        if(top>=max-1)
        {
            System.out.println("Stack OverFlow.");
        }
        else
        {
            top++;
            stack[top]=x;
        }
    }
}
public class AequalB
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s=sc.nextLine();
        Equal A = new Equal(s.length());
        Equal B = new Equal(s.length());
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                A.Push(s.charAt(i));
            }
            if(s.charAt(i)=='b')
            {
                B.Push(s.charAt(i));
            }
            if(s.charAt(i)!='a' && s.charAt(i)!='b')
            {
                return;
            }
        }
        if(A.top==B.top)
        {
            System.out.println("String is Valid.");
            return;
        }
        else
        {
            System.out.println("String is Not Valid.");
        }
    }
}