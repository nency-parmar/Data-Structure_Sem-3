import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number of days: ");
        int days = sc.nextInt();
        
        int years = days / 365;
        int remainingDays = days % 365;
        
        int weeks = remainingDays / 7;
        int newday = remainingDays % 7;
        
        System.out.println(days);
        System.out.println(years + " Years");
        System.out.println(weeks + " Weeks");
        System.out.println(days + " Days");
    }
}
