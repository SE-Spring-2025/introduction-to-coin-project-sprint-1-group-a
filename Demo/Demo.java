package Demo;

import java.util.Scanner;
import Main.*;

public class Demo {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to the CoinFlips Demo!");

        CoinCounts counts = Coin.getCoinCounts();
        new TotalCoinsDashboard(counts);
        new QuarterCounterDashboard(counts);

        fixedDemo();
        interactiveDemo();

        System.out.println("\nThanks for watching the CoinFlips Demo.");
        System.out.println("Have a wonderful day!\n");
    }

    private static void fixedDemo() {
        Coin p = new Penny();
        System.out.println("Making a Penny()");
        System.out.println("Result: " + p.manufacture(p));

        Coin n = new Nickel();
        System.out.println("Making a Nickel()");
        System.out.println("Result: " + n.manufacture(n));

        Coin d = new Dime();
        System.out.println("Making a Dime()");
        System.out.println("Result: " + d.manufacture(d));

        Coin q = new Quarter();
        System.out.println("Making a Quarter()");
        System.out.println("Result: " + q.manufacture(q));

        Coin h = new HalfDollar();
        System.out.println("Making a HalfDollar()");
        System.out.println("Result: " + h.manufacture(h));

        Coin g = new Dollar();
        System.out.println("Making a Dollar()");
        System.out.println("Result: " + g.manufacture(g));
    }

    private static void interactiveDemo() {
        System.out.println("\nWould you like to make more coins yourself? (Y/n) ");
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

            c = c.manufacture(c);
            System.out.println("Result: " + c.toString());
        }
    }
}
