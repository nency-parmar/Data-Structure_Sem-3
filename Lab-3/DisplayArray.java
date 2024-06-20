import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Size of an Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i <= (n-1); i++){
            System.out.print("Enter element in Array index - " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of Array are : ");
        for(int j = 0; j <= (n-1); j++){
            System.out.println(arr[j]);
        }
    }
}