import java.util.Scanner;

public class InsertionSort 
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

        // #Sort By Insertion Sort...
        int i = 1;
        while (i<n) 
        {
            int k = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > k) 
            {
                arr[j+1] = arr[j];
                j--;   
            }
            arr[j+1] = k;
            i++;
        }
        System.out.println("Sorted Array By Insertion Sort is : ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" | ");
        }
        System.out.println();
        sc.close();
    }    
}
