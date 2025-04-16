package Demo;
import java.util.Scanner;
import Main.Coin;
import Main.Dime;
import Main.Dollar;
import Main.HalfDollar;
import Main.Nickel;
import Main.Penny;
import Main.Quarter;

public class Demo {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to the CoinFlips Demo!");

        fixedDemo();
        interactiveDemo();

        System.out.println();
        System.out.println("Thanks for watching the CoinFlips Demo.");
        System.out.println("Have a wonderful day!");
        System.out.println();
    }

    private static void fixedDemo() {
        System.out.println("\n--- Fixed Demo ---");

        System.out.println("Making a Penny()");
        System.out.println("Result: " + new Penny());

        System.out.println("Making a Nickel()");
        System.out.println("Result: " + new Nickel());

        System.out.println("Making a Dime()");
        System.out.println("Result: " + new Dime());

        System.out.println("Making a Quarter()");
        System.out.println("Result: " + new Quarter());

        System.out.println("Making a HalfDollar()");
        System.out.println("Result: " + new HalfDollar());

        System.out.println("Making a Dollar()");
        System.out.println("Result: " + new Dollar());

        System.out.println("Making a Dollar(1991)");
        System.out.println("Result: " + new Dollar(1991));
    }

    private static void interactiveDemo() {
        System.out.println();
        System.out.println("Would you like to make more coins yourself? (Y/n) ");
        String response = keyboard.nextLine().trim();

        if (response.isEmpty() || response.charAt(0) == 'Y' || response.charAt(0) == 'y') {
            runDemo();
        }
    }

    private static void printMenu() {
        System.out.println("\nI'm ready to make you a coin!");
        System.out.println("Enter G for a Dollar");
        System.out.println("Enter H for a Half Dollar");
        System.out.println("Enter Q for a Quarter");
        System.out.println("Enter D for a Dime");
        System.out.println("Enter N for a Nickel");
        System.out.println("Enter P for a Penny");
        System.out.println("Enter X to exit the demo.");
    }

    private static void runDemo() {
        Coin c;

        while (true) {
            printMenu();
            System.out.print("What coin to make? ");
            String response = keyboard.nextLine().trim();

            switch (Character.toUpperCase(response.charAt(0))) {
                case 'G':
                    System.out.println("Gonna make a Dollar...");
                    c = new Dollar();
                    break;
                case 'H':
                    System.out.println("Gonna make a Half Dollar...");
                    c = new HalfDollar();
                    break;
                case 'Q':
                    System.out.println("Gonna make a Quarter...");
                    c = new Quarter();
                    break;
                case 'D':
                    System.out.println("Gonna make a Dime...");
                    c = new Dime();
                    break;
                case 'N':
                    System.out.println("Gonna make a Nickel...");
                    c = new Nickel();
                    break;
                case 'P':
                    System.out.println("Gonna make a Penny...");
                    c = new Penny();
                    break;
                case 'X':
                    System.out.println("Exiting demo...");
                    return;
                default:
                    System.out.println("Invalid entry, try again.");
                    continue;
            }

            System.out.println("Result: " + c.toString());
        }
    }
}
