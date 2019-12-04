import java.util.Scanner; // Importing the Scanner

public class Hello
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Creating the Scanner

        System.out.println("Hello. What is your name?"); // Asking the user's name and inputting their name
        String name = scanner.next();

        System.out.println("It's nice to meet you, " + name + ". How old are you?"); // Asking the user's age and inputting their age
        String age = scanner.next();
        System.out.println("I see that you are still quite young at only " + age + ".");

        System.out.println("Where do you live?"); // Asking the user where they live and inputting their location
        String location = scanner.next();

        System.out.println("Wow! I've always wanted to go to " + location + ". Thanks for chatting with me. Bye!");

        scanner.close(); // Closing the scanner
    }
}
