package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static byte gameRounds = 3;
    public static void passMessage() {
        System.out.println("Correct!");
    }
    public static void stopMessage(String userAnswer, String correctAnswer, String username) {
        System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. "
                + "Correct answer was " + "'" + correctAnswer + "'");
        System.out.println("Let's try again, " + username + "!");
    }
    public static String userEnter() {
        String userAnswer;
        Scanner scanner = new Scanner(System.in);
        userAnswer = scanner.next();
        return userAnswer;
    }
    public static void questionMessage(String expression) {
        System.out.println("Question: " + expression);
        System.out.print("Your answer: ");
    }
    public static void congratsMessage(String username) {
        System.out.println("Congratulations, " + username + "!");
    }
}
