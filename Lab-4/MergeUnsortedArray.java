import java.util.*;
public class MergeUnsortedArray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Size of an Array : ");
        int n = sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Elements in Array - 1 at Index - "+i+": ");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Elements in Array - 2 at Index - "+i+": ");
            b[i]=sc.nextInt();
        }
        int[] arr = new int[(a.length+b.length)];
        int  x = 0;
        while(x!=(a.length+b.length))
        {
            if(x<n)
            {
                arr[x]=a[x];
                x++;
            }
            else
            {
                arr[x]=b[x-n];
                x++;
            }
        }
        System.out.println("New Merged Array is : ");
        System.out.print("[");
        for(int i=0;i<(a.length+b.length);i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.print("]");
    }
    
}