import java.util.Scanner;

class LSearch
{
    public int Search(int x,int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == x)
            {
                return i;
            }
        }
        return -1;
    }
}
public class Linear_Search 
{
    public static void main(String[] args) 
    {
        LSearch l = new LSearch();
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
        int ans = l.Search(x,arr);
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
