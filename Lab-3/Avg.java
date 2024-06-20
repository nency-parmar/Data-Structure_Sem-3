import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :  ");
        int n=sc.nextInt();
        double sum=0;
        double avg=0;

        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
         avg=sum/n;
         System.out.println("Average : " + avg);
    }
}