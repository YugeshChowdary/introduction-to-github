import java.util.Scanner;
public class MultiplyFloatByTwo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a floating point number:");
        double number = scanner.nextDouble();
        double result = number * 2;
        System.out.println("The number multiplied by 2 is: " + result);
        scanner.close();
    }
}

