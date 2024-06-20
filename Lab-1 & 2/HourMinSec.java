import java.util.Scanner;

public class HourMinSec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Seconds : ");
        int sec = sc.nextInt();
        int hours = sec / 3600;
        int remainingSeconds = sec % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        
        System.out.printf(hours+" Hours ; "+minutes+" Minutes ; "+seconds+" Seconds");
    }
}
