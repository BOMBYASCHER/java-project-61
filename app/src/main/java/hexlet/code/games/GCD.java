package hexlet.code.games;

import static hexlet.code.Cli.getName;
import static hexlet.code.Engine.congratsMessage;
import static hexlet.code.Engine.passMessage;
import static hexlet.code.Engine.questionMessage;
import static hexlet.code.Engine.stopMessage;
import static hexlet.code.Engine.userEnter;
import static hexlet.code.Engine.getGameRounds;
import static hexlet.code.Engine.randomNumber;
public class GCD {
    static int getGcd(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return getGcd(secondNumber, firstNumber % secondNumber);
    }
    public static void gcdGame() {
        String username = getName();
        System.out.println("Find the greatest common divisor of given numbers.");
        String correctAnswer;
        byte i = 0;
        final int maxNumber = 100;
        while (i < getGameRounds()) {
            String expression;
            String userAnswer;
            int firstNumber = randomNumber(maxNumber);
            int secondNumber = randomNumber(maxNumber);
            correctAnswer = String.valueOf(getGcd(firstNumber, secondNumber));
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
        if (i == getGameRounds()) {
            congratsMessage(username);
        }
    }
}
