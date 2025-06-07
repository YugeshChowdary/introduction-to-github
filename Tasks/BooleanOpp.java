import java.util.Scanner;

public class BooleanOpposite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean value = false;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter a boolean value (true/false): ");
            if (scanner.hasNextBoolean()) {
                value = scanner.nextBoolean();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter 'true' or 'false'.");
                scanner.next();
            }
        }

        System.out.println("The opposite of the entered value is: " + !value);
        scanner.close();
    }
}
