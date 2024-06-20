import java.util.Scanner;
public class PositionOfNumber 
{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a size of an array : ");
       int n = sc.nextInt();
       int[] arr = new int[n];
       int small = 0;
       int large = 0;
       for(int i=0;i<=(n-1);i++){
        System.out.println("Enter an element in array index - " + i + " : ");
        arr[i] = sc.nextInt();
        }
       for (int i=0;i<(n-1);i++) {
           if(arr[i] < arr[i+1]){
            large = arr[i+1];
           }
           else if(arr[i]>arr[i+1]){
            small = arr[i+1];
           }
        }
        System.out.println("Smallest number: " + small);
        System.out.println("Largest number: " + large);
    }
}