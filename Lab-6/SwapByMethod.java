import java.util.Scanner;
public class SwapByMethod
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b=sc.nextInt();
        System.out.println("Numbers Before Swapping : ");
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("Numbers After Swapping : ");
        Swap sp=new Swap();
        sp.Swapnum(a,b);
    }
}
class Swap
{
    public void Swapnum(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println("Swaped Number a is : "+a);
        System.out.println("Swaped Number b is : "+b);
    }
}