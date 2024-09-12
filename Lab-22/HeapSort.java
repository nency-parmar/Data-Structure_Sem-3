import java.util.Scanner;

public class HeapSort 
{
    public static void Heap_Sort(int[] arr)
    {
        buildMaxHeap(arr);
        int n = arr.length;
        for(int i=n-1;i>0;i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    public static void buildMaxHeap(int[] arr)
    {
        int n = arr.length;
        for(int i=n/2-1;i>=0;i--)
        {
            heapify(arr , n , i);
        }
    }
    public static void heapify(int[] arr,int n ,int i)
    {
        int max_index = i;
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;
        if(leftChild<n && arr[leftChild] > arr[max_index])
        {
            max_index = leftChild;
        }
         if(rightChild<n && arr[rightChild] > arr[max_index])
        {
            max_index = rightChild;
        }
        if(i != max_index)
        {
            int temp1 = arr[i];
            arr[i] = arr[max_index];
            arr[max_index] = temp1;
            heapify(arr, n, max_index);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size of An Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter an Element at Index : "+i);
            arr[i] = sc.nextInt();
        }

        Heap_Sort(arr);

        System.out.println("Sorted Array is : ");
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" | ");
        }
        sc.close();
    }    
}