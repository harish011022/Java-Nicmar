
import java.util.Scanner;

public class Mains{

    // Recursive method to find factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) { // Base case: 0! = 1! = 1
            return 1;
        }
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println(num + "! = " + factorial(num));
        }

        scanner.close();
    }
}
