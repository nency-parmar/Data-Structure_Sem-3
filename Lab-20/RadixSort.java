import java.util.Scanner;

public class RadixSort 
{
    public static void countsort(int []arr,int n,int place)
    {
        int c[] = new int[10];
        int b[]= new int[n];

        for(int i=0;i<10;i++)
        {
            c[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            c[(arr[i]/place)%10]++;
        }
        for(int i=1;i<10;i++)
        {
            c[i]=c[i]+c[i-1];
        }
        for(int i=n-1;i>=0;i--)
        {
            b[c[(arr[i]/place)%10]-1] = arr[i];
            c[(arr[i]/place)%10]--;
        }
        for(int i=0;i<n;i++)
        {
            arr[i] = b[i];
        }
    }
    public static void radixsort(int []arr)
    {
        int n = arr.length;
        int m = Max(arr);
        for(int place=1;m/place>0;place*=10)
        {
            countsort(arr,n,place);
        }
    }
    public static int Max(int []arr)
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] > max) 
            {
                max = arr[i];
            }
        }
        return max;
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
        radixsort(arr);

        System.out.println("Sorted Array by Radix Sort is : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" | ");
        }
        sc.close();
    }    
}