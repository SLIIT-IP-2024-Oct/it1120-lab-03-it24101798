import java.util.Scanner;

public class IT24101798Lab3Q1B { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter price per kg of rice (in rupees): ");
        double pricePerKg = scanner.nextDouble();

        
        System.out.print("Enter the number of kilograms to buy: ");
        double quantity = scanner.nextDouble();

        
        double totalCost = pricePerKg * quantity;

       
        double discountRate = 0.1;
        double discountAmount = totalCost * discountRate;

      
        double finalCost = totalCost - discountAmount;

        
        System.out.println("The total cost before discount is: " + totalCost + " rupees");
        System.out.println("The discount amount is: " + discountAmount + " rupees");
        System.out.println("The total amount you have to pay after discount is: " + finalCost + " rupees");

        scanner.close();
    }
}