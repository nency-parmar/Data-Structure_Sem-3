import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteSortedArray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Size of an Array : ");
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] arr=new int[n-1];
        System.out.println("Enter a Number that You Want to Add : ");
        int b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Elemments at Index : "+i);
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<b)
            {
                arr[i]=a[i];
            }
            else if(a[i]==b)
            {
               continue;
            }
            else
            {
                arr[i-1]=a[i];
            }
        }
        Arrays.sort(arr);
        System.out.println("New Deleted Array is : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("n["+i+"] = "+arr[i]);
        }
    }    
}
