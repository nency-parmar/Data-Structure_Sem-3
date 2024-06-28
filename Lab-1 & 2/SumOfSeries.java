import java.util.Scanner;
public class SumOfSeries 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n : ");
        int n = sc.nextInt();
        int ans = 0;
        for (int i=1;i<=n;i++) 
        {
            int sum = 0;
            for (int j = 1; j <= i; j++) 
            {
                sum += j;
            }
            ans += sum;
        }
        System.out.println("The sum of the Series is: " +ans);
    }
}