import java.util.Arrays;
import java.util.Scanner;

public class InsertSortedArray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Size of an Array : ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter a Number that You Want to Add : ");
        int b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Elemments at Index : "+i);
            a[i]=sc.nextInt();
        }  
        int[] arr=new int[n+1];
        int i=0;
        while (i<a.length && i<b) 
        {
            arr[i]=a[i];
            i++;
        }
        arr[i]=b;
        i++;
        while (i<arr.length) 
        {
            arr[i]=a[i-1];
            i++;
        }
        Arrays.sort(arr);
        System.out.println("New Inserted Array is : ");
        for(int j=0;j<arr.length;j++)
        {
            System.out.println("n["+j+"] = "+arr[j]);
        }
    }    
}