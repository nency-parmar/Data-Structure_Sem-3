import java.util.Scanner;

public class CountingSort 
{
    public static void count(int[] arr)
    {
        int n = arr.length;
        int max = arr[0];

        for (int i=1;i<arr.length;i++) 
        {
            if (arr[i] > max) 
            {
                max = arr[i];
            }
        }
 
        int[] c = new int[max+1];
        int[] b = new int[n];
 
        for(int i=0;i<=max;i++)
        {
            c[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            c[arr[i]]++;
        }
        for(int i=1;i<=max;i++)
        {
            c[i] = c[i] + c[i-1];
        }
        for(int i=n-1;i>=0;i--)
        {
            b[c[arr[i]]-1] = arr[i];
            c[arr[i]]--;
        }
        for(int i=0;i<n;i++)
        {
            arr[i] = b[i];
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size of an Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter an Element at index : "+i);
             arr[i]=sc.nextInt();
        }

        count(arr);
        
        System.out.println("Sorted Array by Counting Sort is : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" | ");
        }
        sc.close(); 
    }    
}
