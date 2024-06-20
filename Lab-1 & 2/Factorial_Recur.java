import java.util.Scanner;

public class Factorial_Recur 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int factorial = factorial(number);
        
        System.out.println("Factorial of " + number + " is " + factorial);
        
        // scanner.close();
    }
    
    public static int factorial(int n) {
        if (n == 0 || n ==1) 
        {
            return 1;
        }
        else 
        {
            return n * factorial(n - 1);
        }
    }
}




// logic of Factorial by recursion
// public static int fact(int n)
// {    
//     if(n==0 || n==1)
//     {
//         return 1;
//     }
//     else 
//     {
//         return n*fact(n-1)
//     }
// }