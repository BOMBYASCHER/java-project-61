package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getName() {
        System.out.print("Welcome to the Brain Games!\nMay I have you name? ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("Hello, " + username + '!');
        return username;
    }
    public static String start() {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
