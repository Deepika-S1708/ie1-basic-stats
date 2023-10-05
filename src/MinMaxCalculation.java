import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinMaxCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        
        System.out.print("Enter the number of integers: ")
        
        int n = scanner.nextInt();
        
        // Input valid int integers
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
        //If there are no numbers entered the if loop will print this statement
        if (numbers.isEmpty()) {
            System.out.println("There are no numbers entered.");
            scanner.close();
            return;
        }

        // Initialize min and max with the first element
        int min = numbers.get(0);
        int max = numbers.get(0);

        // Find minimum and maximum
        for (int i = 1; i < n; i++) {
            int num = numbers.get(i);
            // This conditon checks for the min value and num is assigned to min
            if (num < min) { 
                min = num;
            }
           // This conditon checks for the max value and num is assigned to max
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
