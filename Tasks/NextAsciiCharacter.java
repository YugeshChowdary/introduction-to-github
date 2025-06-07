import java.util.Scanner;
public class NextAsciiCharacter 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        String input = scanner.next();
        char character = input.charAt(0);
        char nextChar = (char) (character + 1);
        System.out.println("The next character in the ASCII sequence is: " + nextChar);
        scanner.close();
    }
}
