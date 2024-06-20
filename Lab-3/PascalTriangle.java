import java.util.Scanner;
public class PascalTriangle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();

        int[][] pascalT = new int[n][n];
        for (int i=0;i<n;i++) 
        {
            for (int j=0;j<=i;j++) 
            {
                if (j == 0 || j == i) 
                {
                    pascalT[i][j] = 1;
                } 
                else 
                {
                    pascalT[i][j] = pascalT[i - 1][j - 1] + pascalT[i - 1][j];
                }
            }
        }
        for (int i=0;i<n;i++) 
        {
            for (int j=0;j<n-i;j++) 
            {
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++) 
            {
                System.out.print(pascalT[i][j]+" ");
            }
            System.out.println();
        }
    }
}
