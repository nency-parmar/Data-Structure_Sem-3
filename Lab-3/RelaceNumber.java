import java.util.*;
public class RelaceNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size of an Array : ");
        int a=sc.nextInt();
        System.out.println("Enter a number that you want to Replace : ");
        int n=sc.nextInt();
        System.out.println("Enter that number by what you want to Replace");
        int m=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
        {
            System.out.println("Enter Element - "+i+" Value : ");
            arr[i]=sc.nextInt();
        }
        int x=0;
        for(int i=0;i<a;i++)
        {
            if(arr[i]==n)
            {
               arr[i]=m;
               x=i;
            }
        }
        for(int i=0;i<a;i++)
        {
            System.out.println("Element - "+i+" = "+arr[i]);
        }
    }
}