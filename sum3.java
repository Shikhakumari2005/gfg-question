
import java.util.Scanner;
public class sum3 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Calculate sum
        int sum = num1 + num2 + num3;

        // Display result
        System.out.println("The sum is: " + sum);
    }
}
