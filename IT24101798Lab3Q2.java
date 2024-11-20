import java.util.Scanner;

public class IT24101798Lab3Q2 { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter monthly salary (in rupees): ");
        double monthlySalary = scanner.nextDouble();

        
        System.out.print("Enter the number of OT hours worked: ");
        double otHours = scanner.nextDouble();

      
        System.out.print("Enter the OT hourly rate (in rupees): ");
        double otRate = scanner.nextDouble();

       
        double otAmount = otHours * otRate;

        
        double totalSalary = monthlySalary + otAmount;

       
        System.out.println("The total salary is: " + totalSalary + " rupees");
        System.out.println("Details:");
        System.out.println("  - Monthly Salary: " + monthlySalary + " rupees");
        System.out.println("  - OT Hours: " + otHours + " hours");
        System.out.println("  - OT Rate: " + otRate + " rupees/hour");
        System.out.println("  - OT Amount: " + otAmount + " rupees");

        scanner.close();
    }
}