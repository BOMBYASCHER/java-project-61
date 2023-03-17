package hexlet.code.games;

import static hexlet.code.Cli.getName;
import static hexlet.code.Engine.congratsMessage;
import static hexlet.code.Engine.passMessage;
import static hexlet.code.Engine.questionMessage;
import static hexlet.code.Engine.stopMessage;
import static hexlet.code.Engine.userEnter;
import static hexlet.code.Engine.gameRounds;
public class GCD {
    static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGcd(b, a % b);
    }
    public static void gcdGame() {
        String username = getName();
        System.out.println("Find the greatest common divisor of given numbers.");
        String correctAnswer;
        byte i = 0;
        while (i < gameRounds) {
            String expression;
            String userAnswer;
            int firstNumber = (int) (Math.random() * 100);
            int secondNumber = (int) (Math.random() * 100);
            int maxNumber = Math.max(firstNumber, secondNumber);
            if (firstNumber == 0 || secondNumber == 0) {
                correctAnswer = String.valueOf(maxNumber);
            } else {
                correctAnswer = String.valueOf(getGcd(firstNumber, secondNumber));
            }
            expression = firstNumber + " " + secondNumber;
            questionMessage(expression);
            userAnswer = userEnter();
            if (correctAnswer.equals(userAnswer)) {
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
