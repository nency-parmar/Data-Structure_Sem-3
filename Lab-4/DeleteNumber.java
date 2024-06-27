import java.util.Scanner;

public class DeleteNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size of an Array : ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n-1];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Value of Element : "+i);
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter a index that you want to delete : ");
        int x = sc.nextInt();
       
        for(int i=0;i<arr2.length;i++)
        {
            if(i<x)
            {
                arr2[i]=arr1[i];
            }
            else if(i==x)
            {
                arr1[i]=arr2[i=1];
            }
            else
            {
                arr2[i]=arr1[i-1];
            }
        }
        System.out.println("New Array : ");
        for(int i=0;i<n+1;i++)
        {
            System.out.println("n["+i+"] = "+arr2[i]);
        }
    }
}
