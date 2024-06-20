import java.util.Scanner;

public class Factorial 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int a = sc.nextInt();

        int count=1;

        for(int i=1;i<=a;i++)
        {
            count=count*i;
        }
        System.out.println("Answer = "+count);
    }    
}
