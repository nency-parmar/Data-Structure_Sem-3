import java.util.Scanner;

public class AreaCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double n = sc.nextInt();
        double a = Math.PI*n*n;
        System.out.println("Area of Circle is : "+a);
    }
}