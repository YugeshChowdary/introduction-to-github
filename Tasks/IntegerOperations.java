import java.util.Scanner;
public class IntegerOperations
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        scanner.close();
    }
}
