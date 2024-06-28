import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class SortNNames 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Names that You Want to Sort in Alphabetical Order : ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = new String[n];
        for (int i=0;i<n;i++) 
        {
            System.out.println("Enter a Name at Index - "+i+": ");
            str[i] = sc.nextLine();
        }
        Arrays.sort(str);
        System.out.println("Names in an Alphabetical Order : ");
        for (String name : str) 
        {
            System.out.println(name);
        }
    }
}