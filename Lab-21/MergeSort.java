import java.util.Scanner;

public class MergeSort 
{
    static int[] arr;
    static int[] b;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size of An Array : ");
        int n = sc.nextInt();
        System.out.println("Enter an Element at : ");
        arr = new int[n];

        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        merge(0,n-1);
        System.out.println("Sorted Array is : ");
        for(int m=0;m<n;m++)
        {
            System.out.print(arr[m]+" | ");
        }
    }  
    public static void merge(int low,int high)
    {
        int mid = 0;
        if(low<high)
        {
            mid = (low + high)/2;
            merge(low,mid);
            merge(mid+1,high);
            mergeSort(low, mid, high);
        }
    }
    public static void mergeSort(int low, int mid , int high)
    {
        int h = low;
        int i = 0;
        int j = mid + 1;
        b = new int[high-low+1];
        while(h <= mid && j <= high)
        {
            if(arr[h] <= arr[j])
            {
                b[i] = arr[h];
                h++;
            }
            else
            {
                b[i] = arr[j];
                j++;
            }
            i++;
        }
        if(h > mid)
        {
            for(int k = j;k <= high; k++)
            {
                b[i] = arr[k];
                i++;
            }
        }
        else
        {
            for(int k = h; k <=mid; k++)
            {
                b[i] = arr[k];
                i++;
            }
        }
        for(int k = 0;k < b.length; k++)
        {
            arr[k+low] = b[k];
        }
    }
}