import java.util.*;
public class SelectionShort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size of An Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i<n;i++)
        {
            System.out.println("Enter an Element at : "+i);
            arr[i] = sc.nextInt();
        }

        // #Sort By Selection Sort...
        for(int i=0;i<n-1;i++)
        {
            int min_i = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j] < arr[min_i])
                {
                    min_i = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_i];
            arr[min_i] = temp;
        }
        System.out.println("Sorted Array By Selection Sort : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" | ");
        }
        System.out.println();
        sc.close();
    }    
}