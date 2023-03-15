package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.getName;
public class Even {
    public static void evenGame() {
        String username = getName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        byte gameSteps = 3;
        byte i = 0;
        String correctAnswer;
        while (i < gameSteps) {
            byte number = (byte) (Math.random() * 100);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.next();
            if (number % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            if (number % 2 == 0 && userAnswer.equals("yes")) {
                System.out.println("Correct!");
                i++;
            }
            if (number % 2 != 0 && userAnswer.equals("no")) {
                System.out.println("Correct!");
                i++;
            }
            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. "
                    + "Correct answer was " + "'" + correctAnswer + "'");
                System.out.println("Let's try again, " + username + "!");
                break;
            }
        }
        if (gameSteps == i) {
            System.out.println("Congratulations, " + username + "!");
        }

    }
}
