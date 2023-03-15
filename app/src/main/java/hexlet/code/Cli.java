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
        System.out.print("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit\nYour choice: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
