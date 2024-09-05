import java.util.Scanner;

public class ShellSort 
{
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

        for(int gap=n/2;gap>=1;gap=gap/2)
        {
            for(int j=gap;j<n;j++)
            {
                for(int i=j-gap;i>=0;i=i-gap)
                {
                    if(arr[i+gap]>arr[i])
                    {
                        break;
                    }
                    else
                    {
                        int temp=arr[i+gap];
                        arr[i+gap]=arr[i];
                        arr[i]=temp;
                    }
                }
            }
        }
        System.out.println("Sorted Array by Shell Sort is : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" | ");
        }
        sc.close();
    }
}