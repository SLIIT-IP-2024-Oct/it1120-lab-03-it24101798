import java.util.Scanner;

public class IT24101798Lab3Q1A { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter price per kg of rice (in rupees): ");
        double pricePerKg = scanner.nextDouble();

      
        System.out.print("Enter the number of kilograms to buy: ");
        double quantity = scanner.nextDouble();

        
        double totalCost = pricePerKg * quantity;

       
        System.out.println("The total amount you have to pay is: " + totalCost + " rupees");

        scanner.close();
    }
}