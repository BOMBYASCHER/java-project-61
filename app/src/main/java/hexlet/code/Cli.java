package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void getName() {
        System.out.print("Welcome to the Brain Games!\nMay I have you name? ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("Hello, " + username + '!');
    }
}
