import java.util.*;

public class DuplicateArray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size of an Array : ");
        int n=sc.nextInt();
        int[] a=new int[n];

        boolean flag = false;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Value of Element : "+i);
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    flag=true;
                    break;
                }
            }
        }
        if(flag)
        {
            System.out.println("It has Duplicate Numberin an Array.");
        }
       else
       {
            System.out.println("It has No Duplicate Number Found in an Array.");
       }
    }
}