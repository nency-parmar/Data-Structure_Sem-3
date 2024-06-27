import java.util.Scanner;
public class MatricesAddition
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int [2][2];
        int[][] b = new int [2][2];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println("Enter 1st Array's  Elements at index - "+i+": "+j+" ");
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println("Enter 2nd Array's Elements at index - "+i+": "+j+" ");
                b[i][j] = sc.nextInt();
            }
        }
        int[][] ans = new int [2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                ans[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Addition Of Two Matrices is : ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}