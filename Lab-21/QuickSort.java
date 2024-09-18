import java.util.Scanner;

public class QuickSort 
{
    public static void Quicksort(int[] arr,int lb,int ub)
    {
        int pivot;
        int i;
        int j;
        boolean flag = true;
        if(lb<ub)
        {
            pivot = arr[lb];
            i = lb;
            j = ub + 1;
            while(flag)
            {
                i++;
                while(pivot>arr[i] && i<ub)
                {
                    i++;
                }
                j--;
                while(pivot<arr[j] && j>=lb)
                {
                    j--;
                }
                if(i<j)
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                else
                {
                    flag = false;
                }
            }
            int temp = arr[lb];
            arr[lb] = arr[j];
            arr[j] = temp;

            Quicksort(arr, lb, j-1);
            Quicksort(arr, j+1, ub);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size of an Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++)
        {
            System.out.println("Enter an Element at : "+i);
            arr[i] = sc.nextInt();
        }

        Quicksort(arr,0,n-1);
        
        System.out.println("Sorted Array is : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" | ");
        }
        sc.close();
    }
}