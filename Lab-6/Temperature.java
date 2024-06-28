import java.util.Scanner;
class Temp
{
    double c;
    double f;

    void c_to_f(double c1)
    {
        f = 32 + (9/5)*c1;
        System.out.println("Fahrenhit = "+f);
    }

    void f_to_c(double f1)
    {
        c = (f1 - 32)*(5/9);
        System.out.println("Celsius = "+c);
    }
}
public class Temperature 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 to Convert Celsius to Fahrenhit Or Number 2 to Convert Fahrenhit to Celsius : ");
        int x=sc.nextInt();
        Temp t = new Temp();
        if(x == 1)
        {
            System.out.println("Enter Celsius to Convert Fahrenhit : ");
            double c1 = sc.nextDouble();
            t.c_to_f(c1);
        }
        else if(x == 2) 
        {
            System.out.println("Enter Fahrenhit to Convert Celsius : ");
            double f1 = sc.nextDouble();
            t.f_to_c(f1);    
        }
        else
        {
            System.out.println("Enter Valid Number 1 Or 2.");
        }
    }    
}