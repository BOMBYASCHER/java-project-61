package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getName() {
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have you name? ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("Hello, " + username + '!');
        return username;
    }
    public static String start() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
