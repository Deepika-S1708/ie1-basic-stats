import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinMaxCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        
        System.out.print("Enter the number of integers: ");
        
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.close();
            return;
        }
        
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The entered number is invalid.");
            scanner.close();
            return;
        }

        // Input integers
        System.out.println("Input the numbers:");
        for (int i = 0; i < n; i++) {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.close();
                return;
            }
            int num = scanner.nextInt();
            numbers.add(num);
        }

        if (numbers.isEmpty()) {
            System.out.println("No numbers entered.");
            scanner.close();
            return;
        }

        // Initialize min and max with the first element
        int min = numbers.get(0);
        int max = numbers.get(0);

        // Find minimum and maximum
        for (int i = 1; i < n; i++) {
            int num = numbers.get(i);

            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // Display the results
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        scanner.close();
    }
}
