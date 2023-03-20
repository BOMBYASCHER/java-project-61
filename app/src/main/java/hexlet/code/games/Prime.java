package hexlet.code.games;

import static hexlet.code.Cli.getName;
import static hexlet.code.Engine.congratsMessage;
import static hexlet.code.Engine.passMessage;
import static hexlet.code.Engine.questionMessage;
import static hexlet.code.Engine.stopMessage;
import static hexlet.code.Engine.userEnter;
import static hexlet.code.Engine.gameRounds;
import static hexlet.code.Engine.randomNumber;
public class Prime {
    public static boolean isPrime(int number) {
        byte j = 2;
        while (j <= Math.sqrt(number)) {
            if (number % j == 0) {
                return false;
            }
            j++;
        }
        return true;
    }
    public static void primeGame() {
        String username = getName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        byte i = 0;
        while (i < gameRounds) {
            int number = randomNumber(100);
            questionMessage(String.valueOf(number));
            String correctAnswer = "no";
            if (isPrime(number)) {
                correctAnswer = "yes";
            }
            String userAnswer = userEnter();
            if (userAnswer.equals(correctAnswer)) {
                passMessage();
                i++;
            } else {
                stopMessage(userAnswer, correctAnswer, username);
                break;
            }
        }
        if (i == gameRounds) {
            congratsMessage(username);
        }
    }
}
