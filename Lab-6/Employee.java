import java.util.Scanner;

class EmployeeDetail 
{
    int employeeID;
    String name;
    String designation;
    double salary;

    public EmployeeDetail(int employeeID, String name, String designation, double salary) 
    {
        this.employeeID = employeeID;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }
    public void printDetails() 
    {
        System.out.println("Employee ID : " +employeeID);
        System.out.println("Employee's Name : " +name);
        System.out.println("Employee's Designation : " +designation);
        System.out.println("Employee's Salary : " +salary);
    }
}

public class Employee 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID : ");
        int employeeID = sc.nextInt();
        System.out.print("Enter Employee's  Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Employee's Designation : ");
        String designation = sc.nextLine();
        System.out.print("Enter Employee's Salary : ");
        double salary = sc.nextDouble();

        EmployeeDetail emp = new EmployeeDetail(employeeID, name, designation, salary);
        System.out.println("\nEmployee Details:");
        emp.printDetails();
    }
}