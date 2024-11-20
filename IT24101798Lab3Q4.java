import java.util.Scanner;

public class IT24101798Lab3Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        
        if (number < 10000 || number > 99999) {
            System.out.println("Invalid input: Please enter a five-digit number.");
            return;
        }

        
        for (int i = 10000; i > 0; i /= 10) {
            int digit = (number / i) % 10;
            System.out.print(digit + " ");
        }

        scanner.close(); 
    }
}