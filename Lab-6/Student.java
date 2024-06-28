import java.util.Scanner;
class StudentDetails
{
    double en_no;
    String name;
    int sem;
    double cpi;

    void getDetails()
    {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter Student's Enrollment Number : ");
        en_no = sc.nextDouble();
        System.out.println("Enter Student's Name : ");
        name = sc.next();
        System.out.println("Enter Student's Semester : ");
        sem = sc.nextInt();
        System.out.println("Enter Student's CPI : ");
        cpi = sc.nextDouble();
    }

    void printDetails()
    {
        System.out.println("Student's Enrollment Number is : "+en_no);
        System.out.println("Student's Name is : "+name);
        System.out.println("Student's Semester is : "+sem);
        System.out.println("Student's CPI is : "+cpi);
    }
}

public class Student 
{
    public static void main(String[] args) 
    {
        StudentDetails [] sd = new StudentDetails[5];
        for(int i=0;i<5;i++)
        {
            sd[i] = new StudentDetails();
            sd[i].getDetails();
        } 
        for(int i=0;i<5;i++)
        {
            sd[i].printDetails();
        }
    }    
}
