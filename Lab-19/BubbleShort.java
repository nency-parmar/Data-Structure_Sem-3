import java.util.*;

public class BubbleShort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entera Size of An Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i<n;i++)
        {
            System.out.println("Enter an Element at : "+i);
            arr[i] = sc.nextInt();
        }

        // #Sort By Bubble Sort...
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array By Bubble Sort is : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" | ");
        }
        System.out.println();
        sc.close();
    }    
}