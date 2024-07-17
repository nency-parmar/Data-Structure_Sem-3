import java.util.Scanner;
class BankAccount
{
    int ActNo;
    String ActHolder;
    double balance;

    BankAccount(int ActNo , String ActHolder , double balance)
    {
        this.ActNo = ActNo;
        this.ActHolder = ActHolder;
        this.balance = balance;
    }

    void getDetails()
    {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter Account Number : ");
        int Actno = sc.nextInt();
        System.out.println("Enter Account Balance : ");
        double bal = sc.nextDouble();
        System.out.println("Enter Account Holder : ");
        String holder = sc.next();
    }

    void printDetails()
    {
        System.out.println("Account Number is : "+ActNo);
        System.out.println("Account Balance is : "+balance);
        System.out.println("Account Holder is : "+ActHolder);
    }

    public void depositMoney(double amount) 
    {
        System.out.println("Your New Amount Added.");
        this.balance = balance + amount;
        System.out.println("Your Current balance is : " + this.balance);
    }
    public void withdrawMoney(double amount) 
    {
        if (balance >= amount) 
        {
            System.out.println("Your Amount Withdrew.");
            this.balance = balance - amount;
            System.out.println("Your Current balance is : " + this.balance);
        } 
        else 
        {
            System.out.println("InValid Balance.");
        }
    }
    public void checkBalance() 
    {
        System.out.println("Your Current balance is : " + this.balance);
    }
}
public class Bank
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        BankAccount ab = new BankAccount(12345, "Nency", 20000);
        ab.getDetails();
        ab.printDetails();
        // for(int i=0;i<1;i++)
        // {
        //     ab[i] = new BankAccount();
        //     ab[i].getDetails();
        // }
        // for(int i=0;i<2;i++)
        // {
        //     ab[i].printDetails();
        // }
        int choice;
        double amount;
        System.out.println("Select an Option : ");
        System.out.println("Enter Number 1 to Deposit Money.");
        System.out.println("Enter Number 2 to Withdraw Money.");
        System.out.println("Enter Number 3 to Check Balance.");
        System.out.println("Enter Number 4 to Exit.");
        System.out.println("Enter Your Choice : ");
        choice = sc.nextInt();

        while (choice!=4) 
        {
            if (choice == 1) 
            {
                System.out.println("Enter Amount to Deposit : ");
                amount = sc.nextDouble();
                ab.depositMoney(amount);
                break;
            } 
            else if (choice == 2) 
            {
                System.out.println("Enter Amount to Withdraw : ");
                amount = sc.nextDouble();
                ab.withdrawMoney(amount);
                break;
            } 
            else if (choice == 3) 
            {
                ab.checkBalance();
                break;
            } 
            else if (choice == 4) 
            {
                System.out.println("Exit.");
                break;
            } 
            else 
            {
                System.out.println("Invalid Number. Please Enter Valid Number.");
            }
        }
    } 
}