import java.util.*;
public class DeleteDuplicateNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size of an Array : ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Element at Index - "+i+": ");
            a[i]=sc.nextInt();
        }  
        int x=0,count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    x=j;
                    count++;
                }
            }   
        }
        System.out.println("Duplicate Number are : "+count);
        int[] arr = new int[(n-count)];
        for(int i=0;i<arr.length;i++)
        {
            if(i<=x)
            {
                arr[i]=a[i];
            }
            else
            {
                arr[i]=a[i+1];
            }
        }
        System.out.println("New Array is : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("arr["+i+"] : "+arr[i]);
        }
    }
    
}