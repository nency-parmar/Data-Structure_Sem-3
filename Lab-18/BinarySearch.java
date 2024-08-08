import java.util.*;
class BSearch
{
    public int Search(int x,int[] arr)
    {
        int left = 0;
        int right = arr[arr.length-1];

        Arrays.sort(arr);
        while(left<=right) 
        {
            int mid = (left+right)/2;
            if(arr[mid] == x)
            {
                return mid;
            }
            else if(x<arr[mid])
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
        return -1;
    }  
}

public class BinarySearch 
{
    public static void main(String[] args) 
    {
        BSearch b = new BSearch();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entera Size of An Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i<n;i++)
        {
            System.out.println("Enter an Element at : "+i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a Value that You Want to Search : ");
        int x = sc.nextInt();
        int ans = b.Search(x,arr);
        if(ans == -1)
        {
            System.out.println("Data Not Found...");
            return;
        }
        else
        {
            System.out.println("Data Found at Index : "+ans);
        }
    }    
}
